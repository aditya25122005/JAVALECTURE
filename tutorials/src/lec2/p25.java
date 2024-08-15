package lec2;

public class p25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		int x=0;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print("     ");
				space++;
			}
			int k=1;
			while(k<=2*i-1) {
				System.out.print(+ ++x+"    ");
				k++;
			}
			i++;
			System.out.println();
		}

	}

}
