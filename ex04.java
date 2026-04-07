package pctEx03;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		double result;
		System.out.println("Digite seu peso:");
        double num1 =  receba.nextDouble();
        System.out.println("digite sua altura");
        double num2 = receba.nextDouble();
        
        receba.close();
        System.out.println("Calculo IMC");
        double imc = num1 / (num2*num2);
        System.out.println("Seu imc é: "+imc);
        
        if(imc<=18.5) {
        	System.out.println("Abaixo do Peso");
        }else if(imc<=25) {
        	System.out.println("Normal");
        }else if(imc<=30) {
        	System.out.println("Sobrepeso");
        }else if(imc<=40) {
        	System.out.println("obesidade");
        }else {
        	System.out.println("Obesidade mórbida");
        }
        
        
		
		
	}

}
