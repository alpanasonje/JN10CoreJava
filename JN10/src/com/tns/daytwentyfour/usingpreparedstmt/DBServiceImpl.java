package com.tns.daytwentyfour.usingpreparedstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBServiceImpl implements IDBService {
	static Connection cn;
	PreparedStatement pst;
	static {
		cn = DBUtil.getCn();
	}

	@Override
	public void addStudent(Student s) throws SQLException {
		pst = cn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		pst.setInt(1, s.getRno());
		pst.setString(2, s.getName());
		pst.setFloat(3, s.getPer());
		int n = pst.executeUpdate();
		if (n != 0)
			System.out.println("Record is inserted successfully....");

	}

	@Override
	public Student getStudentByRno(int rno) throws SQLException {
		Student st = null;
		pst = cn.prepareStatement("SELECT * FROM student WHERE rno=?");
		pst.setInt(1, rno);
		ResultSet rs;
		rs = pst.executeQuery();
		if (rs.next())
			st = new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
		return st;
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		List<Student> studentList = new ArrayList<Student>();
		Student st = null;
		pst = cn.prepareStatement("SELECT * FROM student");
		ResultSet rs;
		rs = pst.executeQuery();
		while (rs.next()) {
			st = new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
			studentList.add(st);
		}
		return studentList;
	}

	@Override
	public int deleteStudentByRno(int rno) throws SQLException {
		pst = cn.prepareStatement("DELETE FROM student WHERE rno=?");
		pst.setInt(1, rno);
		return pst.executeUpdate();

	}

	@Override
	public int deleteByPercentage(float per) throws SQLException {
		pst = cn.prepareStatement("DELETE FROM student WHERE per<?");
		pst.setFloat(1, per);
		return pst.executeUpdate();
	}

	@Override
	public int updateStudent(int rno, Student s) throws SQLException {
		pst = cn.prepareStatement("UPDATE student SET name=?, per=? WHERE rno=?");
		pst.setString(1, s.getName());
		pst.setFloat(2, s.getPer());
		pst.setInt(3, rno);
		return pst.executeUpdate();

	}

}
