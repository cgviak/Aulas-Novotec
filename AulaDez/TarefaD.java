package AulaDez;

public class TarefaD {

	public static void main(String[] args) {
		int b = 0;
		
		for (int a = 1; a <=500; a++) {
			if (a%2 == 0) {
				b += a;	
			}
		}
		System.out.print(b + " ");
	}
}