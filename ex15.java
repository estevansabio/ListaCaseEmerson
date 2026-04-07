package pctEx03;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero");
        num =  receba.nextInt();
        System.out.println((num%3==0 && num%5==0)?"É divisivel por 3 e 5": (num%5==0)?"É divisivel só por 5":(num%3==0)? "É divisivel só por 3":"Não é divisivel por 3 e 5, nem por 5, nem por 3");
        
		
		
	}

}
