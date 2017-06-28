/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.ServicoModelo;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import Controle.IControleViagemControle;

/**
 *
 * @author Andre
 */
public class CadastroServico extends javax.swing.JFrame {

    
    /**
     * Creates new form CadastroServico
     */
    public CadastroServico() {
        initComponents();
        
        campoDescricaoServico.setEnabled(false);
        campoPrecoServico.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoCodigoServico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDescricaoServico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoPrecoServico = new javax.swing.JTextField();
        botaoSalvarServico = new javax.swing.JButton();
        botaoNovoServico = new javax.swing.JButton();
        botaoVoltarCadastroServico = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botaoPesquisarServico = new javax.swing.JButton();
        botaoExcluirServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código do Serviço");

        jLabel2.setText("Descrição");

        campoDescricaoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoServicoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        botaoSalvarServico.setText("Salvar");
        botaoSalvarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarServicoActionPerformed(evt);
            }
        });

        botaoNovoServico.setText("Novo");
        botaoNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoServicoActionPerformed(evt);
            }
        });

        botaoVoltarCadastroServico.setText("Voltar");
        botaoVoltarCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarCadastroServicoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Cadastro de Serviços");

        botaoPesquisarServico.setText("Pesquisar");
        botaoPesquisarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarServicoActionPerformed(evt);
            }
        });

        botaoExcluirServico.setText("Excluir");
        botaoExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoPrecoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoDescricaoServico)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(botaoSalvarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(botaoVoltarCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoPesquisarServico)
                                .addGap(26, 26, 26)
                                .addComponent(botaoExcluirServico))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 96, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisarServico)
                    .addComponent(botaoExcluirServico))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPrecoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarServico)
                    .addComponent(botaoNovoServico)
                    .addComponent(botaoVoltarCadastroServico))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarServicoActionPerformed
        
        ServicoModelo s=new ServicoModelo();
        
        s.setCodServ(Integer.parseInt(campoCodigoServico.getText()));
        s.setDescricaoSR(campoDescricaoServico.getText());
        s.setValor(Float.parseFloat(campoPrecoServico.getText()));
        
        
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IControleViagemControle controle = (IControleViagemControle) registry.lookup("Servico");
             String resultado =  controle.inserirServico(s);
             System.out.println(resultado);
        } catch (RemoteException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_botaoSalvarServicoActionPerformed

    private void botaoNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoServicoActionPerformed
       
        campoCodigoServico.setText("");
        campoDescricaoServico.setEnabled(true);
        campoPrecoServico.setEnabled(true);
        
    }//GEN-LAST:event_botaoNovoServicoActionPerformed

    private void botaoVoltarCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarCadastroServicoActionPerformed
        CadastroServico app=new CadastroServico();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_botaoVoltarCadastroServicoActionPerformed

    private void botaoPesquisarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarServicoActionPerformed
        
     
       campoDescricaoServico.setEnabled(true);
       campoPrecoServico.setEnabled(true);
        
       ServicoModelo s= new ServicoModelo();
       s.setCodServ(Integer.parseInt(campoCodigoServico.getText()));
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IControleViagemControle controle = (IControleViagemControle) registry.lookup("Servico");
             s =  controle.selecionarServico(s);
             campoDescricaoServico.setText(s.getDescricaoSR());
             campoPrecoServico.setText(String.valueOf(s.getValor()));
        } catch (RemoteException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botaoPesquisarServicoActionPerformed

    private void botaoExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirServicoActionPerformed
        
          
        ServicoModelo s= new ServicoModelo();
        s.setCodServ(Integer.parseInt(campoCodigoServico.getText()));
      
        try {
             Registry registry = LocateRegistry.getRegistry("127.0.0.1",1100);
             IControleViagemControle controle = (IControleViagemControle) registry.lookup("Servico");
             
             controle.excluir(s);
             
             campoDescricaoServico.setText(s.getDescricaoSR());
             campoPrecoServico.setText(String.valueOf(s.getValor()));
             
        } catch (RemoteException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botaoExcluirServicoActionPerformed

    private void campoDescricaoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoServicoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluirServico;
    private javax.swing.JButton botaoNovoServico;
    private javax.swing.JButton botaoPesquisarServico;
    private javax.swing.JButton botaoSalvarServico;
    private javax.swing.JButton botaoVoltarCadastroServico;
    private javax.swing.JTextField campoCodigoServico;
    private javax.swing.JTextField campoDescricaoServico;
    private javax.swing.JTextField campoPrecoServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}