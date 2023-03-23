
public class two_dimensional_arrays1 {

	public static void main(String[] args) {
		int [][]array=new int[4][5];
		array[0][0]=25;
		array[0][1]=56;
		array[0][2]=78;
		array[0][3]=13;
		array[0][4]=75;
		
		array[1][0]=85;
		array[1][1]=91;
		array[1][2]=76;
		array[1][3]=23;
		array[1][4]=54;
		
		array[2][0]=65;
		array[2][1]=36;
		array[2][2]=78;
		array[2][3]=45;
		array[2][4]=24;
		
		array[3][0]=38;
		array[3][1]=64;
		array[3][2]=16;
		array[3][3]=81;
		array[3][4]=87;
		
		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
				
	}

}
