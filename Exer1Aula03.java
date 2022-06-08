import java.util.Scanner;

public class Exer1Aula03 {
	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		int cont, num, maiorNum;
		cont = 0;
		num = 0;
		maiorNum = 0;
		while (cont != 3) {
			System.out.println("Digite o " + (cont+1) + "º número: ");
			num = numero.nextInt();
		 
 			if(num >= maiorNum) {
 				maiorNum = num;
			}
			cont += 1;
		}
		System.out.println("O maior número é:  " + maiorNum);
 	}


}
