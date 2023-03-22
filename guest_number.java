import java.util.*;

public class guest_number {

	public static void main(String[] args) {
		int random_num=(int)(Math.random()*100);
		Scanner in=new Scanner(System.in);
		int num=0;
		int attempts=0;
		do {
			attempts++;
			System.out.println("Type a number please");
			num=in.nextInt();
			if(random_num>num) {
				System.out.println("Higher");
			}
			else if(random_num<num) {
				System.out.println("Lower");
			}
		}while(num!=random_num);
		System.out.println("Correct, you got it in "+ attempts+ " tries");
		in.close();
		

	}

}
