package extra;

import javax.swing.JOptionPane;

public class Ages {
public static void main(String[] args) {
	String age;
	
	age = JOptionPane.showInputDialog("How old are you?");
	int asnwer = Integer.parseInt(age);
	for(int i=0;i<asnwer;i++) {
		System.out.println(i);
	}
}
}
