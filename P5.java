package lab;

import java.util.*;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		int n=input.nextInt();
		int next=1;
		int a[]= new int[n];
		a[0]=1;
		System.out.print("0  1 ");
		for(int i=0;i<n-2;++i)
		{
			System.out.printf("%d  ",a[i]);
			a[i+1]=a[i]+next;			
			next=a[i];
		}

	}

}
