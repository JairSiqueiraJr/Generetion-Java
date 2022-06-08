import java.util.Scanner;

public class Exer2Aula03 {
	//Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int n1, n2, n3;
		
		n1 = 0;
		n2 = 0;
		n3 = 0;
		
		System.out.println("Digite 1º numeros");
		n1 = numero.nextInt();
		
		System.out.println("Digite 2º numeros");
		n2 = numero.nextInt();

		System.out.println("Digite 3º numeros");
		n3 = numero.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			if (n2 > n3) {
				System.out.println(n3 + " " +n2 + " " + n1);
			}else {
				System.out.println(n2 + " " + n3 + " " + " " +n1);
			}
			
		}else if(n2 > n3) {
			if(n1>n3) {
				System.out.println(n3+" "+n1+" "+n2);
			}else {
				System.out.println(n1+" "+n3+" "+n2);
			}
		}else {
			if (n1 > n2) {
				System.out.println(n2+" "+n1+" "+n3);
			}else {
				System.out.println(n1+" "+n2+" "+n3);
			}
		}


		

	}


}