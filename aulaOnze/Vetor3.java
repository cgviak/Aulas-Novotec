package aulaOnze;

public class Vetor3 {

	public static void main(String[] args) {
		int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int a : b) {
			if (a%2 == 0) {
				System.out.println(a + " Par");
				} else {
					System.out.println(a + " Ímpar");
			}
			}
		}
	}