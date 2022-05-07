package aulasSenac;
import java.util.Scanner;
public class Tarefa22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = 0;
		double b = 0;
		
		System.out.print("informe as horas trabalhadas: ");
		a = sc.nextDouble();
		
		System.out.print("informe o salário por hora ");
		b= sc.nextDouble ();
		
		if (a>40) {
			System.out.println("Trabalhador ganhará adicional de 50%");
			System.out.println ("Salário: R$"+((a*b*0.5)+(a*b)));
		}else {
			System.out.println ("Salário: R$"+ (a*b));
		}
	}
}
