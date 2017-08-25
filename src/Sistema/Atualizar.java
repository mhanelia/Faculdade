package Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Atualizar extends JPanel {
	private JTextField textFieldNome;
	private JTextField textFieldEmail;

	/**
	 * Create the panel.
	 */
	public Atualizar(JFrame principal, int id) {
		
		JFrame frame = principal;
		
		Paciente p = new  Paciente(id);
		
		JLabel lblAtualizar = new JLabel("Atualizar - ID: " +p.getID() );
		
		JLabel lblNome = new JLabel("Nome:");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setText(p.getNome());
		
		JLabel lblEmail = new JLabel("Email:");
		
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
	 
	  
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Paciente pessoa = new Paciente();
				pessoa.setNome(textFieldNome.getText());
				pessoa.salvar();
				JOptionPane.showMessageDialog(frame, "Pessoa adicionada com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				frame.getContentPane().removeAll();
				JPanel panel = new JPanel();
				frame.getContentPane().add(panel, BorderLayout.CENTER);
				frame.getContentPane().revalidate();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAtualizar)
						.addComponent(lblAtualizar, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(16)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEmail)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldEmail, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNome)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)))))
					.addContainerGap(89, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAtualizar)
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(btnAtualizar)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
