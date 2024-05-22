package codeo.java;
import java.util.Scanner;


public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("The sum of the number is: ");
		System.out.println(sum);
		
		
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("Hello,");
		System.out.println(name);
	}

}
