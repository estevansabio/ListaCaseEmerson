package pctEx03;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite seu imc");
        double imc =  receba.nextDouble();
        
        if(imc<=18) {
        	System.out.println("Magro");
        }else if(imc>=18 && imc <=25) {
        	System.out.println("Normal");
        }else if(imc>25) {
        	System.out.println("Acima do peso");
        }
        
        
		
		
	}

}