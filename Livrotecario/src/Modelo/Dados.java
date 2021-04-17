package Modelo;

import Controle.Hotel;
import Controle.Estante;
import Controle.Ficheiro;
import java.util.Date;

public class Dados {
	int idLivro,idUsuario, idEmprestimo;
	Livro dadosLivro;
	Usuario dadosUsuario;
	Date dataDeDevolucao, dataDeEmprestimo;
	
	public Dados() {
		idLivro = 0;
		idUsuario = 0;
		dadosLivro = null;
		dadosUsuario = null;
		idEmprestimo = 0;
	}
	
	public Dados (int idLivro, int idUsuario) {
		this.idLivro = idLivro;
		this.idUsuario = idUsuario;
		dadosUsuario = Hotel.quarto.get(idUsuario);
		dadosLivro = Estante.prateleira.get(idLivro);
		idEmprestimo = Ficheiro.arquivo.size() + 1;
 	}
	
	public String toString(){
		return "\nID Empréstimo: " + idEmprestimo + "\n\nUsuário: " + dadosUsuario +
				"\nLivro: " + dadosLivro + "\n";
	}
}