package com.ams.service;

import java.util.List;
import com.ams.entity.Student;
import com.ams.exception.RecordNotFoundException;

public interface StudentService {
	public Long add(Student student);

	public void update(Student student);

	public void deleteByStudentId(Long StudentId) throws RecordNotFoundException;

	public Student getByStudentId(Long studentId) throws RecordNotFoundException;

	public List<Student> findByCourseId(Long courseId) throws RecordNotFoundException;

	public Student findByRollNo(Long rollNo) throws RecordNotFoundException;

}
