package teste;

import java.util.Scanner;

public class Teste04{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de pessoas: ");
		int N = scan.nextInt();
		String string = scan.nextLine();
		
		String[] s = string.split(" ");
		
		double[] idade = new double[N];
		int i;
		for(i=0;i<N;i++) {
			idade[i] = scan.nextInt();
		}
		
		System.out.println("Nao poderao entrar as idades: ");
		for(i=0;i<N;i++) {
			if(idade[i]<18) {
				System.out.println(Math.round(idade[i]));
			}
		}
		scan.close();
	}
}