/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.DAOProduto;
import Model.Produtos;
import java.util.List;

/**
 *
 * @author beatr
 */
public class ControleProdutos {
    
    DAOProduto dAOProdutos = new DAOProduto();
    
    /**
     * salva um novo produto no banco de dados
     * @param modelProdutos
     * @return boolean
     */

    public boolean salvarProdutosControle(Produtos modelProdutos) {
        return this.dAOProdutos.salvarProdutosDAO(modelProdutos);
    }
}
