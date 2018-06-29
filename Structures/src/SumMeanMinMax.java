import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = a+b+c;
		double mean=sum/3;
		if ((a>b)&&(a>c)) {
			System.out.println(a + " "+ "maximum");
		}else if((b>a)&&(b>c)) {
			System.out.println(b + " "+ "maximum");
		}else {
			System.out.println(c + " "+ "maximum");
		}
		if ((a<b)&&(a<c)) {
			System.out.println(a + " "+ "minimum");	
		}else if ((b<a)&&(b<c)) {
			System.out.println(b + " "+ "minimum");
		}else {
			System.out.println(c + " "+ "minimum");
		}
		System.out.println(sum + " " + mean);
			
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
