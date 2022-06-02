package aulaOnze;
import java.util.*;
public class Vetor8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int w [] = {1, 2, 3, 4, 5, 6, 13, 13, 13, 10};
		int a = 0;
		
		System.out.print("Qual o número? ");
		a = sc.nextInt();
		
		int n = 0;
		for (int b = 0; b < w.length; b++) {
			if (w[b] == a) {
				n++;
			}
		}
		System.out.print("esse número aparece: " + n +" vez(es)");
	}

}
