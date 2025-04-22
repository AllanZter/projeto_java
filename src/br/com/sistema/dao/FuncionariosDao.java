
package br.com.sistema.dao;

import br.com.sistema.jbdc.ConexaoBanco;
import br.com.sistema.model.Funcionarios;
import br.com.sistema.view.Login;
import br.com.sistema.view.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionariosDao {
    
    private Connection conn;
    
    public FuncionariosDao(){
        this.conn = new ConexaoBanco().pegarConexao();
    }
    
    public void salvar(Funcionarios obj){
        try {
            //criar SQL
            String sql = "insert into tb_funcionarios(nome,apelido,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)" 
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            // preparar conexão SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getApelido());
            stmt.setString(3,obj.getRg());
            stmt.setString(4,obj.getCpf());
            stmt.setString(5,obj.getEmail());
            stmt.setString(6,obj.getSenha());
            stmt.setString(7,obj.getCargo());
            stmt.setString(8,obj.getNivel_acesso());
            stmt.setString(9,obj.getTelefone());
            stmt.setString(10,obj.getCelular());
            stmt.setString(11,obj.getCep());
            stmt.setString(12,obj.getEndereco());
            stmt.setInt(13,obj.getNumero());
            stmt.setString(14,obj.getComplemento());
            stmt.setString(15,obj.getBairro());
            stmt.setString(16,obj.getCidade());
            stmt.setString(17,obj.getEstado());
            // executar sql
            stmt.execute();
            //fechar conexão
            stmt.close();
            JOptionPane.showMessageDialog(null,"Funcionário Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar Dados No Banco" + e.getMessage());
        }
    }
     public void Editar(Funcionarios obj){
        try {
            //criar SQL
            String sql = "update tb_funcionarios set nome=?,apelido=?,rg=?,cpf=?,email=?,senha=?,cargo=?,nivel_acesso=?,telefone=?,celular=?,cep=?,endereco=?," 
                    + "numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";
            // preparar conexão SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getApelido());
            stmt.setString(3,obj.getRg());
            stmt.setString(4,obj.getCpf());
            stmt.setString(5,obj.getEmail());
            stmt.setString(6,obj.getSenha());
            stmt.setString(7,obj.getCargo());
            stmt.setString(8,obj.getNivel_acesso());
            stmt.setString(9,obj.getTelefone());
            stmt.setString(10,obj.getCelular());
            stmt.setString(11,obj.getCep());
            stmt.setString(12,obj.getEndereco());
            stmt.setInt(13,obj.getNumero());
            stmt.setString(14,obj.getComplemento());
            stmt.setString(15,obj.getBairro());
            stmt.setString(16,obj.getCidade());
            stmt.setString(17,obj.getEstado());
            stmt.setInt(18,obj.getId());
            // executar sql
            stmt.execute();
            //fechar conexão
            stmt.close();
            JOptionPane.showMessageDialog(null,"Funcionário Editado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao Editar Dados No Banco" + e.getMessage());
        }
    }
    public void Excluir(Funcionarios obj){
        try {
            String sql = "delete from tb_funcionarios where id=?";
            // preparar conexão SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,obj.getId());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Funcionário excluido com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir funcionário" + e);
        }
    }
    public Funcionarios BuscarFuncionarios(String nome){
        try {
            String sql = "select * from tb_funcionarios where nome =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs =  stmt.executeQuery();
            Funcionarios obj = new Funcionarios();
            if(rs.next()){
                obj.setId(rs.getInt("id")); //1
                obj.setNome(rs.getString("nome"));//2
                obj.setApelido(rs.getString("apelido"));//2
                obj.setRg(rs.getString("rg"));//3
                obj.setCpf(rs.getString("cpf"));//4
                obj.setEmail(rs.getString("email"));//5
                obj.setSenha(rs.getString("senha"));//
                obj.setCargo(rs.getString("cargo"));//
                obj.setNivel_acesso(rs.getString("nivel_acesso"));//
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
            JOptionPane.showMessageDialog(null,"Erro ao resgatar dados dos funcionários" + e.getMessage());
        }
        return null;
    }
    public List<Funcionarios>listar(){
    List<Funcionarios> lista = new ArrayList<>();
        try {
            String sql = "select * from tb_funcionarios ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id")); //1
                obj.setNome(rs.getString("nome"));//2
                obj.setApelido(rs.getString("apelido"));//2
                obj.setRg(rs.getString("rg"));//3
                obj.setCpf(rs.getString("cpf"));//4
                obj.setEmail(rs.getString("email"));//5
                obj.setSenha(rs.getString("senha"));//
                obj.setCargo(rs.getString("cargo"));//
                obj.setNivel_acesso(rs.getString("nivel_acesso"));//
                obj.setTelefone(rs.getString("telefone"));//6
                obj.setCelular(rs.getString("celular"));//7
                obj.setCep(rs.getString("cep"));//8
                obj.setEndereco(rs.getString("endereco"));//9
                obj.setNumero(rs.getInt("numero"));//10
                obj.setComplemento(rs.getString("complemento"));//11
                obj.setBairro(rs.getString("bairro"));//12
                obj.setCidade(rs.getString("cidade"));//13
                obj.setEstado(rs.getString("estado"));//14 
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao resgatar dados");
        }
        return null;
}
         public List<Funcionarios>filtrar(String nome){
    List<Funcionarios> lista = new ArrayList<>();
        try {
            String sql = "select * from tb_funcionarios where nome like ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id")); //1
                obj.setNome(rs.getString("nome"));//2
                obj.setApelido(rs.getString("apelido"));//2
                obj.setRg(rs.getString("rg"));//3
                obj.setCpf(rs.getString("cpf"));//4
                obj.setEmail(rs.getString("email"));//5
                obj.setSenha(rs.getString("senha"));//
                obj.setCargo(rs.getString("cargo"));//
                obj.setNivel_acesso(rs.getString("nivel_acesso"));//
                obj.setTelefone(rs.getString("telefone"));//6
                obj.setCelular(rs.getString("celular"));//7
                obj.setCep(rs.getString("cep"));//8
                obj.setEndereco(rs.getString("endereco"));//9
                obj.setNumero(rs.getInt("numero"));//10
                obj.setComplemento(rs.getString("complemento"));//11
                obj.setBairro(rs.getString("bairro"));//12
                obj.setCidade(rs.getString("cidade"));//13
                obj.setEstado(rs.getString("estado"));//14 
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao resgatar dados");
        }
        return null;
}
    public void EfetuarLogin(String apelido, String senha){
        try {
            String sql = "select * from tb_funcionarios where apelido=? and senha=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,apelido);
            stmt.setString(2,senha);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Seja Bem Vindo!");
                Principal tela = new Principal();
                tela.setVisible(true);
                
            }
            else{
                
                JOptionPane.showMessageDialog(null,"Usuario ou senha incorretos");
                
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar dados" + e);
        }
    }
    
    
    
    
}
