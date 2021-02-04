/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Controle.ControleCliente;
import Model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author beatr
 */
public class TelaCadUsu1 extends javax.swing.JFrame {

    Cliente modelCliente = new Cliente();
    ControleCliente controleCliente = new ControleCliente();
    /**
     * Creates new form TelaCadUsu
     */
    public TelaCadUsu1() {
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
        CdtUsu = new javax.swing.JScrollPane();
        txtCdtUsu = new javax.swing.JTextPane();
        txtSenhaUsu = new javax.swing.JTextField();
        txtNomeUsu = new javax.swing.JTextField();
        txtEmailUsu = new javax.swing.JTextField();
        txtCPFUsu = new javax.swing.JTextField();
        txtLoginUsu = new javax.swing.JTextField();
        BarraNomeUsu = new javax.swing.JTextField();
        BarraEmailUsu = new javax.swing.JTextField();
        BarraLoginUsu = new javax.swing.JTextField();
        BarraSenhaUsu = new javax.swing.JPasswordField();
        btnVoltarLogin = new javax.swing.JButton();
        btnFim2 = new javax.swing.JButton();
        BarraCPFUsu = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCdtUsu.setEditable(false);
        txtCdtUsu.setBackground(new java.awt.Color(255, 229, 77));
        txtCdtUsu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtCdtUsu.setText("          Cadastro de Cliente ");
        CdtUsu.setViewportView(txtCdtUsu);

        jPanel1.add(CdtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 330, 40));

        txtSenhaUsu.setEditable(false);
        txtSenhaUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtSenhaUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSenhaUsu.setText("Senha:");
        txtSenhaUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtSenhaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenhaUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 50, -1));

        txtNomeUsu.setEditable(false);
        txtNomeUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNomeUsu.setText("Nome:");
        txtNomeUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtNomeUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, -1));

        txtEmailUsu.setEditable(false);
        txtEmailUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmailUsu.setText("E-mail:");
        txtEmailUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtEmailUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 50, -1));

        txtCPFUsu.setEditable(false);
        txtCPFUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtCPFUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCPFUsu.setText("CPF:");
        txtCPFUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtCPFUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFUsuActionPerformed(evt);
            }
        });
        jPanel1.add(txtCPFUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 50, -1));

        txtLoginUsu.setEditable(false);
        txtLoginUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtLoginUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLoginUsu.setText("Login:");
        txtLoginUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtLoginUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUsuActionPerformed(evt);
            }
        });
        jPanel1.add(txtLoginUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, -1));

        BarraNomeUsu.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraNomeUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 360, -1));

        BarraEmailUsu.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraEmailUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 360, -1));

        BarraLoginUsu.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraLoginUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, -1));

        BarraSenhaUsu.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraSenhaUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 190, -1));

        btnVoltarLogin.setBackground(new java.awt.Color(255, 229, 77));
        btnVoltarLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltarLogin.setText("Voltar");
        btnVoltarLogin.setToolTipText("");
        btnVoltarLogin.setActionCommand("");
        btnVoltarLogin.setBorderPainted(false);
        btnVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        btnFim2.setBackground(new java.awt.Color(255, 229, 77));
        btnFim2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFim2.setText("Finalizar");
        btnFim2.setToolTipText("");
        btnFim2.setActionCommand("");
        btnFim2.setBorderPainted(false);
        btnFim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFim2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 100, 40));

        BarraCPFUsu.setBackground(new java.awt.Color(204, 204, 204));
        try {
            BarraCPFUsu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(BarraCPFUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuActionPerformed

    private void txtCPFUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFUsuActionPerformed

    private void txtLoginUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginUsuActionPerformed

    private void btnFim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFim2ActionPerformed
        // TODO add your handling code here:
        modelCliente = new Cliente();
        modelCliente.setUsuNome(BarraNomeUsu.getText());
        modelCliente.setUsuEmail(BarraEmailUsu.getText());
        modelCliente.setUsuCPF(BarraCPFUsu.getText());
        modelCliente.setUsuLogin(BarraLoginUsu.getText());
        modelCliente.setUsuSenha(String.valueOf(BarraSenhaUsu.getPassword()));
        //controleCliente.salvarClienteControle(modelCliente);
        formularioUsuVazio();
    }//GEN-LAST:event_btnFim2ActionPerformed

    private void formularioUsuVazio(){
        if((BarraNomeUsu.getText().length() > 0) 
                && (BarraCPFUsu.getText().length() > 0)
                && (BarraEmailUsu.getText().length() > 0)
                && (BarraLoginUsu.getText().length() > 0)){
            JOptionPane.showMessageDialog(this, "Cadastro realizado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            controleCliente.salvarClienteControle(modelCliente);
            limparFormularioUsu();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar!", "Erro", JOptionPane.ERROR_MESSAGE);
        }        
    }    
    /**
     * Limpar formúlario de cadastro de usuários
     * @param void 
     */
    private void limparFormularioUsu(){
        BarraNomeUsu.setText("");
        BarraEmailUsu.setText("");
        BarraCPFUsu.setText("");
        BarraLoginUsu.setText("");
        BarraSenhaUsu.setText("");
        
    }
    
    private void btnVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLoginActionPerformed
        // TODO add your handling code here:
        TelaLogin objeto3 = new TelaLogin();
        objeto3.setVisible(true);
    }//GEN-LAST:event_btnVoltarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadUsu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField BarraCPFUsu;
    private javax.swing.JTextField BarraEmailUsu;
    private javax.swing.JTextField BarraLoginUsu;
    private javax.swing.JTextField BarraNomeUsu;
    private javax.swing.JPasswordField BarraSenhaUsu;
    private javax.swing.JScrollPane CdtUsu;
    private javax.swing.JButton btnFim2;
    private javax.swing.JButton btnVoltarLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCPFUsu;
    private javax.swing.JTextPane txtCdtUsu;
    private javax.swing.JTextField txtEmailUsu;
    private javax.swing.JTextField txtLoginUsu;
    private javax.swing.JTextField txtNomeUsu;
    private javax.swing.JTextField txtSenhaUsu;
    // End of variables declaration//GEN-END:variables
}
