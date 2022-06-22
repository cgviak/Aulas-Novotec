package aulaTreze;

public class Heranca1 {

	public class Pessoa extends Heranca1{
		String nome = "Joe";
		int idade = 5;
		char sexo;
		double fazeraniversario = 2;
		System.out.print(idade+fazeraniversario);
	}
	public class Visitante extends Pessoa {
		
	}
	public class Professor extends Heranca1 {
		String especialidade;
		double salario;
		char receberaumento;
	}
	public class aluno extends Heranca1 {
		int matricula;
		String curso;
		char pagarmensalidade;
	}
	public class Bolsista extends aluno {
		int bolsa;
		char renovarbolsa;
		char pagarmensalidade;
	}
	public class tecnico extends aluno {
		int registro;
		char praticar;
	}

}
