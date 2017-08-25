package Cadastrar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import Pesquisar.P_Esp_Frame;
import Sistema.Medico;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class C_Medico extends JPanel {
	private JTextField Nome ;
	private JTextField Espec ;
	private JTextField CRM;
	private JTextField Salario;


	/**
	 * Create the panel.
	 * @param frmClinica 
	 */
	public C_Medico(JFrame frmClinica) {
		
		Medico m = new Medico();
		
		JLabel lblNome = new JLabel("Nome:");
		
		Nome = new JTextField(5);
		Nome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Especialidade:");
		
		JLabel lblCrm = new JLabel("CRM:");
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		
		Espec = new JTextField();
		Espec.setColumns(10);
		
		CRM = new JTextField();
		CRM.setColumns(10);
		
		Salario = new JTextField();
		Salario.setColumns(10);
		
		JButton btnCadastrarMdico = new JButton("Cadastrar m\u00E9dico");
		btnCadastrarMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				m.setCRM(CRM.getText());
				m.setCod_Esp(Espec.getText());
				m.setNome(Nome.getText());
				m.setSalario(Salario.getText());
				
				m.salvar();
				JOptionPane.showMessageDialog(null, "Médico Cadastrado!");
				
			}
		});
		
		JLabel lblCadastroDeMedicos = new JLabel("Cadastro de Medicos");
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				P_Esp_Frame frame = new P_Esp_Frame();
				frame.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCadastroDeMedicos, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSalrio, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCrm, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(Nome, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
										.addComponent(Espec, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
										.addComponent(CRM, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
										.addComponent(Salario, 241, 242, Short.MAX_VALUE)
										.addComponent(btnCadastrarMdico, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(35))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblCadastroDeMedicos, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNome)
						.addComponent(Nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(Espec, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCrm)
						.addComponent(CRM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSalrio)
						.addComponent(Salario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnCadastrarMdico)
					.addGap(21))
		);
		setLayout(groupLayout);

	}
}
