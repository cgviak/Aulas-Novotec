package br.senac.model;

public class Pessoa {
	private int id;
	private String nome;
	private int anoNascimento;

	public Pessoa() {}

	public Pessoa(int id, String nome, int anoNAscimento) {
		this.id= id;
		this.nome = nome;
		this.anoNascimento= anoNascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}

