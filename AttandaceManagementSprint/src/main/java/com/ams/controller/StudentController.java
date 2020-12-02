package com.ams.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ams.entity.StudentEntity;
import com.ams.exception.RecordNotFoundException;
import com.ams.service.StudentService;

/**
 * @author puspha
 *
 */
//mark class as a Controller
@RestController
@RequestMapping("/api/attendance")
public class StudentController {
	// autowire the attendanceService class
	@Autowired
	private StudentService studentservice;

	@GetMapping("/helloworld")
	public String sayHello() {
		return "HelloWorld";
	}

	// creating post mapping that post the student detail in the database
	@PostMapping("/insert")
	public Long create(@RequestBody StudentEntity student) {
		studentservice.add(student);
		@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		return student.getStudentId();

	}

	// creating put mapping that updates the attendance detail
	@PutMapping("/update")
	public ResponseEntity<Boolean> update(@RequestBody StudentEntity student) {
		studentservice.update(student);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		return responseEntity;
	}

	// creating a delete mapping that deletes a specified student
	@RequestMapping(value = "/delete/{studentId}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable Long studentId) throws RecordNotFoundException {
		studentservice.deleteByStudentId(studentId);
		return "student has been deleted successfully";
	}

	// creating get mapping that retrieves the detail of a specific Student
	@GetMapping("/findStudent/{studentId}")
	public ResponseEntity<StudentEntity> getStudentBystudentId(@PathVariable("studentId") Long studentId)
			throws RecordNotFoundException {
		StudentEntity student = studentservice.getByStudentId(studentId);
		return new ResponseEntity<StudentEntity>(student, new HttpHeaders(), HttpStatus.OK);

	}

	// creating get mapping that retrieves the detail of a specific Student
	@GetMapping("/findcourse/{courseId}")
	public ResponseEntity<List<StudentEntity>> getStudentByCourseId(@PathVariable("courseId") Long courseId)
			throws RecordNotFoundException {
		List<StudentEntity> student = studentservice.findByCourseId(courseId);
		return new ResponseEntity<List<StudentEntity>>(student, HttpStatus.OK);
	}
	// getting all student records by using the method findaAll() of CrudRepository
	@GetMapping("/list")
	private List<StudentEntity> getAllStudents() throws RecordNotFoundException {
		return studentservice.findAllStudents();// response entity

	}

}
