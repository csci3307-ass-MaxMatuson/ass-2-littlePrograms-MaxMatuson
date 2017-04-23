/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Maxi
 *
 */
public class Program_2_16 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1, num2, larger;
		
		System.out.print("Enter the first integer? ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer? ");
		num2 = input.nextInt();
		
		if(num1 == num2)
		{
			System.out.print("\nThese numbers are equal.");
		}
		else
		{
			if(num1 > num2)
			{
				larger = num1;
				System.out.print("\n"+ larger + " is larger.");
			}
			else
			{
				larger = num2;
				System.out.print("\n"+ larger + " is larger.");
			}
		}
		
		
	}

}
