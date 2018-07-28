package lab;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]   s = new int[10];

		for(int i=0; i < s.length; i++)
		{
		    s[i] =10-i;
		}
		System.out.println(java.util.Arrays.toString(s));
		java.util.Arrays.sort(s);
		System.out.println(java.util.Arrays.toString(s));


	}

}
