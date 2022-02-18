package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minDigSenha = 6; 
		
		System.out.println("Digite sua senha:");
		String senha = sc.nextLine();
		int tamanhoSenha = senha.length();
		
		if(tamanhoSenha < minDigSenha) {
			int caracteresFaltantes = minDigSenha - tamanhoSenha;
			System.out.println("Adicione mais " + caracteresFaltantes + " caracteres a sua senha");
		}
		sc.close();
	}
}
