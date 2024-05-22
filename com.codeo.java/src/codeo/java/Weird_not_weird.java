package codeo.java;

import java.util.Scanner;

public class Weird_not_weird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		
		if (n%2!=0 && n<101)
			System.out.println("Weird");
		else {
			
			if (n>=2 && n<=5 && n%2==0)
				System.out.println("Not Weird");
			else if (n>=6 && n<=20)
				System.out.println("Weird");
			else if (n>20 && n<101 && n %2==0)
				System.out.println("Not Weird");
			else
				System.out.println("Invalid");
		}
	}

}
