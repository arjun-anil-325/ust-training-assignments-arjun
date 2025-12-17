import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal : ");
		double p = sc.nextDouble();
		
		System.out.println("Enter interest rate : ");
		double r = sc.nextDouble();
		
		System.out.println("Enter time in years : ");
		double t = sc.nextDouble();
		
		double SI = (p*r*t)/100;
		System.out.println("SI is "+SI);
		
		double TA = p + SI;
		System.out.println("Total amount is "+TA);
		
		sc.close();
		
		}

}
