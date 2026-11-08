package com.studentManagementsystem;

import java.util.Scanner;

import com.student.StudentDataProcessing;

public class ChoiceOptions {

	public static void viewProcessing() {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {

			System.out.println("Enter Your Choice ");
			System.out.println("1. Add Student ");
			System.out.println("2. View All Students ");
			System.out.println("3. Search By RollNumber ");
			System.out.println("4. Update Student ");
			System.out.println("5. Delete Student ");
			System.out.println("6. Sort Student By Marks ");
			System.out.println("7. Show Topper ");
			System.out.println("8. Show Passed Students ");
			System.out.println("9. Show Average marks ");
			System.out.println("0. Exit ");

			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1: {
				System.out.println("Enter Name : ");
				String studentName = sc.nextLine();

				System.out.println("Enter Roll Number : ");
				String studentId = sc.nextLine();

				System.out.println("Enter Marks :");
				double marks = sc.nextDouble();

				StudentDataProcessing.addStudent(studentName, studentId, marks);

				break;
			}
			case 2: {
				StudentDataProcessing.viewAllStudents();
				break;
			}
			case 3: {
				System.out.println("Enter Roll Number ");
				String rno = sc.nextLine();
				StudentDataProcessing.SearchByRollNumber(rno);
				break;
			}
			case 4: {
				System.out.println("Enter Roll Number : ");
				String studentId = sc.nextLine();

				System.out.println("Enter Name Name : ");
				String studentName = sc.nextLine();

				StudentDataProcessing.updateStudent(studentName, studentId);
				break;
			}
			case 5: {
				System.out.println("Enter Roll Number : ");
				String studentId = sc.nextLine();

				StudentDataProcessing.deleteStudent(studentId);
				break;
			}
			case 6: {
				StudentDataProcessing.sortStudentsByMarks();
				break;
			}
			case 7: {
				StudentDataProcessing.showToppers();
				break;
			}
			case 8: {
				StudentDataProcessing.showPassedStudents();
				break;
			}
			case 9: {
				StudentDataProcessing.showAverageMarks();
				break;
			}
			case 0: {
				flag = false;
				System.out.println("Exited");
				break;
			}
			default:
				System.out.println("Please Enter the Valid Number");
			}

		}

		sc.close();
	}
}
