package pctEx03;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num = 124;

		System.out.println("coloque a sua senha para acessar o saldo da sua conta");
		String senha = receba.nextLine();
		if (senha.equals("Senha")) {
			System.out.println("Entrada concedida");
		} else {
			System.out.println("Entrada bloqueada");
		}
		System.out.println("1-Você deseja ver seu saldo? ");
		System.out.println("2-Você deseja sair da conta?");
		int num1 = receba.nextInt();

		{
			switch (num1) {
			case 1:
				System.out.println("aqui está a sua conta");
				System.out.println("Seu saldo na conta é R$124");
			System.out.println("Deseja depositar saldo na conta?");
			int saldo = receba.nextInt();

			if(saldo==1) {
			System.out.println("Quanto deseja colocar na conta?");
			int dindin = receba.nextInt();
			System.out.println("Seu saldo da conta é: R$" + (num + dindin));
			
			}
			
			break;
			case 2 : 
				
				System.out.println("\n Deseja sair da sua conta?");
				int sair = receba.nextInt();
				System.out.println("Você saiu desta conta!");
				
			
			

		}
			

		

		
		
		receba.close();
	}

	}
}
