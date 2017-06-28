
package Controle;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Servidor {
    public static void main(String[] args) {
        try{
	IAbastecimentoControle servico1 = new AbastecimentoControle();
        IVeiculoControle servico2 = new VeiculoControle();
        IControleViagemControle servico3 = new ControleViagemControle();
        IMotoristaControle servico4 = new MotoristaControle();
	Registry registry = LocateRegistry.createRegistry(1100);
		registry.bind ("Abastecimento", servico1);
                registry.bind ("Veiculo", servico2);
                registry.bind ("Controle", servico3);
                registry.bind ("Motorista", servico4);
                
	System.out.println ("Servidor iniciado");	

	}catch(Exception ex){ 
	ex.printStackTrace();
	}
    }

    
    
}
