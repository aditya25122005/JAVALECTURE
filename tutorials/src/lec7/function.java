package lec7;

public class function {
	public static void Add(int a,int b) {
		System.out.println(a+b);
	}
	public static boolean checkPrime(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(2,3);
		for(int i=1;i<=100;i++) {
			if(checkPrime(i)==true) {
				System.out.print(i+", ");
			}
		}
		

	}

}
