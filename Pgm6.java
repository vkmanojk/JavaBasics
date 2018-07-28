package aK;

import java.util.Scanner;

public class Pgm6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("\n1.Add\n2.Subtract\n3.Multiply\n4.Divison ");
		System.out.println("\nEnter your choice: ");
		int op=scan.nextInt();
		int a,b;
		System.out.println("Enter two nos: ");
		a=scan.nextInt();
		b=scan.nextInt();
		switch(op)
		{
		case 1:
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
		case 2:
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
		case 3:
			System.out.println(a+" * "+b+" = "+(a*b));
			break;
		case 4:
			System.out.println(a+" / "+b+" = "+(a/b));
			break;
			
		}
		scan.close();
	}

}
