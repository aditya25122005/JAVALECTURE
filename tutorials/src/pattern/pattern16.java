package pattern;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int n=5;
		for(int i=1;i<2*n;i++)
		{
			int spaces=i>n? i-n:n-i;
			int stars=i>n? i-n+1:n-i+1;
			for(int k=1;k<=spaces;k++) {
					System.out.print("  ");
			}
			for(int j=1;j<=stars;j++) {
					System.out.print("* ");
			}
        	System.out.println();
		}
	}

}
