package poo.model;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setCep("00000");
		
		Cliente cliente = new Cliente();
		cliente.setDocumento("12345678911");
		
		System.out.println("Documento: "+cliente.getDocumento());
		try {
			cliente.adicionarEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
		}
	}

}
