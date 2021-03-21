package Controle;

import Modelo.Livro;
import java.util.ArrayList;
import java.util.List;

public class Estante {
	
	public static List<Livro> prateleira;
	
	public Estante() {
		prateleira = new ArrayList<Livro>();
	}
	public static void adicionaLivro(Livro exemplar) {
		prateleira.add(exemplar);
	}
	
	public static void atualizaLivro(int id,Livro exemplar) {
		prateleira.set(id, exemplar); 	
	}
	public static void removeLivro(int id) {
		prateleira.remove(id); 	
	}
	
	@Override
	public String toString() {
		String total = "\n";
		
		for (int i=0; i<prateleira.size(); i++){
			Livro exemplar = prateleira.get(i);
			total = total + exemplar.toString();
		}
		return total;
	}
}
