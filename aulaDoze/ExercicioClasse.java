package aulaDoze;

public class ExercicioClasse {
	String borracha;
	String fios;
	String plugue;
	String eletro;
	
	//fone tem borracha, fios, plugue, eletr�nicos;  faz barulhos por meio de vibra��o; est� inativo, sem vibrar.
	void fone () {
		System.out.println("borracha: " + this.borracha);
		System.out.println("fios: " + this.fios);
		System.out.println("plugue: " + this.plugue);
		System.out.println("eletro: " + this.eletro);
	}
	//mochila tem zipper, tecido, livros, papeis; guarda materiais, pendura nas costas por al�as; est� na cadeira, cheia
	String zipper;
	String tecido;
	String caderno;
	String mochila;
	
	void mochila () {
	if (this.zipper == "Sim") {
		System.out.println ("Est� aberto.");
	} else {
		System.out.println("n�o h� zipper.");
	}
	System.out.println (this.tecido);
	System.out.println (this.caderno);
	System.out.print(this.mochila);
}

}



//abstrato
//m�sica tem sons, vibra��o, letras, ritmo; faz o corpo se mexer, traz vida a um ambiente, deixa a prof brava; est� tocando.
//java tem vetores, comandos, estruturas, m�todos; l� programas, l� c�digos, os interpreta, e os mostra ao usu�rio; java est� ativado, est� na nuvem por githu