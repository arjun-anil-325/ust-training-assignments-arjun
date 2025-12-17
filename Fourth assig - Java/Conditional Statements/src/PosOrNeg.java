import java.util.Scanner;
public class PosOrNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		double num = sc.nextDouble();
		
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if(num<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
		
		sc.close();
	}

}
