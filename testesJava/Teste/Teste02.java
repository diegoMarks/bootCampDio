package Teste;
import java.io.IOException;
import java.util.Scanner;

public class Teste02 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de casos: ");
		int casos = sc.nextInt();
		int cont = 0;
		while(cont < casos) {
			
			System.out.print("Valor de A: ");
			double a = sc.nextDouble();
			System.out.print("Valor de B: ");
			double b = sc.nextDouble();
			System.out.print("Valor de C: ");
			double c = sc.nextDouble();
			
			double saida = ((((a*2)+(b*3)+(c*5))/(2+3+5)));

			System.out.printf("%.1f \n",saida);
			cont++;
		}
		
		
		
		sc.close();
	}
}