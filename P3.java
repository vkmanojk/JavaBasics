package lab;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};
		int sum=0;
		for(int i=0;i<5;++i)
		{
			sum+=a[i];
		}
		float avg=sum/5;
		System.out.println("The average is: "+avg);
	}

}
