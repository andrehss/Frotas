/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;


import Controle.IVeiculoControle;
import Modelo.VeiculoModelo;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre
 */
public class TelaVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame1
     */
    public TelaVeiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        campoFabricante = new javax.swing.JTextField();
        campoModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoAnoFabricacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoConsumoMedio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoCor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoChassi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoCapacidadeTanque = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        campoTipo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 400));

        jLabel2.setText("Placa");

        jLabel3.setText("Fabricante");

        jLabel4.setText("Modelo");

        campoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModeloActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo");

        jLabel7.setText("Ano de Fabricação");

        jLabel8.setText("Consumo Médio");

        jLabel9.setText("Cor");

        jLabel10.setText("Chassi");

        jLabel11.setText("Capacidade do Tanque");

        campoCapacidadeTanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCapacidadeTanqueActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExluir.setText("Excluir");
        btnExluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5)
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campoPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(campoFabricante)))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCor, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(campoChassi)
                            .addComponent(campoTipo))
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoConsumoMedio, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(campoCapacidadeTanque)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(campoChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCapacidadeTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoConsumoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExluir)
                    .addComponent(btnEditar)
                    .addComponent(btnBuscar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModeloActionPerformed

    private void campoCapacidadeTanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCapacidadeTanqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCapacidadeTanqueActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        VeiculoModelo veiculo=new VeiculoModelo();
      
        veiculo.setPlacaVeiculo(campoPlaca.getText());
        veiculo.setTipoVeiculo(campoTipo.getText());
        veiculo.setFabricante(campoFabricante.getText());
        veiculo.setNumeroChassi(Integer.parseInt(campoChassi.getText()));
        veiculo.setModelo(campoModelo.getText());
        veiculo.setCor(campoCor.getText());
        veiculo.setAnoFabricacao(Integer.parseInt(campoAnoFabricacao.getText()));
        veiculo.setCapacidadeTanque(Float.parseFloat(campoCapacidadeTanque.getText()));
        veiculo.setMediaConsumo(Float.parseFloat(campoConsumoMedio.getText()));
        
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IVeiculoControle controle = (IVeiculoControle) registry.lookup("Veiculo");
             String resultado =  controle.inserirVeiculo(veiculo);
             System.out.println(resultado);
        } catch (RemoteException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirActionPerformed
        
        VeiculoModelo veiculo= new VeiculoModelo();
        veiculo.setPlacaVeiculo(campoPlaca.getText());
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IVeiculoControle controle = (IVeiculoControle) registry.lookup("Veiculo");
             
             controle.excluir(veiculo);
             
             campoTipo.setText(String.valueOf(veiculo.getTipoVeiculo()));
             campoFabricante.setText(String.valueOf(veiculo.getFabricante()));
             campoChassi.setText(String.valueOf(veiculo.getNumeroChassi()));
             campoModelo.setText(String.valueOf(veiculo.getModelo()));
             campoCor.setText(String.valueOf(veiculo.getCor()));
             campoAnoFabricacao.setText(String.valueOf(veiculo.getAnoFabricacao()));
             campoCapacidadeTanque.setText(String.valueOf(veiculo.getCapacidadeTanque()));
             campoConsumoMedio.setText(String.valueOf(veiculo.getMediaConsumo()));
                     
        } catch (RemoteException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnExluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        VeiculoModelo veiculo = new VeiculoModelo();
        veiculo.setPlacaVeiculo(campoPlaca.getText());
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IVeiculoControle controle = (IVeiculoControle) registry.lookup("Veiculo");
             
            
             veiculo.setTipoVeiculo(campoTipo.getText());
             veiculo.setFabricante(campoFabricante.getText());
             veiculo.setNumeroChassi(Integer.parseInt(campoChassi.getText()));
             veiculo.setModelo(campoModelo.getText());
             veiculo.setCor(campoCor.getText());
             veiculo.setAnoFabricacao(Integer.parseInt(campoAnoFabricacao.getText()));
             veiculo.setCapacidadeTanque(Float.parseFloat(campoCapacidadeTanque.getText()));
             veiculo.setMediaConsumo(Float.parseFloat(campoConsumoMedio.getText()));
            
             controle.editar(veiculo);
            
             
        } catch (RemoteException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
         VeiculoModelo veiculo= new VeiculoModelo();
         veiculo.setPlacaVeiculo(campoPlaca.getText());
       
       
       try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IVeiculoControle controle = (IVeiculoControle) registry.lookup("Veiculo");
             veiculo =  controle.selecionarVeiculo(veiculo);
             
             campoTipo.setText(String.valueOf(veiculo.getTipoVeiculo()));
             campoFabricante.setText(String.valueOf(veiculo.getFabricante()));
             campoChassi.setText(String.valueOf(veiculo.getNumeroChassi()));
             campoModelo.setText(String.valueOf(veiculo.getModelo()));
             campoCor.setText(String.valueOf(veiculo.getCor()));
             campoAnoFabricacao.setText(String.valueOf(veiculo.getAnoFabricacao()));
             campoCapacidadeTanque.setText(String.valueOf(veiculo.getCapacidadeTanque()));
             campoConsumoMedio.setText(String.valueOf(veiculo.getMediaConsumo()));
                         
             
        } catch (RemoteException ex) {
            Logger.getLogger(TelaMotorista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(TelaMotorista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoAnoFabricacao;
    private javax.swing.JTextField campoCapacidadeTanque;
    private javax.swing.JTextField campoChassi;
    private javax.swing.JTextField campoConsumoMedio;
    private javax.swing.JTextField campoCor;
    private javax.swing.JTextField campoFabricante;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
