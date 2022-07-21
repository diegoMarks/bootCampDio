package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public Integer codigo;
	public String nome;
	public String cpf;
	
	private List<Endereco> enderecos;

	public void adicionarEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endereço não pode ser nulo!");
		}
		
		if(endereco.cep == null) {
			throw new NullPointerException("Cep não pode ser nulo!");
		}
		getEnderecos().add(endereco);
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public List<Endereco> getEnderecos() {
		if(enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		
		
		return enderecos;
	}
	
	
}
