package java_02;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Import Scanner class for using input function
		String str;
		int num1;
		double num2;
		
		System.out.print("Input a String: ");
		str = sc.next(); //Input and save it to a String variable
		
		System.out.print("Input a int: ");
		num1 = sc.nextInt(); //Input and save it to a int variable
		
		System.out.print("Input a double: ");
		num2 = sc.nextDouble();
		
		System.out.println("Output: "+str+", "+num1+", "+num2);
		
		
		
	}
}
