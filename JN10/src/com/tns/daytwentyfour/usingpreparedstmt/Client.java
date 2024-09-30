package com.tns.daytwentyfour.usingpreparedstmt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		DBServiceImpl service=new DBServiceImpl();
		int rno;
		String name;
		float per;
		Student obj;
		try
		{
		do {
			System.out.println("Welcome to the Application.");
			System.out.println("""
					1. Insert the Record.
					2. Delete the Record by roll number.
					3. Delete the Record by percentage.
					4. Retrive all the Records.
					5. Retrieve the Record by roll number.
					6. Update the Record.
					7. Exit.
					""");
			System.out.println("Enter Your Choice : ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter roll number  : ");
				rno=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the name : ");
				name=scan.nextLine();
				System.out.println("Enter the per : ");
				per=scan.nextFloat();
				obj=new Student(rno,name,per);
				service.addStudent(obj);
				break;
			case 2:
				System.out.println("Enter the roll number to delete records");
				rno=scan.nextInt();
				n=service.deleteStudentByRno(rno);
				if (n>0)
				System.out.println(n+" rows deleted..");
				else
					System.out.println("No such record found");
				
				
				break;
			
			case 3:
				System.out.println("Enter the per to delete records");
				per=scan.nextFloat();
				n=service.deleteByPercentage(per);
				if (n>0)
				System.out.println(n+" rows deleted..");
				else
					System.out.println("No such record found");
				
				
				
				break;
			case 4:
				List<Student> list;
				list=service.getAllStudents();
				if (list.size()>0)
				System.out.println(list);
				else
					System.out.println("No record available");
				System.out.println("-----------------------------");
				
				break;
			case 5:
				System.out.println("Enter the roll number to delete records");
				rno=scan.nextInt();
				
				
				obj=service.getStudentByRno(rno);
				System.out.println(obj);
				System.out.println("-----------------------------");
				
				break;
			
			case 6:
				System.out.println("Enter the rollno  ");
				rno=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the name : ");
				name=scan.nextLine();
				System.out.println("Enter the new percentage ");
				per=scan.nextFloat();
				obj=new Student(rno,name,per);
				n=service.updateStudent(rno, obj);
				if (n>0)
					System.out.println(n+" rows deleted..");
					else
						System.out.println("No such record found");
					
				break;
			case 7:
				System.out.println("You have exited from the System.");
				
				System.exit(0);
				break;
			default:
				System.out.println("You have Entered Wrong Choice.");
			}
		}while(true);

		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
