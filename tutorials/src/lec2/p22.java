package lec2;
import java.util.Scanner;

public class p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int row=1;
		int star=n;
		while(row<=n) {
			int space=2*row-3;
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
			j++;
			}
			//star
			int k=1;
			if(row==1) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
			
			//next row prep
			System.out.println();
			star--;
			row++;
			space+=2;

			
		}

	}

}
