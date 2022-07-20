
public class Teste {
	public static void main(String[] args) {

		ExercicioDio abastecer = new ExercicioDio(100);
		double qtdAbastecido = abastecer.abastecer(abastecer.getPrecoGasolina(), abastecer.getPrecoGasolina());
		System.out.println("Preço da gasolina: R$" + abastecer.getPRECO_GASOLINA());
		System.out.println("Quantidade a ser abastecida: " + abastecer.getQtdGasonlina() + " Litros");
		System.out.println("Quantidade a pagar: R$" + qtdAbastecido);
		
	}
}
