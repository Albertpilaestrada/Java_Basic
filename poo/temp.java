package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class temp {

	public static void main(String[] args) {
		
		getme_time listener=new getme_time();
		
		Timer my_temp=new Timer(10000,listener);
		
		my_temp.start();
		
		JOptionPane.showMessageDialog(null, "Press acept for stop");
		System.exit(0);
		
	}

}

class getme_time implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date now=new Date();
		System.out.println("I get you the time each 10 sec: "+now);
		Toolkit.getDefaultToolkit().beep();
	}
	
}