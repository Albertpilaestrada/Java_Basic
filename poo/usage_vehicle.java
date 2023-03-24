package poo;

import javax.swing.*;

public class usage_vehicle {

	public static void main(String[] args) {
		
		car mini1=new car();//instacia de una clase o ejemplarizar una clase
		
		mini1.set_color(JOptionPane.showInputDialog("Tell me the color of your mini1"));
		
		furgo myfurgo1=new furgo(550,7);
		
		myfurgo1.set_color(JOptionPane.showInputDialog("Tell me the color of your furgo1"));
		
		myfurgo1.seats_config(JOptionPane.showInputDialog("Your furgo1 has leather seats? "
				+ "yes or not"));
		
		myfurgo1.air_config(JOptionPane.showInputDialog("Your furgo1 has air conditioner? "
				+ "yes or not"));
		
		System.out.println(mini1.get_general_data()+"\n"+myfurgo1.get_general_data()+" "+myfurgo1.tellme_furgo_data());
						
	}

}
