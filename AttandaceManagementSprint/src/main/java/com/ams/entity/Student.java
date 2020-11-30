package com.ams.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="student")
public class Student {
	@Id // specifies the property, used for identify the class
	@Column(name="student_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long studentId;
	private Long rollNo;
	private String firstName;
	private String lastName;
	//private Date dob;
	private String gender;
	private String mobileNo;
	private Long courseId;
	private String courseName;
	private Long subjectId;
	private String subjectName;
	private String semester;
	private String emailId;
	private String fatherEmailId;
	private String fatherMobileNo;
	private String profilePic;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollNo=" + rollNo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", mobileNo=" + mobileNo + ", courseId=" + courseId
				+ ", courseName=" + courseName + ", subjectId=" + subjectId + ", subjectName=" + subjectName
				+ ", semester=" + semester + ", emailId=" + emailId + ", fatherEmailId=" + fatherEmailId
				+ ", fatherMobileNo=" + fatherMobileNo + ", profilePic=" + profilePic + "]";
	}
	
	public Student(Long studentId, Long rollNo, String firstName, String lastName, String gender, String mobileNo,
			Long courseId, String courseName, Long subjectId, String subjectName, String semester, String emailId,
			String fatherEmailId, String fatherMobileNo, String profilePic) {
		super();
		this.studentId = studentId;
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.courseId = courseId;
		this.courseName = courseName;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.semester = semester;
		this.emailId = emailId;
		this.fatherEmailId = fatherEmailId;
		this.fatherMobileNo = fatherMobileNo;
		this.profilePic = profilePic;
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
	/**public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}***/
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFatherEmailId() {
		return fatherEmailId;
	}
	public void setFatherEmailId(String fatherEmailId) {
		this.fatherEmailId = fatherEmailId;
	}
	public String getFatherMobileNo() {
		return fatherMobileNo;
	}
	public void setFatherMobileNo(String fatherMobileNo) {
		this.fatherMobileNo = fatherMobileNo;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
