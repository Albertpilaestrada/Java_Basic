import java.util.*;

public class In_Example1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre_usuario=in.nextLine();
		System.out.println("Introduce tu edad");
		int edad_usuario=in.nextInt();
		System.out.println("Hola "+nombre_usuario+". El año que viene tendrás "
		+(edad_usuario+1)+" años.");
		

	}

}
