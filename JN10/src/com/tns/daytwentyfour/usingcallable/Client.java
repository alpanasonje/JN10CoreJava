package com.tns.daytwentyfour.usingcallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.tns.daytwentyfour.usingpreparedstmt.DBUtil;

public class Client {
	public static void main(String[] args) {
		Connection cn=DBUtil.getCn();
		try {
			CallableStatement cst=cn.prepareCall("{?= call getper(?)}");
			cst.registerOutParameter(1,Types.DOUBLE);
			cst.setInt(2, 21);
			cst.execute();
			System.out.println("Percentage is "+cst.getDouble(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
