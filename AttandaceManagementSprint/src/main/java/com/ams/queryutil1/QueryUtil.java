package com.ams.queryutil1;

public class QueryUtil {
	private QueryUtil() {
	}

	public static final String VIEW_STUD_BY_ROLLNO = "SELECT s FROM Student s WHERE s.rollNo like ?1";
	public static final String VIEW_STUD_BY_COURSEID = "SELECT s FROM Student s WHERE s.courseId like ?1";
	public static final String DEL_STUD_BY_ID = "DELETE from Student s where s.studentId like ?1";

}
