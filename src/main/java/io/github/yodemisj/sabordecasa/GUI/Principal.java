/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.yodemisj.sabordecasa.GUI;

import io.github.gabrielsizilio.sabordecasa.produto.Venda;
import io.github.yodemisj.sabordecasa.funcionario.Funcionario;

/**
 *
 * @author yodem
 */
public class Principal extends javax.swing.JFrame {
    
    private Funcionario funcionarioSistema;

    /**
     * Creates new form Principal
     */
    public Principal(Funcionario funcionarioSistema) {
        this.funcionarioSistema = funcionarioSistema;
        initComponents();
        
        if(funcionarioSistema.getAdministrador()) {
            System.out.println("admin? " + funcionarioSistema.getAdministrador());
            btnCadastrarFuncionario.setEnabled(funcionarioSistema.getAdministrador());
        }
        
        // Centralização da janela
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPrincipal = new javax.swing.JPanel();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        btnEfetuarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarFuncionario.setText("Cadastrar Funcionario");
        btnCadastrarFuncionario.setEnabled(false);
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setText("Cadastrar Cliente");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnEfetuarVenda.setText("Efetuar Venda");
        btnEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskPrincipalLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnCadastrarFuncionario)
                .addGap(112, 112, 112)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(btnEfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskPrincipalLayout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
        );

        btnCadastrarFuncionario.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
            
        
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
//            CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
//            cadastroFuncionario.setVisible(true);
//            cadastroFuncionario.setClosable(true);
//            dskPrincipal.add(cadastroFuncionario);         
//            GABRIEL: COMENTEI AUQI PQ TA DANDO ERRO NO CADASTRO DE FUCNIONARIO
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarVendaActionPerformed
        // TODO add your handling code here:
        Venda venda = new Venda();
        venda.setVisible(true);
    }//GEN-LAST:event_btnEfetuarVendaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnEfetuarVenda;
    private javax.swing.JPanel dskPrincipal;
    // End of variables declaration//GEN-END:variables
}
