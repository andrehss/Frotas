package Controle;
import Modelo.MotoristaModelo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.Conexao;
import java.sql.Date;
import javax.swing.JOptionPane;

public class MotoristaControle extends UnicastRemoteObject implements IMotoristaControle {
	
	public MotoristaControle()throws RemoteException{}
    
    @Override
    public String inserirMotorista(MotoristaModelo m) throws RemoteException {
        
        String sentenca = "INSERT INTO motorista (codMotorista,nomeMotorista,categoriaCNH,numeroCNH,vencimentoCNH) VALUE (?,?,?,?,?)";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        stmt.setInt(1, m.getCodMotorista());
                        stmt.setString(2,m.getNomeMotorista());
                        stmt.setString(3, m.getCategoriaCNH());
                        stmt.setInt(4, m.getNumeroCNH());
                        stmt.setDate(5, m.getVencimentoCNH());
                       
                        
                       stmt.execute();
                       JOptionPane.showMessageDialog(null,"Motorista SALVO com Sucesso");
		} catch (SQLException e) {
                       JOptionPane.showMessageDialog(null,"ERRO ao SALVAR Motorista" + e);
		}
       return "Sucesso";
    }
        @Override
    public void excluir(MotoristaModelo motorista){
    	String sentenca = "DELETE FROM motorista WHERE codMotorista = ?";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                       
                        stmt.setInt(1, motorista.getCodMotorista()); // dúvida se é assim que faz o método
                        stmt.execute();
                        JOptionPane.showMessageDialog(null,"Motorista EXCLUIDO com Sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ERRO ao EXCLUIR Motorista" + e);;
		}
    }
        @Override
     public void editar(MotoristaModelo motorista){
    	String sentenca = "UPDATE motorista set nomeMotorista = ?, categoriaCNH = ?, numeroCNH = ? , vencimentoCNH = ? WHERE codMotorista= ?";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setInt(5, motorista.getCodMotorista());
                        stmt.setString(1, motorista.getNomeMotorista());
                        stmt.setString(2,motorista.getCategoriaCNH());
                        stmt.setInt(3, motorista.getNumeroCNH());
                        stmt.setDate(4, motorista.getVencimentoCNH());
                        
                        stmt.execute();
                        
                        JOptionPane.showMessageDialog(null,"Motorista ALTERADO com Sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ERRO ao ALTERAR Motorista");
		}
    }
    
  @Override
    public MotoristaModelo selecionarMotorista(MotoristaModelo motorista) throws RemoteException {
       String sentenca = "Select * from motorista WHERE codMotorista=?";
       MotoristaModelo retorno = new MotoristaModelo();
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setInt(1, motorista.getCodMotorista()); // realmente precisa desse set?
                      
                        ResultSet rs = stmt.executeQuery();
                        while(rs.next()){
                            retorno.setNomeMotorista(rs.getString("nomeMotorista"));
                            retorno.setCategoriaCNH(rs.getString("categoriaCNH"));
                            retorno.setNumeroCNH(rs.getInt("numeroCNH"));
                            retorno.setVencimentoCNH(rs.getDate("vencimentoCNH"));
                            
                        }
                        
                        
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return retorno;
    }
    
    
    
    
    
}
