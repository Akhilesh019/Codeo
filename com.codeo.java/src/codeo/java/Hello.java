package codeo.java;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("---------------");
		
		int X = 15;
		int Y = 15;	
		if (X>Y) {
		System.out.println("X is greater than Y");
	}
		else if(X<Y){
			System.out.println("X is smaller than Y");
		}
		else {
			System.out.println("Both are equal");
		}
		
		while(X > 10) {
			System.out.println(X);
			X--;
		}
		
		
		
		for(int i=0; i < 15; i++) {
			System.out.println(i);
		}
}
}
