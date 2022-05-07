package aulasSenac;

import java.util.Scanner;

public class Aula4 {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double x = 0;
		System.out.println ("Digite um número: ");
		x = sc.nextDouble ();
		
		if (x>10) {
			System.out.println ("É Maior do que 10!");
		} else {
			System.out.println ("Não é maior que 10!");
	}
	}
}