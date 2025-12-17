import java.util.Scanner;
public class CelciusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature in celcius : ");
		double c = sc.nextDouble();
		
		double f = (c * 9 / 5) + 32;
		
		System.out.println("Temperature in fahrenheit is "+f);
		
		sc.close();

	}

}
