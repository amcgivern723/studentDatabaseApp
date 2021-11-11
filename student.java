package studentDatabaseApp;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int  schoolYear;
	private String studentID;
	private String courses = "" ;
	private int tutionBalance;
	private static int costOfCourse = 600; 
	private static int id = 1000;
	
	//Constructor to prompt students to enter students name and year 
	public student() { 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - level 4\n2 - Level 5\n3 - Level 6\n4 - Level 7 \n Enter student School Year: ");
		this.schoolYear = in.nextInt();
		
		setstudentID(); 
		
	}


	// Generate ID 
	private void setstudentID() {
		// School year + ID 
		id++;
		this.studentID = schoolYear + "" + id;
		
	}

	// Enrol in courses 
	public void enrol() {
		//Get inside a loop, user hits 0
		do { 
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) { 
				courses = courses + "\n " + course;
				tutionBalance = tutionBalance + costOfCourse;
			}
			else {
				break;
				}
		}
		while (1 !=0);
	}

	// View Balance 
	public void viewBalance() {
		System.out.println("Your Balance is: £" + tutionBalance);
	}
	
	// Pay Tuition 
	public void payTution() {
		viewBalance();
		System.out.print("Please enter your payment: £ ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment; 
		System.out.println("Thank You for your payment of £" + payment);
		viewBalance();
	}
	// Show Status 
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nUniversity Level" + schoolYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: £" + tutionBalance;
	}
}

