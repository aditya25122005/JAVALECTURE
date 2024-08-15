package Lec1;

public class print_Prime {
	public static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}	
		return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ALL PRIME NO UPTO n");
		for (int i=1;i<=100;i++) {
			if(isPrime(i)==true) {
				System.out.print(i+" ");
			}
		}
		
		

	}

}
