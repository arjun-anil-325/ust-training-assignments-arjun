import java.util.Scanner;
public class AreaAndPeriOfRect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of rectangle : ");
		float l = sc.nextFloat();
		
		System.out.println("Enter breadth of rectangle : ");
		float b = sc.nextFloat();
		
		float p = 2*(l+b);
		float a = l*b;
		
		System.out.println("Perimeter of rectangle is "+p);
		System.out.println("Area of rectangle is "+a);
		
		sc.close();
	}

}
