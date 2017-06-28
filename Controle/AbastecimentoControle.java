package Controle;
import Modelo.AbastecimentoModelo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.Conexao;

public class AbastecimentoControle extends UnicastRemoteObject implements IAbastecimentoControle{

    

    public AbastecimentoControle()throws RemoteException{}
    
    
    @Override
    public String inserirAbastecimento(AbastecimentoModelo abastecimento) throws RemoteException {
        
    
    	String sentenca = "INSERT INTO abastecimento (codAbastecimento,placaVeiculo,quantidadeAbastecida, quilometroAbastecido, quilometroAbastecidoAnterior, dataAbastecimento) VALUE (?,?,?,?,?,?)"; // arrumar de acordo com o banco
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        stmt.setInt(1, abastecimento.getCodAbastecimento());
                       //stmt.setString(2, abastecimento.getPlacaVeiculo());
                        stmt.setFloat(3,abastecimento.getQuantidadeAbastecida());
                        stmt.setInt(4, abastecimento.getQuilometroAbastecido());
                        stmt.setInt(5, abastecimento.getQuilometroAbastecidoAnterior());
                        stmt.setDate(6, abastecimento.getDataAbastecimento());
                        
                        stmt.execute();
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return "Sucesso";
    }
	
    @Override
    public void excluir(AbastecimentoModelo abastecimento){
    	String sentenca = "DELETE FROM abastecimento WHERE codAbastecimento = ?"; // arrumar de acordo com o banco
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setInt(1, abastecimento.getCodAbastecimento());
                        stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    @Override
     public void editar(AbastecimentoModelo abastecimento){
    	String sentenca = "UPDATE abastecimento set placaVeiculo = ?, quantidadeAbastecida = ?, quilometroAbatecido = ?, quilometroAbastecidoAnterior = ?, dataAbastecimento= ? WHERE codAbastecimento=?"; // arrumar de acordo com o banco
    	try {
           
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setInt(6, abastecimento.getCodAbastecimento()); // realmente precisa desse set?
                        //stmt.setString(1, abastecimento.getPlacaVeiculo());
                        stmt.setFloat(2, abastecimento.getQuantidadeAbastecida());
                        stmt.setDate(3, abastecimento.getDataAbastecimento());
                        stmt.setInt(4, abastecimento.getQuilometroAbastecido());
                        stmt.setInt(5, abastecimento.getQuilometroAbastecidoAnterior());
                        
                        stmt.execute();
                        
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
     
    @Override
    public AbastecimentoModelo selecionarAbastecimento(AbastecimentoModelo abastecimento) throws RemoteException {
       String sentenca = "Select * from abastecimento WHERE codAbastecimento=?";
       AbastecimentoModelo retorno = new AbastecimentoModelo();
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setInt(1, abastecimento.getCodAbastecimento()); // realmente precisa desse set?
                      
                        ResultSet rs = stmt.executeQuery();
                        while(rs.next()){
                            retorno.setCodAbastecimento(rs.getInt("codAbastecimento"));
                            //retorno.setPlacaVeiculo(rs.getString("placaVeiculo"));
                            retorno.setQuantidadeAbastecida(rs.getFloat("quantidadeAbastecida"));
                            retorno.setDataAbastecimento(rs.getDate("dataAbastecimento"));
                            retorno.setQuilometroAbastecido(rs.getInt("quilometroAbastecido"));
                            retorno.setQuilometroAbastecidoAnterior(rs.getInt("quilometroAbastecidoAnterior"));
                        }
                        
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return retorno;
    }

   
	
 
    
}
