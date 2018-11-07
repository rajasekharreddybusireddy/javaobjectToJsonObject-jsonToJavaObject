package com.blogspot.javabyrajasekhar.ObjectToJsonAndJsonToObject;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJsonValue {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "rajasekhar reddy", 60000d);
		ObjectMapper objectMapper = new ObjectMapper();
		try {

			// java object to json string
			String jsonString = objectMapper.writeValueAsString(employee);
			System.out.println("object to json :" + jsonString);

			// json string java object
			Employee emp = objectMapper.readValue(jsonString, Employee.class);
			System.out.println("eno :" + emp.getEno());
			System.out.println("name: " + emp.getName());
			System.out.println("salary :" + emp.getSalary());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
