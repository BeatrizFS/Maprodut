/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.DAOCliente;
import Model.Cliente;
import java.util.List;

/**
 *
 * @author beatr
 */
public class ControleCliente {
    
    DAOCliente dAOCliente = new DAOCliente();

    /**
     * salvar um novo cliente no banco de dados 
     * @param modelCliente
     * @return boolean
     */
    public boolean salvarClienteControle(Cliente modelCliente) {
        return this.dAOCliente.salvarUsuarioDAO(modelCliente);
    }
    
    //Listar os dados na tabela 
    
    public List<Cliente> getListaClienteControle() {
        return this.dAOCliente.getListaClienteDAO();
    }
    /**
     * Excluir um Cliente do banco de dados pelo código
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirClienteControle(int pCodigo) {
        return this.dAOCliente.excluirUsuarioDAO(pCodigo);
    }    

    //Exibir os dados ao clicar em uma linha da tabela + botão exibir
    public Cliente getClienteControle(int pCodigo) {
        return this.dAOCliente.getClienteDAO(pCodigo);
    }
    
    //Verifica se o cliente está na tabela 
    public boolean validarClienteController(Cliente cliente) {
        return this.dAOCliente.validarCliente(cliente);
    }
    
}
