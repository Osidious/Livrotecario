package Controle;

import Modelo.Dados;
import Modelo.Livro;

import java.util.ArrayList;
import java.util.List;

public class Ficheiro {
	public static List<Dados> arquivo;
	public static List<Livro> prateleira;
	
	public Ficheiro(){
		arquivo = new ArrayList<Dados>();
	}
	
	public static void registraEmprestimo(int idLivro,Dados emprestimo, Livro temp){
		arquivo.add(emprestimo);
		prateleira.set(idLivro, temp);
	}
	
	public static void registraDevolucao(int id) {
		arquivo.remove(id);
	}
	
	public static void reservaEmprestimo(int id) {
		arquivo.remove(id);
	}
	
	@Override
	public String toString() {
		String total = "\n";
		
		for (int i=0; i<arquivo.size(); i++){
			Dados emprestimo = arquivo.get(i);
			total = total + emprestimo.toString();
		}
		return total;
	}
}
