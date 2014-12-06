import java.util.Scanner;

public class NewBlockSheme {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first variale:");
		int a = scn.nextInt();
		
		Scanner scn2 = new Scanner(System.in);
		System.out.println("Enter second variable:");
		int b = scn2.nextInt();
		
		if(b==0) {
			System.out.println("Divisor can not be 0");
			System.exit(0);
		}else {
			System.out.println("Result: " + a/b);
		}
	}
}
