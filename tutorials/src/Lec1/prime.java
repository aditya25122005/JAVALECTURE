package Lec1;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c==1 || n==0 ||n==1) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("prime");
		}

	}

}
