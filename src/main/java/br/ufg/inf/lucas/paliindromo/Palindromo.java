package br.ufg.inf.lucas.paliindromo;

import java.text.Normalizer;

/**
 * Método que diz se uma palavra ou frase é palíndromo
 *
 */
public class Palindromo {
	public boolean ehPalindromo(String frase) {
		if (frase == null) {
			return false;
		}

		String fraseFiltrada = Palindromo.removerAcentos(Palindromo.removeConjuntores(frase));
		
		for (int i = 0; i < fraseFiltrada.length(); i++) {
			if (fraseFiltrada.charAt(i) != fraseFiltrada.charAt( (fraseFiltrada.length() -1) - i)) {
				return false;
			}
		}
		
		return true;
	}
	
	private static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
	
	private static String removeConjuntores(String frase) {
		return frase.toUpperCase().replace(" ", "").replace("-", "").replace(",", "");
	}
}
