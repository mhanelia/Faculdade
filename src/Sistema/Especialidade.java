package Sistema;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Especialidade {

	public String Cod_Esp;
	public String Desc_Esp;
	
	
	

	public String getCod_Esp() {
		return Cod_Esp;
	}




	public void setCod_Esp(String cod_Esp) {
		Cod_Esp = cod_Esp;
	}




	public String getDesc_Esp() {
		return Desc_Esp;
	}




	public void setDesc_Esp(String desc_Esp) {
		Desc_Esp = desc_Esp;
	}




	public Especialidade[] consultar(String nomeM) {
		int x = 0;
		ResultSet rs = null;
		Banco b = new Banco();
		rs = b.sqlConsulta("SELECT COUNT(*) AS total FROM Especialidade WHERE Desc_Esp like '" + nomeM + "%';");
		System.out.println("SELECT COUNT(*) AS total FROM Especialidade WHERE Desc_Esp like '" + nomeM + "%';");
		try {
			rs.next();
			x = Integer.parseInt(rs.getString("total"));
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if (x == 0) return null;
		Especialidade[] p = new Especialidade[x];
	
		rs = b.sqlConsulta("SELECT * FROM Especialidade WHERE Desc_Esp like '" + nomeM + "%';");
		
		System.out.println("SELECT * FROM Especialidade WHERE Desc_Esp like '" + nomeM + "%';");
		try {
			int count = 0;
			while (rs.next()) {
				Especialidade temp = new Especialidade();
				temp.setCod_Esp(rs.getString("Cod_Esp"));
				temp.setDesc_Esp(rs.getString("Desc_Esp"));
	
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
