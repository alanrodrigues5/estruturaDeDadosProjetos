import javax.swing.JOptionPane;

public class Init {
	public static void main(String[] args) {
		String palavra;
		palavra = JOptionPane.showInputDialog("Insira a palavra para ser revertida aqui.");
		int tamanho = palavra.length() - 1;
		System.out.println(new CadeiaDeCaracteres().inverterCaracteres(palavra, tamanho));
	}
}
