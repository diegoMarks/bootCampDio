package teste;

import java.util.Scanner;

public class Teste01 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String[] nomes = new String[10];
	for(int i=0;i<10;i++){
		
		System.out.print("Insira um Nome: ");
		nomes[i] = input.next();
	}
	System.out.println(nomes[2]);	
	System.out.println(nomes[6]);
	System.out.println(nomes[8]);
	
	input.close();
}
}

