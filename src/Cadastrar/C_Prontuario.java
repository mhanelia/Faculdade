package Cadastrar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import Pesquisar.P_Medico;
import Pesquisar.P_Medico_Frame;
import Pesquisar.P_Paciente;
import Pesquisar.P_Paciente_Frame;
import Sistema.Prontuario;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;


public class C_Prontuario extends JPanel {
	private JTextField dt_termino;
	private JTextField dt_inicio;
	private JTextField CRM;
	private JTextField CPF;

	/**
	 * Create the panel.
	 * @param frmClinica 
	 */
	public C_Prontuario(JFrame frmClinica) {
		setLayout(null);
		Prontuario pront = new Prontuario();
		JLabel lblNewLabel = new JLabel("Data de Inicio:");
		lblNewLabel.setBounds(22, 60, 88, 14);
		add(lblNewLabel);
		
		dt_termino = new JTextField();
		dt_termino.setBounds(120, 96, 190, 20);
		add(dt_termino);
		dt_termino.setColumns(10);
		
		dt_inicio = new JTextField();
		dt_inicio.setColumns(10);
		dt_inicio.setBounds(120, 57, 190, 20);
		add(dt_inicio);
		
		JLabel lblDataDeTermino = new JLabel("Data de Termino:");
		lblDataDeTermino.setBounds(22, 99, 100, 14);
		add(lblDataDeTermino);
		
		JLabel lblCpfDoPaciente = new JLabel("CPF do paciente:");
		lblCpfDoPaciente.setBounds(22, 155, 100, 14);
		add(lblCpfDoPaciente);
		
		JLabel lblCrmDoMdico = new JLabel("CRM do m\u00E9dico:");
		lblCrmDoMdico.setBounds(22, 127, 100, 14);
		add(lblCrmDoMdico);
		
		CRM = new JTextField();
		CRM.setColumns(10);
		CRM.setBounds(120, 124, 190, 20);
		add(CRM);
		
		CPF = new JTextField();
		CPF.setColumns(10);
		CPF.setBounds(120, 152, 190, 20);
		add(CPF);
		
		JTextArea obs = new JTextArea();
		obs.setBounds(120, 183, 190, 80);
		add(obs);
		
		JLabel lblObsSobreO = new JLabel("Obs. sobre o");
		lblObsSobreO.setBounds(22, 188, 82, 14);
		add(lblObsSobreO);
		
		JLabel lblPaciente = new JLabel("paciente:");
		lblPaciente.setBounds(22, 202, 75, 14);
		add(lblPaciente);
		
		JButton btnGerarProntuario = new JButton("Gerar prontuario");
		btnGerarProntuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
				pront.setDt_termino(dt_termino.getText());
				pront.setDt_inicio(dt_inicio.getText());
				pront.setCRM(CRM.getText());
				pront.setCPF(CPF.getText());
				pront.setObs(obs.getText());
				
				pront.salvar();
				
				String[] data = dt_inicio.getText().split("/");  
				  
				
				String ano = data[2];  
				String mes = data[1];  
				String dia = data[0];  
				
				String teste = "" + ano + "-" + mes + "-" + dia;				
				pront.setDt_inicio(teste);
				
				String[] data2 = dt_termino.getText().split("/");  
				  
				
				String ano2 = data[2];  
				String mes2 = data[1];  
				String dia2 = data[0];  
				
				String teste2 = "" + ano + "-" + mes + "-" + dia;				
				pront.setDt_termino(teste2);
				
				JOptionPane.showMessageDialog(null, "Prontuário Cadastrado!");
			}
		});
		btnGerarProntuario.setBounds(319, 266, 131, 23);
		add(btnGerarProntuario);
		
		JButton btnpMedico = new JButton("Pesquisar");
		btnpMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				P_Medico_Frame frame = new P_Medico_Frame();
				frame.setVisible(true);
				
			}
		});
		btnpMedico.setBounds(321, 123, 106, 23);
		add(btnpMedico);
		
		JButton btnpPaciente = new JButton("Pesquisar");
		btnpPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				P_Paciente_Frame frame = new P_Paciente_Frame();
				frame.setVisible(true);
			}
		});
		btnpPaciente.setBounds(320, 151, 107, 23);
		add(btnpPaciente);
		
		JLabel lblProntuario = new JLabel("Prontuario");
		lblProntuario.setBounds(22, 11, 100, 14);
		add(lblProntuario);

	}
}
