package pattern;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=5;i>0;i--) {
			for(int s=n-i;s>0;s--) {
				System.out.print("  ");
			}
			
			for(int j=2*i-1;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
