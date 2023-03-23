
public class Use_arrays3 {

	public static void main(String[] args) {
		int []random_array=new int[150];
		
		for(int i=0;i<random_array.length;i++) {
			
			random_array[i]=(int)Math.round(Math.random()*100);
			
		}
		for(int num:random_array) {
			
			System.out.print(num+",");
		}

	}

}
