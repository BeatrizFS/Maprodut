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

    public List<Empresa> getListaEmpresaControle() {
        return this.dAOEmpresa.getListaEmpresaDAO();
    }
    
    
}
