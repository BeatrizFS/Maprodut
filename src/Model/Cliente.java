/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Foi criada a classe Cliente 
 * @author beatriz
 */

//Abstração 
public class Cliente {
    //Abaixo estão os atributos referentes a classe Cliente
    private int usuId;
    private String usuNome;
    private String usuCPF;
    private String usuEmail;
    private String usuLogin;
    private String usuSenha;

/**
 * Fizemos os get (pegar) e set (setar)
 * Encapsulamento 
 */    
    /**
     * @return the usuId
     */
    public int getUsuId() {
        return usuId;
    }

    /**
     * @param usuId the usuId to set
     */
    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }

    /**
     * @return the usuNome
     */
    public String getUsuNome() {
        return usuNome;
    }

    /**
     * @param usuNome the usuNome to set
     */
    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    /**
     * @return the usuCPF
     */
    public String getUsuCPF() {
        return usuCPF;
    }

    /**
     * @param usuCPF the usuCPF to set
     */
    public void setUsuCPF(String usuCPF) {
        this.usuCPF = usuCPF;
    }

    /**
     * @return the usuEmail
     */
    public String getUsuEmail() {
        return usuEmail;
    }

    /**
     * @param usuEmail the usuEmail to set
     */
    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

    /**
     * @return the usuLogin
     */
    public String getUsuLogin() {
        return usuLogin;
    }

    /**
     * @param usuLogin the usuLogin to set
     */
    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    /**
     * @return the usuSenha
     */
    public String getUsuSenha() {
        return usuSenha;
    }

    /**
     * @param usuSenha the usuSenha to set
     */
    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

}
