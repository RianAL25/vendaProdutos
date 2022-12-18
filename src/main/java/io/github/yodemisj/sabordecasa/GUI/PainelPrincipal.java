/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.yodemisj.sabordecasa.GUI;

import io.github.gabrielsizilio.sabordecasa.produto.CadastroProduto;
import io.github.gabrielsizilio.sabordecasa.produto.CadastroRecheio;
import io.github.gabrielsizilio.sabordecasa.produto.Venda;
import io.github.yodemisj.sabordecasa.funcionario.Funcionario;

/**
 *
 * @author yodem
 */
public class PainelPrincipal extends javax.swing.JFrame {

        private Funcionario funcionarioSistema;
                
    public PainelPrincipal(Funcionario funcionarioSistema) {
        this.funcionarioSistema = funcionarioSistema;
        initComponents();
        System.out.println("admin? " + funcionarioSistema.getAdministrador());
        
        if(funcionarioSistema.getAdministrador()) {
            miCadastrarFuncionario.setEnabled(funcionarioSistema.getAdministrador());
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

        jMenuItem1 = new javax.swing.JMenuItem();
        dskPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        miCadastrarFuncionario = new javax.swing.JMenuItem();
        miCadastrarCliente = new javax.swing.JMenuItem();
        miCadastrarProduto = new javax.swing.JMenuItem();
        miCadastrarRecheio = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miEditarFuncionario = new javax.swing.JMenuItem();
        miEditarCliente = new javax.swing.JMenuItem();
        miEfetuarVenda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1293, Short.MAX_VALUE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        jMenu3.setText("Cadastrar");

        miCadastrarFuncionario.setText("Funcionario");
        miCadastrarFuncionario.setEnabled(false);
        miCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu3.add(miCadastrarFuncionario);

        miCadastrarCliente.setText("Cliente");
        miCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(miCadastrarCliente);

        miCadastrarProduto.setText("Produto");
        miCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(miCadastrarProduto);

        miCadastrarRecheio.setText("Recheio");
        miCadastrarRecheio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarRecheioActionPerformed(evt);
            }
        });
        jMenu3.add(miCadastrarRecheio);

        jMenu1.add(jMenu3);

        jMenu4.setText("Editar");

        miEditarFuncionario.setText("Funcionario");
        miEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarFuncionarioActionPerformed(evt);
            }
        });
        jMenu4.add(miEditarFuncionario);

        miEditarCliente.setText("Cliente");
        jMenu4.add(miEditarCliente);

        jMenu1.add(jMenu4);

        miEfetuarVenda.setText("Efetuar Venda");
        miEfetuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEfetuarVendaActionPerformed(evt);
            }
        });
        jMenu1.add(miEfetuarVenda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarFuncionarioActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setVisible(true);
        cadastroFuncionario.setClosable(true);
        dskPrincipal.add(cadastroFuncionario);  
    }//GEN-LAST:event_miCadastrarFuncionarioActionPerformed

    private void miCadastrarRecheioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarRecheioActionPerformed
        CadastroRecheio cadastroRecheio = new CadastroRecheio();
        cadastroRecheio.setVisible(true);
        //cadastroRecheio.setClosable(true);
        dskPrincipal.add(cadastroRecheio);
    }//GEN-LAST:event_miCadastrarRecheioActionPerformed

    private void miCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarProdutoActionPerformed
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.setVisible(true);
        //cadastroProduto.setClosable(true);
        dskPrincipal.add(cadastroProduto);
    }//GEN-LAST:event_miCadastrarProdutoActionPerformed

    private void miEfetuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEfetuarVendaActionPerformed
        Venda venda = new Venda(funcionarioSistema);
        venda.setVisible(true);
        //venda.setClosable(true);
        dskPrincipal.add(venda);
    }//GEN-LAST:event_miEfetuarVendaActionPerformed

    private void miCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarClienteActionPerformed
       CadastroCliente cadastroCliente = new CadastroCliente();
       cadastroCliente.setVisible(true);
       dskPrincipal.add(cadastroCliente);
    }//GEN-LAST:event_miCadastrarClienteActionPerformed

    private void miEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarFuncionarioActionPerformed
        EditaFuncionario editaFuncionario = new EditaFuncionario();
        editaFuncionario.setVisible(true);
        editaFuncionario.setClosable(true);
        dskPrincipal.add(editaFuncionario);

    }//GEN-LAST:event_miEditarFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem miCadastrarCliente;
    private javax.swing.JMenuItem miCadastrarFuncionario;
    private javax.swing.JMenuItem miCadastrarProduto;
    private javax.swing.JMenuItem miCadastrarRecheio;
    private javax.swing.JMenuItem miEditarCliente;
    private javax.swing.JMenuItem miEditarFuncionario;
    private javax.swing.JMenuItem miEfetuarVenda;
    // End of variables declaration//GEN-END:variables
}
