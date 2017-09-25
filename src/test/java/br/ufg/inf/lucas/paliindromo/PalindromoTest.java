package br.ufg.inf.lucas.paliindromo;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * testes unitarios para a classe de palindromo
 */
public class PalindromoTest {

	private Palindromo palindromo;

	public PalindromoTest() {
		palindromo = new Palindromo();
	}
	
	@Test
	public void testPalindromo() throws Exception {
		String frasePalindromo = "Socorram-me subi no onibus em Marrocos";
		
		assertTrue(palindromo.ehPalindromo(frasePalindromo));
	}
	
	@Test
	public void testNaoPalindromo() throws Exception {
		String frasePalindromo = "Socoram-me subi no onibus em Marrocos";
		
		assertFalse(palindromo.ehPalindromo(frasePalindromo));
	}
	
	@Test
	public void testPalindromoVazio() throws Exception {
		String frasePalindromo = "";
		
		assertTrue(palindromo.ehPalindromo(frasePalindromo));
	}
	
	@Test
	public void testPalindromoNull() throws Exception {
		assertFalse(palindromo.ehPalindromo(null));
	}
	
	@Test
	public void testPalindromoInvertida() throws Exception {
		String frasePalindromo = "socorraM me subino on ibus em-marrocoS";
		
		assertTrue(palindromo.ehPalindromo(frasePalindromo));
	}
	
	@Test
	public void testPalindromoUpperCase() throws Exception {
		String frasePalindromo = "oraVa O avaRo";
		
		assertTrue(palindromo.ehPalindromo(frasePalindromo));
	}
	
	@Test
	public void testPalindromoCaracteresEspeciais() throws Exception {
		String frasePalindromo = "Ótimo só eu que os omito";
		
		assertTrue(palindromo.ehPalindromo(frasePalindromo));

	}
	
	@Test
	public void testPalindromoVirgula() throws Exception {
		String frasePalindromo = "Otimo, so eu, que os omito";
		
		assertTrue(palindromo.ehPalindromo(frasePalindromo));

	}
}
