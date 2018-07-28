package aK;

public class Pgm9 {

	public static void main(String[] args) {
		String s1="Hello"; 
		String s2="whatsup"; 
		System.out.println("string length is: "+s1.length());  
		System.out.println("string length is: "+s2.length()); 
		System.out.println(s1.compareTo(s2));
		s1=s1.concat("how are you");
		System.out.println(s1);
		System.out.println(s2.isEmpty());
		System.out.println(s2+"how are you");       
	    System.out.println(s2.trim()+"how are you"); 
	    String s1lower=s1.toLowerCase();
	    System.out.println(s1lower);
	    String s1upper=s1.toUpperCase();  
	    System.out.println(s1upper);
	    System.out.println(s1.contains("hello")); 
	    System.out.println(s1.equalsIgnoreCase(s2));
	    char[] ch=s1.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    	System.out.print(ch[i]);
	    byte[] b=s1.getBytes(); 
	    for(int i=0;i<b.length;i++) {
    	System.out.println(b[i]);
	    }
	    System.out.println(s2.isEmpty());
	    System.out.println(s1.endsWith("how"));
	    
	}

}
