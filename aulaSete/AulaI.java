package aulaSete;
//10 valores númericos, soma e média
import java.util.*;
public class AulaI {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = 0, b=0, total=0;
		
		while (n < 10) {
		System.out.println ("Digite um número: ");
		b= sc.nextInt ();
		total += b;
		n++;
		}
		System.out.println(total);

	}

}
