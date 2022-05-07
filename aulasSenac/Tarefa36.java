package aulasSenac;
import java.util.*;
public class Tarefa36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a; //h1
		int b; //h2
		int c; //m1
		int d; //m2
		
		System.out.println ("Idade Homem 1: ");
		a = sc.nextInt ();
		System.out.println ("Idade Homem 2: ");
		b = sc.nextInt ();
		System.out.println ("Idade Mulher 1: ");
		c = sc.nextInt ();
		System.out.println ("Idade Mulher 2: ");
		d = sc.nextInt ();
		
	if ((a>b) && (c>d)) {
				System.out.println (a+d);
				System.out.println (b*c);
			} else if ((a>b)&& (d>c)){
				System.out.println (a+c);
				System.out.println (b*d);
			} else if ((a<b) && (c>d)) {
				System.out.println (b+d);
				System.out.println (a*c);
			} else if ((a<b)&& (c<d)) {
				System.out.println (b+c);
				System.out.println (a*d);
			}
	}
}