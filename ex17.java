package pctEx03;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner (System.in);
		
		System.out.println("ME diga quanto você pagou pelo produto:");
		int prod = receba.nextInt();
		System.out.println("Me diga a quantidade de produtos que você comprou:");
		int quant = receba.nextInt();
		System.out.println("O valor da sua compra é de: " +(prod*quant)  );
		System.out.println("Agora, vamos aplicar o IPI de 15%, digite o valor da sua compra:");
		int valor = receba.nextInt();
		System.out.println("O valor da sua compra aplicando 15% de imposto é: " +(valor+valor*0.15));

	}

}
