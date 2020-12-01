package com.ams.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ams.entity.Student;
import com.ams.exception.RecordNotFoundException;
import com.ams.queryutil1.ErrorMessageUtil;
import com.ams.repository.StudentDao;

/***
 * 
 * @author puspha
 *
 */
//defining business logic
@Service("service")
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;

	// saving a specific record by using method of save() CrudRepository
	@Override
	public Long add(Student student) {
		dao.save(student);
		return student.getStudentId();
	}

	// Updating
	@Override
	public void update(Student student) {
		dao.save(student);

	}

	// deleting a specific record
	@Override
	public void deleteByStudentId(Long studentId) throws RecordNotFoundException {
		if (dao.findById(studentId) == null) {
			throw new RecordNotFoundException(ErrorMessageUtil.STD_RECORD_NOT_FOUND);
		}
		dao.deleteById(studentId);
	}

	// getting a specific record by using getBystudentId() of CrudRepository
	@Override
	public Student getByStudentId(Long studentId) throws RecordNotFoundException {
		Optional<Student> student = dao.findById(studentId);
		if (student.isEmpty()) {
			throw new RecordNotFoundException(ErrorMessageUtil.STD_RECORD_NOT_FOUND);
		}
		return student.get();
	}

	// getting a specific record by using findByRollNo() of CrudRepository
	@Override
	public Student findByRollNo(Long rollNo) throws RecordNotFoundException {
		if (dao.findByRollNo(rollNo) == null) {
			throw new RecordNotFoundException(ErrorMessageUtil.STD_RECORD_NOT_FOUND);
		}
		return dao.findByRollNo(rollNo);
	}

	// getting a records by using findByCourseId() of CrudRepository
	@Override
	public List<Student> findByCourseId(Long courseId) throws RecordNotFoundException {
		if (dao.findByCourseId(courseId) == null) {
			throw new RecordNotFoundException(ErrorMessageUtil.STD_RECORD_NOT_FOUND);
		}
		return dao.findByCourseId(courseId);
	}

}
