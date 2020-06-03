package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {
	int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite jedan broj koji predstavlja ocj"));
	if(a < 1 || a > 5)
		System.out.println("Krivi broj");
	
	switch(a) {
	case '1':
		System.out.println("Nedovoljan");
		break;
	case '2':
		System.out.println("Dovoljan");
		break;
	case '3':
		System.out.println("Dobar");
		break;
	case '4':
		System.out.println("Vrlo Dobar");
		break;
	case '5':
		System.out.println("Odlican");
		break;
	}
	}

}
