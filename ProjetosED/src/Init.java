import javax.swing.JOptionPane;

public class Init {
	public static void main(String[] args) {
		String entrada;
		int fat;
		entrada = JOptionPane.showInputDialog("Insira o numero para calcular o Fatorial: ");
		fat = Integer.parseInt(entrada);
		System.out.println(new Fatorial().calcularFatorial(fat));
	}
}
