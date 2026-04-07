package pctEx03;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num;
		System.out.println("Digite o valor da sua compra");
        num =  receba.nextInt();
        System.out.println((num<100)?"não terá desconto": "Você terá desconto de 10%, o valor total da compra é:"+(num*0.9));
        
		
		
	}

}
