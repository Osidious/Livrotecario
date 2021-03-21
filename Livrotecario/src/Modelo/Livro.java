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
			strDisponibilidade = "Dispon�vel";
		else
			strDisponibilidade = "Indispon�vel";	
	}
	@Override
	public String toString(){
		return "\nID: " + idLivro + "\nT�tulo: " + titulo +
				"\nAutor: " + autor + "\nEditora: " + editora +
				"\nEdi��o: " + edicao + "�\nDisponibilidade: "+ strDisponibilidade + "\n";
	}
}
