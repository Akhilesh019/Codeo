package codeo.java;
import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int d;
	/*		while(n!=0)
		{
			d=n%10;
			System.out.print(d+" ");
			n=n/10;
		}
		*/
		int temp = n;
		int r = 0;
		while (n!=0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println(r);
		if (r==temp) {
			System.out.println("P");
		}
		else {
			System.out.println("Not");
		}
	}

}
 