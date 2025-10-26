package com.imd.lista_programacao_fmc;

import java.util.Scanner;

import com.imd.lista_programacao_fmc.questao_1.PisoTeto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Questão 1 - Calcular teto e piso da divisão: ");
		System.out.println("Digite o dividendo e o divisor: ");
		double dividendo = sc.nextDouble();
		System.out.println("Digite o divisor: ");
		double divisor = sc.nextDouble(); 
		PisoTeto pisoTeto = new PisoTeto(dividendo, divisor);
		System.out.println(pisoTeto);
		System.out.println("================================");
	}

}
