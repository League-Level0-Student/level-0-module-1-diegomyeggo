import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles a clock
String answer;  
answer = JOptionPane.showInputDialog("What has hands but can not clap?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("A clock") ) {
	JOptionPane.showMessageDialog(null, "Correct");
	score += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is: A clock");
}
		// 6. Add some more riddles
answer = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
if (answer.equals("A candle") ) {
	JOptionPane.showMessageDialog(null, "Correct");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is: A candle");
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
}
	}
}
