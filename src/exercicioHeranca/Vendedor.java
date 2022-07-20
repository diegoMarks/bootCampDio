package exercicioHeranca;

public class Vendedor extends Funcionario {

	private float precoMercadoria;
	private String nomeMercadoria;
	
	
	public float getPrecoMercadoria() {
		return precoMercadoria;
	}

	public void setPrecoMercadoria(float precoMercadoria) {
		this.precoMercadoria = precoMercadoria;
	}



	public String getNomeMercadoria() {
		return nomeMercadoria;
	}



	public void setNomeMercadoria(String nomeMercadoria) {
		this.nomeMercadoria = nomeMercadoria;
	}



	void vender(float precoMercadoria,String nomeMercadoria) {
		System.out.println("Preço da mercadoria: "+ precoMercadoria);
		System.out.println("Nome da mercadoria: "+ nomeMercadoria);
	}
}
