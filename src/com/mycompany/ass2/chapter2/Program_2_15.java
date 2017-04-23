/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Maxi
 *
 */
public class Program_2_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, sum, difference, product;
		double quotient;
		
		System.out.print("Enter the first integer? ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer? ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		difference = num1 - num2;
		product = num1 * num2;
		quotient = (double)num1 / (double)num2;
		
		System.out.println("\nSum: " +num1+ " + " +num2+ " = " +sum);
		System.out.println("\nDifference: " +num1+ " - " +num2+ " = " +difference);
		System.out.println("\nProduct: " +num1+ " * " +num2+ " = " +product);
		System.out.println("\nQuotient: " +num1+ " / " +num2+ " = " + quotient);
		

	}

}
