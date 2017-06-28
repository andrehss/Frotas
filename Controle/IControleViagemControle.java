package Controle;

import java.rmi.Remote;
import java.rmi.RemoteException;
import Modelo.ControleViagemModelo;

public interface IControleViagemControle extends Remote {

	public String inserirControle(ControleViagemModelo controleViagem) throws RemoteException;
	public void editar(ControleViagemModelo controleViagem) throws RemoteException;
        public void excluir(ControleViagemModelo controleViagem) throws RemoteException;
        public ControleViagemModelo selecionarControle(ControleViagemModelo controleViagem) throws RemoteException;
}
