package Sistema;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JTextField;



public class Paciente {
	private int ID;
	private String Nome;
	private String CPF;
	private String RG;
	private String Tel;
	private String Endereco;
	private String Dt_Nasc;
	private int Numero_Quarto;


	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	
	public String getDt_Nasc() {

		return Dt_Nasc;
	}
	public void setDt_Nasc(String Dt_Nasc) {
		this.Dt_Nasc = Dt_Nasc;
	}
	
	
	public int getNumero_Quarto() {
		return Numero_Quarto;
	}
	
	
	public void setNumero_Quarto(int numero_Quarto) {
		Numero_Quarto = numero_Quarto;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Paciente(){
		
	}
	
	
	
	
	public int setNumero_Quarto;  
	  
	
	public Paciente (int id) {
		
		
		setNome("");
		setCPF("");
		setRG("");
		setTel("");
		setEndereco("");
		setDt_Nasc("");
		setNumero_Quarto();
		ResultSet rs = null;
		Banco b = new Banco();
		rs = b.sqlConsulta("SELECT * FROM Paciente WHERE id = " + getID() + ";");
		try {
			rs.next();
			setNome(rs.getString("Nome"));
			setCPF(rs.getString("CPF"));
			setRG(rs.getString("RG"));
			setTel(rs.getString("Tel"));
			setEndereco(rs.getString("Endereco"));
			setDt_Nasc(rs.getString("Dt_Nasc"));
			setNumero_Quarto();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void remover() {
	Banco b = new Banco();
	if (getID() > 0) {
    b.sqlAtualizacao("DELETE FROM Paciente WHERE id = " + getID() + ";");
	}
	}
	
	
	
	public void salvar() {
		Banco banco = new Banco();
		banco.sqlAtualizacao("INSERT INTO Paciente (CPF, RG, Dt_Nasc, Numero_Quarto, Nome, Endereco, Telefone) VALUES ('" + this.getCPF() + "', '" + this.getRG() + "', '" + this.getDt_Nasc() + "', '" + this.getNumero_Quarto() +"', '" + this.getNome() +"', '" + this.getEndereco() + "','" + this.getTel() +"');");
	}
	
				
		public Paciente[] consultar(String nomeM) {
		int x = 0;
		ResultSet rs = null;
		Banco b = new Banco();
		rs = b.sqlConsulta("SELECT COUNT(*) AS total FROM Paciente WHERE Nome like '" + nomeM + "%';");
		System.out.println("SELECT COUNT(*) AS total FROM Paciente WHERE Nome like '" + nomeM + "%';");
		System.out.println("INSERT INTO Paciente (CPF, RG, Dt_Nasc, Numero_Quarto, Nome, Endereco, Telefone) VALUES ('" + this.getCPF() + "', '" + this.getRG() + "', '" + this.getDt_Nasc() + "', '" + this.getNumero_Quarto() +"', '" + this.getNome() +"', '" + this.getEndereco() + "','" + this.getNome() +"');");
		try {
			rs.next();
			x = Integer.parseInt(rs.getString("total"));
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if (x == 0) return null;
		Paciente[] p = new Paciente[x];
		rs = b.sqlConsulta("SELECT * FROM Paciente WHERE Nome like '" + nomeM + "%';");
		System.out.println("SELECT * FROM Paciente WHERE Nome like '" + nomeM + "%';");
		try {
			int count = 0;
			while (rs.next()) {
				Paciente temp = new Paciente();
				temp.setNome(rs.getString("Nome"));
				temp.setRG(rs.getString("RG"));
				temp.setCPF(rs.getString("CPF"));
				temp.setEndereco(rs.getString("Endereco"));
				temp.setTel(rs.getString("Telefone"));
				temp.setDt_Nasc(rs.getString("Dt_Nasc"));
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
		public void setNumero_Quarto() {
			// TODO Auto-generated method stub
			
		}
		public Paciente[] consultar() {
			// TODO Auto-generated method stub
			return null;
		} 
}
	
	
	
	




