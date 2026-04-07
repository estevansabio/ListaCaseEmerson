package pctEx03;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Digite o nome de usuário:");
		String user = receba.nextLine();
		System.out.println("Digite a senha:");
        int senha = receba.nextInt();
        
        if(user.equals("admin")&&senha==123){
        	System.out.println("Acesso concedido");
        	
        }else {
        	System.out.println("Acesso negado");
        }
	}

}
