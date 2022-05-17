package velhaModoTexto;

import java.util.Scanner;

public class iniciarjogo {

	public static void main(String[] args) {
		//iniciando o tabuleiro com o novo player
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da velha por Ciro Meneses - RU: 2732171");
		System.out.println("Escolha a Dificuldade entre 1-3: ");
		int dificuldade = teclado.nextInt();

		// Cria os computadores
		Computador computador = null;
		ComputadorFacil compFacil = new ComputadorFacil();
		ComputadorMedio compMedio = new ComputadorMedio();
		ComputadorDificil compDificil = new ComputadorDificil();

		// Define qual computador ir� jogar de acordo com a dificuldade escolhida
		if (dificuldade == 1)
			computador = compFacil;
		else if (dificuldade == 2)
			computador = compMedio;
		else if (dificuldade == 3)
			computador = compDificil;

		// Loop principal do jogo
		while (tabuleiro.situacao() == 0) {
			// Desenha Tabuleiro
			tabuleiro.imprime();

			// Jogador joga
			jogador.joga(tabuleiro);

			// S� joga ap�s verificar se n�o houve ganhadores
			if (tabuleiro.checaSituacao() == 0)
				computador.joga(tabuleiro);
		}
	}

}