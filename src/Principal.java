import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		int num = Integer.valueOf(JOptionPane
				.showInputDialog("Entre com um numero interro :"));
		
		Fatorial in = new Fatorial(num);
		
		JOptionPane.showMessageDialog(null,  in.fatorial());

	}

}
