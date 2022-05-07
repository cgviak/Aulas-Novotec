package aulasSenac;
import java.util.*;
public class Tarefa41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			double n1;
			double n2;
			double n3;
			double n5;
			
			System.out.println ("Digite a nota 1: ");
			n1 = sc.nextDouble ();
			System.out.println ("Digite a nota 2: ");
			n2 = sc.nextDouble ();
			System.out.println ("Digite a nota 3: ");
			n3 = sc.nextDouble ();
			System.out.println ("Digite a Média dos Exercícios: ");
			n5 = sc.nextDouble ();
			
			double n4 = ((n1+(n2*2)+(n3*3)+n5)/7);
			if (n4 >= 9) {
				System.out.print("Conceito A.");
			} else if (n4>=7.5 && n4 < 9) {
				System.out.print("Conceito B.");
			} else if (n4>=6 && n4 < 7.5) {
				System.out.print("Conceito C.");
			} else {
				System.out.print("Conceito D.");
			}
	}

}
