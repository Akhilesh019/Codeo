package codeo.java;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		if (n%4==0 && n%100!=0)
			System.out.println("True");
		else if (n%400==0)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
