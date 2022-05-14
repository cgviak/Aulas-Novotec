package AulaNove;

public class TarefaB {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		
		do {
			if (a%2 == 0) {
				b+= c;
				c++;
			}
		}
		while (c<=500);
			System.out.print(b);
	}

}
