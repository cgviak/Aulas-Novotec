package AulaNove;
import java.util.*;
public class tarefaD {

	public static void main(String[] args) {

		long a = 1 , b = 1 , c = 0;
		do {
				a += b;
				b+= c;
				c++;
				long var = a*b;
			}
		while (c<=16);	
			System.out.println(var);
	}
}