package com.tns.daytwentyfour.scrollableresultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

import com.tns.daytwentyfour.usingpreparedstmt.DBUtil;

public class StudentDetails {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		int rno;
		String name;
		float per;
			try {
			Connection cn = DBUtil.getCn();
			Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("SELECT * FROM student");
			do {
				System.out.println("Welcome to the Application.");
				System.out.println("""
						1. Display First Record
						2. Display Next Record
						3. Display Previous Record
						4. Display Last Record
						5. Update current record
						6. delete current record
						7. Insert new record
						8. Exit.
						""");
				System.out.println("Enter Your Choice : ");
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					rs.first();
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					break;
				case 2:
					rs.next();
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					break;
				case 3:
					rs.previous();
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					break;

				case 4:
					rs.last();
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					break;
				case 5:
					scan.nextLine();	
					System.out.println("Enter the name : ");
					name=scan.nextLine();
					System.out.println("Enter the per : ");
					per=scan.nextFloat();
					rs.updateString(2, name);
					rs.updateFloat(3, per);
					rs.updateRow();
					System.out.println("Percentage updated...");
					break;
				case 6:
					rs.deleteRow();
					System.out.println("Current Row is deleted....");
					break;
				case 7:
					rs.moveToInsertRow();
					System.out.println("Enter roll number  : ");
					rno=scan.nextInt();
					scan.nextLine();
					System.out.println("Enter the name : ");
					name=scan.nextLine();
					System.out.println("Enter the per : ");
					per=scan.nextFloat();
				
					rs.updateInt(1,rno);
					rs.updateString(2,name);
					rs.updateFloat(3, per);
					rs.insertRow();
					System.out.println("Row is inserted...");
					break;
				case 8:
					System.out.println("You have exited from the System.");

					System.exit(0);
					break;
				default:
					System.out.println("You have Entered Wrong Choice.");
				}
			} while (true);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
