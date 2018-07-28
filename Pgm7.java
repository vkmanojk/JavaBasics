package aK;

import java.util.Scanner;

public class Pgm7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number whose multiplication table is required: ");
		int n=input.nextInt();
		for(int i=1;i<=10;++i)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
		input.close();
	}

}
