package lec3;

public class p27 {
	public static void main(String [] args) {
		int n=5;
		int i=1;
//		int x=0;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print("  ");	
				space++;
				
			}
			int star=1;
			int j=1;
			while(star<=2*i-1) {
				if(j<star/2+1) {
					
				}
				System.out.print(star+" ");
				star++;
			}
			i++;
			System.out.println();
		}
		
	}

}
