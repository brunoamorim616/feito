
package SistGestDao;

import SistGestModelo.Colaborador;
import SistGestModelo.Equipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EquipeDao extends ConnectionFactory {
    // define msg como uma nova JOptionPane
    JOptionPane msg = new JOptionPane();
    // declara Con como connection private
    private Connection con;
    
    //metodo par aconseguir a conexao com o banco de dados
    public EquipeDao() {
        this.con = this.getConnection();
    }
    //metodo de inserir um equipe no sistema
    public void inserir(Equipe eq) throws SQLException {
    //comando para o banco de dados
        String sql = "insert into equipe (id, nome, descricao)"
                + "values (?, ?, ?)";
        // executa o comando do banco de dados e define o que vai entrar em qual ordem 
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, eq.getId());
            st.setString(2, eq.getNome());
            st.setString(3, eq.getDescricao());
            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }
    }
    //metodo de puxar uma equipe no sistema
    public Equipe getEquipe(int idEquipe) throws SQLException {
        //comando para o banco de dados
        String sql = "select * from equipe where id = ?";
        Equipe eq = null;
        // executa o comando do banco de dados =
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idEquipe);
            //coleta dados para o banco de dados
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    eq = new Equipe();
                    eq.setId(rs.getInt("id"));
                    eq.setNome(rs.getString("nome"));
                    eq.setDescricao(rs.getString("descricao"));
                }
            }
            // fecha a conexao com o bando de dados
            st.close();
        }
        //finaliza a variavel con
        this.con.close();
        //retorna uma equipe
        return eq;

    }
    //metodo de listar uma equipe no sistema
    public List<Equipe> listarEquipe() throws SQLException {
        //comando para o banco de dados
        String sql = "select * from equipe";
        List<Equipe> equipe = null;
        // executa o comando do banco de dados 
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            // criacao de um array list equipe
            equipe = new ArrayList<Equipe>();
            //coleta de dados para o banco de dados
            while (rs.next()) {
                Equipe eq = new Equipe();
                eq.setId(rs.getInt("id"));
                eq.setNome(rs.getString("nome"));
                eq.setDescricao(rs.getString("descricao"));
                //adiciona uma nova equipe no arraylist 
                equipe.add(eq);
            }
            
            rs.close();
            // fecha a conexao com o bando de dados
            st.close();

        }
         //finaliza a variavel con
        this.con.close();
        //retorna arraylist equipe
        return equipe;
    }
    //metodo de editar  uma equipe no sistema
    public void alterar(Equipe eq) throws SQLException {
        //comando para o banco de dados
        String sql2 = "insert into equipe (id ,nome, descricao)"
                + "values (?, ?, ?)";
        //comando para o banco de dados
        String sql = "update equipe set nome = ?, descricao = ? where id = ?";
         // executa o comando do banco de dados e define o que vai entrar em qual ordem 
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, eq.getNome());
            st.setString(2, eq.getDescricao());
            st.setInt(3, eq.getId());
            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }

         //finaliza a variavel con
        this.con.close();

    }
    //metodo de eliminar  uma equipe no sistema
     public void eliminar(int id) throws SQLException {
         //comando para o banco de dados
        String sql = "delete from equipe where id = ?";
         // executa o comando do banco de dados e define o que vai entrar em qual ordem 
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1,id);
            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }
         //finaliza a variavel con
        this.con.close();

    }
}
