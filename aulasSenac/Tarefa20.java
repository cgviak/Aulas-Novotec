package aulasSenac;
import java.util.Scanner;
public class Tarefa20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = 0;
		int b = 0;
		
		System.out.println ("Digite um número: ");
		a = sc.nextInt ();
		
		System.out.println ("Digite outro número: ");
		b = sc.nextInt ();
		System.out.print("Em ordem crescente: ");
		if (b>a) {
			System.out.println (b+", "+a);
		} else {
			System.out.println (a+", "+b);
		}
	}
}