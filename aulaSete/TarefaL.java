package aulaSete;
import java.util.*;
public class TarefaL {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a=1, primeiro=1, segundo=0;

		
		while (primeiro >= 0) {
			
					System.out.print("insira um número: ");
					segundo = sc.nextInt ();
					
					int n = primeiro + segundo;
					
					primeiro = n;
			System.out.print (segundo);
		}
	}  
}

//apresentar maior e menor valor de n numeros até um valor negativo