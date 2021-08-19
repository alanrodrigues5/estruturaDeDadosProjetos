package controller;
import javax.swing.JOptionPane;

public class Fatorial {
	public int calcularFatorial(int fat) {
		if (fat > 12 || fat < 0) {
			JOptionPane.showMessageDialog(null,
					"Não pode ser maior que 12 ou menor que 0 \nPor uma limitação do sistema.\nOperação cancelada!");
			System.exit(0);
		}
		/** 
		 * A condição de parada é que o numero do fatorial deve ser igual a 1
		 * */
		if (fat <= 1) {
			return 1;
		}
		/**
		 * fat=12-1 |fat=11 *  3628800        retorno = 479001600
		 * fat=11-1 |fat=10 *  362880         retorno = 3628800
		 * fat=10-1 |fat=09  * 40320          retorno = 362880
		 * fat=09-1 |fat=08  * 5040           retorno = 40320
		 * fat=08-1 |fat=07  * 720            retorno = 5040 
		 * fat=07-1 |fat=06  * 120            retorno = 720
		 * fat=06-1 |fat=05  * 24             retorno = 120
		 * fat=05-1 |fat=04  * 6              retorno = 24
		 * fat=04-1 |fat=03  * 2              retorno = 6
		 * fat=03-1 |fat=02  * 1              retorno = 2
		 * fat=02-1 |fat=01  * 1              retorno = 1
		*/ 
		else {
			return fat-- * calcularFatorial(fat);
		}
	}
}
