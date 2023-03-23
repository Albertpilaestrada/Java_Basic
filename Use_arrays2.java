import javax.swing.JOptionPane;

public class Use_arrays2 {

	public static void main(String[] args) {
		String []country=new String[8];
		/*country[0]="España";
		country[1]="Cuba";
		country[2]="Mexico";
		country[3]="Argentina";
		country[4]="Colombia";
		country[5]="Peru";
		country[6]="Ecuador";
		country[7]="Puerto Rico";*/
		
		for(int i=0;i<8;i++) {
			country[i]=JOptionPane.showInputDialog("Type a country "+(i+1));
			
		}
		
		/*String []country= {"España","Cuba","Mexico","Argentina",
				"Colombia","Peru","Ecuador","Puerto Rico"};*/
		
		/*for(int i=0;i<country.length;i++) {
			System.out.println("Country "+i+" is "+country[i]);
		}*/
		for(String element:country) {
			System.out.println("Country "+element);
		}
		

	}

}
