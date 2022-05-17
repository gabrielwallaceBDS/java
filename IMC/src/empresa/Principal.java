package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Por favor diite o seu peso (kg)");//sysout + ctrl spaco
		Scanner teclado = new Scanner(System.in);
		
		float peso = teclado.nextFloat();
		//double pi = 3.1415f;//(float)3.1415;
		System.out.println("Digite sua altura (m)");
		
		float altura  = teclado.nextFloat();
		
		float imc = peso / (altura * altura);
		
		System.out.printf("seu IMC é: %.2f" ,imc);

	}

}
