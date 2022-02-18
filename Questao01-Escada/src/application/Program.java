package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n=");
		int n = sc.nextInt();

		
		for (int i = 1; i <= n; i++) {
			int numeroDeEspacos = n - i;
			while(numeroDeEspacos != 0) {
				System.out.print(" ");
				numeroDeEspacos--;
			}
			int numeroDeDegraus = i;
			while(numeroDeDegraus != 0) {
				System.out.print("*");
				numeroDeDegraus--;
			}
			System.out.println();
		}
		sc.close();
	}
}
