import javax.swing.*;
public class In_Example2 {

	public static void main(String[] args) {
		
		String user_name=JOptionPane.showInputDialog("Introduce tu nombre");
		String age=JOptionPane.showInputDialog("Introduce tu edad");
		int user_age=Integer.parseInt(age);
		/*user_age++
		System.out.println("Hola "+user_name+" el año que viene tendrás "
		+user_age);
		 */
		System.out.println("Hola "+user_name+" el año que viene tendrás "
		+(user_age+1));

	}

}
