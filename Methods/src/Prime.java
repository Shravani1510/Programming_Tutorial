import java.util.Scanner;


public class Prime {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number for testing wheather it is prime or not");
		int prime = scan.nextInt();
	boolean num = primefunction(prime);
		
			if(num)	{
			System.out.println("prime");
			}
			else {
				System.out.println("not a prime");
			}
		
		
		//todo: write a method which tells you if a given number is a prime or not
		
	}

	public static boolean primefunction(int n) {
		for(int i= 2; i<n; i++) {
			int result;
			result =n%i;
			if(result==0) {
				return false;
				}
		}
		// TODO Auto-generated method stub
		return true;
	}
}
