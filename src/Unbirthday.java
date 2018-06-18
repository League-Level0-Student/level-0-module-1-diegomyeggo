import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String day;
	day = JOptionPane.showInputDialog("What is your birthday (ex. 12/22)");
	if (day.equals("6/14")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy UnBirthday");
	}		
	}
}

