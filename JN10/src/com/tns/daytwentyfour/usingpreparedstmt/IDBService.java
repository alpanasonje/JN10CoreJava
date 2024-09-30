package com.tns.daytwentyfour.usingpreparedstmt;

import java.sql.SQLException;
import java.util.List;

public interface IDBService {
	void addStudent(Student s) throws SQLException;
	Student getStudentByRno(int rno)throws SQLException;
	List<Student> getAllStudents() throws SQLException;
	int deleteStudentByRno(int rno) throws SQLException;
	int deleteByPercentage(float per) throws SQLException;
	int updateStudent(int rno, Student s) throws SQLException;
}
