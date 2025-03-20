package exemplos;

public class Aula9 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		//System.out.println("Nome do usuário: " + args[0]);		
		//System.out.println(args[1]);
		
		//tipos primitivos - armazena valor
		Integer codigo =1;
		byte num;
		final int numero=0;
		double valor;
		boolean achou= false;
		char resposta= 'S';
		//armazena uma referência que poderá ser chamada pelo programa em diferentes instâncias
		// forma antiga de se definir uma string: String nome2 = new String("Alexandre");
		String nome = "Alexandre";
		
		System.out.println(nome.toUpperCase());
	}

}