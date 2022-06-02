package aulaOnze;

public class Vetor6 {

	public static void main(String[] args) {

		int a [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 42, 56, 22};
		
		for (int b : a) {
			for (b = a.length - 1; b >= 0; b--) {
			
				System.out.println(a[b]);
		}
		}
	}

}
