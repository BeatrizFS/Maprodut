/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Empresa;
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
 * Utilizamos
 * conectar(); para conectar com o banco de dados
 * desconectar(); para desconectar com o bando de dados
 */

/**
 * Herança
 * @author beatr
 */
public class DAOEmpresa extends ConexaoSQLite{
    
    public boolean salvarEmpresaDAO(Empresa pEmpresa) {
        conectar();
        //executar sql
        String sql = "INSERT INTO tbl_empresa("
                +"emp_nome, "
                +"emp_email, "
                +"emp_fone, "
                +"emp_cnpj, "
                +"emp_end, "
                +"emp_bairro, "
                +"emp_cidade, "
                +"emp_numero, "
                +"emp_estado) "
                +"VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pEmpresa.getEmpNome());
            preparedStatement.setString(2, pEmpresa.getEmpEmail());
            preparedStatement.setString(3, pEmpresa.getEmpFone());
            preparedStatement.setString(4, pEmpresa.getEmpCNPJ());
            preparedStatement.setString(5, pEmpresa.getEmpEnd());
            preparedStatement.setString(6, pEmpresa.getEmpBairro());
            preparedStatement.setString(7, pEmpresa.getEmpCidade());
            preparedStatement.setString(8, pEmpresa.getEmpNumero());
            preparedStatement.setString(9, pEmpresa.getEmpEstado());
            preparedStatement.executeUpdate();            
        }catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        desconectar();
        return true;
    }
   /**
     * Faz com que os dados aparecam na tabela 
     * ArrayLista
     */    
    public List<Empresa> getListaEmpresaDAO(){
        List<Empresa> listaEmpresa = new ArrayList<>();
        Empresa modelEmpresa = new Empresa();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_emp_id, "
                +"emp_nome, "
                +"emp_email, "
                +"emp_fone, "
                +"emp_cnpj, "
                +"emp_end, "
                +"emp_bairro, "
                +"emp_cidade, "
                +"emp_numero, "
                +"emp_estado "
                +" FROM tbl_empresa";
        try{
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelEmpresa = new Empresa();
                modelEmpresa.setEmpId(resultSet.getInt("pk_emp_id"));
                modelEmpresa.setEmpNome(resultSet.getString("emp_nome"));
                modelEmpresa.setEmpEmail(resultSet.getString("emp_email"));
                modelEmpresa.setEmpFone(resultSet.getString("emp_fone"));
                modelEmpresa.setEmpCNPJ(resultSet.getString("emp_cnpj"));
                modelEmpresa.setEmpEnd(resultSet.getString("emp_end"));
                modelEmpresa.setEmpBairro(resultSet.getString("emp_bairro"));
                modelEmpresa.setEmpCidade(resultSet.getString("emp_cidade"));
                modelEmpresa.setEmpNumero(resultSet.getString("emp_numero"));
                modelEmpresa.setEmpEstado(resultSet.getString("emp_estado"));
                listaEmpresa.add(modelEmpresa);
            }
        }catch (Exception ex) {
            System.err.println(ex);
        }
        desconectar();
        return listaEmpresa;
    }
    /**
     * Exclui uma empresa do banco de dados pelo codigo
     * @param pCodigo
     * @return boolean 
     */
    public boolean excluirEmpresaDAO(int pCodigo){
        conectar();
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM tbl_empresa WHERE pk_emp_id = '"+pCodigo+"'";
        preparedStatement = this.criarPreparedStatement(sql);
        try{
            preparedStatement.executeUpdate();            
        }catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        }finally{
            if(preparedStatement != null) {
                try{
                    preparedStatement.close();                    
                }catch (SQLException ex) {
                   Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
                   ex.printStackTrace();
                }
            }
        }
        this.desconectar();
        return true;
    }
    public Empresa getEmpresaDAO(int pCodigoEmpresa){
        Empresa modelEmpresa = new Empresa();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_emp_id, "
                +"emp_nome, "
                +"emp_email, "
                +"emp_fone, "
                +"emp_cnpj, "
                +"emp_end, "
                +"emp_bairro, "
                +"emp_cidade, "
                +"emp_numero, "
                +"emp_estado "
                +" FROM tbl_empresa WHERE pk_emp_id = '"+pCodigoEmpresa+"'";
        
        preparedStatement = criarPreparedStatement(sql);
        try{
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                modelEmpresa= new Empresa();
                modelEmpresa.setEmpId(resultSet.getInt("pk_emp_id"));
                modelEmpresa.setEmpNome(resultSet.getString("emp_nome"));
                modelEmpresa.setEmpEmail(resultSet.getString("emp_email"));
                modelEmpresa.setEmpFone(resultSet.getString("emp_fone"));
                modelEmpresa.setEmpCNPJ(resultSet.getString("emp_cnpj"));
                modelEmpresa.setEmpEnd(resultSet.getString("emp_end"));
                modelEmpresa.setEmpBairro(resultSet.getString("emp_bairro"));
                modelEmpresa.setEmpCidade(resultSet.getString("emp_cidade"));
                modelEmpresa.setEmpNumero(resultSet.getString("emp_numero"));
                modelEmpresa.setEmpEstado(resultSet.getString("emp_estado"));
    
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e) {
            System.err.println(e);
        }
        desconectar();
        return modelEmpresa;
    }
        /**
     * Pesquisa os Empresa na tabela
     * @param empresa
     * @return 
     */
    public List<Empresa> readForEmpresa(String empresa){
        conectar();
        Empresa modelEmpresa = new Empresa();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<Empresa> listaEmpresa = new ArrayList<>();
        
        String sql = "SELECT pk_emp_id, "
                +"emp_nome, "
                +"emp_email, "
                +"emp_fone, "
                +"emp_cnpj, "
                +"emp_end, "
                +"emp_bairro, "
                +"emp_cidade, "
                +"emp_numero, "
                +"emp_estado "
                +" FROM tbl_empresa WHERE emp_nome LIKE ?";
        try{
            preparedStatement = criarPreparedStatement(sql);
            preparedStatement.setString(1, "%"+empresa+"%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelEmpresa = new Empresa();
                modelEmpresa.setEmpId(resultSet.getInt("pk_emp_id"));
                modelEmpresa.setEmpNome(resultSet.getString("emp_nome"));
                modelEmpresa.setEmpEmail(resultSet.getString("emp_email"));
                modelEmpresa.setEmpFone(resultSet.getString("emp_fone"));
                modelEmpresa.setEmpCNPJ(resultSet.getString("emp_cnpj"));
                modelEmpresa.setEmpEnd(resultSet.getString("emp_end"));
                modelEmpresa.setEmpBairro(resultSet.getString("emp_bairro"));
                modelEmpresa.setEmpCidade(resultSet.getString("emp_cidade"));
                modelEmpresa.setEmpNumero(resultSet.getString("emp_numero"));
                modelEmpresa.setEmpEstado(resultSet.getString("emp_estado"));
                listaEmpresa.add(modelEmpresa);
            }
        }catch (Exception ex) {
            System.err.println(ex);
        }
        desconectar();
        return listaEmpresa;
    }    

}
