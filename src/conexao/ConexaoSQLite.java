/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author beatriz
 */
public class ConexaoSQLite {

    private Connection conexao;

    /**
     * Conecta a um banco de dados (cria o banco se ele não existir)
     *
     * @return
     */
    public boolean conectar() {

        try {
            String url = "jdbc:sqlite:BancoDados/database.db"; //Caminho do banco de dados
            
            this.conexao = DriverManager.getConnection(url);
            System.out.println("Conectado");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false; //Se não conectar com o banco de dados
        }

        return true; //Se conectar com o banco de dados
    }
    
    /**
     * Desconecta do banco de dados
     * @return 
     */

    public boolean desconectar() {
        //try-catch para tratar exceções 
        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
                System.out.println("desconectado");
            }
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false; //Se não desconectar com o banco de daos 
        }
        return true; //Se desconectar com o banco de daos 
    }

    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @return
     */
    public Statement criarStatement() {
        try {
            return this.conexao.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @return
     */
    public PreparedStatement criarPreparedStatement(String pSQL, int RETURN_GENERATED_KEYS) {
        try {
            System.out.println("Executando");
            return conexao.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Connection getConexao() {
        return this.conexao;
    }

    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @return
     */
    public PreparedStatement criarPreparedStatement(String sql) {
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException e) {
            return null;
        }
    }

}
