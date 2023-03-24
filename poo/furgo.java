package poo;

public class furgo extends car{
	
	private int extra_load;
	private int extra_places;
	
	public furgo(int extra_load,int extra_places) {
		
		super();//call father class constructor
		this.extra_load=extra_load;
		this.extra_places=extra_places;
		
	}
	
	public String tellme_furgo_data() {
		return "The load capacity is "+extra_load+" and have "+extra_places+" places";
	}

}
