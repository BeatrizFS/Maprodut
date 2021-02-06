/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produtos;
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
public class DAOProdutos extends ConexaoSQLite {
    
    public boolean salvarProdutoDAO(Produtos pProduto){
        conectar();
        
        String sql = "INSERT INTO tbl_produto("
                +"pro_empresa, "
                +"pro_descricao, "
                +"pro_marca, "
                +"pro_preco) "
                +"VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pProduto.getProEmpresa());
            preparedStatement.setString(2, pProduto.getProDescricao());
            preparedStatement.setString(3, pProduto.getProMarca());
            preparedStatement.setDouble(4, pProduto.getProPreco());
            preparedStatement.executeUpdate();
        }catch (SQLException ex){
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        desconectar();
        return true;
    }
    
    public List<Produtos> getListaProdutosDAO(){
        List<Produtos> listaProdutos = new ArrayList<>();
        Produtos modelProdutos = new Produtos();
        conectar();
        ResultSet resultSet =null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_pro_id, "
                +"pro_empresa, "
                +"pro_descricao, "
                +"pro_marca, "
                +"pro_preco "
                +" FROM tbl_produto";
        try{
            preparedStatement = criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelProdutos = new Produtos();
                modelProdutos.setProId(resultSet.getInt("pk_pro_id"));
                modelProdutos.setProEmpresa(resultSet.getString("pro_empresa"));
                modelProdutos.setProDescricao(resultSet.getString("pro_descricao"));
                modelProdutos.setProMarca(resultSet.getString("pro_marca"));
                modelProdutos.setProPreco(resultSet.getDouble("pro_preco"));
                listaProdutos.add(modelProdutos);                                    
            }
        }catch (Exception ex) {
            System.err.println(ex);
        }
        desconectar();
        return listaProdutos;
    }
    public boolean excluirProdutosDAO(int pCodigo) {
        conectar();
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM tbl_produto WHERE pk_pro_id = '"+pCodigo+"'";
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
                }catch (SQLException ex){
                    Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }
        }
        this.desconectar();
        return true;
    }
    public Produtos getProdutosDAO(int pCodigoProdutos){
        Produtos modelProdutos = new Produtos();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_pro_id, "
                +"pro_empresa, "
                +"pro_descricao, "
                +"pro_marca, "
                +"pro_preco "
                +" FROM tbl_produto WHERE pk_pro_id = '"+pCodigoProdutos+"'";
        
        preparedStatement = criarPreparedStatement(sql);
        try{
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                modelProdutos= new Produtos();
                modelProdutos.setProId(resultSet.getInt("pk_pro_id"));
                modelProdutos.setProEmpresa(resultSet.getString("pro_empresa"));
                modelProdutos.setProDescricao(resultSet.getString("pro_empresa"));
                modelProdutos.setProMarca(resultSet.getString("pro_marca"));
                modelProdutos.setProPreco(resultSet.getDouble("pro_preco"));
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e) {
            System.err.println(e);
        }
        desconectar();
        return modelProdutos;
    }
        public List<Produtos> readForProdutos(String descricao){
        conectar();    
        Produtos modelProdutos = new Produtos();
        ResultSet resultSet =null;
        PreparedStatement preparedStatement = null;
        List<Produtos> listaProdutos = new ArrayList<>();
        
        String sql = "SELECT pk_pro_id, "
                +"pro_empresa, "
                +"pro_descricao, "
                +"pro_marca, "
                +"pro_preco "
                +" FROM tbl_produto WHERE pro_descricao LIKE ?";
        try{
            preparedStatement = criarPreparedStatement(sql);
            preparedStatement.setString(1, "%"+descricao+"%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                modelProdutos = new Produtos();
                modelProdutos.setProId(resultSet.getInt("pk_pro_id"));
                modelProdutos.setProEmpresa(resultSet.getString("pro_empresa"));
                modelProdutos.setProDescricao(resultSet.getString("pro_descricao"));
                modelProdutos.setProMarca(resultSet.getString("pro_marca"));
                modelProdutos.setProPreco(resultSet.getDouble("pro_preco"));
                listaProdutos.add(modelProdutos);                                    
            }
        }catch (Exception ex) {
            System.err.println(ex);
        }
        desconectar();
        return listaProdutos;
    }
}
