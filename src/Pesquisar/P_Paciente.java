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

import Cadastrar.C_Prontuario;
import Sistema.Atualizar;
import Sistema.Paciente;
import Sistema.Remover;
import Sistema.Sistema;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.GridLayout;

import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class P_Paciente extends JPanel {
	private JTable table;
	private JTextField nomeM;

	/**
	 * Create the panel.
	 */
	public P_Paciente(JFrame principal) {

		
		JFrame frame = principal;
		table = new JTable();
		DefaultTableModel dtm = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"CPF", "Nome"
				}
				);
		nomeM = new JTextField();
		nomeM.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				if (nomeM.getText() != "")
				{
				Paciente p = new Paciente();
				Paciente[] pac = p.consultar(nomeM.getText());
				if (pac != null) {
					for (int i=0; i<pac.length; i++) {
						dtm.addRow(new Object[] {
								pac[i].getCPF(),
								pac[i].getNome()
								
								
						});
					}
				}
			}
			}
		});
		table.setModel(dtm);
		nomeM.setBounds(30, 42, 364, 20);
		add(nomeM);
		nomeM.setColumns(10);
		
		JLabel lblConsultar = new JLabel("Consultar");
		lblConsultar.setBounds(282, 441, 46, 14);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 73, 364, 154);

		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(301, 238, 93, 20);
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
		btnAtualizar.setBounds(191, 238, 104, 20);
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
		
		JLabel lblNomeDoMdico = new JLabel("Nome do Paciente");
		lblNomeDoMdico.setBounds(30, 11, 122, 14);
		add(lblNomeDoMdico);
		Sistema S = new Sistema();
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				S.frmClinica.getContentPane().removeAll();
				C_Prontuario cadpro = new C_Prontuario (S.frmClinica);
				S.frmClinica.getContentPane().add(cadpro, BorderLayout.CENTER);
				S.frmClinica.getContentPane().revalidate();
			}
		});
		btnVoltar.setBounds(92, 238, 89, 23);
		add(btnVoltar);
		
		

	}
}