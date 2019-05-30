package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoDeSorte {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		int numeroDaSorte = aleatorio.nextInt(51);
		int tentativa = numeroDaSorte;
		int vidas = 9;

		while (vidas > -1) {

			System.out.println("Digite um número entre 0 e 50: ");
			numeroDaSorte = entrada.nextInt();

			if (numeroDaSorte == tentativa) {
				System.out.println("Parabéns você ganhou!");
				break;
			} else {
				System.out.println("Restam " + vidas-- + " tentativas.");
			}

		}
		System.out.println("Game Over!");

	}

}
