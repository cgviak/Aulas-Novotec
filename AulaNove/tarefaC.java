package AulaNove;

public class tarefaC {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		
		do {
			if (a%4 == 0) {
				b+= c;
				c++;
			}
		}
		while (c<=200);
			System.out.print(b);
	}

}