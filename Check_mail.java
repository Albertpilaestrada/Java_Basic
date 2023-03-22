import javax.swing.*;
public class Check_mail {

	public static void main(String[] args) {
		
		int arroba=0;
		boolean dot=false;
		String mail=JOptionPane.showInputDialog("Introduce mail");
		for(int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				dot=true;
			}
		}
		if (arroba==1&&dot==true) {
			System.out.println("The mail is correct");
		}
		else {
			System.out.println("The mail is incorrect");
		}

	}

}
