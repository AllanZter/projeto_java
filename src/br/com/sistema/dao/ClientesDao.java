
package br.com.sistema.dao;

import br.com.sistema.jbdc.ConexaoBanco;
import br.com.sistema.model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientesDao {
    
    private Connection conn;
    
    public ClientesDao(){
        this.conn = new ConexaoBanco().pegarConexao();
    }
    
    public void salvar(Clientes obj){
        try {
            //criar SQL
            String sql = "insert into tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)" 
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            // preparar conexão SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getRg());
            stmt.setString(3,obj.getCpf());
            stmt.setString(4,obj.getEmail());
            stmt.setString(5,obj.getTelefone());
            stmt.setString(6,obj.getCelular());
            stmt.setString(7,obj.getCep());
            stmt.setString(8,obj.getEndereco());
            stmt.setInt(9,obj.getNumero());
            stmt.setString(10,obj.getComplemento());
            stmt.setString(11,obj.getBairro());
            stmt.setString(12,obj.getCidade());
            stmt.setString(13,obj.getEstado());
            // executar sql
            stmt.execute();
            //fechar conexão
            stmt.close();
            JOptionPane.showMessageDialog(null,"Cliente Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar Dados No Banco" + e.getMessage());
        }
    }
    public Clientes BuscarClientes(String nome){
        try {
            String sql = "select * from tb_clientes where nome =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs =  stmt.executeQuery();
            Clientes obj = new Clientes();
            if(rs.next()){
                obj.setId(rs.getInt("id")); //1
                obj.setNome(rs.getString("nome"));//2
                obj.setRg(rs.getString("rg"));//3
                obj.setCpf(rs.getString("cpf"));//4
                obj.setEmail(rs.getString("email"));//5
                obj.setTelefone(rs.getString("telefone"));//6
                obj.setCelular(rs.getString("celular"));//7
                obj.setCep(rs.getString("cep"));//8
                obj.setEndereco(rs.getString("endereco"));//9
                obj.setNumero(rs.getInt("numero"));//10
                obj.setComplemento(rs.getString("complemento"));//11
                obj.setBairro(rs.getString("bairro"));//12
                obj.setCidade(rs.getString("cidade"));//13
                obj.setEstado(rs.getString("estado"));//14                         
            }
            return obj;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao resgatar dados dos Clientes" + e.getMessage());
        }
        return null;
    }
   
    
    
}
