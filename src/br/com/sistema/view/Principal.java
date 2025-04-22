
package br.com.sistema.view;




public class Principal extends javax.swing.JFrame {

    public static boolean cadastro;
    
    
    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCaixa = new javax.swing.JMenu();
        AbrirCaixa = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        itemFecharCaixa = new javax.swing.JMenuItem();
        itemVendas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemClientes = new javax.swing.JMenuItem();
        itemFuncionarios = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto JavaAllan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenuBar1.setBorder(null);

        jMenu1.setText("Sair");
        jMenuBar1.add(jMenu1);

        menuCaixa.setText("Caixa");

        AbrirCaixa.setText("Abertura de Caixa");
        AbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirCaixaActionPerformed(evt);
            }
        });
        menuCaixa.add(AbrirCaixa);

        jMenuItem2.setText("Sangria");
        menuCaixa.add(jMenuItem2);

        jMenuItem3.setText("Reforço");
        menuCaixa.add(jMenuItem3);

        itemFecharCaixa.setText("Fechamento de Caixa");
        itemFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFecharCaixaActionPerformed(evt);
            }
        });
        menuCaixa.add(itemFecharCaixa);

        itemVendas.setText("Vendas Balcão");
        itemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVendasActionPerformed(evt);
            }
        });
        menuCaixa.add(itemVendas);

        jMenuItem1.setText("Recebimentos");
        menuCaixa.add(jMenuItem1);

        jMenuBar1.add(menuCaixa);

        jMenu2.setText("Cadastro");

        itemClientes.setText("Clientes");
        itemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClientesActionPerformed(evt);
            }
        });
        jMenu2.add(itemClientes);

        itemFuncionarios.setText("Funcionários");
        itemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(itemFuncionarios);

        jMenuItem6.setText("Fornecedor");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Estoque");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Relátorios");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1118, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.setExtendedState(MAXIMIZED_BOTH);

Principal.cadastro = false;

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void AbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirCaixaActionPerformed
        AbrirCaixa abertura = new AbrirCaixa();
        abertura.setVisible(true);
    }//GEN-LAST:event_AbrirCaixaActionPerformed

    private void itemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClientesActionPerformed
        FormularioClientes clientes = new FormularioClientes();
        clientes.setVisible(true);
    }//GEN-LAST:event_itemClientesActionPerformed

    private void itemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVendasActionPerformed
        Vendas balcao = new Vendas();
        balcao.setVisible(true);
    }//GEN-LAST:event_itemVendasActionPerformed

    private void itemFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFecharCaixaActionPerformed
        FecharCaixa fechamento = new FecharCaixa();
        fechamento.setVisible(true);
    }//GEN-LAST:event_itemFecharCaixaActionPerformed

    private void itemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFuncionariosActionPerformed
        FormularioFuncinarios funcionarios = new FormularioFuncinarios();
        funcionarios.setVisible(true);
    }//GEN-LAST:event_itemFuncionariosActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:

    
                                 

                         
                          

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirCaixa;
    private javax.swing.JMenuItem itemClientes;
    private javax.swing.JMenuItem itemFecharCaixa;
    private javax.swing.JMenuItem itemFuncionarios;
    private javax.swing.JMenuItem itemVendas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu menuCaixa;
    // End of variables declaration//GEN-END:variables
}
