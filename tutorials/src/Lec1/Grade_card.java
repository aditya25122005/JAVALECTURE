package Lec1;

public class Grade_card {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int m=78;
		if(m>100 || m<0) {
			System.out.println("Invalid Input");
		}
		
		if(m>=75) {
			System.out.println("A");
			
		}
		else if(m>=65 && m<75) {
			System.out.println("B");
		}
		else if(m>=55 && m<65) {
			System.out.println("C");
		}
		else if(m>=45 && m<65) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
			
		}

	}

}
