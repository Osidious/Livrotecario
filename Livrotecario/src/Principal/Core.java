package Principal;

import Modelo.*;
import Controle.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Core {
	
	static Estante est = new Estante();
	static Hotel hot = new Hotel();
	static Ficheiro fic = new Ficheiro();
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int opcao = 0;
		do{
			menu();
			opcao = ler.nextInt();
		}while(escolha(opcao) != 0);
		System.out.println("Tenha um bom dia!");
		System.exit(0);
	}
	
	public static void menu() {
		System.out.println("\t\t\t\t Menu");
		System.out.println("1 - Livros");
		System.out.println("2 - Usu�rios");
		System.out.println("3 - Emprestimo");
		System.out.println("4 - Busca");
		System.out.println("5 - Sair");
	}
	
	public static int escolha(int opcao) throws Exception {
		switch(opcao) {
		case 1:
			menuLivro();
			opcao = ler.nextInt();
			ler.nextLine(); //Buffer
			escolhaLivro(opcao);
			return 1;
		case 2:
			menuUsuario();
			opcao = ler.nextInt();
			ler.nextLine(); //Buffer
			escolhaUsuario(opcao);
			return 1;
		case 3:
			menuEmprestimo();
			opcao = ler.nextInt();
			ler.nextLine(); //Buffer
			escolhaEmprestimo(opcao);
			return 1;
		case 4:
			return 1;
		case 5:
			return 0;
		default:
			System.out.println("Entrada de Valor Inv�lido!");
			System.out.println("Tente Novamente:");
			return 1;
		}
	}

	public static void menuLivro() {
		System.out.println("1 - Cadastra livro");
		System.out.println("2 - Atualiza informa��es de um livro");
		System.out.println("3 - Deleta um livro");
		System.out.println("4 - Lista todos os Livros");
		System.out.println("5 - Voltar a p�gina inicial");
	}

	private static int escolhaLivro(int opcao) {
		String titulo, autor, editora;
		int edicao, valorId = 0;
		switch(opcao) {
		case 1:
			System.out.println("Digite o t�tulo do livro: ");
			titulo = ler.nextLine();
			
			System.out.println("Digite o nome do autor do livro: ");
			autor = ler.nextLine();
			
			System.out.println("Digite o n�mero que representa a edi��o do livro: ");
			edicao = ler.nextInt();
			ler.nextLine(); //Buffer
			
			System.out.println("Digite o nome da editora: ");
			editora = ler.nextLine();
			
			Livro exemplar = new Livro(titulo,autor,editora,edicao, true);
			Estante.adicionaLivro(exemplar);
			return 1;
		case 2:
			System.out.println("Selecione por ID qual livro deseja editar: ");
			valorId = ler.nextInt();
			ler.nextLine(); // Buffer
			
			System.out.println("Digite o t�tulo do livro: ");
			titulo = ler.nextLine();
			
			System.out.println("Digite o nome do autor do livro: ");
			autor = ler.nextLine();
			
			System.out.println("Digite o n�mero que representa a edi��o do livro: ");
			edicao = ler.nextInt();
			ler.nextLine(); //Buffer
			
			System.out.println("Digite o nome da editora: ");
			editora = ler.nextLine();
			
			exemplar = new Livro(titulo,autor,editora,edicao, true);
			valorId--; // ID's come�am em 1 e as posi�oes na prateleira da estante come�am em 0 reduzindo em 1 para corre��o
			Estante.atualizaLivro(valorId, exemplar);
			return 1;
		case 3:
			System.out.println("Selecione por ID qual livro deseja editar: ");
			valorId = ler.nextInt();
			valorId--; // ID's come�am em 1 e as posi�oes na prateleira da estante come�am em 0 reduzindo em 1 para corre��o
			ler.nextLine(); // Buffer
			
			Estante.removeLivro(valorId);
			return 1;
		case 4:
			System.out.println(est.toString());
			return 1;
		case 5:
			System.out.println("Voltar a tela de in�cio");
			return 1;
		default:
			System.out.println("Entrada de Valor Inv�lido!");
			System.out.println("Tente Novamente:");
			return 1;
		}
	}
	
	public static void menuUsuario() {
		System.out.println("1 - Cadastra usu�rio");
		System.out.println("2 - Atualiza informa��es de um usu�rio");
		System.out.println("3 - Deleta um usu�rio");
		System.out.println("4 - Lista todos os usu�rios");
		System.out.println("5 - Voltar a p�gina inicial");
	}
	
	private static int escolhaUsuario(int opcao) throws Exception {
		String nome, cpf, telefone, stringDataDeNascimento;
		int valorId = 0;
		Date dataDeNascimento;
		DateFormat dataForma;
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do usu�rio: ");
			nome = ler.nextLine();
			
			System.out.println("Digite o cpf do usu�rio(apenas n�meros): ");
			cpf = ler.nextLine();
			
			System.out.println("Digite o telefone de contato do usuario (apenas n�meros): ");
			telefone = ler.nextLine();
			
			System.out.println("Digite a data de nascimento no formato - dd/mm/aaaa : ");
			stringDataDeNascimento = ler.nextLine();
			dataDeNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(stringDataDeNascimento);  
			
			Usuario individuo = new Usuario(nome, cpf, telefone, dataDeNascimento);
			Hotel.adicionaUsuario(individuo);
			return 1;
		case 2:
			System.out.println("Selecione por ID qual Usuario deseja atualizar: ");
			valorId = ler.nextInt();
			ler.nextLine(); // Buffer
			
			System.out.println("Digite o nome do usu�rio: ");
			nome = ler.nextLine();
			
			System.out.println("Digite o cpf do usu�rio(apenas n�meros): ");
			cpf = ler.nextLine();
			
			System.out.println("Digite o telefone de contato do usuario (apenas n�meros): ");
			telefone = ler.nextLine();
			
			System.out.println("Digite a data de nascimento no formato - dd/mm/aaaa : ");
			ler.useDelimiter("/");
			stringDataDeNascimento = ler.next();
			dataForma = new SimpleDateFormat("dd MM yyyy");
			dataDeNascimento = dataForma.parse(stringDataDeNascimento); 
			
			individuo = new Usuario(nome, cpf, telefone, dataDeNascimento);
			valorId--; // ID's come�am em 1 e as posi�oes na prateleira da estante come�am em 0 reduzindo em 1 para corre��o
			Hotel.atualizaUsuario(valorId, individuo);
			return 1;
		case 3:
			System.out.println("Selecione por ID qual livro deseja editar: ");
			valorId = ler.nextInt();
			valorId--; // ID's come�am em 1 e as posi�oes na prateleira da estante come�am em 0 reduzindo em 1 para corre��o
			ler.nextLine(); // Buffer
			
			Hotel.removeUsuario(valorId);
			return 1;
		case 4:
			System.out.println(hot.toString());
			return 1;
		case 5:
			System.out.println("Voltar a tela de in�cio");
			return 1;
		default:
			System.out.println("Entrada de Valor Inv�lido!");
			System.out.println("Tente Novamente:");
			return 1;
		}
	}
	
	public static void menuEmprestimo() {
		System.out.println("1 - Registra Empr�stimo");
		System.out.println("2 - Registra Devolu��o");
		System.out.println("3 - Reserva Empr�stimo");
		System.out.println("4 - Lista todos os empr�stimos");
		System.out.println("5 - Voltar a p�gina inicial");
	}
	
	private static int escolhaEmprestimo(int opcao) {
		String titulo, autor, editora;
		int edicao, valorIdUsuario = 0, valorIdLivro = 0, valorIdEmprestimo = 0;
		switch(opcao) {
		case 1:
			System.out.println("\t\tLista de Usu�rios Cadastrados");
			System.out.println(hot.toString());
			System.out.println("Digite o ID do usu�rio a quem o empr�stimo ser� feito: ");
			valorIdUsuario = ler.nextInt();
			ler.nextLine();//Buffer
			
			System.out.println("\t\tLista de Livros Cadastrados");
			System.out.println(est.toString());
			System.out.println("Digite o ID do livro que deseja ceder: ");
			valorIdLivro = ler.nextInt();
			ler.nextLine();//Buffer
			
			valorIdLivro--;				//Corrigindo a diferen�a dos valores representados e a posi��o onde est�o armazenados
			valorIdUsuario--;			//id representado: 1 id armazenado na posi��o: 0
			

			
			Dados emprestimo = new Dados(valorIdLivro, valorIdUsuario);
			//Ficheiro.registraEmprestimo(valorIdLivro, emprestimo, temp);
			return 1;
		case 2:
			System.out.println("\t\tLista de Emprestimos");
			System.out.println(fic.toString());
			System.out.println("Selecione por ID o empr�stimo: ");
			valorIdEmprestimo = ler.nextInt();
			valorIdEmprestimo--;
			ler.nextLine(); // Buffer

			Ficheiro.registraDevolucao(valorIdEmprestimo);
			return 1;
		case 3:
			
			return 1;
		case 4:
			System.out.println("\t\tLista de Emprestimos");
			System.out.println(fic.toString());
			return 1;
		case 5:
			System.out.println("Voltar a tela de in�cio");
			return 1;
		default:
			System.out.println("Entrada de Valor Inv�lido!");
			System.out.println("Tente Novamente:");
			return 1;
		}
	}

}
