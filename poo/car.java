package poo;

public class car {
	
	private int wheels;
	private int length;
	private int wide;
	private int engine;
	private int plataform_weight;
	private String color;
	private int total_weight;
	private boolean leather_seats, air_conditioner;
	
	public car() {
		wheels=4;
		length=2000;
		wide=400;
		engine=1600;
		plataform_weight=500;
	}
	
	public String get_general_data() {//método getter
		return "The base of car have "+wheels+" wheels"+". Measure "+length/1000+
			" meters long with a wide of "+wide+"cm, a plataworm weight of "+plataform_weight+
			"kg and power engine of "+engine+"horsepower";
	}
	
	public void set_color(String car_color) {
		color=car_color;//método setter
	}
	
	public String tell_color() {
		return "The color of car is "+color;//método getter
	}
	
	public void seats_config(String leather_seats) {//setter
		if(leather_seats.equalsIgnoreCase("yes")) {
			this.leather_seats=true;
		}
		else {
			this.leather_seats=false;
		}
	}
	
	public String tellme_seats() {//getter
		if(leather_seats==true) {
			return "The car has leather seats";
		}
		else {
			return "The car has'nt leather seats";
		}
	}
	
	public void air_config(String air_conditioner) {//setter
		if(air_conditioner.equalsIgnoreCase("yes")) {
			this.air_conditioner=true;
		}
		else {
			this.air_conditioner=false;
		}
	}
	
	public String tellme_air() {//getter
		if(air_conditioner==true) {
			return "The car has air conditioner";
		}
		else {
			return "The car has'nt air conditioner";
		}
	}
	
	public String tellme_weight_car() {//setter y getter
		int bodywork=500;
		total_weight=plataform_weight+bodywork;
		if(leather_seats==true) {
			total_weight=total_weight+50;
		}
		if(air_conditioner==true) {
			total_weight=total_weight+30;
		}
		return "The car weight is "+total_weight;
	}
	
	public int car_price() {//getter
		int car_price=10000;
		if(leather_seats==true) {
			car_price+=250;
		}
		if(air_conditioner==true) {
			car_price+=450;
		}
		return car_price;
		
	}

}
