package aulaOnze;

public class Vetor7 {

	public static void main(String[] args) {

		int x [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int a : x) {
			if (a%2 == 0) {
				int y = a/2;
				System.out.println (y);
				} else {
				int y = a*3;
				System.out.println (y);
			}
		}
	}

}
