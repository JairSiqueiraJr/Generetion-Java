package Turma54Aula04;

import java.util.Scanner;

public class Exer3Aula04 {
	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99. (WHILE)

	public static void main(String[] args) {
		Scanner nome = new Scanner(System.in);
	
		int  i,totalPessoa, idadeMenor, idadeMaior, idade;
		int cont = 0;
		String pessoas;
		idadeMenor = 0;
		idadeMaior = 0;
		totalPessoa = 0;
		i =  0;
		while (cont != -99) {
			
			System.out.println("Digite a idade da: "+(i+1)+"º: ");
			idade = nome.nextInt();
			cont = idade;
			totalPessoa++;
			if (idade < 21) {
				idadeMenor++;
			}else if(idade > 50) {
				idadeMaior++;
			}
			System.out.println("Digite -99 para encerrar o programa! ");
			i++;
		}
			System.out.println("Total de pessoas com menos de 21 anos: "+ idadeMenor );
			System.out.println("Total de pessoas com mais de 50 anos :  "+ idadeMaior );

	}

}
