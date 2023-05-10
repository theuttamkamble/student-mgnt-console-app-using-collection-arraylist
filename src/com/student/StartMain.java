package com.student;

import java.util.ArrayList;
import java.util.Scanner;

import com.student.operation.Operations;
import com.student.pojo.Student;

public class StartMain {

static ArrayList<Student> students = new ArrayList<Student>();
	
	public static void main(String[] args) {	
		// program starts here...
		StartMain.start();
	}
	
	public static void start() {
		
		System.out.println("+--------[ Welcone To Student ]----------------------------------------+");
		System.out.println("+----------------------------------------------------------------------+");
		System.out.println("|    1 for SHOW All Student List                                       |");
		System.out.println("|    2 for CREATE New Student/s                                        |");
		System.out.println("|    3 for UPDATE a Student                                            |");
		System.out.println("|    4 for SEARCH a Student                                            |");
		System.out.println("|    5 for DELETE a Student                                            |");
		System.out.println("|    6 for DELETE ALL Students                                         |");
		System.out.println("|    7 for EXIT                                                        |");
		System.out.println("+----------------------------------------------------------------------+");
		
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.print("What do you want? : ");
		option = sc.nextInt();		
		
		switch (option)
		{
		case 1: 
			System.out.println("Displaying...");
			Operations.displayAllStudents(students);
			StartMain.start();
			break;
		
		case 2: 
			Operations.createNewStudent(students);
			StartMain.start();
			break;
		
		case 3: 
			Operations.updateStudent(students);
			StartMain.start();
			break;
			
		case 4: 
			Operations.searchStudentByName(students);
			StartMain.start();
			break;
		
		case 5: 
			Operations.deleteStudent(students);
			StartMain.start();
			break;
		
		case 6: 
			Operations.deleteAllStudents(students);
			StartMain.start();
			break;
		
		case 7: 
			System.out.println("Thank you!\nVisit again");
			System.out.println("+----------------------------------------------------------------------+");
			System.exit(option);
			break;
		
		default: 
			System.out.println("Please try again.\n");
			StartMain.start();
			break;
		
		}
		
		System.out.println("+----------------------------------------------------------------------+");
	}
	

}
