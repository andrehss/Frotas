package Controle;

import Modelo.MotoristaModelo;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IMotoristaControle extends Remote{
    
    public String inserirMotorista(MotoristaModelo m) throws RemoteException;
    public void editar(MotoristaModelo m) throws RemoteException;
    public void excluir(MotoristaModelo m) throws RemoteException;
    public MotoristaModelo selecionarMotorista(MotoristaModelo m) throws RemoteException;
    
}
