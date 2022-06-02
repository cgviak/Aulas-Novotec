package aulaOnze;

public class Vetor10 {

	public static void main(String[] args) {
		int nota [] = {9, 8, 10, 9, 8, 10, 9, 8, 10, 7};
		int c = 0;

		for (int a : nota) {

			for (int b = 0; b <= nota.length; b++) {
				c += a;
			}
			int d = c/10;
			System.out.println(d);
		}
	}
}