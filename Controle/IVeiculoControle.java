package Controle;

import java.rmi.Remote;
import java.rmi.RemoteException;
import Modelo.VeiculoModelo;

public interface IVeiculoControle extends Remote {
	
	public String inserirVeiculo(VeiculoModelo veiculo) throws RemoteException;
	public void editar(VeiculoModelo veiculo) throws RemoteException;
        public void excluir(VeiculoModelo veiculo) throws RemoteException;
        public VeiculoModelo selecionarVeiculo(VeiculoModelo veiculo) throws RemoteException;
        
}
