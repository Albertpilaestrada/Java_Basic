import javax.swing.*;

public class In_number {

	public static void main(String[] args) {
		
		double x=10000.0;
		System.out.printf("%1.2f",x/3);
		System.out.println("");
		
		String num1=JOptionPane.showInputDialog("Introduce un número");
		double num2=Double.parseDouble(num1);
		System.out.print("La raíz de "+num2+" es ");
		System.out.printf("%1.2f", Math.sqrt(num2));

	}

}
