/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.yodemisj.sabordecasa.GUI;

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
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
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
        jMenu3.add(miCadastrarCliente);

        miCadastrarProduto.setText("Produto");
        jMenu3.add(miCadastrarProduto);

        miCadastrarRecheio.setText("Recheio");
        jMenu3.add(miCadastrarRecheio);

        jMenu1.add(jMenu3);

        jMenuItem6.setText("Efetuar Venda");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarFuncionarioActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setVisible(true);
        cadastroFuncionario.setClosable(true);
        dskPrincipal.add(cadastroFuncionario);  
    }//GEN-LAST:event_miCadastrarFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem miCadastrarCliente;
    private javax.swing.JMenuItem miCadastrarFuncionario;
    private javax.swing.JMenuItem miCadastrarProduto;
    private javax.swing.JMenuItem miCadastrarRecheio;
    // End of variables declaration//GEN-END:variables
}
