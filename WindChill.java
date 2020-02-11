import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		//wind chill formula constants
		final double CONSTANT_1 = 35.74;
		final double CONSTANT_2 = 0.6215;
		final double CONSTANT_3 = 35.75;
		final double CONSTANT_4 = 0.16;
		final double CONSTANT_5 = 0.4275;
		
		//variables
		double outsideTemp;		//outside temperature
		double windSpeed;		//wind speed
		double windChill;		//wind chill
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter outside temperature in Fahrenheit: ");
		outsideTemp = scan.nextDouble();
		System.out.print("Enter wind speed in mph: ");
		windSpeed = scan.nextDouble();
		
		windChill = CONSTANT_1 + (CONSTANT_2 * outsideTemp) - (CONSTANT_3 * Math.pow(windSpeed, CONSTANT_4))
				+ (CONSTANT_5 * outsideTemp * Math.pow(windSpeed, CONSTANT_4));
		
		System.out.println("\nWind Chill is: " + windChill);
		
		scan.close();		
	}

}
