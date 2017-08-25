package Sistema;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import Cadastrar.C_Medico;
import Cadastrar.C_Paciente;
import Cadastrar.C_Prontuario;
import Pesquisar.P_Medico;
import Pesquisar.P_Paciente;
import Pesquisar.P_Prontuario;
import Pesquisar.P_Quarto_Frame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;


public class Sistema {

	public JFrame frmClinica;
    Paciente p = new Paciente();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema window = new Sistema();
					window.frmClinica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClinica = new JFrame();
		frmClinica.setTitle("Sistema M\u00E9dico 1.0");
		frmClinica.setResizable(false);
		frmClinica.setBounds(100, 100, 641, 421);
		frmClinica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmClinica.setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenuItem mntmGerarAtendimento = new JMenuItem("Gerar atendimento");
		mntmGerarAtendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmClinica.getContentPane().removeAll();
				C_Prontuario cadpro = new C_Prontuario (frmClinica);
				frmClinica.getContentPane().add(cadpro, BorderLayout.CENTER);
				frmClinica.getContentPane().revalidate();
				
			}
		});
		
		JMenuItem mntmConsultarProntuario = new JMenuItem("Consultar Prontuario");
		mnInicio.add(mntmConsultarProntuario);
		mntmConsultarProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmClinica.getContentPane().removeAll();
				P_Prontuario p_prontuario = new P_Prontuario(frmClinica);
				frmClinica.getContentPane().add(p_prontuario, BorderLayout.CENTER);
				frmClinica.getContentPane().revalidate();
				
			}
		});
		mnInicio.add(mntmGerarAtendimento);
		
		JSeparator separator = new JSeparator();
		mnInicio.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmClinica.dispose();
				
			}
		});
		mnInicio.add(mntmSair);
		
		JMenu mnMedico = new JMenu("M\u00E9dico");
		menuBar.add(mnMedico);
		
		JMenuItem mntmConsultarMdico = new JMenuItem("Consultar m\u00E9dico");
		mntmConsultarMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmClinica.getContentPane().removeAll();
				P_Medico p_medico = new P_Medico(frmClinica);
				frmClinica.getContentPane().add(p_medico, BorderLayout.CENTER);
				frmClinica.getContentPane().revalidate();
				
			}
		});
		
		JMenuItem mntmCadastrarMdico = new JMenuItem("Cadastrar m\u00E9dico");
		mnMedico.add(mntmCadastrarMdico);
		mntmCadastrarMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmClinica.getContentPane().removeAll();
				C_Medico cadmed = new C_Medico(frmClinica);
				frmClinica.getContentPane().add(cadmed, BorderLayout.CENTER);
				frmClinica.getContentPane().revalidate();
				
			}
		});
		mnMedico.add(mntmConsultarMdico);
		
		JMenu mnPacientes = new JMenu("Pacientes");
		menuBar.add(mnPacientes);
		
		JMenuItem mntmCadastrarPaciente = new JMenuItem("Cadastrar paciente");
		mnPacientes.add(mntmCadastrarPaciente);
		mntmCadastrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmClinica.getContentPane().removeAll();
				C_Paciente cadpac = new C_Paciente (frmClinica);
				frmClinica.getContentPane().add(cadpac, BorderLayout.CENTER);
				frmClinica.getContentPane().revalidate();
			
			}
		});
		
		JMenuItem mntmConsultarPaciente = new JMenuItem("Consultar paciente");
		mnPacientes.add(mntmConsultarPaciente);
		
		JMenu mnNewMenu = new JMenu("Quartos");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Verificar quartos");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				P_Quarto_Frame frame = new P_Quarto_Frame();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		mntmConsultarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmClinica.getContentPane().removeAll();
				P_Paciente p_pessoa = new P_Paciente(frmClinica);
				frmClinica.getContentPane().add(p_pessoa, BorderLayout.CENTER);
				frmClinica.getContentPane().revalidate();
				
			}
		});
		frmClinica.getContentPane().setLayout(new BorderLayout(0, 0));
	}

}
