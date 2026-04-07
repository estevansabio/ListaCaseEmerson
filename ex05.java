package pctEx03;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner receba = new Scanner(System.in);
     double num;
     
     System.out.println("Me diga o seu saldo médio:");
     num = receba.nextDouble();
     
     if(num<=500) {
    	 System.out.println("Seu saldo é " +num);
     }else if(num<=1000) {
    	 System.out.println("Seu saldo é " +(num+num*0.3));
     }else if(num<=3000) {
    	 System.out.println("Seu saldo é " +(num+num*0.4));
     }else {
    	 System.out.println("Seu saldo é " +(num+num*0.5));
     }
     
     
	}

}
