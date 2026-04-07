package pctEx03;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao banco de triângulos");
		System.out.println("Me diga quanto vale cada lado do traingulo e eu falarei se ele é equilátero, escaleno ou isósceles");
        int l1 = receba.nextInt();
        int l2 = receba.nextInt();
        int l3 = receba.nextInt();
        
        if(l1==l2 && l2==l3) {
        	System.out.println("Seu triângulo é Equilátero");
        }else if(l1==l2 ||l1==l3||l2==l3) {
        	System.out.println("Seu triângulo é Isósceles");
        }else {
        	System.out.println("Seu triângulo é Escaleno");
        }
		
	}

}
