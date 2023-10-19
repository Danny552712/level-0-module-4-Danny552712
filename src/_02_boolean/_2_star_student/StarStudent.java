package _02_boolean._2_star_student;

import javax.swing.JOptionPane;

public class StarStudent {
	
	public static void main(String[] args) {
		
		// booleans may be passed as parameters in method calls just like an
		// an int or any other kind of value. 
		
		// 1. Initialize passedExam to a value.

		boolean passedExam = true;
		
		// 2. Call the didYouPass method with the variable you just initialized
		//    as the parameter so that it shows a pop-up.
		
		didYouPass(passedExam);
		
		// The "not" operator (!) can be placed before a boolean value to 
		// temporarily "flip" the value between true and false.
		
		// 3. Use a ! on the boolean variable in either your method call or in 
		//    the didYouPass method itself to get the other pop-up to show 
		//    without changing the original value you gave to passedExam.
		
		didYouPass(!passedExam); // set argument as opposite of passedExam value
		
		passedExam = !true; // set the passedExam value to opposite of true
		
		didYouPass(passedExam); // set the argument in the didYouPass method to passed exam value
		
	}
	
	public static void didYouPass(boolean passedExam) {
		
		if(passedExam) {
			JOptionPane.showMessageDialog(null, "Congratulations!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
		}
		
	}

}
