package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class use_person {

	public static void main(String[] args) {
		
		person[] persons=new person [2];
		persons[0]=new employe2("Ernesto Conde",19000,2009,13,05);
		persons[1]=new student("Claudia Díaz","Electronics");
		
		for (person p:persons) {
			System.out.println(p.giveme_name()+","+p.giveme_description());
		}

	}

}

abstract class person{
	
	public 	person(String names) {
		name=names;
	}
	
	public  String giveme_name() {
		return name;
	}
	
	public abstract String giveme_description();
	
	private String name;
	
}

class employe2 extends person{
	
	public employe2(String names, double salarys, int years, int months, int days) {
		
		super(names);
		salary=salarys;
		GregorianCalendar calendar=new GregorianCalendar(years,months-1,days);
		start_date=calendar.getTime();
		id=next_id;
		next_id++;
	}
	
	public String giveme_description() {
		return "ID:"+id+" has a salary: "+salary;
	}
	
	public double giveme_salary() {//getter
		return salary;
	}
	
	public Date giveme_contract_date() {//getter
		return start_date;
	}
	
	public void rise_salary(double percent){//setter
		double rise=salary*percent/100;
		salary+=rise;
	}
	
	private double salary;
	private Date start_date;
	int id;
	private static int next_id=1;
	
	
}

class student extends person{
	
	public student(String names,String careers) {
		super(names);
		career=careers;
		
	}
	
	public String giveme_description() {
		return "This student studies "+career;
	}
	
	private String career;
	
}
