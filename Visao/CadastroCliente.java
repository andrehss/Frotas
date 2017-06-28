/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.ClienteModelo;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import Controle.IAbastecimentoControle;

/**
 *
 * @author Andre
 */
public class CadastroCliente extends javax.swing.JFrame  {

   
    
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        campoNomeCliente.setEnabled(false);
        campoCepCliente.setEnabled(false);
        campoContatoCliente.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoCodigoCliente = new javax.swing.JTextField();
        campoNomeCliente = new javax.swing.JTextField();
        campoCepCliente = new javax.swing.JTextField();
        campoContatoCliente = new javax.swing.JTextField();
        botaoSalvarCliente = new javax.swing.JButton();
        botaoNovoCliente = new javax.swing.JButton();
        botaoVoltarCadastroCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botaoPesquisarCliente = new javax.swing.JButton();
        botaoEditarCliente = new javax.swing.JButton();
        botaoExcluirCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo Cliente");

        jLabel2.setText("Nome");

        jLabel3.setText("CEP");

        jLabel4.setText("Contato");

        campoCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoClienteActionPerformed(evt);
            }
        });

        botaoSalvarCliente.setText("Salvar");
        botaoSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarClienteActionPerformed(evt);
            }
        });

        botaoNovoCliente.setText("Novo");
        botaoNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoClienteActionPerformed(evt);
            }
        });

        botaoVoltarCadastroCliente.setText("Voltar");
        botaoVoltarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarCadastroClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Cadastro de Clientes");

        botaoPesquisarCliente.setText("Pesquisar");
        botaoPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarClienteActionPerformed(evt);
            }
        });

        botaoEditarCliente.setText("Editar");
        botaoEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarClienteActionPerformed(evt);
            }
        });

        botaoExcluirCliente.setText("Excluir");
        botaoExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoPesquisarCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(botaoExcluirCliente)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(campoContatoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoSalvarCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoNovoCliente)))
                                .addGap(31, 31, 31)
                                .addComponent(botaoEditarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(botaoVoltarCadastroCliente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarCliente)
                    .addComponent(botaoExcluirCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoContatoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarCliente)
                    .addComponent(botaoNovoCliente)
                    .addComponent(botaoVoltarCadastroCliente)
                    .addComponent(botaoEditarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoClienteActionPerformed

    private void botaoNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoClienteActionPerformed
       
        campoNomeCliente.setEnabled(true); // deixa o campo desabilitado
        campoCepCliente.setEnabled(true);
        campoContatoCliente.setEnabled(true);
        
        campoCodigoCliente.setText("");
        
                
    }//GEN-LAST:event_botaoNovoClienteActionPerformed

    private void botaoSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarClienteActionPerformed
       
       ClienteModelo c= new ClienteModelo();
       c.setCodCli(Integer.parseInt(campoCodigoCliente.getText()));
       c.setNome(campoNomeCliente.getText());
       c.setCepEnd(Integer.parseInt(campoCepCliente.getText()));
       c.setTelefone(Integer.parseInt(campoContatoCliente.getText()));
     
       
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IAbastecimentoControle controle = (IAbastecimentoControle) registry.lookup("Cliente");
             String resultado =  controle.inserirCliente(c);
             System.out.println(resultado);
        } catch (RemoteException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     
     
       
    }//GEN-LAST:event_botaoSalvarClienteActionPerformed

    private void botaoVoltarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarCadastroClienteActionPerformed
        CadastroCliente app=new CadastroCliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_botaoVoltarCadastroClienteActionPerformed

    private void botaoPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarClienteActionPerformed
       
       campoNomeCliente.setEnabled(true); // deixa o campo desabilitado
       campoCepCliente.setEnabled(true);
       campoContatoCliente.setEnabled(true);
        
       
        
       ClienteModelo c= new ClienteModelo();
       c.setCodCli(Integer.parseInt(campoCodigoCliente.getText()));
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IAbastecimentoControle controle = (IAbastecimentoControle) registry.lookup("Cliente");
             c =  controle.selecionarCliente(c);
             campoNomeCliente.setText(c.getNome());
             campoContatoCliente.setText(String.valueOf(c.getTelefone()));
             campoCepCliente.setText(String.valueOf(c.getCepEnd()));
        } catch (RemoteException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoPesquisarClienteActionPerformed

    private void botaoExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirClienteActionPerformed
       
       ClienteModelo c= new ClienteModelo();
       c.setCodCli(Integer.parseInt(campoCodigoCliente.getText()));
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IAbastecimentoControle controle = (IAbastecimentoControle) registry.lookup("Cliente");
             
             controle.excluir(c);
             
             campoNomeCliente.setText(c.getNome());
             campoContatoCliente.setText(String.valueOf(c.getTelefone()));
             campoCepCliente.setText(String.valueOf(c.getCepEnd()));
             
        } catch (RemoteException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoExcluirClienteActionPerformed

    
    private void botaoEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarClienteActionPerformed
        ClienteModelo c = new ClienteModelo();
        c.setCodCli(Integer.parseInt(campoCodigoCliente.getText()));
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IAbastecimentoControle controle = (IAbastecimentoControle) registry.lookup("Cliente");
             
            
             
             c.setNome(campoNomeCliente.getText());
             c.setTelefone(Integer.parseInt(campoContatoCliente.getText()) );
             c.setCepEnd(Integer.parseInt(campoCepCliente.getText()));
             
             controle.editar(c);
            
             
        } catch (RemoteException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoEditarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditarCliente;
    private javax.swing.JButton botaoExcluirCliente;
    private javax.swing.JButton botaoNovoCliente;
    private javax.swing.JButton botaoPesquisarCliente;
    private javax.swing.JButton botaoSalvarCliente;
    private javax.swing.JButton botaoVoltarCadastroCliente;
    private javax.swing.JTextField campoCepCliente;
    private javax.swing.JTextField campoCodigoCliente;
    private javax.swing.JTextField campoContatoCliente;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
