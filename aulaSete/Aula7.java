//aula 7 06/05/2022 While
package aulaSete;
import java.util.*;
public class Aula7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a;
		int i = 1;
		System.out.print("Determine um número: ");
		a = sc.nextInt ();
					
	while (i <= 10) {
		System.out.println (a*i);
		i++;
	}
	}
}
