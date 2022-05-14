package aulaSete;
import java.util.*;
public class TarefaH {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c= 10, f;
		
		while (c<=100) {
			f = ((9*c+160)/5);
			System.out.print(c+" em Farenheit " +f);
			c+=10;
			
		}
	}

}
