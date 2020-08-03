package java_02;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Import Scanner class for using input function
		String str;
		int num;
		
		System.out.print("Input a String: ");
		str = sc.next(); //Input and save it to a String variable
		
		System.out.print("Input a number: ");
		num = sc.nextInt(); //Input and save it to a int variable
		
		System.out.println("Output: "+str+", "+num);
	}
}
