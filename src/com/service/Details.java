package com.service;

import java.util.ArrayList;
import java.util.Scanner;

public class Details {
	
	Scanner sc=new Scanner(System.in);
	ArrayList<Student> s=new ArrayList<Student>();
	
	ArrayList<Student> addStudent() {
		
		 s.add(new Student(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
		return s;
	}
	
	ArrayList<Student> getDetails(int id){
		
		ArrayList<Student> filtered=s;
		filtered
		.stream()
		.filter((a) -> a.getId()==id)
		.toList();
		if(s.isEmpty()) {
			System.out.println("No details available");
		}
		return filtered;
		
	}
	
	ArrayList<Student> updateMarks(int marks){
		
		ArrayList<Student> modifiedMarks=s;
		modifiedMarks
		.stream()
		.peek((a) -> a.setMarks(marks))
		.toList();
		
		return modifiedMarks;
	}
	
	ArrayList<Student> deleteDetails(int id){
		
		ArrayList<Student> delete=s;
		boolean removed=delete
		.removeIf((std) -> std.getId()==id);
		if(removed) {
			System.out.println("Student with ID " + id + " has been deleted.");
		}
		else {
			System.out.println("No student found with ID " + id + ".");
		}
		return delete;
	}
	
	}

