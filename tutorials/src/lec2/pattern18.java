
package lec2;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int i=1;
		while(i<=n) {
			//space
			int space=3;
			while(space<=4) {
				System.out.print(" ");
				space++;
			}
			int star=1;
			while(star<=i) {
				System.out.print("*");
				star+=2;
				
			}
			i++;
			System.out.println();
		}
				

	}

}
