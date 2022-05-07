package aulasSenac;
import java.util.*;
public class Tarefa23 {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		int idade = 0;
		double peso = 0;
		double altura = 0;
		int sexo;
		
		System.out.println ("Digite sua idade: ");
		idade = sc.nextInt ();
		
		System.out.println ("Digite seu peso: ");
		peso = sc.nextDouble ();
		
		System.out.println ("Digite sua altura: ");
		altura = sc.nextDouble ();
		
		System.out.println ("Digite seu sexo: ");
		sexo = sc.nextInt();
		
		double idealm = ((72.2*altura)-58);
		double idealf = ((62.1*altura)-44.7);
		if (sexo == 1) {
			System.out.println ("seu peso ideal é: "+ idealm);
			if (peso>idealm) {
			System.out.print ("você precisa perder:"+(idealm-peso)+"kg");
			} else {
				System.out.print("você precisa ganhar: "+ (peso-idealm)+"kg");
			}
		} else {
				System.out.println ("seu peso ideal é: "+ idealf);
				if (peso>idealm) {
				System.out.print ("você precisa perder:"+(idealf-peso)+"kg");
				} else {
					System.out.print("você precisa ganhar: "+ (peso-idealf)+"kg");
		}
	}
}
}
