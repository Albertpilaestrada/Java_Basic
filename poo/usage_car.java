package poo;

import javax.swing.*;

public class usage_car {

	public static void main(String[] args) {
		
		car mini=new car();//instacia de una clase o ejemplarizar una clase
		
		mini.set_color(JOptionPane.showInputDialog("Tell me the color of your car"));
		
		System.out.println(mini.tell_color());
		
		System.out.println(mini.get_general_data());
		
		mini.seats_config(JOptionPane.showInputDialog("Your car has leather seats? yes or not"));
		
		System.out.println(mini.tellme_seats());
		
		mini.air_config(JOptionPane.showInputDialog("Your car has air conditioner? yes or not"));
		
		System.out.println(mini.tellme_air());
		
		System.out.println(mini.tellme_weight_car());
		
		System.out.println("The price of mini is: "+mini.car_price());
		
		//System.out.println("This car has "+mini.wheels+" wheels");

	}

}
