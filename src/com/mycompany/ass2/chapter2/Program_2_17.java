/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Maxi
 *
 */
public class Program_2_17 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int num1, num2, num3, sum, average, product, smallest, largest;
		
		System.out.print("Enter the first integer? ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer? ");
		num2 = input.nextInt();
		
		System.out.print("Enter the third integer? ");
		num3 = input.nextInt();
		
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		average = sum / 3;
		
		
		
		
	}

}
