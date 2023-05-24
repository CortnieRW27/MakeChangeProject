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
		double roundedNum = 0;
		
//		double remainder8 = 0;	
//		double trunkNum = 0;
//		double trunkNum2 = 0;
//		double trunkNum3 = 0;
//		double trunkNum4 = 0;
//		double trunkNum5 = 0;
//		double trunkNum6 = 0;

		System.out.println("How much is the item you chose?");
		double itemPrice = sc.nextDouble();
		System.out.println("How much money was given?");
		double amountTendered = sc.nextDouble();

		if (amountTendered  < itemPrice) {
			System.out.println("ERROR! Please provide correct amount!");
		}
		
		else if (amountTendered >= itemPrice) {	
		changeReturned = (amountTendered - itemPrice);
		System.out.println(changeReturned);
		}
		
		
		remainder = (double) changeReturned % 20;
//		System.out.println(remainder);
		
		if (changeReturned >= 20) {
			twenties = (int) changeReturned / 20;
			System.out.println(twenties + " twenties");
		}
		else if (changeReturned < 20) {
			
		}

		
		remainder2 = (double) remainder % 10;
//		System.out.println(remainder2);
		
		if (remainder >= 10) {
			tens = (int) remainder / 10;
			System.out.println(tens + " tens");
		}
		else if (remainder < 10) {
			
		}
		
		
		remainder3 = (double) remainder2 % 5;
//		System.out.println(remainder3);
		
		if (remainder2 >= 5) {
			fives = (int) remainder2 / 5;
			System.out.println(fives + " fives");
		}
		else if (remainder2 < 5) {
			
		}

		
		remainder4 = (double) remainder3 % 1;
//		System.out.println(remainder4);
		
		if (remainder3 >= 1) {
			ones = (int) remainder3 / 1;
			System.out.println(ones + " ones");
		}
		else if (remainder3 < 1) {
			
		}


		
		remainder5 = (double) remainder4 % .25;
//		System.out.println(remainder5);
		 
		if (remainder4 >= .25) {
			quarters = (int) (remainder4 * 100) / 25;
			System.out.println(quarters + " quarters");
		}
		else if (remainder4 < .25) {
			
		}

		
		
		remainder6 = (double) remainder5 % .10;
//		System.out.println(remainder6);
		
		if (remainder5 >= .10) {
			dimes = (int) (remainder5 * 100) / 10;
			System.out.println(dimes + " dimes");
		}
		else if (remainder5 < .10) {
			
		}
		

		
		remainder7 = (double) remainder6 % .05;
//		System.out.println(remainder7);
		
		if (remainder6 >= .05) {
			nickels = (int) (remainder6 * 100) / 5;
			System.out.println(nickels + " nickels");
		}
		else if (remainder6 < .05) {
			
		}
		
		roundedNum = (remainder7 + 0.0005);
//		System.out.println(roundedNum);
		roundedNum = roundedNum;
		roundedNum = roundedNum * 100;
//		roundedNum = Math.floor(roundedNum);
		roundedNum = roundedNum / 100;
//		System.out.println(roundedNum);
	
		pennies = (int) (roundedNum * 100) / 1;
		System.out.println(pennies + " pennies");
//		remainder8 = (double) roundedNum % .01;
		}
	}


