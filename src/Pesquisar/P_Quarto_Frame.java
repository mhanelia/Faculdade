package Pesquisar;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;

import Sistema.Medico;
import Sistema.Quarto;

public class P_Quarto_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField nomeM;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_Quarto_Frame frame = new P_Quarto_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P_Quarto_Frame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Quarto", "Andar"
			}
		));
		DefaultTableModel dtm = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Nº Quarto", "Andar"
				}
				);
		
		nomeM = new JTextField();
		nomeM.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				Quarto p = new Quarto();
				Quarto[] pac = p.consultar(nomeM.getText());
				if (pac != null) {
					for (int i=0; i<pac.length; i++) {
						dtm.addRow(new Object[] {
								pac[i].getNumQuarto(),
								pac[i].getAndar()
								
							
								
								
								
						});
					}
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		table.setModel(dtm);
		JLabel lblNmeroDoQuarto = new JLabel("N\u00FAmero do Quarto");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNmeroDoQuarto, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(nomeM, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
					.addGap(49))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmeroDoQuarto)
						.addComponent(nomeM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		

		
		
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
