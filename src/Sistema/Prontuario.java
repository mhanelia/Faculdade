package Sistema;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Prontuario {


	private String dt_inicio;
	private String dt_termino;
	private String CRM;
	private String CPF;
	private String obs;
	private int Id_Quarto;
	
	public String getDt_inicio() {

		return dt_inicio;
	}
	public void setDt_inicio(String dt_inicio) {
		
			this.dt_inicio = dt_inicio;
	}
	public String getDt_termino() {
	
		return dt_termino;
	}
	public void setDt_termino(String dt_termino) {
		this.dt_termino = dt_termino;
	}
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	
	public int getId_Quarto() {
		return Id_Quarto;
	}
	public void setId_Quarto(int id_Quarto) {
		Id_Quarto = id_Quarto;
	}
	public void salvar() {
		Banco banco = new Banco();
		banco.sqlAtualizacao("INSERT INTO Prontuario (dt_inicio, dt_termino, CRM, CPF, obs, id_Quarto) VALUES ('" + this.getDt_inicio() + "', '" + this.getDt_termino() + "', '" + this.getCRM() + "', '" + this.getCPF() +"', '" + this.getObs() +"', '" + this.getId_Quarto() +"');");
	}
	public Prontuario[] Prontuario(String text) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Prontuario[] consultar(String nomeM) {
		int x = 0;
		ResultSet rs = null;
		Banco b = new Banco();
		rs = b.sqlConsulta("SELECT COUNT(*) AS total FROM Prontuario WHERE CPF like '" + nomeM + "%';");
		System.out.println("SELECT COUNT(*) AS total FROM Prontuario WHERE CPF like '" + nomeM + "%';");
		try {
			rs.next();
			x = Integer.parseInt(rs.getString("total"));
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if (x == 0) return null;
		Prontuario[] p = new Prontuario[x];
		rs = b.sqlConsulta("SELECT * FROM Prontuario WHERE CPF like '" + nomeM + "%';");
		System.out.println("SELECT * FROM Prontuario WHERE CPF like '" + nomeM + "%';");
		try {
			int count = 0;
			while (rs.next()) {
				Prontuario temp = new Prontuario();
				temp.setDt_inicio(rs.getString("Dt_inicio"));
				temp.setDt_termino(rs.getString("Dt_termino"));
				temp.setCRM(rs.getString("CRM"));
				temp.setCPF(rs.getString("CPF"));
				temp.setObs(rs.getString("obs"));
				temp.setObs(rs.getString("Id_Quarto"));
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
