package com.example.start.data;

public class Application {

	
	private String Name;
	private String type;
	private String Id;
	private String Stage__c;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getStage__c() {
		return Stage__c;
	}
	public void setStage__c(String stage__c) {
		Stage__c = stage__c;
	}
	@Override
	public String toString() {
		return "Application [Name=" + Name + ", type=" + type + ", Id=" + Id + ", Stage__c=" + Stage__c + "]";
	}
	
	
}
