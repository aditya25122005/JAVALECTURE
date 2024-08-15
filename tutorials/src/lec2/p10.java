package lec2;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=5;
		while(i>0) {
			
			int space=n-i;
			while(space>0) {
				System.out.print("  ");
				space--;
			}
			int star=2*i-1;
			while(star>0) {
				System.out.print("* ");
				star--;
				
				
			}
			i--;
			System.out.println();
					
			
		}

	}

}
