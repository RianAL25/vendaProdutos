/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.gabrielsizilio.sabordecasa.produto;

import io.github.yodemisj.sabordecasa.funcionario.Funcionario;
import java.awt.Component;
import java.awt.SystemColor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Gabriel Sizilio <Gabriel at IFNMG>
 */
public class CadastroProduto extends javax.swing.JFrame {
    
    private static CadastroProduto instance;
    private static final DefaultComboBoxModel<Recheio> boxModel = new DefaultComboBoxModel<>();
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    
    /**
     * Creates new form RegistroProdutos
     */
    public CadastroProduto() {
        initComponents();
        
        
        
        recheioReload();
        cboRecheio.setModel(boxModel);
        cboRecheio.setRenderer(new RecheioRender());
        
        try {
            cboRecheio.setSelectedIndex(0);
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
    }
//</editor-fold>
    
    public static CadastroProduto getInstance() {
        if(instance == null) {
            instance = new CadastroProduto();
        }
        
        recheioReload();
        return instance;
    }
    
    public static void recheioReload() {
        try {
            int selectedIdx = boxModel.getIndexOf(boxModel.getSelectedItem());
            boxModel.removeAllElements();
            
            boxModel.addAll(new RecheioDao().findAll());
            boxModel.setSelectedItem(boxModel.getElementAt(selectedIdx));
        } catch (Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        btnSsalvar = new javax.swing.JButton();
        cboRecheio = new javax.swing.JComboBox<>();
        lblRecheio = new javax.swing.JLabel();
        ftfPreco = new javax.swing.JFormattedTextField();
        ckbRecheio = new javax.swing.JCheckBox();
        bntCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Produto");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        lblPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPreco.setText("Preco base:");
        lblPreco.setToolTipText("");

        btnSsalvar.setText("Salvar");
        btnSsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSsalvarActionPerformed(evt);
            }
        });

        cboRecheio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboRecheio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRecheioActionPerformed(evt);
            }
        });

        lblRecheio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRecheio.setText("Recheio:");
        lblRecheio.setToolTipText("");

        ftfPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        ftfPreco.setText("0,00");
        ftfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfPrecoActionPerformed(evt);
            }
        });

        ckbRecheio.setToolTipText("");
        ckbRecheio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbRecheioActionPerformed(evt);
            }
        });

        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRecheio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbRecheio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ckbRecheio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboRecheio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSsalvarActionPerformed
        // TODO add your handling code here:
        try {
           
            Recheio recheio = new Recheio();
            
            new ProdutoDao().saveOrUpdate(new Produto(null, txtNome.getText(), new BigDecimal(ftfPreco.getValue().toString()), (Recheio)boxModel.getSelectedItem()));
           
        } catch (Exception e) {
             Logger.getLogger(CadastroRecheio.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Record not saved.\nCheck the data or the network connection and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_btnSsalvarActionPerformed

    private void cboRecheioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRecheioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboRecheioActionPerformed

    private void ftfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfPrecoActionPerformed

    private void ckbRecheioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbRecheioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbRecheioActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        // TODO add your handling code here:
        //        CANCELAR CRIAÇÃO DE PRODUTO
        dispose();

    }//GEN-LAST:event_bntCancelarActionPerformed
    
    private void clear() {
        txtNome.setText(null);
        txtNome.requestFocus();
        ftfPreco.setValue(null);
    }
    
    private class RecheioRender extends JLabel implements ListCellRenderer<Recheio> {
        @Override
        public Component getListCellRendererComponent(
                JList<? extends Recheio> list, Recheio value, 
                int index, boolean isSelected, boolean cellHasFocus) {
            if(value == null) {
                return this;
            }
            
            setOpaque(true);
            setForeground(SystemColor.textText);
            setBackground(SystemColor.text);
            if(isSelected) {
                setForeground(SystemColor.textHighlightText);
                setBackground(SystemColor.textHighlight);
            }
            
            setText(value.getNome());
            setBorder(BorderFactory.createEmptyBorder(0, 5, 1, 1));
            return this;
        }
    }
    
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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton btnSsalvar;
    private javax.swing.JComboBox<Recheio> cboRecheio;
    private javax.swing.JCheckBox ckbRecheio;
    private javax.swing.JFormattedTextField ftfPreco;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblRecheio;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
