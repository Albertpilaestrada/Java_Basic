import javax.swing.*;

public class Access_Aplication {

	public static void main(String[] args) {
		String key="Alberto";
		String pass="";
		while(key.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Tipe de password please: ");
			if (key.equals(pass)==false) {
				System.out.println("Password incorrect");
			}
		}
		System.out.println("Access granted");

	}

}
