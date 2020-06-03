package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		
		int br1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		int br2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		int br3 = Integer.parseInt(JOptionPane.showInputDialog("Unesite treci broj"));
		
		if(br1 >= br2 && br1 >= br3) {
			System.out.println(br1);
		}else if(br2 >= br1 && br2 >= br3) {
			System.out.println(br2);
		}else if(br3 >= br1 && br3 >= br2) {
		    System.out.println(br3);
		}
	      
	}

}
