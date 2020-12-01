package com.ams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ams.entity.Student;
import com.ams.repository.StudentDao;
@Service("service")
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;

	@Override
	public Long add(Student student) {
		 dao.save(student);
		 return student.getStudentId();
	}

	@Override
	public void update(Student student) {
		dao.save(student);
		
	}

	@Override
	public void deleteByStudentId(Long studentId) {
		dao.deleteById(studentId);
		
		
	}

	@Override
	public Student findByFirstName(String firstName) {
		return dao.findByFirstName(firstName);
	}

	@Override
	public Student findByStudentId(Long studentId) {
		return dao.findByStudentId(studentId);
	}

	@Override
	public Student findByGender(String gender) {
		return dao.findByGender(gender);
	}

	@Override
	public Student findByRollNo(Long rollNo) {
		return dao.findByRollNo(rollNo);
	}

	
}
