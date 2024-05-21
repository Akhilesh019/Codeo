package com.codeo.loops;
import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String operation = sc.next();
		
		switch(operation) {
		case "Create":
			System.out.println("Database is created");
			break;
		case "Delete":
			System.out.println("Data is deleted");
			break;
		case "Update":
			System.out.println("Data is updated");
			break;
		case "Retrieve":
			System.out.println("Data is Retrieved");
			break;
		default:
			System.out.println("Invalid operation: " + operation );
		}

	}

}
