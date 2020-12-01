package com.ams.entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
import com.sun.istack.NotNull;
import javax.persistence.Table;

@Entity
@Table(name = "studenttable1")
public class Student {
	@Id
	@Column(name = "STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long studentId;
	@NotNull
	@Column(name="Roll_No",length=10)
	private Long rollNo;
	@NotNull
	@Column(name="FIRST_NAME",length=10)
	private String firstName;
	@NotNull
	@Column(name="LAST_NAME",length=10)
	private String lastName;
	@NotNull
	@Column(name="Gender",length=10)
	private String gender;
	@NotNull
	@Column(name="Email",length=10)
	private String email;
	@NotNull
	@Column(name="Mobile",length=15)
	private String mobileNo;
	@NotNull
	@Column(name="COURSE",length=10)
	private String courseName;
	@NotNull
	@Column(name="COURSE_ID",length=10)
	private Long courseId;
	@NotNull
	@Column(name = "SUBJ_NAME", length = 10)
	private String subjectName;
	@NotNull
	@Column(name = "SUBJ_ID", length = 10)
	private Long subjectId;
	@NotNull
	@Column(name="FATHER_Mobile",length=10)
	private Long fatherMobile;
	public Student(Long rollNo, String firstName, String lastName, String gender, String email, String mobileNo,
			String courseName, Long courseId, String subjectName, Long subjectId, Long fatherMobile) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.mobileNo = mobileNo;
		this.courseName = courseName;
		this.courseId = courseId;
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.fatherMobile = fatherMobile;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Long getFatherMobile() {
		return fatherMobile;
	}
	public void setFatherMobile(Long fatherMobile) {
		this.fatherMobile = fatherMobile;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollNo=" + rollNo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", email=" + email + ", mobileNo=" + mobileNo + ", courseName="
				+ courseName + ", courseId=" + courseId + ", subjectName=" + subjectName + ", subjectId=" + subjectId
				+ ", fatherMobile=" + fatherMobile + "]";
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
