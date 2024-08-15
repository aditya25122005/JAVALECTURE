package pattern;

public class pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=5;
		while(i>0) {
			int j=5;
			while(j>0) {
				if(j==n-i+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(j+" ");
				}
				j--;
			}
			System.out.println();
			i--;
		}

	}

}
