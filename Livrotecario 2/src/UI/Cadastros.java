package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastros implements ActionListener{
	private JFrame janela;							/// Janela da interface
	private JPanel painel;							/// painel da inteface
	
	private JLabel titulo = new JLabel("Título: ");
	private JTextField caixaTitulo;
	private JLabel autor = new JLabel("Autor(a): ");
	private JTextField caixaAutor;
	private JLabel editora = new JLabel("Editora: ");
	private JTextField caixaEditora;
	private JLabel edicao = new JLabel("Edicao: ");
	private JTextField caixaEdicao;
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton cancelar = new JButton("Cancelar");
	
	public void CadastroLivro() {
		janela = new JFrame();
		painel = new JPanel();
		
		titulo.setFont(new Font("Cambria", Font.BOLD ,18));
		titulo.setBounds(10, 10, 100, 20);
		autor.setFont(new Font("Cambria", Font.BOLD ,18));
		autor.setBounds(10, 40, 100, 20);
		editora.setFont(new Font("Cambria", Font.BOLD ,18));
		edicao.setBounds(10, 70, 100, 20);
		edicao.setFont(new Font("Cambria", Font.BOLD ,18));
		editora.setBounds(10, 100, 100, 20);
		
		caixaTitulo = new JTextField(200);
		caixaTitulo.setBounds(150, 10, 200, 20);
		caixaAutor = new JTextField(200);
		caixaAutor.setBounds(150, 40, 200, 20);
		caixaEditora = new JTextField(200);
		caixaEditora.setBounds(150, 70, 200, 20);
		caixaEdicao = new JTextField(2);
		caixaEdicao.setBounds(150, 100, 200, 20);
		
		cadastrar.setBounds(250, 130, 100, 50);
		cadastrar.setFont(new Font("Cambria", Font.BOLD, 14));
		cadastrar.setBackground(Color.white);
		cadastrar.setForeground(Color.DARK_GRAY);
		cancelar.setBounds(10, 130, 100, 50);
		cancelar.setFont(new Font("Cambria", Font.BOLD, 14));
		cancelar.setBackground(Color.white);
		cancelar.setForeground(Color.DARK_GRAY);
        cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				janela.dispose();
			}
		});
		
		this.painel.setBorder(BorderFactory.createEmptyBorder(100, 275, 100, 100)); /// define o layout do painel
		this.painel.setLayout(new GridLayout(0, 1));
		this.painel.setBackground(Color.white);
		this.painel.setForeground(new java.awt.Color(255, 255, 255));
		
		this.janela.add(titulo);
		this.janela.add(autor);
		this.janela.add(editora);
		this.janela.add(edicao);
		this.janela.add(caixaTitulo);
		this.janela.add(caixaAutor);
		this.janela.add(caixaEditora);
		this.janela.add(caixaEdicao);
		this.janela.add(cadastrar);
		this.janela.add(cancelar);
		this.janela.add(painel, BorderLayout.CENTER);								/// define o layout da janela
		this.janela.setTitle("Cadastro Livro");
		this.janela.setResizable(false);
		this.janela.pack();
		this.janela.setLocationRelativeTo(null);
		this.janela.setVisible(true);
	}
	
	private JLabel nome = new JLabel("Nome: ");
	private JTextField caixaNome;
	private JLabel CPF = new JLabel("CPF: ");
	private JTextField caixaCPF;
	private JLabel telefone = new JLabel("Telefone: ");
	private JTextField caixaDDD;
	private JTextField caixaTelefone;
	
	public void CadastroUsuario() {
		janela = new JFrame();
		painel = new JPanel();
		
		nome.setBounds(10, 10, 100, 20);
		nome.setFont(new Font("Cambria", Font.BOLD ,18));
		CPF.setBounds(10, 40, 100, 20);
		CPF.setFont(new Font("Cambria", Font.BOLD ,18));
		telefone.setBounds(10, 70, 100, 20);
		telefone.setFont(new Font("Cambria", Font.BOLD ,18));
		
		caixaNome = new JTextField(200);
		caixaNome.setBounds(150, 10, 200, 20);
		caixaCPF = new JTextField(11);
		caixaCPF.setBounds(150, 40, 200, 20);
		caixaDDD = new JTextField(2);
		caixaDDD.setBounds(150, 70, 30, 20);
		caixaTelefone = new JTextField(9);
		caixaTelefone.setBounds(190, 70, 160, 20);
		
		cadastrar.setBounds(250, 130, 100, 50);
		cadastrar.setFont(new Font("Cambria", Font.BOLD, 14));
		cadastrar.setBackground(Color.white);
        cadastrar.setForeground(Color.DARK_GRAY);
		cancelar.setBounds(10, 130, 100, 50);
		cancelar.setFont(new Font("Cambria", Font.BOLD, 14));
		cancelar.setBackground(Color.white);
        cancelar.setForeground(Color.DARK_GRAY);
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				janela.dispose();
			}
		});
	
		this.painel.setBorder(BorderFactory.createEmptyBorder(100, 275, 100, 100)); /// define o layout do painel
		this.painel.setLayout(new GridLayout(0, 1));
		this.painel.setBackground(Color.white);
		this.painel.setForeground(new java.awt.Color(255, 255, 255));
		
		this.janela.add(nome);
		this.janela.add(CPF);
		this.janela.add(telefone);
		this.janela.add(caixaNome);
		this.janela.add(caixaCPF);
		this.janela.add(caixaDDD);
		this.janela.add(caixaTelefone);
		this.janela.add(cadastrar);
		this.janela.add(cancelar);
		this.janela.add(painel, BorderLayout.CENTER);								/// define o layout da janela
		this.janela.setTitle("Cadastro Usuário");
		this.janela.setResizable(false);
		this.janela.pack();
		this.janela.setLocationRelativeTo(null);
		this.janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
