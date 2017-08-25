package Sistema;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import Pesquisar.P_Paciente;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Consultar extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Consultar(JFrame principal) {

		JFrame frame = principal;

		JLabel lblConsultar = new JLabel("Consultar");
		
		P_Paciente psqp = new P_Paciente(frame);

		JScrollPane scrollPane = new JScrollPane();

		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (table.getSelectedRow() >= 0) {
					frame.getContentPane().removeAll();
					Remover remover = new Remover(frame, (int)table.getValueAt(table.getSelectedRow(), 0));
					frame.getContentPane().add(remover, BorderLayout.CENTER);
					frame.getContentPane().revalidate();
				} else {
					JOptionPane.showMessageDialog(frame, "Selecione uma pessoa!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (table.getSelectedRow() >= 0) {
					frame.getContentPane().removeAll();
					Atualizar atualizar = new Atualizar(frame,
					(int)table.getValueAt(table.getSelectedRow(), 0));
					frame.getContentPane().add(atualizar, BorderLayout.CENTER);
					frame.getContentPane().revalidate();
				} else {
					JOptionPane.showMessageDialog(frame, "Selecione uma pessoa!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnAtualizar)
							.addGap(123))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblConsultar)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnRemover)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)))
							.addGap(27))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblConsultar)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAtualizar)
						.addComponent(btnRemover))
					.addContainerGap(47, Short.MAX_VALUE))
		);

		table = new JTable();
		DefaultTableModel dtm = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"ID", "Nome", "Email"
				}
				);
		Paciente p = new Paciente();
		Paciente[] pessoas = p.consultar();
		if (pessoas != null) {
			for (int i=0; i<pessoas.length; i++) {
				dtm.addRow(new Object[] {
						pessoas[i].getID(),
						pessoas[i].getNome(),
						//pessoas[i].getEmail()
				});
			}
		}
		table.setModel(dtm);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}
}
