package studentDatabaseApp;

import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many new students you want to add
		System.out.print("Enter number of new students to enroll? : ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		student[] students = new student[numOfStudents];
		
		// Create a number of new students.
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new student();
			students[n].enrol();
			students[n].payTution();
			
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
			
		}

	}

}
