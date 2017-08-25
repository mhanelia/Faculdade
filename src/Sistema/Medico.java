package Sistema;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class Medico {
 

	private String Nome;
	
	private String Cod_Esp;
	
	private String CRM;
	
	private String  Salario;


	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getCod_Esp() {
		return Cod_Esp;
	}

	public void setCod_Esp(String cod_Esp) {
		Cod_Esp = cod_Esp;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	public String getSalario() {
		return Salario;
	}

	public void setSalario(String salario) {
		Salario = salario;
	} 
	
	
	public void salvar() {
		Banco banco = new Banco();
		banco.sqlAtualizacao("INSERT INTO Medico (CRM, Nome, Cod_Esp , Salario) VALUES ('" + this.getCRM() + "', '" + this.getNome() + "', '" + this.getCod_Esp() + "', '" + this.getSalario() +"');");
	}
	
	public void remover_m(){
		Banco banco = new Banco();
		banco.sqlAtualizacao("DELETE FROM Medico WHERE CRM = " + getCRM());
		
		
	}
	
	public Medico[] consultar(String nomeM) {
		int x = 0;
		ResultSet rs = null;
		Banco b = new Banco();
		rs = b.sqlConsulta("SELECT COUNT(*) AS total FROM Medico WHERE Nome like '" + nomeM + "%';");
		System.out.println("SELECT COUNT(*) AS total FROM Medico WHERE Nome like '" + nomeM + "%';");
		try {
			rs.next();
			x = Integer.parseInt(rs.getString("total"));
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if (x == 0) return null;
		Medico[] p = new Medico[x];
	
		rs = b.sqlConsulta("SELECT * FROM Medico WHERE Nome like '" + nomeM + "%';");
		
		System.out.println("SELECT * FROM Medico WHERE Nome like '" + nomeM + "%';");
		try {
			int count = 0;
			while (rs.next()) {
				Medico temp = new Medico();
				temp.setNome(rs.getString("Nome"));
				temp.setCod_Esp(rs.getString("Cod_Esp"));
				temp.setCRM(rs.getString("CRM"));
				temp.setSalario(rs.getString("Salario"));
				p[count] = temp;
				count++;
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return p;
	} 
	
	
	}

