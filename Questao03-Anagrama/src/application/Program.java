package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = sc.nextLine();
		List<String> trechos = trechoPalavra(palavra);
		int contadorAnagramas = 0;

		for (int i = 0; i <= trechos.size(); i++) {
			for (int j = i+1; j < trechos.size(); j++) {
				if(j < trechos.size()) {	
					String s1 = trechos.get(i);
					String s2 = trechos.get(j);
					if(compararPalavras(s1, s2)) {
						contadorAnagramas ++;
					}
				}
			}
		}
		System.out.println("Número de anagramas: " + contadorAnagramas);
		
		
		sc.close();
	}
	
	public static List<String> trechoPalavra(String palavra) {
		int comprimentoPalavra = palavra.length();
		List<String> trechos = new ArrayList<>();
		
		for (int i = 1; i < comprimentoPalavra; i++) {
			for (int j = 0; j < comprimentoPalavra; j++) {
				if(i == 1) {
					trechos.add(Character.toString(palavra.charAt(j)));					
				} else {
					if(j + i < comprimentoPalavra) {
						trechos.add(palavra.substring(j, j + i));												
					} else if (j + i == comprimentoPalavra){
						trechos.add(palavra.substring(j));
					}
				}
			}
		}
		System.out.println(trechos);
		return trechos;
	}
	
	public static boolean compararPalavras(String trecho1, String trecho2) {
		boolean isAnagrama = false;
		if(trecho1.length() == trecho2.length()) {
			char[] s1 = trecho1.toCharArray();
			char[] s2 = trecho2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			String s1Sorted = new String(s1);
			String s2Sorted = new String(s2);
			if(s1Sorted.equals(s2Sorted)) {
				isAnagrama=true;
			}
		}
		return isAnagrama;
	}

}
