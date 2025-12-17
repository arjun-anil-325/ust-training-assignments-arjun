import java.util.Scanner;
public class swapNo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter second number : ");
		double b = sc.nextDouble();
		
		System.out.println("Before swapping : a = "+a+", b = "+b);
		
		double temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping : a = "+a+", b = "+b);
		
		sc.close();
		
	}

}