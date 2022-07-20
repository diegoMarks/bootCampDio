package exercicioIntefaces;

public class Calculadora implements OperacaoMatematica {

	@Override
	public void soma(double num1, double num2) {
		System.out.println("Resultado da soma: " + num1+num2);
	}

	@Override
	public void subtracao(double num1, double num2) {
		System.out.println("Resultado da subtração: " + (num1-num2));
	}

	@Override
	public void multi(double num1, double num2) {
		System.out.println("Resultado da multiplicação: " + num1*num2);		
	}

	@Override
	public void divisao(double num1, double num2) {
		System.out.println("Resultado da divisão: " + num1/num2);		
	}

	
}
