package com.student.operation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.student.pojo.Student;

public class Operations {
static Scanner sc = new Scanner(System.in);
	
	// Code for Display All student list
	public static void displayAllStudents(ArrayList<Student> students) {
		Iterator<Student> itr = students.iterator();
		
		System.out.println("\nsid  -  sname  -     email    -   course  - fee");
		System.out.println("+----------------------------------------------------------------------+");
		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println("| " + s.getSid() + " - " + s.getSname() + " - " + s.getEmail() + " - " + s.getCourse()+ " - " + s.getFee());
		}
	}
	
	// Code for Create or Add new, one or more Students
	public static void createNewStudent(ArrayList<Student> students) {
		int x;
		System.out.print("How many students do you want to add: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			Student s = new Student();
			System.out.println("\nEnter Student details >>");
			System.out.print("ID: ");
			int id = sc.nextInt();
			s.setSid(id);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			s.setSname(name);

			System.out.print("Email: ");
			String email = sc.nextLine();
			s.setEmail(email);

			System.out.print("Course: ");
			String course = sc.nextLine();
			s.setCourse(course);

			System.out.print("Fee: ");
			double fee = sc.nextDouble();
			s.setFee(fee);

			students.add(s);
			sc.nextLine();
		}
		
		System.out.println("\nStudent/s Added Successfully.");
		Operations.displayAllStudents(students);
	}

	// Code for Update Student Details
	public static void updateStudent(ArrayList<Student> students) {
		int id;
		System.out.print("Enter Student ID for Update: ");
		id = sc.nextInt();

		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			if (s.getSid() == id) {
				System.out.println("What do you want to Update?\n");

				int opt;

				System.out.println("+---------------------------------------------------+");
				System.out.println("| 1 Update ID                                       |");
				System.out.println("| 2 Update Name                                     |");
				System.out.println("| 3 Update Email                                    |");
				System.out.println("| 4 Update Course                                   |");
				System.out.println("| 5 Update Fee                                      |");
				System.out.println("+---------------------------------------------------+");

				System.out.print("\nOption: ");
				opt = sc.nextInt();
				sc.nextLine();

				switch (opt) {
				case 1:
					System.out.print("Enter New ID: ");
					int sid = sc.nextInt();
					s.setSid(sid);
					break;

				case 2:
					System.out.print("Enter New Name");
					String sname = sc.nextLine();
					s.setSname(sname);
					break;

				case 3:
					System.out.print("Enter New Email: ");
					String email = sc.nextLine();
					s.setEmail(email);
					break;

				case 4:
					System.out.print("Enter New Course: ");
					String scourse = sc.nextLine();
					s.setCourse(scourse);
					break;

				case 5:
					System.out.print("Enter New Fee: ");
					double sfee = sc.nextDouble();
					s.setFee(sfee);
					break;

				default:
					System.out.println("Something went wrong!");
					System.out.println("Please try again.");
					break;
				}
			}
		}
	}

	// Code for Search a Student (search by Student Name) -- 1
	public static void searchStudentByName(ArrayList<Student> students) {
		System.out.print("\nEnter Student ID or Name: ");
		String searched = sc.nextLine();
		System.out.println("Searching...");
		
		Iterator<Student> itr = students.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			if(s.getSname().equals(searched)) { 
				System.out.println("[ ID = "+s.getSid()+" Name = "+s.getSname()+" Email = "+s.getEmail()+" Course = "+s.getCourse()+" Fee = "+s.getFee()+" ]");
			} else {
				Operations.searchStudentById(s, searched);
			}
		}
	}

	// Code for Search a Student (search by Student ID) -- 2
	private static void searchStudentById(Student s, String searched) {
		
		try {
			if(s.getSid() == Integer.parseInt(searched)) {
				System.out.println("[ ID = "+s.getSid()+" Name = "+s.getSname()+" Email = "+s.getEmail()+" Course = "+s.getCourse()+" Fee = "+s.getFee()+" ]");
				
			}
		} catch(NumberFormatException e) {
			/* you can print exception here
			 * i put it blank here bcoz
			 * i dont want to display any extra code.
			 */
		}

	}
	
	// Code for Delete a Student (delete by Student ID)
	public static void deleteStudent(ArrayList<Student> students) {
		int id;

		System.out.print("Which Student do you want to DELETE Enter ID: ");
		id = sc.nextInt();

		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();

			if (s.getSid() == id) {
				System.out.println(s.getSname() + " Deleted successfully.");
				students.remove(s);
				break;
			}
		}
	}

	// Code for Delete all Student 
	public static void deleteAllStudents(ArrayList<Student> students) {
		char c;

		System.out.print("Are you sure to DELETE ALL Students (Y/n)? ");
		c = sc.next().charAt(0);

		if (c == 'Y' || c == 'y') {
			students.removeAll(students);
			System.out.println("Successfully Deleted all students.");
		} 
		else if (c == 'N' || c == 'n') {
			System.out.println("Cancelled");
		} 
		else {
			System.out.println("Invalid! Try again.");
			Operations.deleteAllStudents(students);
		}
	}
	
	/*
	// Testing code for Search a student by ID
	private static void searchStudentById(ArrayList<Student> students, String searched) {
		Iterator<Student> itr = students.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			try {
				if(s.getSid() == Integer.parseInt(searched)) {
					System.out.println("ID = "+s.getSid()+" Name = "+s.getSname()+" Email = "+s.getEmail()+" Course = "+s.getCourse()+" Fee = "+s.getFee());
					// break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("---------------------------");
			}
			
		}
	} 
	*/
}
