package pctEx03;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int pcal, scal,bcal;
		
		System.out.println("Bem-Vindo ao MENU do nosso restaurante");
		System.out.println("Vamos ao nosso cardápio do prato principal:");
		System.out.println("1-Vegetariano (180cal) | Abacaxi (75cal) | Chá (20cal)");
		System.out.println("2-Peixe (230cal) | Sorvete diet (110cal) | Suco de laranja (70cal)");
		System.out.println("3-Frango (250cal) | Mouse diet (170cal) | Suco de melão (100cal)");
		System.out.println("4-Carne (350cal) | Mouse chocolate (200cal) | Refrigerante diet (65cal)");
		System.out.println("Escolha uma opção:");
		
		pcal = receba.nextInt();
		scal = receba.nextInt();
		bcal = receba.nextInt();
		
		switch (pcal) {
		case 1-> pcal = 180;
		case 2-> pcal = 230;
		case 3-> pcal = 250;
		case 4-> pcal = 350;
		}
		switch(scal) {
		case 1-> scal = 75;
		case 2-> scal = 110;
		case 3-> scal = 170;
		case 4-> scal = 200;
		}
        switch(bcal) {
    	case 1-> bcal = 20;
		case 2-> bcal = 70;
		case 3-> bcal = 100;
		case 4-> bcal = 65;
        }
        System.out.println("\n A quantidade de calorias que você comeu foi " +(pcal+scal+bcal));
	}

}
