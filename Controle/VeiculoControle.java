package Controle;
import Modelo.VeiculoModelo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Conexao;

public class VeiculoControle extends UnicastRemoteObject implements IVeiculoControle {
	
	public VeiculoControle()throws RemoteException{}
    
    @Override
    public String inserirVeiculo(VeiculoModelo veiculo) throws RemoteException {
        
        String sentenca = "INSERT INTO veiculo (placaVeiculo,tipoVeiculo,fabricante,numeroChassi,modelo,cor,anoFabricação,capacidadeTanque,mediaConsumo) VALUE (?,?,?,?,?,?,?,?,?)";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        stmt.setString(1, veiculo.getPlacaVeiculo());
                        stmt.setString(2,veiculo.getTipoVeiculo());
                        stmt.setString(3, veiculo.getFabricante());
                        stmt.setInt(4, veiculo.getNumeroChassi());
                        stmt.setString(5, veiculo.getModelo());
                        stmt.setString(6, veiculo.getCor());
                        stmt.setInt(7, veiculo.getAnoFabricacao());
                        stmt.setFloat(8, veiculo.getCapacidadeTanque());
                        stmt.setFloat(9, veiculo.getMediaConsumo());
                        
                        stmt.execute();
                        
                        JOptionPane.showMessageDialog(null,"Veiculo SALVO com Sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ERRO ao SALVAR Veiculo" + e);
		}

        
       return "Sucesso";
    }
    @Override
    public void excluir(VeiculoModelo veiculo){
            String sentenca = "DELETE FROM veiculo WHERE placaVeiculo = ?";
            try {
                            Conexao con = new Conexao();
                            PreparedStatement stmt = con.con.prepareStatement(sentenca);
                            
                            stmt.setString(1, veiculo.getPlacaVeiculo());
                            
                            stmt.execute();
                            
                            JOptionPane.showMessageDialog(null,"Veiculo EXCLUIDO com Sucesso");
                            
                    } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null,"ERRO ao EXCLUIR Veiculo" + e);
                    }
    }
    @Override
     public void editar(VeiculoModelo veiculo){
    	String sentenca = "UPDATE veiculo set tipoVeiculo = ?,fabricante = ?,numeroChassi = ?,modelo = ?,cor = ?,anoFabricação = ?,capacidadeTanque = ?,mediaConsumo = ?  WHERE placaVeiculo= ?";
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setString(9, veiculo.getPlacaVeiculo());
                        stmt.setString(1,veiculo.getTipoVeiculo());
                        stmt.setString(2, veiculo.getFabricante());
                        stmt.setInt(3, veiculo.getNumeroChassi());
                        stmt.setString(4, veiculo.getModelo());
                        stmt.setString(5, veiculo.getCor());
                        stmt.setInt(6, veiculo.getAnoFabricacao());
                        stmt.setFloat(7, veiculo.getCapacidadeTanque());
                        stmt.setFloat(8, veiculo.getMediaConsumo());
                        
                        stmt.execute();
                        
                        JOptionPane.showMessageDialog(null,"Veiculo ALTERADO com Sucesso");
                        
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ERRO ao ALTERAR Veiculo" + e);
		}
    }
     
     
        @Override
    public VeiculoModelo selecionarVeiculo(VeiculoModelo veiculo) throws RemoteException {
       String sentenca = "Select * from veiculo WHERE placaVeiculo = ?";
       VeiculoModelo retorno = new VeiculoModelo();
    	try {
			Conexao con = new Conexao();
                        PreparedStatement stmt = con.con.prepareStatement(sentenca);
                        
                        stmt.setString(1, veiculo.getPlacaVeiculo()); // realmente precisa desse set?
                      
                        ResultSet rs = stmt.executeQuery();
                        while(rs.next()){
                        /*    
                            retorno.setDescricaoSR(rs.getString("descricaoSR"));
                            retorno.setValor(rs.getFloat("valor")); */
                        
                        retorno.setTipoVeiculo(rs.getString("tipoVeiculo"));
                        retorno.setFabricante(rs.getString("fabricante"));
                        retorno.setNumeroChassi(rs.getInt("numeroChassi"));
                        retorno.setModelo(rs.getString("modelo"));
                        retorno.setCor(rs.getString("cor"));
                        retorno.setAnoFabricacao(rs.getInt("anoFabricação"));
                        retorno.setCapacidadeTanque(rs.getFloat("capacidadeTanque"));
                        retorno.setMediaConsumo(rs.getFloat("mediaConsumo"));
                                
                        }
                        
                        
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return retorno;
    }
     
     
}

