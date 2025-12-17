import java.util.Scanner;
public class basicOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		int sum = a+b;
		int diff = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println("Sum is "+sum);
		System.out.println("Difference is "+diff);
		System.out.println("Product is "+mul);
		System.out.println("Quotient is "+div);
		
		sc.close();

	}

}
