package br.com.sistema.jbdc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class TestaConexao {
    
    public static void main(String[] args) {
        try {
            new ConexaoBanco().pegarConexao();
            JOptionPane.showMessageDialog(null,"Conectado com sucesso");
            System.out.println("Banco de Dados conectado com sucesso");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar ao Banco de Dados" + e.getMessage());
            System.out.println("Erro ao conectar com Banco de Dados" + e.getMessage());
            
        }
    }
    
}
