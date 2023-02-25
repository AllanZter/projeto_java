
package Interface;


public class jfprincipal extends javax.swing.JFrame {

    public static boolean cadastro;
    
    
    public jfprincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jdpprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Caixa = new javax.swing.JMenu();
        Abertura = new javax.swing.JMenuItem();
        Sangria = new javax.swing.JMenuItem();
        reforco = new javax.swing.JMenuItem();
        fechamento = new javax.swing.JMenuItem();
        frente_de_loja = new javax.swing.JMenu();
        Atualizar_estoque = new javax.swing.JMenuItem();
        etiqueta = new javax.swing.JMenuItem();
        devolucao = new javax.swing.JMenuItem();
        estoque = new javax.swing.JMenu();
        orcamento = new javax.swing.JMenuItem();
        devolucao_1 = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        movimentacao = new javax.swing.JMenu();
        tam_tela = new javax.swing.JMenuItem();
        cor_tela = new javax.swing.JMenuItem();
        outra_opcao = new javax.swing.JMenu();
        tecla_atalho = new javax.swing.JMenu();
        menu_fiscal = new javax.swing.JMenu();
        ajuda = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

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

        javax.swing.GroupLayout jdpprincipalLayout = new javax.swing.GroupLayout(jdpprincipal);
        jdpprincipal.setLayout(jdpprincipalLayout);
        jdpprincipalLayout.setHorizontalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jdpprincipalLayout.setVerticalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );

        Caixa.setText("Caixa");

        Abertura.setText("Abertura");
        Abertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AberturaActionPerformed(evt);
            }
        });
        Caixa.add(Abertura);

        Sangria.setText("Sangria");
        Caixa.add(Sangria);

        reforco.setText("Reforço");
        Caixa.add(reforco);

        fechamento.setText("Fechamento");
        Caixa.add(fechamento);

        jMenuBar1.add(Caixa);

        frente_de_loja.setText("Frente de Loja");

        Atualizar_estoque.setText("Atualizar Estoque");
        frente_de_loja.add(Atualizar_estoque);

        etiqueta.setText("impressão de etiquetas");
        etiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiquetaActionPerformed(evt);
            }
        });
        frente_de_loja.add(etiqueta);

        devolucao.setText("Devolução");
        frente_de_loja.add(devolucao);

        jMenuBar1.add(frente_de_loja);

        estoque.setText("Estoque");

        orcamento.setText("Orçamento");
        estoque.add(orcamento);

        jMenuBar1.add(estoque);

        devolucao_1.setText("Devolução");

        cliente.setText("Clientes");
        devolucao_1.add(cliente);

        jMenuBar1.add(devolucao_1);

        movimentacao.setText("movimentação");

        tam_tela.setText("Tamanho Tela");
        movimentacao.add(tam_tela);

        cor_tela.setText("Cor da tela");
        movimentacao.add(cor_tela);

        jMenuBar1.add(movimentacao);

        outra_opcao.setText("Outras Opções");
        jMenuBar1.add(outra_opcao);

        tecla_atalho.setText("Teclas de Atalho");
        jMenuBar1.add(tecla_atalho);

        menu_fiscal.setText("Menu Fiscal");
        jMenuBar1.add(menu_fiscal);

        ajuda.setText("Ajuda");
        jMenuBar1.add(ajuda);

        jMenu10.setText("Sair");
        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.setExtendedState(MAXIMIZED_BOTH);

jfprincipal.cadastro = false;

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void etiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiquetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiquetaActionPerformed

    private void AberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AberturaActionPerformed

        if(cadastro==false){
            jifcadastro obj = new jifcadastro();
            jdpprincipal.add(obj);
            obj.setVisible(true);

        }//fim do if
        // TODO add your handling code here:
    }//GEN-LAST:event_AberturaActionPerformed

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
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jfprincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abertura;
    private javax.swing.JMenuItem Atualizar_estoque;
    private javax.swing.JMenu Caixa;
    private javax.swing.JMenuItem Sangria;
    private javax.swing.JMenu ajuda;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem cor_tela;
    private javax.swing.JMenuItem devolucao;
    private javax.swing.JMenu devolucao_1;
    private javax.swing.JMenu estoque;
    private javax.swing.JMenuItem etiqueta;
    private javax.swing.JMenuItem fechamento;
    private javax.swing.JMenu frente_de_loja;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpprincipal;
    private javax.swing.JMenu menu_fiscal;
    private javax.swing.JMenu movimentacao;
    private javax.swing.JMenuItem orcamento;
    private javax.swing.JMenu outra_opcao;
    private javax.swing.JMenuItem reforco;
    private javax.swing.JMenuItem tam_tela;
    private javax.swing.JMenu tecla_atalho;
    // End of variables declaration//GEN-END:variables
}
