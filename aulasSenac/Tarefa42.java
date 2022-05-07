package aulasSenac;
import java.util.*;
public class Tarefa42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int ts; //tempo de serviço
		int i; //idade
		
		System.out.println ("Digite a idade: ");
		i = sc.nextInt ();
		System.out.println ("Digite o Tempo de Serviço: ");
		ts = sc.nextInt ();
		if (i>=65) {
			System.out.println ("apto para aposentar.");
		} else if (ts>=30) {
			System.out.println ("apto para aposentar.");
		}else if (i>=60 && ts>=25) {
			System.out.println ("apto para aposentar.");
		}else {
			System.out.print("Inapto para aposentar.");
		}
	}

}
