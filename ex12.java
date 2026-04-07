package pctEx03;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num;
		System.out.println("ME DE O NÚMERO PARA SABER SE VOCÊ ESTÁ NO INTERVALO");
        num =  receba.nextInt();
        System.out.println((num>=10 && num<=50)?"Você está no intervalo": "Você não está no intervalo");
        
		
		
	}

}
