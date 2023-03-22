
public class Declaraciones_Operadores {

	public static void main(String[] args) {
	   
		int a=6;
	    int b=7;
	    int c=b+a;
	    float d=b/a;
	    System.out.println(c + " " + d);
	    final int e=5;
	    d=b/e;
	    //c+=4;
	    System.out.println(c + " " + d);
		
		final double apulgadas=2.54;
		double cm=8;
		double resultado=cm/apulgadas;
		System.out.println("En "+cm+"cm hay "+resultado+" pulgadas");
		
		int operador1,operador2,resultado1;
		operador1=9;
		operador2=3;
		resultado1=operador1-operador2;
		System.out.println(resultado1);

	}

}
