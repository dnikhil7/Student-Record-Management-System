package com.service;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Details obj= new Details();
		
		ArrayList<Student> student=new ArrayList<Student>();
		ArrayList<Student> s = null;
		
		
		System.out.println("* Welcome to Student Record Management System *");
		
		System.out.println(" ");
		
		System.out.println("You can do the following operation in this system: ");
		System.out.println("Add");
		System.out.println("View");
		System.out.println("Update");
		System.out.println("Delete");
		System.out.println("Once you start you will do all this operations");
		System.out.println("Enter 1 to start the process: ");
		
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1 :
			System.out.println("Please enter your details in ID, Name, Marks formate: ");
			s=obj.addStudent();

		case 2 :
			System.out.println("Please enter your ID to view details: ");
			int id=sc.nextInt();
			obj.getDetails(id);
			System.out.println(s);

		case 3 :
			System.out.println("Enter your recent marks: ");
			int marks=sc.nextInt();
			s=obj.updateMarks(marks);
			System.out.println(s);
			
		case 4 :
			System.out.println("Enter your ID to delete your details: ");
			int ID=sc.nextInt();
			s=obj.deleteDetails(ID);
		}
		
	}

}
