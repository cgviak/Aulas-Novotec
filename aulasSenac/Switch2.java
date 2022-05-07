//aula 5 02/05/2022 switch case
package aulasSenac;
import java.util.*;
public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		byte dia;
		byte mes;
		
		System.out.print("Determine o dia: ");
		dia = sc.nextByte ();
		
		System.out.print("Determine o mês: ");
		mes = sc.nextByte ();
		System.out.print("Seu signo é: ");
		
		switch (mes) {
		case 1:
			if (dia<=19) {
				System.out.print("Capricórnio.");
			} else {
				System.out.print("Aquário.");
			}
			break;
		case 2:
			if (dia<=18) {
				System.out.print("Aquário.");
			} else {
				System.out.print("Peixes.");
			}
			break;
		case 3:
			if (dia<=20) {
				System.out.print("Peixes.");
			} else {
				System.out.print("Áries.");
			}
			break;
		case 4:
			if (dia<=20) {
				System.out.print("Áries.");
			} else {
				System.out.print("Touro.");
			}
			break;
		case 5:
			if (dia<=20) {
				System.out.print("Touro.");
			} else {
				System.out.print("Gêmeos.");
			}
			break;
		case 6:
			if (dia<=20) {
				System.out.print("Gêmeos.");
			} else {
				System.out.print("Câncer.");
			}
			break;
		case 7:
			if (dia<=22) {
				System.out.print("Câncer.");
			} else {
				System.out.print("Leão.");
			}
			break;
		case 8:
			if (dia<=22) {
				System.out.print("Leão.");
			} else {
				System.out.print("Virgem.");
			}
			break;
		case 9:
			if (dia<=22) {
				System.out.print("Virgem.");
			} else {
				System.out.print("Libra.");
			}
			break;
		case 10:
			if (dia<=22) {
				System.out.print("Libra.");
			} else {
				System.out.print("Escorpião.");
			}
			break;
		case 11:
			if (dia<=21) {
				System.out.print("Escorpião.");
			} else {
				System.out.print ("Sagitário.");
			}
			break;
		case 12:
			if (dia<=22) {
				System.out.print("Sagitário.");
			} else {
				System.out.print("Capricórnio.");
			}
			break;
		default:
			System.out.print("valor inválido.");
		}
		}
}