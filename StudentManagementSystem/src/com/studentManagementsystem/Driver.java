package com.studentManagementsystem;

import java.util.Scanner;

public class Driver {
	static {
		System.out.println("Welcome to KodeWala");
		System.out.println("Student Management System");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChoiceOptions.viewProcessing();

		sc.close();
	}
}
