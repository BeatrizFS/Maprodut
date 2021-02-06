/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Controle.ControleProdutos;
import Model.Produtos;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author beatr
 */
public class TelaCadProd extends javax.swing.JFrame {
    
    Produtos modelProdutos = new Produtos();
    ControleProdutos controleProdutos = new ControleProdutos();
    List<Produtos> listaProdutos = new ArrayList<>();

    /**
     * Creates new form TelaCadUsu
     */
    public TelaCadProd() {
        initComponents();
        carregarProdutos();
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
        CdtProdut = new javax.swing.JScrollPane();
        txtCadProdut = new javax.swing.JTextPane();
        Empresa = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        Marca = new javax.swing.JTextField();
        BarraEmpresa = new javax.swing.JTextField();
        BarraMarca = new javax.swing.JTextField();
        Tabela = new javax.swing.JScrollPane();
        tblproduto = new javax.swing.JTable();
        BarraPreco = new javax.swing.JTextField();
        Preco3 = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        BarraCodigo = new javax.swing.JTextField();
        Produto = new javax.swing.JTextField();
        BarraProduto = new javax.swing.JTextField();
        btnSair1 = new javax.swing.JButton();
        btnNovoprod1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCadProdut.setEditable(false);
        txtCadProdut.setBackground(new java.awt.Color(255, 229, 77));
        txtCadProdut.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtCadProdut.setText("          Cadastro de produto ");
        CdtProdut.setViewportView(txtCadProdut);

        jPanel1.add(CdtProdut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 330, 40));

        Empresa.setEditable(false);
        Empresa.setBackground(new java.awt.Color(255, 255, 255));
        Empresa.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Empresa.setText("Empresa:");
        Empresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(Empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, -1));

        Codigo.setEditable(false);
        Codigo.setBackground(new java.awt.Color(255, 255, 255));
        Codigo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Codigo.setText("Código:");
        Codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });
        jPanel1.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, -1));

        Marca.setEditable(false);
        Marca.setBackground(new java.awt.Color(255, 255, 255));
        Marca.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Marca.setText("Marca:");
        Marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });
        jPanel1.add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, -1));

        BarraEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 420, -1));

        BarraMarca.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 420, -1));

        tblproduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblproduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Empresa", "Produto", "Marca", "Preço"
            }
        ));
        Tabela.setViewportView(tblproduto);

        jPanel1.add(Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 620, 150));

        BarraPreco.setBackground(new java.awt.Color(204, 204, 204));
        BarraPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraPrecoActionPerformed(evt);
            }
        });
        jPanel1.add(BarraPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 170, -1));

        Preco3.setEditable(false);
        Preco3.setBackground(new java.awt.Color(255, 255, 255));
        Preco3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Preco3.setText("Preço:");
        Preco3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Preco3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Preco3ActionPerformed(evt);
            }
        });
        jPanel1.add(Preco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 50, -1));

        btnVoltar.setBackground(new java.awt.Color(255, 229, 77));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("");
        btnVoltar.setActionCommand("");
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        btnExcluir.setBackground(new java.awt.Color(255, 229, 77));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("");
        btnExcluir.setActionCommand("");
        btnExcluir.setBorderPainted(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 70, -1));

        btnSalvar.setBackground(new java.awt.Color(255, 229, 77));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.setActionCommand("");
        btnSalvar.setBorderPainted(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, -1));

        BarraCodigo.setEditable(false);
        BarraCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, -1));

        Produto.setEditable(false);
        Produto.setBackground(new java.awt.Color(255, 255, 255));
        Produto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Produto.setText("Produto:");
        Produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, -1));

        BarraProduto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(BarraProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 420, -1));

        btnSair1.setBackground(new java.awt.Color(255, 229, 77));
        btnSair1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair1.setText("Sair");
        btnSair1.setToolTipText("");
        btnSair1.setActionCommand("");
        btnSair1.setBorderPainted(false);
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 70, -1));

        btnNovoprod1.setBackground(new java.awt.Color(255, 229, 77));
        btnNovoprod1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNovoprod1.setText("Exibir informações");
        btnNovoprod1.setToolTipText("");
        btnNovoprod1.setActionCommand("");
        btnNovoprod1.setBorderPainted(false);
        btnNovoprod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoprod1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovoprod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed

    private void Preco3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Preco3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Preco3ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        TelaTipCad objeto7 = new TelaTipCad();
        objeto7.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int linha = tblproduto.getSelectedRow();
        if (linha <0){
            JOptionPane.showMessageDialog(this, "Selecione um produto!");
        }else{
            int codigo = (int) tblproduto.getValueAt(linha, 0);
            controleProdutos.excluirProdutosControle(codigo);
            carregarProdutos();
            limparFormularioPro();
            JOptionPane.showMessageDialog(this, "Produto excluido!");
        }        
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void formularioProVazio(){
        if((BarraEmpresa.getText().length()>0)
            && (BarraProduto.getText().length()>0)){
        JOptionPane.showMessageDialog(this, "Cadastro realizado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        controleProdutos.salvarProdutosControle(modelProdutos);
        carregarProdutos();
        limparFormularioPro();            
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar!", "Erro", JOptionPane.ERROR_MESSAGE);                        
        }
    }
    
    private void limparFormularioPro(){
        BarraEmpresa.setText("");
        BarraProduto.setText("");
        BarraMarca.setText("");
        BarraPreco.setText("");
    }
    
    private void carregarProdutos(){
        listaProdutos = controleProdutos.getListaProdutosControle();
        DefaultTableModel modelo4 = (DefaultTableModel) tblproduto.getModel();
        modelo4.setNumRows(0);
        
        for (int i = 0; i < listaProdutos.size(); i++){
            modelo4.addRow(new Object[]{
                listaProdutos.get(i).getProId(),
                listaProdutos.get(i).getProEmpresa(),
                listaProdutos.get(i).getProMarca(),
                listaProdutos.get(i).getProPreco()
            });
        }
        
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        modelProdutos = new Produtos();
        modelProdutos.setProEmpresa(BarraEmpresa.getText());
        modelProdutos.setProDescricao(BarraProduto.getText());
        modelProdutos.setProMarca(BarraMarca.getText());
        modelProdutos.setProPreco(Double.parseDouble(BarraPreco.getText()));
        formularioProVazio();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void BarraPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BarraPrecoActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
        TelaLogin objeto9 = new TelaLogin();
        objeto9.setVisible(true);
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnNovoprod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoprod1ActionPerformed
        // TODO add your handling code here:
        modelProdutos = new Produtos();
        int linha = tblproduto.getSelectedRow();
        if (linha <0) {
           JOptionPane.showMessageDialog(this, "Selecione um produto!"); 
        }else{
            int codigo = (int) tblproduto.getValueAt(linha, 0);
            modelProdutos = controleProdutos.getProdutosControle(codigo);
            BarraCodigo.setText(String.valueOf(modelProdutos.getProId()));
            BarraEmpresa.setText(modelProdutos.getProEmpresa());
            BarraProduto.setText(modelProdutos.getProDescricao());
            BarraMarca.setText(modelProdutos.getProMarca());
            BarraPreco.setText(String.valueOf(modelProdutos.getProPreco()));        
        }
    }//GEN-LAST:event_btnNovoprod1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraCodigo;
    private javax.swing.JTextField BarraEmpresa;
    private javax.swing.JTextField BarraMarca;
    private javax.swing.JTextField BarraPreco;
    private javax.swing.JTextField BarraProduto;
    private javax.swing.JScrollPane CdtProdut;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Empresa;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Preco3;
    private javax.swing.JTextField Produto;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoprod1;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tblproduto;
    private javax.swing.JTextPane txtCadProdut;
    // End of variables declaration//GEN-END:variables
}
