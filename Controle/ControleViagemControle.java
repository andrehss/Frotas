package Controle;
import Modelo.ControleViagemModelo;
import Modelo.MotoristaModelo;
import Modelo.VeiculoModelo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.Conexao;

public class ControleViagemControle extends UnicastRemoteObject implements IControleViagemControle{

        public ControleViagemControle()throws RemoteException{}
    
    @Override
    public String inserirControle(ControleViagemModelo controleViagem) throws RemoteException {

    
    	String sentenca = "INSERT INTO controle (codControle, codMotorista, placaVeiculo, kmSaida, kmEntrada, dataSaida, dataEntrada) VALUE (?,?,?,?)";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        stmt.setInt(1, controleViagem.getCodControle());
                        stmt.setInt(2, controleViagem.getMotorista().getCodMotorista());
                        stmt.setString(3, controleViagem.getVeiculo().getPlacaVeiculo());
                        stmt.setInt(4, controleViagem.getKmSaida());
                        stmt.setInt(5, controleViagem.getKmEntrada());
                        stmt.setDate(6, controleViagem.getDataSaida());
                        stmt.setDate(7, controleViagem.getDataEntrada());
                        
                       stmt.execute();
                       
		} catch (SQLException e) {
			e.printStackTrace();
		}
       return "Sucesso";
      
    }
	
        @Override
    public void excluir(ControleViagemModelo controleViagem){
    	String sentenca = "DELETE FROM controle WHERE codControle = ?";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setInt(1, controleViagem.getCodControle());
                        stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
        @Override
     public void editar(ControleViagemModelo controleViagem){
    	String sentenca = "UPDATE controle set codMotorista = ?, placaVeiculo = ?, kmSaida = ?, kmEntrada = ?, dataSaida = ?, dataEntrada = ? WHERE codControle=?";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setInt(1, controleViagem.getCodControle());
                        stmt.setInt(2, controleViagem.getMotorista().getCodMotorista());
                        stmt.setString(3, controleViagem.getVeiculo().getPlacaVeiculo());
                        stmt.setInt(4, controleViagem.getKmSaida());
                        stmt.setInt(5, controleViagem.getKmEntrada());
                        stmt.setDate(6, controleViagem.getDataSaida());
                        stmt.setDate(7, controleViagem.getDataEntrada());
                        
                        stmt.executeUpdate();
                        
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    @Override
    public ControleViagemModelo selecionarControle(ControleViagemModelo controleViagem) throws RemoteException {
       String sentenca = "Select * from controle WHERE codControle=?";
       ControleViagemModelo retorno = new ControleViagemModelo();
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                       
                        stmt.setInt(1, controleViagem.getCodControle()); // realmente precisa desse set?
                      
                        ResultSet rs = stmt.executeQuery();
                        while(rs.next()){
                            
                        MotoristaModelo motorista=new MotoristaModelo();
                        motorista.setCodMotorista(rs.getInt("codMotorista"));
                        VeiculoModelo veiculo=new VeiculoModelo();
                        veiculo.setPlacaVeiculo(rs.getString("placaVeiculo"));
                        
                        retorno.setMotorista (motorista);
                        retorno.setVeiculo(veiculo);
                        retorno.setKmSaida(rs.getInt("kmSaida"));
                        retorno.setKmEntrada(rs.getInt("kmEntrada"));
                        retorno.setDataSaida(rs.getDate("dataSaida"));
                        retorno.setDataEntrada(rs.getDate("dataEntrada"));
                              
                        }
                        
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return retorno;
    }
	
}
