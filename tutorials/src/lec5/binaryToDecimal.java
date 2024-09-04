package lec5;

public class binaryToDecimal {
	
	 public static void main(String [] args) {
		 int n= 101100;
		 int sum=0;
		 int mul=1;
		 
		 while(n>0) {
			 int rem=n%10;
			 sum += rem*mul;
			 mul*=2;
			 n=n/10;
			 
		 }
		 System.out.print(sum);
		 
		 int src=8;
		 int des=10;
		 
		 
		 
	 }
	 
	 
	

}
