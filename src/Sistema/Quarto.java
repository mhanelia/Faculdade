package Sistema;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Quarto {
	
	private int NumQuarto;
	private int Andar;




public int getNumQuarto() {
		return NumQuarto;
	}




	public void setNumQuarto(int numQuarto) {
		NumQuarto = numQuarto;
	}


	


public int getAndar() {
		return Andar;
	}




	public void setAndar(int andar) {
		Andar = andar;
	}




public Quarto[] consultar(String nomeM) {
	int x = 0;
	ResultSet rs = null;
	Banco b = new Banco();
	rs = b.sqlConsulta("SELECT COUNT(*) AS total FROM Quarto WHERE Id_Quarto = "+ nomeM +"");
	System.out.println("SELECT COUNT(*) AS total FROM Quarto WHERE Id_Quarto = "+ nomeM +"");
	try {
		rs.next();
		x = Integer.parseInt(rs.getString("total"));
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	if (x == 0) return null;
	Quarto [] q = new Quarto[x];
	rs = b.sqlConsulta("SELECT * FROM Quarto WHERE Id_Quarto = "+ nomeM +"");
	System.out.println("SELECT * FROM Quarto WHERE Id_Quarto = "+ nomeM +"");
	try {
		int count = 0;
		while (rs.next()) {
			Quarto temp = new Quarto();
			temp.setNumQuarto(rs.getInt("Id_Quarto"));
			temp.setAndar(rs.getInt("Andar"));
			q[count] = temp;
			count++;
		}
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return q;

} 
}