package poo;

import java.util.*;

public class use_employes {

	public static void main(String[] args) {
		
		leadership leader_RRHH=new leadership("Alberto",25000,1990,01,14);
		leader_RRHH.set_incentive(2000);
		
		employe[] myemployes=new employe[6];
		myemployes[0]=new employe("Pedro Lopéz",18500,1990,10,17);
		myemployes[1]=new employe("Ana Goméz",21500,1994,05,14);
		myemployes[2]=new employe("María Clara",20500,1995,03,24);
		myemployes[3]=new employe("Antonio Fernández");
		myemployes[4]=leader_RRHH;//Polimorfismo o Principio de sustitucion
		myemployes[5]=new leadership("Yud",30000,1994,06,25);
				
		for(employe e: myemployes) {
			e.rise_salary(5);
		}
				
		for(employe e: myemployes) {
			System.out.println("ID:"+e.id+" Name: "+e.giveme_name()+
					". Salary: "+e.giveme_salary()+" .Hire date: "+
					e.giveme_contract_date());
		}

	}

}

class employe{
	
	public employe(String names, double salarys, int years, int months, int days) {
		
		name=names;
		salary=salarys;
		GregorianCalendar calendar=new GregorianCalendar(years,months-1,days);
		start_date=calendar.getTime();
		id=next_id;
		next_id++;
	}
	
	public employe(String names) {
		this(names,15000,2000,01,01);
		id=next_id;
		next_id++;
	}
	
	public String giveme_name() {//getter
		return name;
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
	
	private final String name;
	private double salary;
	private Date start_date;
	int id;
	private static int next_id=1;
	
	
}

class leadership extends employe{

	public leadership(String names, double salarys, int years, int months, int days) {
		
		super(names, salarys, years, months, days);
		
	 }
	
	public void set_incentive(double b) {
		incentive=b;
	}
	
	public double giveme_salary() {
		
		double boss_salary=super.giveme_salary();
		return boss_salary+incentive;
	}

	private double incentive;
	
}
