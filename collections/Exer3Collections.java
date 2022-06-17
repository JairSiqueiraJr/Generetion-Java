package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/

public class Exer3Collections {

	public static void main(String[] args) {
		 
		Collection<String> nomes	= new ArrayList();
		Scanner add = new Scanner(System.in);
		//Estoque
		System.out.println("==========Estoque===========");
		nomes.add("Caixa de som");
		nomes.add("Canetas");
		nomes.add("Capinhas de proteção");
		nomes.add("Pericúla de proteção");
		nomes.add("Caderno");
		nomes.add("Carregadores");
		nomes.add("Computadores");
		nomes.add("Acessorios");
		nomes.add("Periféricos");
		nomes.add("Livros");
	
		for(String name : nomes) {
			
			System.out.println("Produtos:" + name);
			}
		//Removendo Conteudos.
		nomes.remove("Canetas");
		nomes.remove("Caderno");
		nomes.remove("Livros");
		//Atualizando Estoque
		System.out.println("============Estoque Atualizada=============");
		
		for(String name : nomes) {
			
			System.out.println("Produtos:" + name);
			}
		
		
		
		
		

	}

}
