package lec3;

public class p25 {
	public static void main(String [] args) {
		int n=5;
		int i=1;
		int x=0;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print("    ");	
				space++;
				
			}
			int star=1;
			while(star<=2*i-1) {
				System.out.print(x++ +"   ");
				star++;
			}
			i++;
			System.out.println();
		}
	}

}
