/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Foi criada a classe Produtos
 * @author beatriz
 */
public class Produtos {
    //Abaixo estão os atributos referentes a classe Produtos
    private int proId;
    private String proEmpresa;
    private String proDescricao;
    private String proMarca;
    private Double proPreco;
    

    /**
     * @return the proId
     */
    public int getProId() {
        return proId;
    }

    /**
     * @param proId the proId to set
     */
    public void setProId(int proId) {
        this.proId = proId;
    }
    
        /**
     * @return the proEmpresa
     */
    public String getProEmpresa() {
        return proEmpresa;
    }

    /**
     * @param proEmpresa the proEmpresa to set
     */
    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }
    
    /**
     * @return the proDescricao
     */
    public String getProDescricao() {
        return proDescricao;
    }

    /**
     * @param proDescricao the proDescricao to set
     */
    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    /**
     * @return the proMarca
     */
    public String getProMarca() {
        return proMarca;
    }

    /**
     * @param proMarca the proMarca to set
     */
    public void setProMarca(String proMarca) {
        this.proMarca = proMarca;
    }

    /**
     * @return the proPreco
     */
    public Double getProPreco() {
        return proPreco;
    }

    /**
     * @param proPreco the proPreco to set
     */
    public void setProPreco(Double proPreco) {
        this.proPreco = proPreco;
    }
        
}
