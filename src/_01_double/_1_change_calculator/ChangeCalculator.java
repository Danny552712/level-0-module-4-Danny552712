package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String manyNickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");

		// Convert their answer to an int.   Hint: Integer.parseInt()  
double intManyNickels = Integer.parseInt(manyNickels);

		// Ask the user how many dimes they have, and convert their answer
String manyDimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
double intManyDimes = Integer.parseInt(manyDimes);

		// Ask the user how many quarters they have, and convert their answer
String manyQuarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
double intManyQuarters = Integer.parseInt(manyQuarters);

		// Calculate how much money the user has.  Hint: Use a double variable 
double finalAmount = ((intManyNickels * 0.05) + (intManyDimes * 0.10) + (intManyQuarters * 0.25));

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "Your final amount is: $" + finalAmount);
	}
}

