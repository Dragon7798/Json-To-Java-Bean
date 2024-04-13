package com.example.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.start.data.Demo;
import com.example.start.data.Employee;

@RestController
public class DemoController {

	@Autowired
	DemoService dmService;

	@RequestMapping(value = "/dere", method = RequestMethod.GET)
	String get() {
		throw new NullPointerException("Fatalaaaa");
//		return "response is here";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	String post(@RequestBody Demo d) {
		return dmService.printService(d);
	}

	@GetMapping("/api/employees")
	public List<Employee> fetch() {

		Employee employee = new Employee();
		employee.setId(String.valueOf(Math.random() * 100));
		employee.setName("Dragon");

		return List.of(employee);
	}

	@GetMapping("/api/employee/{id}")
	public String fetchSingle(@PathVariable String id) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName("Dragon");

		return employee.toString();
	}

	@PostMapping("/api/employee")
	public String postEmp(@RequestBody Employee employee) {
		return "Employee Created : " + employee.toString();
	}

	@PostMapping("/api/employees")
	public List<Employee> listEmp(@RequestBody List<Employee> listEmp) {

		return listEmp;
	}
	
	
	@DeleteMapping("/api/employee")
	public String deleteEmp(@RequestParam(name = "id") String id) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName("Dragon");

		return "Deleted : " + employee.toString();
	}
	
	
	@PutMapping("/api/employee")
	public String updateEmp(@RequestParam(name = "id") String id) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName("Dragon");

		return "Deleted : " + employee.toString();
	}
	
	

}
