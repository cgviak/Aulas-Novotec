package aulaSete;

public class TarefaG {

	public static void main(String[] args) {
		int a=1, primeiro=1, segundo=1;
		System.out.print("0 1 ");
		while (a<= 15) {
			int n = primeiro + segundo;
					primeiro = segundo;
					segundo = n;
					a++;
			System.out.print (primeiro + " ");
		}
	}  
}