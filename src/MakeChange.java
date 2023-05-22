import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double changeReturned = 0;

		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		double remainder = 0;
		double remainder2 = 0;
		double remainder3 = 0;
		double remainder4 = 0;
		double remainder5 = 0;
		double remainder6 = 0;
		double remainder7 = 0;
		double remainder8 = 0;
		double a, b, c, d, e, f, g, h = 0;

		System.out.println("How much is the item you chose?");
		double itemPrice = sc.nextDouble();
		System.out.println("How much money was given?");
		double amountTendered = sc.nextDouble();
		
		
		if (amountTendered < itemPrice) {
			System.out.println("ERROR: Please give correct amount of  money!");
		}

		if (amountTendered >= itemPrice) {
			changeReturned = (amountTendered - itemPrice);
			double roundedNum = (changeReturned + 0.0005);

			a = roundedNum;
			a = a * 100;
			a = Math.floor(a);
			a = a / 100;
			System.out.println("Your change is " + a);

			twenties = (int) a / 20;
			System.out.println("You will recieve " + twenties + " twenties");
			remainder = (double) roundedNum % 20;
			

			b = remainder;
			b = b * 100;
			b = Math.floor(b);
			b = b / 100;

			tens = (int) b / 10;
			System.out.println("You will recieve " + tens + " tens");
			remainder2 = (double) roundedNum % 10;
			
			

			c = remainder2;
			c = c * 100;
			c = Math.floor(c);
			c = c / 100;

			fives = (int) c / 5;
			System.out.println("You will recieve " + fives + " fives");
			remainder3 = (double) roundedNum % 5;
            
            
			d = remainder3;
			d = d * 100;
			d = Math.floor(d);
			d = d / 100;

			ones = (int) d / 1;
			System.out.println("You will recieve " + ones + " ones");
			remainder4 = (double) roundedNum % 1;
			

			e = remainder4;
			e = e * 100;
			e = Math.floor(e);
			e = e / 100;

			quarters = (int) (e * 100) / 25;
			System.out.println("You will recieve " + quarters + " quarters");
			remainder5 = (double) roundedNum % .25;
			

			f = remainder5;
			f = f * 100;
			f = Math.floor(f);
			f = f / 100;

			dimes = (int) (f * 100) / 10;
			System.out.println("You will recieve " + dimes + " dimes");
			remainder6 = (double) roundedNum % .10;
			

			g = remainder5;
			g = g * 100;
			g = Math.floor(g);
			g = g / 100;

			nickels = (int) (g * 100) / 5;
			System.out.println("You will recieve " + nickels + " nickels");
			remainder7 = (double) roundedNum % .05;
			

			h = remainder6;
			h = h * 100;
			h = Math.floor(h);
			h = h / 100;

			pennies = (int) (h * 100) / 1;
			System.out.println("You will recieve " + pennies + " pennies");
		}
			

		sc.close();
		

	}
}