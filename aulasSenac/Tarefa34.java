package aulasSenac;
import java.util.*;
public class Tarefa34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double x;
		double y;
		
		System.out.println ("Digite o primeiro número: ");
		x = sc.nextDouble ();
		System.out.println ("Digite o segundo número: ");
		y = sc.nextDouble ();
		
		double z = ((x*y)+5);
			if (z<= 0) {
				System.out.println ("Resposta A.");
			} else if (z<= 100) {
				System.out.println("Resposta B.");
			} else {
				System.out.println("Resposta C.");
			}
		System.out.println (z);
	}

}
