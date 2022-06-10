package Turma54Aula05;

import java.util.Scanner;

public class Exer1Aula05 {

	public static void main(String[] args) {
		//1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		Scanner vet = new Scanner(System.in);
		int i,pont, tamanhoVetor,maiorNum;
		pont = 0;
		maiorNum = 0;
		 
		
			System.out.println("Digite o tamanho do vetor: ");
			tamanhoVetor = vet.nextInt();
			
			int[] vetor = new int [tamanhoVetor];
			
		for(i = 0; i < tamanhoVetor; i++) {
			
			System.out.println((i+1)+"º Pontuação: ");
			vetor[i] = vet.nextInt();
			
			if(vetor[i] > maiorNum) {
				maiorNum = vetor[i];
			}
			}
		
		for(i = 0; i < tamanhoVetor; i++) {
			System.out.println((i+1)+"º Pontuação: " + vetor[i]);
			
		}
		System.out.println("O Maior pontuação foi: "+maiorNum);
	
		 
	}

	
}
