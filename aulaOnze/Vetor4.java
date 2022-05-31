package aulaOnze;

public class Vetor4 {

	public static void main(String[] args) {
		int [] v = {0, 5, 1, 4, 2, 7, 8, 3, 6};
		for (int i = 8; i <=5; i++) {
			int aux = v [i];
			v [i] = v [8-i+1];
			v [8-i+1] = aux; 
		}
		System.out.println (v[3]=v[1]);
				System.out.println(v[v[3]] = v[v[2]]);
	}
}