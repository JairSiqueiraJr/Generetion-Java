package atividadeclasseobjeto;

import java.util.Scanner;

/*  1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console */

public class Cliente {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String produto;
	String qualidade;
	String descricao;
	int opcao;
	produto();
	opcao = entrada.nextInt();
	descricao(opcao);
	qualidade();
	}
	
	public static void produto() {
		System.out.println("1 Computador");
		System.out.println("2 Notebook");
		System.out.println("3 Impressora");
		System.out.println("4 Som");
		System.out.println("5 Cameras");
	}
	public static void qualidade() {
		
		System.out.println("Novo");
	}
	public static void descricao(int opcao){
		if( opcao == 1) {
			System.out.println("Computador --> i5 1.4 Ghz, 8 giga ram, HD de 1000 terabyte");
		}else if(opcao == 2) {
			System.out.println("Notebook --> portatil i7, 16 de ram, SSD 256g, Placa grafica 1050Ti Nvidea");
		}else if(opcao == 4) {
			System.out.println("Som --> Aparelho de som Sony, 2 alto falantes 1000Am");
		}else if(opcao == 5) {
			System.out.println("Cameras --> Ips, CFTV, Baba eletronicas");
		}
	}
	
	
	
	
	
	
	
}
