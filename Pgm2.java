package aK;

import java.util.Scanner;

public class Pgm2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		int n=input.nextInt();
		int sum=0;
		for(int i=0;i<n;++i)
		{
			sum+=(i+1);
		}
		System.out.println("The sum is "+sum);
		input.close();
	}

}
