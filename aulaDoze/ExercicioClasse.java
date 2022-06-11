package aulaDoze;

public class ExercicioClasse {
	String borracha;
	String fios;
	String plugue;
	String eletro;
	
	//fone tem borracha, fios, plugue, eletrônicos;  faz barulhos por meio de vibração; está inativo, sem vibrar.
	void fone () {
		System.out.println("borracha: " + this.borracha);
		System.out.println("fios: " + this.fios);
		System.out.println("plugue: " + this.plugue);
		System.out.println("eletro: " + this.eletro);
	}
	//mochila tem zipper, tecido, livros, papeis; guarda materiais, pendura nas costas por alças; está na cadeira, cheia
	String zipper;
	String tecido;
	String caderno;
	String mochila;
	
	void mochila () {
	if (this.zipper == "Sim") {
		System.out.println ("Está aberto.");
	} else {
		System.out.println("não há zipper.");
	}
	System.out.println (this.tecido);
	System.out.println (this.caderno);
	System.out.print(this.mochila);
}

}



//abstrato
//música tem sons, vibração, letras, ritmo; faz o corpo se mexer, traz vida a um ambiente, deixa a prof brava; está tocando.
//java tem vetores, comandos, estruturas, métodos; lê programas, lê códigos, os interpreta, e os mostra ao usuário; java está ativado, está na nuvem por githu