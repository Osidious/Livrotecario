package Controle;

import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
		
	public static List<Usuario> quarto;
		
	public Hotel() {
		quarto = new ArrayList<Usuario>();
	}
	public static void adicionaUsuario(Usuario individuo) {
		quarto.add(individuo);
	}
		
	public static void atualizaUsuario(int id,Usuario individuo) {
		quarto.set(id, individuo); 	
	}
	
	public static void removeUsuario(int id) {
		quarto.remove(id); 	
	}
	
	public String toString() {
		String total = "\n";
		
		for (int i=0; i<quarto.size(); i++){
			Usuario individuo = quarto.get(i);
			total = total + individuo.toString();
				
		}
			
		return total;
	}
	
}
