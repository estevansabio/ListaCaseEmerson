package pctEx03;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int dia;
		System.out.println("Digite um número para o dia da semana");
		dia = receba.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			System.out.println("Fim de semana");
			break;
		case 2:
			System.out.println("Segunda");
			System.out.println("Dia útil");
			break;
		case 3:
			System.out.println("Terça");
			System.out.println("Dia útil");
			break;
		case 4:
			System.out.println("Quarta");
			System.out.println("Dia útil");
			break;
		case 5:
			System.out.println("Quinta");
			System.out.println("Dia útil");
			break;
		case 6:
			System.out.println("Sexta");
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("Sábado");
			System.out.println("Fim de Semana");
			default:
				System.out.println("dia inválido");
		}
		
		
		
		
		receba.close();
	}
}