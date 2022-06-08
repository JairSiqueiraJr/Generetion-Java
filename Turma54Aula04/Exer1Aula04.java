package Turma54Aula04;

import java.util.Scanner;
	//1- Informar todos os números de 1000 a 1999 que quando divididos por 11
	//obtemos resto = 5. (FOR)
public class Exer1Aula04 {

	public static void main(String[] args) {
		
		int n1, soma, totalDiv;
	
		totalDiv = 0; 
		for(int i = 1000; i <= 1999; i++){
			soma = i%11;
			if(soma == 5) {
				totalDiv++;
				System.out.println("Os números dividido por 11 e com resto 5 são: " + totalDiv);			}	
		}
		
	}
}