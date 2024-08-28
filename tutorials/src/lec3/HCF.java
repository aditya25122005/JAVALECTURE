package lec3;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60;
		int b=36;
		while(b%a !=0) {
			int rem=b%a;
			b=a;
			a=rem;
		}
		System.out.println(a);

	}

}
