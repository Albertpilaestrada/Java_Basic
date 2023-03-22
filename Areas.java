import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Choose an option: \n1: Square \n2: Triangle \n"
				+ "3: Rectangle \n4: Circle");
		int figure=in.nextInt();
		switch(figure){
			case 1:
				int side=Integer.parseInt(JOptionPane.showInputDialog("Introduce lado"));
				System.out.println("The area of the square is "+Math.pow(side,2));
				break;
			case 2:
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
				int height=Integer.parseInt(JOptionPane.showInputDialog("Introduce height"));
				System.out.println("The area of the triangle is "+((base*height)/2));
				break;
			case 3:
				int sidea=Integer.parseInt(JOptionPane.showInputDialog("Introduce sidea"));
				int sideb=Integer.parseInt(JOptionPane.showInputDialog("Introduce sideb"));
				System.out.println("The area of the rectangle is "+(sidea*sideb));
				break;
			case 4:
				int radius=Integer.parseInt(JOptionPane.showInputDialog("Introduce radius"));
				System.out.print("The area of the circle is ");
				System.out.printf("%1.2f",Math.PI*(Math.pow(radius,2)));
				break;
			default:
				System.out.println("The option is not valid");
			}
		  in.close();

	}

}
