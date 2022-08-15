package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exercicios.Exercicio1;
import Exercicios.Exercicio2;
import Exercicios.Exercicio3;
import Exercicios.Exercicio4;

public class TestMain {

	public static void main(String[] args) {
				
		//EXERCÍCIO 1 - VOTOS EM RELAÇÃO AO TOTAL DE ELEITORES
		
		Exercicio1 e1 = new Exercicio1();
		System.out.println("Exercício 1");
		System.out.println("Percentual de votos válidos: " + e1.percentualValidos() + "%");
		System.out.println("Percentual de votos brancos: " + e1.percentualBrancos() + "%");
		System.out.println("Percentual de votos nulos: " + e1.percentualNulos() + "%");
		System.out.println("------------------------------------");
		
		//EXERCÍCIO 2 - ALGORITMO DE ORDENAÇÃO BUBBLE SORT
		
		Integer vetor[]= {5,3,2,4,7,1,0,6};
		Exercicio2 e2 = new Exercicio2();
		System.out.println("Exercício 2");
		System.out.println("Bubble Sort:");
		e2.bubbleSort(vetor);
		System.out.println("------------------------------------");

		//EXERCÍCIO 3 - FATORIAL
		try {
		Exercicio3 e3 = new Exercicio3();
		System.out.println("Exercício 3");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		Integer num = sc.nextInt();
		System.out.println("O fatorial de " + num + " é: " + e3.fatorial(num));
		System.out.println("------------------------------------");
		
		//EXERCÍCIO 4 - SOMA DOS MULTIPLOS DE 3 OU 5
		Exercicio4 e4 = new Exercicio4();
		System.out.println("Exercício 4");
		System.out.println("Digite um número:");
		Integer num2 = sc.nextInt();
		System.out.println("A soma dos múltiplos de 3 ou 5 menores que " + num2 + " é: " + e4.somamultiplos(num2));
		sc.close();
		}
		catch(InputMismatchException e){
			System.out.println("Tipo de entrada inválida");
		}
			
		System.out.println("------------------------------------");
		
		
	}

}
