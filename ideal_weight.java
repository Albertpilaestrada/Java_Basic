import javax.swing.*; 
public class ideal_weight {

	public static void main(String[] args) {
		
		String gender="";
		do {
			gender=JOptionPane.showInputDialog("Introduce your gender (F/M)");
		}while (gender.equalsIgnoreCase("F")==false&&gender.equalsIgnoreCase("M")==false);
		
		int height=Integer.parseInt(JOptionPane.showInputDialog("Introduce your height in cm"));
		int ideal_weight=0;
		if (gender.equalsIgnoreCase("F")) {
			ideal_weight=height-120;
		}
		else if(gender.equalsIgnoreCase("M")) {
			ideal_weight=height-110;
		}
		System.out.println("Your ideal weight is "+ideal_weight+" kg");

	}

}
