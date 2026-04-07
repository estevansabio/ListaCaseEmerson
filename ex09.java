package pctEx03;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		System.out.println("Olá, Bem-Vindo a Calculadora, digite 2 números e uma operação");
		double n1 = receba.nextDouble(), n2 = receba.nextDouble();
		receba.nextLine();
		String op = receba.nextLine();
		
		switch(op) {
		case "+"->System.out.println(n1+n2);
		case "-"->System.out.println(n1-n2);
		case "*"->System.out.println(n1*n2);
		case "/"->System.out.println(n1/n2);
		}
		

	}

}
