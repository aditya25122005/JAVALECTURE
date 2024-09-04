package lec5;
import java.util.*;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8 bit=m1 byte
//		16 bit=2byte
//		32 bit= 4 byte
		
		
//		byte
//		short   2 byte
//		int     4 byte
//		long
//		
//		float    
//		double
//		
//		char     2 byte
//		boolean  1 bit
		
		int n=38;
		int sum=0;
		int mul=1;
		
		while(n>0) {
			int rem=n%2;
			sum= sum+rem*mul;
			n=n/2;
			mul=mul*10;
		}
		System.out.print(sum);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
