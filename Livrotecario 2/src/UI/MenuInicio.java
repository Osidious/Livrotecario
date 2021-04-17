package UI;
	
import java.awt.*;																	/// bibliotecas utilizadas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MenuInicio implements MouseListener, ActionListener{
 
	private JFrame janela;															/// Janela da interface
	private JPanel painel;															/// painel da inteface
	private JMenuBar barra;															/// barra de menu
	private JLabel images;															/// imagem da tela de inicio
	
	private JMenu menuCadastro;														/// Opções do menu
	private JMenu menuEditar;
	private JMenu menuExibir;		
	private JMenu menuExcluir;
	private JMenu menuEmprestar;
	private JMenu menuDevolver;
	private JMenu menuReserva;
	private JMenu menuSair;
	private JMenuItem menuLivrosEditar = new JMenuItem("Livros");
	private JMenuItem menuLivrosExibir = new JMenuItem("Livros");
	private JMenuItem menuLivrosExcluir = new JMenuItem("Livros");
	private JMenuItem menuUsuariosCadastro = new JMenuItem("Usuários");
	private JMenuItem menuUsuariosEditar = new JMenuItem("Usuários");
	private JMenuItem menuUsuariosExibir = new JMenuItem("Usuários");
	private JMenuItem menuUsuariosExcluir = new JMenuItem("Usuários");
	
	private JMenuItem menuLivrosCadastro = new JMenuItem("Livros");
	
	public MenuInicio() {															/// método que gera a interface
		janela = new JFrame();
		painel = new JPanel();
		barra = new JMenuBar();
		images = new JLabel();
		UIManager.put("MenuItem.background", Color.white);
		UIManager.put("MenuBar.background", Color.white);
		
		painel.setBorder(BorderFactory.createEmptyBorder(175, 150, 175, 150));	 	/// define a aparência do painel
		painel.setLayout(new GridLayout(0, 1));
		painel.setBackground(Color.white);
		painel.setForeground(new java.awt.Color(255, 255, 255));
		images.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.jpg")));
		painel.add(images);
		
		menuCadastro = new JMenu("Cadastrar");
		menuEditar = new JMenu("Editar");
		menuExibir = new JMenu("Exibir");
		menuExcluir = new JMenu("Excluir");
		menuEmprestar = new JMenu("Emprestar");
		menuDevolver = new JMenu("Devolver");
		menuReserva = new JMenu("Reserva");
		menuSair = new JMenu("Sair");
		menuSair.addMouseListener(this);
		
		menuLivrosCadastro = new JMenuItem("Livros");
		menuLivrosCadastro.addActionListener(this);
		menuLivrosCadastro.setBackground(Color.white);
		menuLivrosEditar = new JMenuItem("Livros");
		menuLivrosEditar.addActionListener(this);
		menuLivrosExibir = new JMenuItem("Livros");
		menuLivrosExibir.addActionListener(this);
		menuLivrosExcluir = new JMenuItem("Livros");
		menuLivrosExcluir.addActionListener(this);
		menuUsuariosCadastro = new JMenuItem("Usuários");
		menuUsuariosCadastro.addActionListener(this);
		menuUsuariosEditar = new JMenuItem("Usuários");
		menuUsuariosEditar.addActionListener(this);
		menuUsuariosExibir = new JMenuItem("Usuários");
		menuUsuariosExibir.addActionListener(this);
		menuUsuariosExcluir = new JMenuItem("Usuários");
		menuUsuariosExcluir.addActionListener(this);
		
		menuCadastro.add(menuLivrosCadastro);										/// adciona as sub-opções as opções do menu
		menuCadastro.addSeparator();
		menuCadastro.add(menuUsuariosCadastro);
		menuEditar.add(menuLivrosEditar);
		menuEditar.addSeparator();
		menuEditar.add(menuUsuariosEditar);
		menuExibir.add(menuLivrosExibir);
		menuExibir.addSeparator();
		menuExibir.add(menuUsuariosExibir);
		menuExcluir.add(menuLivrosExcluir);
		menuExcluir.addSeparator();
		menuExcluir.add(menuUsuariosExcluir);
		
		barra.add(menuCadastro);													/// adciona as opções do menu a barra de menu
		barra.add(menuEditar);
		barra.add(menuExibir);
		barra.add(menuExcluir);
		barra.add(menuEmprestar);
		barra.add(menuDevolver);
		barra.add(menuReserva);
		barra.add(menuSair);
		
		janela.setJMenuBar(barra);													/// adiciona a barra de menu
		janela.add(painel, BorderLayout.CENTER);									/// define o layout da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Livrotecário");
		janela.setResizable(false);
		janela.pack();
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public void actionPerformed (ActionEvent e) {
		Cadastros c = new Cadastros();
		if(e.getSource() == menuLivrosCadastro) {
			c.CadastroLivro();
		}
		else if(e.getSource() == menuLivrosEditar) {
		
		}
		else if(e.getSource() == menuLivrosExibir) {
			
		}
		else if(e.getSource() == menuLivrosExcluir) {
			
		}
		else if(e.getSource() == menuUsuariosCadastro) {
			c.CadastroUsuario();
		}
		else if(e.getSource() == menuUsuariosEditar) {
			
		}
		else if(e.getSource() == menuUsuariosExibir) {

		}
		else if(e.getSource() == menuUsuariosExcluir) {

		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == menuSair) {
			System.exit(0);
		}
		else if(e.getSource() == menuEmprestar) {
			
		}
		else if(e.getSource() == menuDevolver) {
			
		}
		else if(e.getSource() == menuReserva) {
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {										/// método main
//		Cadastros c = new Cadastros();
//		c.CadastroLivro();
		new MenuInicio();															/// método que chama a interface
	}
}
