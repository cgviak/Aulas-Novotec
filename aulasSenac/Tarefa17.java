package aulasSenac;
import java.util.Scanner;
public class Tarefa17 {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float a = 0; //prova 1
        float b = 0; //prova 2
        float c = 0; //prova 3
        
        System.out.println ("Qual a nota da prova 1? ");
        a = sc.nextInt();
        
        System.out.println ("Qual a nota da prova 2? ");
        b = sc.nextInt();
        
        System.out.println ("Qual a nota da prova 3? ");
        c = sc.nextInt();
        
        double d = (((a*2)+(b*3)+(c*5))/10); //média
        System.out.println ("Média final: " + d);
        
        if (d>=6) {
        	System.out.println ("Aluno foi aprovado!");
        } else {
        	System.out.println ("Pegou DP.");
        }

	}

}
