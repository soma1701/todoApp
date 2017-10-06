package com.bridgelabz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import com.bridgelabz.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private static final String KEY = "Student";
	
	 @Autowired
	    private RedisTemplate<String, Object> template;
	 
	 	private HashOperations<String, String, Student> hashops;
	 

	public void register(Student student) {
		hashops = template.opsForHash();
		hashops.put(KEY, String.valueOf(student.getId()), student);
		
		
		
		
	}

}
