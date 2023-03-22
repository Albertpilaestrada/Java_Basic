import javax.swing.JOptionPane;

public class factorial {

	public static void main(String[] args) {
		
		long result=1L;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
		for (int i=num;i>0;i--) {
			result=result*i;
		}
		System.out.println("The factorial of "+num+" is "+result);

	}

}
