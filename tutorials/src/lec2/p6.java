package lec2;

public class p6 {
	public static void main (String[] args){
		int n=5;
		int i=5;
		while(i>0) {
			
			int space=1;
			while(space<=n-i) {
				System.out.print("    ");
				space++;
				
			}
			int star=1;
			while(star<=i) {
				System.out.print("* ");
				star++;
			}
			i--;
			System.out.println();
		}
		
	}

}
