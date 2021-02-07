/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.DAOEmpresa;
import Model.Empresa;
import java.util.List;

/**
 *
 * @author beatr
 */
public class ControleEmpresa {
    
    DAOEmpresa dAOEmpresa = new DAOEmpresa();
    
    /**
     * salvar uma nova empresa no banco de dados
     * @param modelEmpresa
     * @return boolean
     */
    public boolean salvarEmpresaControle(Empresa modelEmpresa) {
        return this.dAOEmpresa.salvarEmpresaDAO(modelEmpresa);
    }

    //Lista os dados na tabela
    public List<Empresa> getListaEmpresaControle() {
        return this.dAOEmpresa.getListaEmpresaDAO();
    }
    
    /**
     * Excluir um Empresa do banco de dados pelo código
     * @param codigo
     * @return boolean
     */
    public boolean excluirEmpresaControle(int codigo) {
        return this.dAOEmpresa.excluirEmpresaDAO(codigo);
    }
    //Exibir os dados ao clicar em uma linha da tabela + botão exibir
    public Empresa getEmpresaControle(int pCodigo) {
        return this.dAOEmpresa.getEmpresaDAO(pCodigo);
    }
    
    
}
