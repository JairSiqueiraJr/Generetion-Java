package Turma54Aula05;

import java.util.Scanner;

public class Exer2Aula05 {
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		int media, maiorNum, entrada;
		maiorNum = 0;
		media = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) +"º Jogada do dado: ");
			vet[i] = num.nextInt();
			media = media + vet[i];
			
			if(vet[i] > maiorNum) {
				maiorNum = vet[i];
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("Valores da "+(i+1)+"º Jogada do dado foi: " + vet[i] );
		}
		media = media/10;
		System.out.println("A média Aritmética dos lançamentos foram: " + media );
		System.out.println("A maior pontuação foi: "+ maiorNum);
	
		

	}

}
