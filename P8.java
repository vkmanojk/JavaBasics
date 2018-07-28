package lab;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one[]={1,2,3,4};
		char two[]={'O','A','O','O'};
		float gpa;
		float sgpa=0,nr;
		for(int i=0;i<4;++i)
		{
			switch(two[i])
			{
			case 'O':
				gpa=10;
				break;
			case 'A':
				gpa=9.5f;
				break;
			case 'B':
				gpa=9;
				break;
			case 'C':
				gpa=8;
				break;
			case 'D':
				gpa=7;
				break;
			case 'E':
				gpa=6;
				break;
			case 'P':
				gpa=5;
				break;
			default:
				gpa=0;
			}
			nr=gpa*one[i];
			sgpa=sgpa+(nr/one[i]);
		}
		System.out.print("The SGPA is: "+sgpa/4);

	}

}
