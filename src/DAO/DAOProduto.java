/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produtos;
import conexao.ConexaoSQLite;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author beatr
 */
public class DAOProduto extends ConexaoSQLite{
    
    public boolean salvarProdutosDAO(Produtos pProduto){
        conectar();
        //executar sql
        String sql = "INSERT INTO tbl_produto("
                +"pro_empresa, "
                +"pro_descricao, "
                +"pro_marca, "
                +"pro_preco, "
                +"pro_quat) "
                +"VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            preparedStatement.setString(1, pProduto.getProEmpresa());
            preparedStatement.setString(2, pProduto.getProDescricao());
            preparedStatement.setString(3, pProduto.getProMarca());
            preparedStatement.setDouble(4, pProduto.getProPreco());
            preparedStatement.setInt(5, pProduto.getProQuat());
            preparedStatement.executeUpdate();           
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desconectar();
        return true;
    }
    public List<Produtos> getListaProdutosDAO(){
        List<Produtos> listaProdutos = new ArrayList<>();
        Produtos modelProdutos = new Produtos();
        conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT pk_pro_is, "
                +"pro_empresa, "
                +"pro_descricao, "
                +"pro_marca, "
                +"pro_preco, "
                +"pro_quantidade "
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
                modelProdutos.setProQuat(resultSet.getInt("pro_quantidade"));
                listaProdutos.add(modelProdutos);
            }
        }catch (Exception ex){
            System.err.println(ex);
        }
        desconectar();
        return listaProdutos;
        
    }
    
}
