package Modelo;

import Controle.Hotel;
import java.util.Date;

public class Usuario {
	String nome, cpf, telefone;
	Date dataDeNascimento;
	int idUsuario;
	
	public Usuario() {
		nome = null;
		cpf = null;
		telefone = null;
		idUsuario = 0;
		dataDeNascimento = null;
	}
	
	public Usuario (String nome, String cpf, String  telefone, Date dataDeNascimento) {
		idUsuario = Hotel.quarto.size() + 1;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String toString(){
		return "\nID: " + idUsuario + "\nNome: " + nome +
				"\nCPF: " + cpf + "\nTelefone: " + telefone +
				"\nData de Nascimento: " + dataDeNascimento + "\n";
	}
}
