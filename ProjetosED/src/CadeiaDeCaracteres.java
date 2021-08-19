
public class CadeiaDeCaracteres {

	public String inverterCaracteres(String palavra, int tamanho) {
		/**
		 * Condição de parada = a posição do vetor da String deve ser igual a 0
		 */
		if(tamanho == 0 ) {
			return String.valueOf(palavra.charAt(tamanho));
		}
		/**exemplo: ABCD
		 * tamanho = 3 | retorno = DCBA
		 * tamanho = 2 | retorno = CBA
		 * tamanho = 1 | retorno = BA
		 * tamanho = 0 | retorno = A
		 * */
		else {
			return palavra.charAt(tamanho)+ inverterCaracteres(palavra, tamanho -1);
		}
	}

}
