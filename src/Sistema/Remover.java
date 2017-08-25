package Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Remover extends JPanel {

	public Remover(JFrame principal, int id) {
		
		JFrame frame = principal;
		
		Paciente p = new Paciente(id);
		
		JLabel lblDesejaRemoverEsta = new JLabel("Deseja remover esta pessoa?");
		
		JLabel lblId = new JLabel("ID: " + p.getID());
		
		JLabel lblNome = new JLabel("Nome: " + p.getNome());
		
		JLabel lblNewLabel = new JLabel("Email: ");
		
		JButton btnSim = new JButton("Sim");
		btnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.remover();
				JOptionPane.showMessageDialog(frame, "Pessoa removida com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				frame.getContentPane().removeAll();
				JPanel panel = new JPanel();
				frame.getContentPane().add(panel, BorderLayout.CENTER);
				frame.getContentPane().revalidate();
			}
		});
		
		JButton btnNo = new JButton("N\u00E3o");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
					.addContainerGap(187, Short.MAX_VALUE)
					.addComponent(btnSim)
					.addGap(18)
					.addComponent(btnNo)
					.addGap(27))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDesejaRemoverEsta)
						.addComponent(lblId)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblNewLabel)
							.addComponent(lblNome)))
					.addContainerGap(151, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(lblDesejaRemoverEsta)
					.addGap(18)
					.addComponent(lblId)
					.addGap(18)
					.addComponent(lblNome)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNo)
						.addComponent(btnSim))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
