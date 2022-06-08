package Turma54Aula04;

import java.util.Scanner;

public class Exer2Aula04 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int numero,par,impar;
		par = 0;
		impar = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"º Número: ");
			numero = num.nextInt();
			if(numero%2 == 0) {
				par++;
			}else {
				impar++;
			}

		}
		System.out.println("A Quantidade de pares são: "+ par);
		System.out.println("A Quantidade de pares são: "+ impar);

	}

}
