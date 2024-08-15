package lec2;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		
		int n=5;
		while(row<2*n) {
			//space
			int space=1;
			while(space<=n-row) {
				System.out.print(" ");
				if(row<n) {
					space++;
				}
				else {
					space--;
				}
			}
			
			
			
			
		}

	}

}
