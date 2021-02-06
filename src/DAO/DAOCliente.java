/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import conexao.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

        
/**
 *
 * @author beatr
 */
public class DAOCliente extends ConexaoSQLite {
    
    public boolean salvarUsuarioDAO(Cliente pCliente){
        conectar();
        //executar sql
        String sql = "INSERT INTO tbl_cliente("
                +"usu_nome, "
                +"usu_email, "
                +"usu_cpf, "
                +"usu_login, "
                +"usu_senha) "
                +"VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pCliente.getUsuNome());
            preparedStatement.setString(2, pCliente.getUsuEmail());
            preparedStatement.setString(3, pCliente.getUsuCPF());
            preparedStatement.setString(4, pCliente.getUsuLogin());
            preparedStatement.setString(5, pCliente.getUsuSenha());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        desconectar();
        return true;
    }
    
    public List<Cliente> getListaClienteDAO(){
        List<Cliente> listaCliente = new ArrayList<>();
        Cliente modelCliente = new Cliente();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_usu_id, "
                +"usu_nome, "
                +"usu_email, "
                +"usu_cpf, "
                +"usu_login "
                +" FROM tbl_cliente";
        
        try{
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelCliente = new Cliente();
                modelCliente.setUsuId(resultSet.getInt("pk_usu_id"));
                modelCliente.setUsuNome(resultSet.getString("usu_nome"));
                modelCliente.setUsuEmail(resultSet.getString("usu_email"));
                modelCliente.setUsuCPF(resultSet.getString("usu_cpf"));
                modelCliente.setUsuLogin(resultSet.getString("usu_login"));
                listaCliente.add(modelCliente);
            }
        }catch (Exception ex){
            System.err.println(ex);
        }
        desconectar();
        return listaCliente;
    }
    
    /**
     * Excluir um Cliente do banco de dados pelo codigo
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirUsuarioDAO(int pCodigo){
        conectar();
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM tbl_cliente WHERE pk_usu_id = '"+pCodigo+"'";
        preparedStatement = this.criarPreparedStatement(sql);
        try {
         preparedStatement.executeUpdate();   
        }catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        }finally{
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                }catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.desconectar();      
        return true;
    }
    /**
     * Exibir os dados ao clicar em uma linha da tabela
     * @param pCodigoCliente
     * @return 
     */
    public Cliente getClienteDAO(int pCodigoCliente){
        Cliente modelCliente = new Cliente();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_usu_id, "
                +"usu_nome, "
                +"usu_email, "
                +"usu_cpf, "
                +"usu_login, "
                +"usu_senha "
                +" FROM tbl_cliente WHERE pk_usu_id = '"+pCodigoCliente+"'";
        
        preparedStatement = criarPreparedStatement(sql);
        try{
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                modelCliente= new Cliente();
                modelCliente.setUsuId(resultSet.getInt("pk_usu_id"));
                modelCliente.setUsuNome(resultSet.getString("usu_nome"));
                modelCliente.setUsuEmail(resultSet.getString("usu_email"));
                modelCliente.setUsuCPF(resultSet.getString("usu_cpf"));
                modelCliente.setUsuLogin(resultSet.getString("usu_login"));
                modelCliente.setUsuSenha(resultSet.getString("usu_senha"));
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e) {
            System.err.println(e);
        }
        desconectar();
        return modelCliente;
    }
    
    public boolean validarCliente(Cliente Cliente){
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT "   
                +"usu_nome, "
                +"usu_email, "
                +"usu_cpf, "
                +"usu_login "
                +" FROM tbl_cliente "
                + "WHERE usu_login = '" + Cliente.getUsuLogin() + "' AND " 
                + "usu_senha = '"+ Cliente.getUsuSenha() + "'"; 
        
        System.out.println(sql);
        
            preparedStatement = criarPreparedStatement(sql);
            
        try{
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                return true; 
            } else {
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;  
        } finally {
            try{
                resultSet.close();
                preparedStatement.close();
                desconectar();
            } catch (SQLException ex){
                ex.printStackTrace();
                
            }
        }  
    }
    
    public List<Cliente> readForNome(String nome){
        conectar();
        Cliente modelCliente = new Cliente();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<Cliente> listaCliente = new ArrayList<>();
        
        String sql = "SELECT pk_usu_id, "
                +"usu_nome, "
                +"usu_email, "
                +"usu_cpf, "
                +"usu_login "
                + " FROM tbl_cliente WHERE usu_nome LIKE ?";


        try{
            preparedStatement = criarPreparedStatement(sql);
            preparedStatement.setString(1, "%"+nome+"%");
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                modelCliente = new Cliente();
                modelCliente.setUsuId(resultSet.getInt("pk_usu_id"));
                modelCliente.setUsuNome(resultSet.getString("usu_nome"));
                modelCliente.setUsuEmail(resultSet.getString("usu_email"));
                modelCliente.setUsuCPF(resultSet.getString("usu_cpf"));
                modelCliente.setUsuLogin(resultSet.getString("usu_login"));
                listaCliente.add(modelCliente);
            }
        }catch (Exception ex){
            System.err.println(ex);
        }
        desconectar();
        return listaCliente;
    }
}
