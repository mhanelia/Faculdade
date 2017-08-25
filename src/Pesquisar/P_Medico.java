package Pesquisar;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;

import net.miginfocom.swing.MigLayout;

import java.awt.CardLayout;

import Sistema.Atualizar;
import Sistema.Medico;
import Sistema.Paciente;
import Sistema.Remover;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.GridLayout;

import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class P_Medico extends JPanel {
	private JTable table;
	private JTextField nomeM;

	/**
	 * Create the panel.
	 */
	public P_Medico(JFrame principal) {

		
		JFrame frame = principal;
		table = new JTable();
		DefaultTableModel dtm = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"CRM", "Nome", "Cod_Esp", "Salario"
				}
				);
		nomeM = new JTextField();
		nomeM.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				Medico p = new Medico();
				Medico[] pac = p.consultar(nomeM.getText());
				if (pac != null) {
					for (int i=0; i<pac.length; i++) {
						dtm.addRow(new Object[] {
								pac[i].getCRM(),
								pac[i].getNome(),
								pac[i].getCod_Esp(),
								pac[i].getSalario()
								
								
								
						});
					}
				}
			}
		});
		table.setModel(dtm);
		nomeM.setBounds(104, 34, 358, 20);
		add(nomeM);
		nomeM.setColumns(10);
		
		JLabel lblConsultar = new JLabel("Consultar");
		lblConsultar.setBounds(282, 441, 46, 14);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 81, 358, 154);

		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(380, 256, 82, 20);
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
		btnAtualizar.setBounds(283, 256, 87, 20);
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


		setLayout(null);
		scrollPane.setViewportView(table);
		add(scrollPane);
		add(btnAtualizar);
		add(btnRemover);
		add(lblConsultar);
		
		JLabel lblNomeDoMdico = new JLabel("Nome do m\u00E9dico:");
		lblNomeDoMdico.setBounds(10, 37, 122, 14);
		add(lblNomeDoMdico);
		
		

	}
	
	
	
}