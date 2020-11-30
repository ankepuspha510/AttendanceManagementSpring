package com.ams.Service;

import com.ams.entity.Student;


public interface StudentService {
    public Long add(Student student);
	public void update(Student student);
	public void deleteByStudentId(Long StudentId);
	public Student findByName(String firstName);
	public Student findByStudentId(Long studentId);
	public Student findByGender(String gender);
	public Student findByRollNo(Long rollNo);

}
