package _01_double._2_test_scores;

import javax.swing.JOptionPane; 

public class TestScores {

	public static void main(String[] args) {
		
		//Get the Student's test score and stores value as a double value
		String StudentScore = JOptionPane.showInputDialog(null, "What is you test score? (enter one with a decimal)");
		double TestScore = Double.parseDouble(StudentScore);
		
		//If Statements
			//Descends from 89.5, goes down by 10 to 60
		if (TestScore >= 89.5)	{
			JOptionPane.showMessageDialog(null, "Wow! That's great! You did amazing!");
		} 
		
		else if (TestScore >= 79.5) {
			JOptionPane.showMessageDialog(null, "Woah! You studied hard, study more for an A!");
		} 
		
		else if (TestScore >= 69.5) {
			JOptionPane.showMessageDialog(null, "Well, that's a passing grade! Try to study a little more for a safer score.");
		} 
		
		else if (TestScore >= 60) {
			JOptionPane.showMessageDialog(null, "So close! Focus on your studies for a passing grade");
		} 
		
		else {
			JOptionPane.showMessageDialog(null, "Oh well, not your best score but you can do better next time.");
		}
	
	}
}