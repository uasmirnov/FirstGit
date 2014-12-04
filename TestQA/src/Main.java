import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first variale");
		int a = scn.nextInt();
		
		if (a == 0)
		{
			System.out.println("First variable = 0" + " Error");
			System.exit(0);
			}
		else
	     	if(a == 1)
				{
				while (a<4)
				a++;
				}
	     			else System.exit(0);
	     	
		Scanner scn2 = new Scanner(System.in);
		System.out.println("Enter second variable");
		int b = scn2.nextInt();
			
		System.out.println("Result: " + a/b);
		}		
}


