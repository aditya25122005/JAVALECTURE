package pattern;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<2*n;i++) {
			int curr= i<n? i: 2*n-i;
			for(int j=1;j<=curr;j++) {
				System.out.print(curr);
				System.out.print(j<curr? "*": "");
			}
			System.out.println();
		}
		

	}

}
