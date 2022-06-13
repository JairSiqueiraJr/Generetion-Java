package ExerciciosHeranca;

public class Cfonte {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		
		dog.setNome("Mavis");
		dog.setIdade(7);
		dog.setSons("Au-Au-Au");
		dog.setDever("Andar/Correr");
		
		System.out.println("=======Cachorro=======");
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		System.out.println("Sons:" + dog.getSons());
		System.out.println("locomover:" + dog.getDever());

		Cavalo cav = new Cavalo();
		
		cav.setNome("Pé de pano");
		cav.setIdade(10);
		cav.setSons("Hiin in in");
		cav.setDever("Anda/Correr");
		
		System.out.println("=======Cavalo=======");
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade());
		System.out.println("Sons:" + cav.getSons());
		System.out.println("locomover:" + cav.getDever());
		
		Preguica pre = new Preguica();
		

		pre.setNome("Tobby");
		pre.setIdade(20);
		pre.setSons("AAA, AAA, AAA, AAA");
		pre.setDever("Se Arrastar/Escalar/Nadar");
		
		System.out.println("=======Preguiça=======");
		System.out.println("Nome: " + pre.getNome());
		System.out.println("Idade: " + pre.getIdade());
		System.out.println("Sons:" + pre.getSons());
		System.out.println("locomover:" + pre.getDever());
		
	}

}
