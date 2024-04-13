package com.example.start.service;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JsonUtility {

    public static void jsonToBean(String json) throws IOException {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        File folder = new File("D:\\Java Bean");
        if (!folder.exists()) {
            folder.mkdir();
        }
        generateClasses(jsonObject, folder, "Request");
    }

    private static void generateClasses(JsonObject jsonObject, File folder, String className) throws IOException {
        CompilationUnit compilationUnit = new CompilationUnit();
        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addClass(className);
        classDeclaration.setModifiers(Modifier.publicModifier().getKeyword());

        for (String key : jsonObject.keySet()) {
            JsonElement element = jsonObject.get(key);
            if (element.isJsonObject()) {
                generateClassFromJsonObject(element.getAsJsonObject(), folder, key);
                classDeclaration.addPrivateField(className(key), key);
            } else if (element.isJsonArray()) {
                generateClassFromJsonArray(element.getAsJsonArray().get(0).getAsJsonObject(), folder, key);
                classDeclaration.addPrivateField("List<" + className(key) + ">", key);
            } else if (element.isJsonPrimitive()) {
                handleJsonPrimitive(classDeclaration, element, key);
            }
        }

        classDeclaration.getFields().forEach(field -> {
            field.createGetter();
            field.createSetter();
        });
        writeCompilationUnitToFile(compilationUnit, folder, className);
    }

    private static String className(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    private static void generateClassFromJsonObject(JsonObject jsonObject, File folder, String className) throws IOException {
        generateClasses(jsonObject, folder, className);
    }

    private static void generateClassFromJsonArray(JsonObject jsonObject, File folder, String className) throws IOException {
        generateClasses(jsonObject, folder, className);
    }

    private static void handleJsonPrimitive(ClassOrInterfaceDeclaration classDeclaration, JsonElement element, String key) {
        if (element.getAsJsonPrimitive().isString()) {
            classDeclaration.addPrivateField("String", key);
        } else if (element.getAsJsonPrimitive().isNumber()) {
            classDeclaration.addPrivateField("int", key);
        } else if (element.getAsJsonPrimitive().isBoolean()) {
            classDeclaration.addPrivateField("boolean", key);
        }
    }

    private static void writeCompilationUnitToFile(CompilationUnit compilationUnit, File folder, String className) throws IOException {
        File classFile = new File(folder.getAbsolutePath() + "\\" + className(className) + ".java");
        classFile.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(classFile)) {
            fos.write(compilationUnit.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    public static void main(String[] args) throws Exception {

        jsonToBean("{\"applicationNo\":\"7879\",\"documentList\":[{\"documentName\":\"Test Doc\",\"documentId\":\"123Doc\",\"fpcCode\":\"ASD123\",\"scanDate\":\"2023-12-12\"}]}");
    }
}
