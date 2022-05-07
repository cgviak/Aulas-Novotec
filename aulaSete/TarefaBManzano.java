package aulaSete;
import java.util.*;
public class TarefaBManzano {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = 0, b = 0;
		while (a < 100) {
			System.out.println(a+1);
			a++;
			b += a;
	}
		System.out.println(b);
	}
}
