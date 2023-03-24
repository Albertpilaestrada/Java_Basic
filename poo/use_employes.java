package poo;

import java.util.*;

public class use_employes {

	public static void main(String[] args) {
		
		/*employe employe1=new employe("Pedro Lopéz",18500,1990,10,17);
		employe employe2=new employe("Ana Goméz",21500,1994,05,14);
		employe employe3=new employe("María Clara",20500,1995,03,24);
		
		employe1.rise_salary(5);
		employe2.rise_salary(5);
		employe3.rise_salary(5);
		
		System.out.println("Name: "+employe1.giveme_name()+
				". Salary: "+employe1.giveme_salary()+" .Hire date: "+
				employe1.giveme_contract_date());
		System.out.println("Name: "+employe2.giveme_name()+
				". Salary: "+employe2.giveme_salary()+" .Hire date: "+
				employe2.giveme_contract_date());
		System.out.println("Name: "+employe3.giveme_name()+
				". Salary: "+employe3.giveme_salary()+" .Hire date: "+
				employe3.giveme_contract_date());*/
		
		employe[] myemployes=new employe[3];
		myemployes[0]=new employe("Pedro Lopéz",18500,1990,10,17);
		myemployes[1]=new employe("Ana Goméz",21500,1994,05,14);
		myemployes[2]=new employe("María Clara",20500,1995,03,24);
		
		/*for(int i=0;i<3;i++) {
			myemployes[i].rise_salary(5);
		}*/
		
		for(employe e: myemployes) {
			e.rise_salary(5);
		}
		
		/*for(int i=0;i<3;i++) {
			System.out.println("Name: "+myemployes[i].giveme_name()+
					". Salary: "+myemployes[i].giveme_salary()+" .Hire date: "+
					myemployes[i].giveme_contract_date());
		}*/
		
		for(employe e: myemployes) {
			System.out.println("Name: "+e.giveme_name()+
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
	
	private String name;
	private double salary;
	private Date start_date;
	
	
}
