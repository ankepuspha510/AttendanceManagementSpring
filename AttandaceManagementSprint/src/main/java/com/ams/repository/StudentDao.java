package com.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ams.entity.Student;

public interface StudentDao extends JpaRepository<Student,Long>{
	@Query("SELECT s FROM Student s WHERE s.firstName like ?1")
	public Student findByFirstName(String firstName);
	@Query("SELECT s FROM Student s WHERE s.studentId like ?1")
	public Student findByStudentId(Long studentId);
	@Query("SELECT s FROM Student s WHERE s.rollNo like ?1")
	public Student findByRollNo(Long rollNo);
	@Query("SELECT s FROM Student s WHERE s.gender like ?1")
	public Student findByGender(String gender);

}
