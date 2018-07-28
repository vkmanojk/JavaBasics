package lab;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sign;
		float div,sum=0;
		Scanner p=new Scanner(System.in);
		System.out.print("Enter the value for n: ");
		int size=p.nextInt();
		for(i=1;i<size;++i)
		{
			if(i%2==0)
			{
				sign=1;
			}
			else
				sign=-1;
			div=(float)1/(i+2);
			sum=sum+sign*div;
		}
		sum=4*(sum+1);
		System.out.println("The required output is: "+sum);

	}

}
