
public class two_dimensional_arrays2 {

	public static void main(String[] args) {
		int [][]array= {
				{25,56,78,13,75},
				{85,91,76,23,54},
				{65,36,79,45,24},
				{38,64,16,81,87},
			};
		
		for(int[]row:array) {
			System.out.println();
			for(int i:row) {
				System.out.print(i+" ");
			}
		}
				
	}

}