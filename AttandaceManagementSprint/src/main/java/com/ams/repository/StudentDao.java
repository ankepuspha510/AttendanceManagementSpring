package com.ams.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ams.entity.Student;
import com.ams.queryutil1.QueryUtil;

/***
 * 
 * @author pushpa
 *
 */
public interface StudentDao extends JpaRepository<Student, Long> {
	// Query to find record of student by rollNo
	@Query(QueryUtil.VIEW_STUD_BY_ROLLNO)
	public Student findByRollNo(Long rollNo);

	// Query to find record of student by courseId
	@Query(QueryUtil.VIEW_STUD_BY_COURSEID)
	public List<Student> findByCourseId(Long courseId);

	// Query to delete a record of student using id
	@Query(QueryUtil.DEL_STUD_BY_ID)
	@Transactional
	@Modifying
	public void deleteByStudentId(Long StudentId);

}
