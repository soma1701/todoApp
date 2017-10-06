package com.bridgelabz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.entity.Student;
import com.bridgelabz.service.StudentService;

@RestController
public class StudentCredential {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody Student student) {
		try {
			studentService.register(student);
			System.out.println(student.getName());
			System.out.println("you are successfully registerd");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("incorrect credential", HttpStatus.BAD_GATEWAY);

		}
		return new ResponseEntity<String>("register successfully", HttpStatus.OK);

	}
}
