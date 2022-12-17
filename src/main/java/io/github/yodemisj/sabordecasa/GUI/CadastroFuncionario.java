/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package io.github.yodemisj.sabordecasa.GUI;

import io.github.yodemisj.sabordecasa.funcionario.Credencial;
import io.github.yodemisj.sabordecasa.funcionario.CredencialDao;
import io.github.yodemisj.sabordecasa.funcionario.Funcionario;
import io.github.yodemisj.sabordecasa.funcionario.FuncionarioDao;

/**
 *
 * @author yodem
 */
public class CadastroFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form teste
     */
    public CadastroFuncionario() {
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

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCadastrarSenha = new javax.swing.JLabel();
        chkAdministrador = new javax.swing.JCheckBox();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        pwdConfirmarSenha = new javax.swing.JPasswordField();
        pwdSenha = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        lblMatricula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMatricula.setText("Matricula:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("Email:");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");

        lblCadastrarSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastrarSenha.setText("Confirmar Senha:");

        chkAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkAdministrador.setText("Administrador");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        txtMatricula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyReleased(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        pwdConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pwdConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdConfirmarSenhaActionPerformed(evt);
            }
        });
        pwdConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdConfirmarSenhaKeyReleased(evt);
            }
        });

        pwdSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pwdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdSenhaKeyReleased(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(lblCadastrarSenha)
                    .addComponent(lblEmail)
                    .addComponent(lblSenha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pwdSenha)
                            .addComponent(pwdConfirmarSenha)
                            .addComponent(btnCancelar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSenha)
                        .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMatricula)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastrarSenha)
                    .addComponent(pwdConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAdministrador))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Funcionario funcionario = new Funcionario();
        Credencial credencial = new Credencial();
        funcionario.setNome(txtNome.getText());
        funcionario.setMatricula(Long.parseLong(txtMatricula.getText()));
        credencial.setEmail(txtEmail.getText());
        credencial.setSenha(String.valueOf(pwdSenha.getPassword()));
        funcionario.setCredencial(credencial);
        funcionario.setAdministrador(chkAdministrador.isSelected());
        funcionario.setAtivo(true);
        Long id;
        id = new FuncionarioDao().saveOrUpdate(funcionario);
        funcionario.setId(id);
        id = new CredencialDao().saveOrUpdate(credencial);
        credencial.setId(id);

        txtNome.setText(null);
        txtEmail.setText(null);
        txtMatricula.setText(null);
        pwdSenha.setText(null);
        pwdConfirmarSenha.setText(null);
        chkAdministrador.setSelected(false);
        txtNome.requestFocus();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void pwdConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdConfirmarSenhaActionPerformed
        if (String.valueOf(pwdSenha.getPassword())
            .equals(String.valueOf(pwdConfirmarSenha.getPassword()))
            && !txtNome.getText().trim().isEmpty()
            && !txtEmail.getText().trim().isEmpty()
            && !txtMatricula.getText().trim().isEmpty()) {
            btnCadastrar.setEnabled(true);
        } else {
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_pwdConfirmarSenhaActionPerformed

    private void pwdConfirmarSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdConfirmarSenhaKeyReleased
        if (String.valueOf(pwdSenha.getPassword())
            .equals(String.valueOf(pwdConfirmarSenha.getPassword()))
            && !txtNome.getText().trim().isEmpty()
            && !txtEmail.getText().trim().isEmpty()
            && !txtMatricula.getText().trim().isEmpty()) {
            btnCadastrar.setEnabled(true);
        } else {
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_pwdConfirmarSenhaKeyReleased

    private void pwdSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdSenhaKeyReleased
        if (String.valueOf(pwdSenha.getPassword())
            .equals(String.valueOf(pwdConfirmarSenha.getPassword()))
            && !txtNome.getText().trim().isEmpty()
            && !txtEmail.getText().trim().isEmpty()
            && !txtMatricula.getText().trim().isEmpty()) {
            btnCadastrar.setEnabled(true);
        } else {
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_pwdSenhaKeyReleased

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        if (String.valueOf(pwdSenha.getPassword())
            .equals(String.valueOf(pwdConfirmarSenha.getPassword()))
            && !txtNome.getText().trim().isEmpty()
            && !txtEmail.getText().trim().isEmpty()
            && !txtMatricula.getText().trim().isEmpty()) {
            btnCadastrar.setEnabled(true);
        } else {
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (String.valueOf(pwdSenha.getPassword())
            .equals(String.valueOf(pwdConfirmarSenha.getPassword()))
            && !txtNome.getText().trim().isEmpty()
            && !txtEmail.getText().trim().isEmpty()
            && !txtMatricula.getText().trim().isEmpty()) {
            btnCadastrar.setEnabled(true);
        } else {
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyReleased
        if (String.valueOf(pwdSenha.getPassword())
            .equals(String.valueOf(pwdConfirmarSenha.getPassword()))
            && !txtNome.getText().trim().isEmpty()
            && !txtEmail.getText().trim().isEmpty()
            && !txtMatricula.getText().trim().isEmpty()) {
            btnCadastrar.setEnabled(true);
        } else {
            btnCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_txtMatriculaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chkAdministrador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrarSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pwdConfirmarSenha;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
