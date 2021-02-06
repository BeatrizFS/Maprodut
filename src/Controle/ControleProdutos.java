/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.DAOProdutos;
import Model.Produtos;
import java.util.List;

/**
 *
 * @author beatr
 */
public class ControleProdutos {
    
    DAOProdutos dAOProdutos = new DAOProdutos();

    public boolean excluirProdutosControle(int codigo) {
        return this.dAOProdutos.excluirProdutosDAO(codigo);
    }

    public boolean salvarProdutosControle(Produtos modelProdutos) {
        return this.dAOProdutos.salvarProdutoDAO(modelProdutos);
    }

    public List<Produtos> getListaProdutosControle() {
        return this.dAOProdutos.getListaProdutosDAO();
    }

    public Produtos getProdutosControle(int pCodigo) {
        return this.dAOProdutos.getProdutosDAO(pCodigo);
    }
           
}
