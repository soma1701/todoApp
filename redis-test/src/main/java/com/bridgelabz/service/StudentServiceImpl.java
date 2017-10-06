package com.bridgelabz.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import com.bridgelabz.dao.StudentDao;
import com.bridgelabz.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	public void register(Student student) {
		
		studentDao.register(student);
		
	}

}
