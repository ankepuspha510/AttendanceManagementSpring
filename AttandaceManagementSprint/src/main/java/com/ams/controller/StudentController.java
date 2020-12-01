package com.ams.controller;

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

import com.ams.entity.Student;
import com.ams.service.StudentService;

@RestController
@RequestMapping("/api/AttendanceManagementSystem")
public class StudentController {
	@Autowired
	StudentService service;
	@GetMapping("/helloworld")
	public String sayHello() {
		return "HelloWorld";
	}
	@PostMapping("/insert")

	public Long create(@RequestBody Student student) {

		service.add(student);

		@SuppressWarnings({ "unused", "unchecked", "rawtypes" })

		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);

		return student.getStudentId();

	}
	// creating put mapping that updates the attendance detail

		@PutMapping("/update")

		public ResponseEntity<Boolean> update(@RequestBody Student student) {

			service.update(student);

			@SuppressWarnings({ "rawtypes", "unchecked" })

			ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);

			return responseEntity;

		}
		// creating a delete mapping that deletes a specified student

		@RequestMapping(value = "/delete/{studentId}", method = RequestMethod.DELETE)

		public String deleteStudent(@PathVariable Long studentId) {

			service.deleteByStudentId(studentId);

			return "student has been deleted successfully";

		}
		@GetMapping("/findStudent/{studentId}")

		public ResponseEntity<Student> getStudentBystudentId(@PathVariable("studentId") Long studentId) {

			Student student = service.findByStudentId(studentId);

			return new ResponseEntity<Student>(student, new HttpHeaders(), HttpStatus.OK);

		}
		@GetMapping("/findroll/{rollNo}")

		public ResponseEntity<Student> getStudentByRollNo(@PathVariable("rollNo") Long rollNo) {

			Student student = service.findByRollNo(rollNo);

			return new ResponseEntity<Student>(student, new HttpHeaders(), HttpStatus.OK);

		}
        @GetMapping("/findgender/{gender}")
        public ResponseEntity<Student> getStudentByGender(@PathVariable("gender") String gender) {

			Student student = service.findByGender(gender);

			return new ResponseEntity<Student>(student, new HttpHeaders(), HttpStatus.OK);

		}
        @GetMapping("/findfirstname/{firstName")
        public ResponseEntity<Student> getStudentByFirstName(@PathVariable("firstName") String firstName) {

			Student student = service.findByFirstName(firstName);

			return new ResponseEntity<Student>(student, new HttpHeaders(), HttpStatus.OK);

		}
        
        

}
