package Turma54Aula05;

import java.util.Scanner;

public class Exer3Aula05 {
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2.*/
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		double[][] n1 = new double[4][6];
		double[][] n2 = new double[4][6];
		double[][] m1 = new double[4][6];
		int ent;
		
		for(int i = 0; i < n1.length; i++) {
			for(int j = 0; j < n1[i].length; j++) {
				
				n1[i][j] = num.nextInt();
			}
				
		 System.out.println();
		}
		for(int i = 0; i < n1.length; i++) {
			
			for(int j = 0; j < n1[i].length ; j++) {
				
				System.out.print(n1[i][j] + n2[i][j] + " | ");
				
			}
			System.out.println();
		}
	}

}
