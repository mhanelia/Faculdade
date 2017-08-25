package Cadastrar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

import Sistema.Paciente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class C_Paciente extends JPanel {
	protected static final JFrame frame = null;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfRG;
	private JTextField tfTel;
	private JTextField tfEnd;
	private JTextField tfNasc;
	private JTextField tfNumQuarto;

	/**
	 * Create the panel.
	 * @param frmClinica 
	 */
	public C_Paciente(JFrame frmClinica) {
		setLayout(null);
		Paciente p = new Paciente();
		
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(26, 60, 64, 14);
		add(lblNome);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(26, 117, 64, 14);
		add(lblRg);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(26, 92, 64, 14);
		add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(26, 142, 64, 14);
		add(lblTelefone);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(26, 167, 64, 14);
		add(lblEndereo);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setBounds(26, 192, 118, 14);
		add(lblDataDeNascimento);
		
		JLabel lblNumeroDoQuarto = new JLabel("Numero do quarto:");
		lblNumeroDoQuarto.setBounds(26, 217, 118, 14);
		add(lblNumeroDoQuarto);
		
		tfNome = new JTextField();
		tfNome.setToolTipText("Nome completo");
		tfNome.setBounds(164, 57, 299, 20);
		add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setToolTipText("Apenas n\u00FAmeros. Sem pontua\u00E7\u00E3o");
		tfCPF.setColumns(10);
		tfCPF.setBounds(164, 89, 299, 20);
		add(tfCPF);
		
		tfRG = new JTextField();
		tfRG.setToolTipText("Apenas n\u00FAmeros. Sem pontua\u00E7\u00E3o");
		tfRG.setColumns(10);
		tfRG.setBounds(164, 114, 299, 20);
		add(tfRG);
		
		tfTel = new JTextField();
		tfTel.setToolTipText("Apenas n\u00FAmeros. Sem pontua\u00E7\u00E3o");
		tfTel.setColumns(10);
		tfTel.setBounds(164, 139, 297, 20);
		add(tfTel);
		
		tfEnd = new JTextField();
		tfEnd.setToolTipText("Endere\u00E7o da resid\u00EAncia ");
		tfEnd.setColumns(10);
		tfEnd.setBounds(164, 164, 297, 20);
		add(tfEnd);
		
		tfNasc = new JTextField();
		tfNasc.setToolTipText("Separado por \"/\"");
		tfNasc.setColumns(10);
		tfNasc.setBounds(164, 189, 299, 20);
		add(tfNasc);
		
		tfNumQuarto = new JTextField();
		tfNumQuarto.setToolTipText("Quarto desesjado");
		tfNumQuarto.setColumns(10);
		tfNumQuarto.setBounds(166, 214, 297, 20);
		add(tfNumQuarto);
		
		JButton btnCadastrarPaciente = new JButton("Cadastrar paciente");
		btnCadastrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			p.setNome(tfNome.getText());
			p.setCPF(tfCPF.getText());
			p.setRG(tfRG.getText());
			p.setTel(tfTel.getText());
			p.setNumero_Quarto(Integer.parseInt(tfNumQuarto.getText()));
			p.setDt_Nasc(tfNasc.getText());
			

			String[] data = tfNasc.getText().split("/");  
			  
			
			String ano = data[2];  
			String mes = data[1];  
			String dia = data[0];  
			
			String teste = "" + ano + "-" + mes + "-" + dia;
			
			System.out.println(teste);
			
			p.setDt_Nasc(teste);
			
			
			
			
			p.setEndereco(tfEnd.getText());
			
			
			
			
			
			
			
			
			p.salvar();
			JOptionPane.showMessageDialog(null, "Paciente Cadastrado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
			JPanel panel = new JPanel();

			
			
			
				
				
			}
		});
		btnCadastrarPaciente.setBounds(314, 256, 152, 23);
		add(btnCadastrarPaciente);
		
		JLabel lblCadastroDePacientes = new JLabel("Cadastro de Pacientes:");
		lblCadastroDePacientes.setBounds(26, 11, 138, 14);
		add(lblCadastroDePacientes);

	}
}
