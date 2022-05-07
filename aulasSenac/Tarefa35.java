package aulasSenac;
import java.util.*;
public class Tarefa35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double l; //litros
		double a; // Gasolina ou Álcool (1 ou 0)
		
		System.out.println ("Digite o combustível: (1 ou 0) ");
		a = sc.nextDouble ();
		System.out.println ("Digite os litros: ");
		l = sc.nextDouble ();
		
		if (a<1) {
			System.out.println("Álcool.");
		} else if (l<=20) {
			System.out.println ("Desconto de 3% por litro.");
			System.out.print ("R$"+(l*2.813));
		} else if (l>20) {
			System.out.println ("Desconto de 5% por litro.");
			System.out.print("R$"+(l*2.755));
		} 
		if (a>1) {
			System.out.println ("Gasolina.");
		} else if (l<=20) {
			System.out.println ("Desconto de 4% por litro.");
			System.out.print ("R$"+(l*3.168));
		} else if (l>20) {
			System.out.println ("Desconto de 6% por litro.");
			System.out.print("R$"+(l*3.102));
		}
	}

}
