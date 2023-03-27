package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class temp2 {

	public static void main(String[] args) {
		
		clock myclock=new clock();
		myclock.ongoing(5000,true);
		JOptionPane.showMessageDialog(null, "Press acept for stop");
		System.exit(0);

	}

}

class clock{
	
	public void ongoing(int interval, final boolean sound) {
		class getme_time2 implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			Date now=new Date();
			System.out.println("I get you the time since 5 sec: "+now);
			if(sound){
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
	}
		ActionListener listener=new getme_time2();
		Timer mytemporizer=new Timer(interval,listener);
		mytemporizer.start();
	}
		
}
