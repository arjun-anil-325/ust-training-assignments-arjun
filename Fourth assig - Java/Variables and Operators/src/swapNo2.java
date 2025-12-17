import java.util.Scanner;
public class swapNo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter second number : ");
		double b = sc.nextDouble();
		
		System.out.println("Before swapping : a = "+a+", b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping : a = "+a+", b = "+b);
		
		sc.close();
		
	}

}