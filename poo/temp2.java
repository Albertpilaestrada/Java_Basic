package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class temp2 {

	public static void main(String[] args) {
		
		clock myclock=new clock(5000,true);
		myclock.ongoing();
		JOptionPane.showMessageDialog(null, "Press acept for stop");
		System.exit(0);

	}

}

class clock{
	
	public clock(int interval,boolean sound) {
	
	this.interval=interval;
	this.sound=sound;
	}
	
	public void ongoing() {
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
	
	private int interval;
	private boolean sound;
	
	
}

