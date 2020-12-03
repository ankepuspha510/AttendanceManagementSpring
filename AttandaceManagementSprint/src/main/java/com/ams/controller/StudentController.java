package com.ams.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ams.entity.StudentEntity;
import com.ams.exception.RecordNotFoundException;
import com.ams.service.StudentService;
import org.apache.log4j.Logger;

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
	private StudentService studentService;
	public static final Logger Log = Logger.getLogger(StudentController.class.getName());

	@GetMapping("/helloworld")
	public String sayHello() {
		return "HelloWorld";
	}

	// creating post mapping that post the student detail in the database
	@PostMapping("/insertStudent")
	public Long create(@RequestBody StudentEntity student) {
		Log.info("Started adding student details");
		studentService.add(student);
		@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		Log.info("complete adding student details");
		return student.getStudentId();

	}

	// creating put mapping that updates the attendance detail
	@PutMapping("/updateStudent")
	public ResponseEntity<Boolean> update(@RequestBody StudentEntity student) {
		Log.info("Started updating student details");
		studentService.update(student);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		Log.info("complete updating student details");
		return responseEntity;
	}

	// creating a delete mapping that deletes a specified student
	@DeleteMapping(value = "/deleteStudent/{studentId}")
	public String deleteStudent(@PathVariable Long studentId) throws RecordNotFoundException {
		Log.info("Started delete student details");
		studentService.deleteByStudentId(studentId);
		Log.info("complete deleting student details");
		return "student has been deleted successfully";
	}

	// creating get mapping that retrieves the detail of a specific Student
	@GetMapping("/findStudent/{studentId}")
	public ResponseEntity<StudentEntity> getStudentBystudentId(@PathVariable("studentId") Long studentId)
			throws RecordNotFoundException {
		Log.info("Started finding student details");
		StudentEntity student = studentService.getByStudentId(studentId);
		Log.info("complete findingg student details");
		return new ResponseEntity<StudentEntity>(student, new HttpHeaders(), HttpStatus.OK);

	}

	// creating get mapping that retrieves the detail of a specific Student
	@GetMapping("/findcourse/{courseId}")
	public ResponseEntity<List<StudentEntity>> getStudentByCourseId(@PathVariable("courseId") Long courseId)
			throws RecordNotFoundException {
		Log.info("Started finding student details using courseId");
		List<StudentEntity> student = studentService.findByCourseId(courseId);
		Log.info("completed finding student details using courseId");
		return new ResponseEntity<List<StudentEntity>>(student, HttpStatus.OK);
	}

	// getting all student records by using the method findaAll() of CrudRepository
	@GetMapping("/listStudent")
	public List<StudentEntity> getAllStudents() throws RecordNotFoundException {
		Log.info("Started viewing student details");
		@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
		ResponseEntity<Boolean> reponseEntity;
		Log.info("All student details viewed");
		return studentService.findAllStudents();

	}

}
