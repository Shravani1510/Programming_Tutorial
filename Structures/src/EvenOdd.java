import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int number = x%2;
		if(number==0) {
			System.out.println("even");
		}else if(number==1) {
			System.out.println("odd");
		}
		
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
