public class ExercicioDio {

	private final double PRECO_GASOLINA = 4.50;
	private double qtdGasolina;
	
	public ExercicioDio(double qtdGasolina) {
		this.qtdGasolina = qtdGasolina;
	}
	
	double abastecer(double qtdGasolina,double precoGasolina) {
		return qtdGasolina * precoGasolina;
	}
	
	
	public double getQtdGasonlina() {
		return qtdGasolina;
	}
	
	public double getPrecoGasolina() {
		return getPRECO_GASOLINA();
	}

	public double getPRECO_GASOLINA() {
		return PRECO_GASOLINA;
	}
	
}
