package aK;

import java.util.Scanner;

public class Pgm3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=input.nextInt();
		if(n%2!=0)
			System.out.println("ODD");
		else
			System.out.println("EVEN");
		input.close();

	}

}
