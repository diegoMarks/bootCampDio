package exercicioHeranca;

public class Teste {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Emivaldo");
		funcionario.setCpf("4395432493-23");
		funcionario.setIdade(54);
		//Exemplo de Down Cast Explicito, não aconselhavel.
		//Gerente gerenteEmivaldo = (Gerente) new Funcionario();
		Gerente gerenteEmivaldo = new Gerente();
		gerenteEmivaldo.setNome("Emovaldo");
		
		System.out.println(gerenteEmivaldo.getNome());
		
		gerenteEmivaldo.darOrdem(funcionario.getNome());
		
	}

}
