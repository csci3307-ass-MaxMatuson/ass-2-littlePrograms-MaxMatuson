/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Maxi
 *
 */
public class Program_2_6 {
	public static void main(String[] args)
	{
		//Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		// First integer
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		// Second integer
		System.out.print("Enter second integer: ");
		y = input.nextInt();

		// Third integer
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		
		// Result of 3 integers, x, y and z.
		result = x * y * z;
		
		// Output
		System.out.printf("Product is %d%n", result);
		
		//------------------------------------------------------------------------------------
		// Other way
		/**
		 * Program_2_6 obj = new Program_2_6();
		 * result = obj.otherWay();
		 * System.out.printf("\n*using other way* --> Product is %d%n", result);
		*/
		//------------------------------------------------------------------------------------
	}
	
	//------------------------------------------------------------------------------------
	// Other way - using JOptionPane
	/**
	 * public int otherWay()
	 * {
	 * int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer: "));
	 * int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer: "));
	 * int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third integer: "));
	 * int product = num1 * num2 * num3;
	 * return product;
	 * }
	*/
	//------------------------------------------------------------------------------------
	
} // End Main
