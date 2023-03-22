
public class Calc_Math {

	public static void main(String[] args) {
		
		double raiz=Math.sqrt(9);
		System.out.println(raiz);
		
		double num1=6.25;
		int resultado1=(int)Math.round(num1);
		System.out.println(resultado1);
		
		double base=4;
		double exponente=2;
		double resultado2=Math.pow(base,exponente);
		System.out.println(resultado2);
		
		System.out.println("Los resultados son "+raiz+" "+resultado1+" "+resultado2);

	}

}
