package teste;

import java.util.Scanner;

public class Teste03 {
	public static void main(String args[]){
	      Scanner sc=new Scanner(System.in);
	     
	         int number,id;
	         
	         System.out.print("Quantidade de Gameplays: ");
	         number=sc.nextInt();
	         System.out.print("Número do ID: ");
	         id=sc.nextInt();

	         int count=0;
	         while(number>0){
	           int id1,num;
	           System.out.println("Inserindo Gameplay!!");
	           System.out.println("ID de quem está postando");
	           id1=sc.nextInt();
	           System.out.println("Tipo de Gameplay postada 0 = CS | 1 = LOL");
	           num=sc.nextInt();

	           if((id==id1)&&(num==0)){
			        count++;
		    }
	           number--;
	         }
	         System.out.println("Quantidade de Gameplays de CS: "+count);
	     sc.close();
}
}
