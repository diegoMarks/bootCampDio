package poo.model;

import poo.model.Endereco.TipoEndereco;
import poo.model.Pessoa.TipoPessoa;

public class EntregaCartaoApp {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setCep("00000");
		endereco.setTipoEndereco(TipoEndereco.ENTREGA);
		
		Cliente cliente = new Cliente();
		cliente.setTipo(TipoPessoa.FISICA);
		
		
		try {
			cliente.adicionarEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
		}
	}

}
