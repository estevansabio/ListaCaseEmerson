package pctEx03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero");
        num =  receba.nextInt();
        System.out.println((num%10==0)?"É divisivel por 10": (num%5==0)?"É divisivel por 5":(num%2==0)? "É divisivel por 2":"Não é divisivel por 10, nem por 5, nem por 2");
        
		
		
	}

}
