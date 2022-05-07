package aulasSenac;
import java.util.Scanner;
public class Tarefa15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double x = 0;
		System.out.println ("escreva um valor: ");
		x = sc.nextDouble ();
		if (x >= 0) {
			System.out.println ("número é positivo!");
		} else {
			System.out.println ("número é negativo!");
		}

	}

}
