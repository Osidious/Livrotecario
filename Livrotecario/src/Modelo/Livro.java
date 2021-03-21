package Modelo;

import Controle.Estante;
public class Livro {
	String titulo, autor, editora, strDisponibilidade;
	int idLivro, edicao;
	boolean disponibilidade;
	
	public Livro() {
		titulo = null;
		autor = null;
		editora = null;
		strDisponibilidade = null;
		idLivro = 0;
		edicao = 0;
		disponibilidade = true;
	}
	
	public Livro (String titulo, String autor, String editora, int edicao, boolean disponibilidade) {
		idLivro = Estante.prateleira.size() + 1;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
		if(disponibilidade == true)
			strDisponibilidade = "Disponível";
		else
			strDisponibilidade = "Indisponível";	
	}
	@Override
	public String toString(){
		return "\nID: " + idLivro + "\nTítulo: " + titulo +
				"\nAutor: " + autor + "\nEditora: " + editora +
				"\nEdição: " + edicao + "°\nDisponibilidade: "+ strDisponibilidade + "\n";
	}
}
