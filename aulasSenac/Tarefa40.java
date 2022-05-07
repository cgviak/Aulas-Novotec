package aulasSenac;
import java.util.*;
public class Tarefa40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int q; // Quant. Adquirida
		double p; //preço
		
		System.out.println ("Nome do Produto.");
		System.out.println ("Digite a Quantidade Adquirida: ");
		q = sc.nextInt ();
		System.out.println ("Digite o Preço: ");
		p = sc.nextDouble ();
		
		if (q<=5) {
			System.out.print (q*(p*0.98));
		}else if (q>5 && q <=10) {
			System.out.print ((q*(p*0.97)));
		} else {
			System.out.print((q*(p*0.95)));
		}
	}

}
