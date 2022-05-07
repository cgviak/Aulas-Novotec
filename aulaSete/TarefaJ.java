package aulaSete;
import java.util.*;
public class TarefaJ {
//soma de 50 a 70
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b, c = 0;
		System.out.print ("Somar de: ");
		a = sc.nextInt ();
		System.out.println(" até: ");
		b = sc.nextInt();
		while (a<b) {
			a++; 
			c += a;
		}
		System.out.println (c+1);
	}

}
