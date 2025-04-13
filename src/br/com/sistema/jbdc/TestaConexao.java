package br.com.sistema.jbdc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class TestaConexao {
    
    public static void main(String[] args) {
        try {
            new ConexaoBanco().pegarConexão();
            JOptionPane.showMessageDialog(null,"Conectado com sucesso");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar ao Banco de Dados" + e.getMessage());
        }
    }
    
}
