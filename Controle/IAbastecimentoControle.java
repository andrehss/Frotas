package Controle;

import java.rmi.Remote;
import java.rmi.RemoteException;
import Modelo.AbastecimentoModelo;

public interface IAbastecimentoControle extends Remote {
	
    public String inserirAbastecimento(AbastecimentoModelo abastecimento) throws RemoteException;
    public void editar(AbastecimentoModelo abastecimento) throws RemoteException;
    public void excluir(AbastecimentoModelo abastecimento) throws RemoteException;
    public AbastecimentoModelo selecionarAbastecimento(AbastecimentoModelo abastecimento) throws RemoteException;
}
