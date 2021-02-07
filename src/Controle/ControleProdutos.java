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
    /**
     * Excluir um Produto do banco de dados pelo código
     * @param codigo
     * @return boolean
     */
    public boolean excluirProdutosControle(int codigo) {
        return this.dAOProdutos.excluirProdutosDAO(codigo);
    }
   /**
     * salvar um novo produto no banco de dados 
     * @param modelProdutos
     * @return boolean
     */
    public boolean salvarProdutosControle(Produtos modelProdutos) {
        return this.dAOProdutos.salvarProdutoDAO(modelProdutos);
    }
    //Listar os dados na tabela 
    public List<Produtos> getListaProdutosControle() {
        return this.dAOProdutos.getListaProdutosDAO();
    }
    //Exibir os dados ao clicar em uma linha da tabela + botão exibi
    public Produtos getProdutosControle(int pCodigo) {
        return this.dAOProdutos.getProdutosDAO(pCodigo);
    }
           
}
