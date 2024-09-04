package lec6;
import java.util.*;

public class pascal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int row=0;
		int star= 1;
		while(row< n) {
			int i=0;
			int ncr=1;
			while(i<star) {
				System.out.print(ncr+ " ");
				ncr=(row-i)*ncr /(i+1);
				i++;
			}
			System.out.println();
			row++;
			star++;
			
			//star
//			(n-r / r+1 )*NcR
			
			
//	0		1
//	1		1 1
//	2		1 2 1
//	3		1 3 3 1
//	4		1 4 6 4 1
//	5		1 5 10 10 5 1
			
			
			
			
			
			
			
			
			
		}
		
	}

}
