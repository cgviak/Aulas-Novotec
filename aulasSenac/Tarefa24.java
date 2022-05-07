package aulasSenac;
import java.util.*;
public class Tarefa24 {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		double a;
		double b;
		
		System.out.print("Digite o salário fixo: R$");
		a = sc.nextDouble ();
		
		System.out.print("Digite o total de vendas: R$ ");
		b = sc.nextDouble ();
		
		if (b>1500) {
			System.out.print ("Salário: R$"+((b*0.03)+a));
		} else {
			System.out.print ("Salário: R$"+((b*0.05)+a));
		}
	}
}
