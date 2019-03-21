
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
    JOptionPane msg = new JOptionPane();
    private Connection con;
    

    public EquipeDao() {
        this.con = this.getConnection();
    }

    public void inserir(Equipe eq) throws SQLException {

        String sql = "insert into equipe (id, nome, descricao)"
                + "values (?, ?, ?)";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, eq.getId());
            st.setString(2, eq.getNome());
            st.setString(3, eq.getDescricao());

            st.execute();
            st.close();
        }
    }

    public Equipe getEquipe(int idEquipe) throws SQLException {
        String sql = "select * from equipe where id = ?";
        Equipe eq = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idEquipe);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    eq = new Equipe();
                    eq.setId(rs.getInt("id"));
                    eq.setNome(rs.getString("nome"));
                    eq.setDescricao(rs.getString("descricao"));
                }
            }
            st.close();
        }

        this.con.close();
        return eq;

    }
    
    public List<Equipe> listarEquipe() throws SQLException {
        String sql = "select * from equipe";
        List<Equipe> equipe = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            equipe = new ArrayList<Equipe>();

            while (rs.next()) {
                Equipe eq = new Equipe();
                eq.setId(rs.getInt("id"));
                eq.setNome(rs.getString("nome"));
                eq.setDescricao(rs.getString("descricao"));
                equipe.add(eq);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return equipe;
    }
    
    public void alterar(Equipe eq) throws SQLException {

        String sql2 = "insert into equipe (id ,nome, descricao)"
                + "values (?, ?, ?)";
        
        String sql = "update equipe set nome = ?, descricao = ? where id = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, eq.getNome());
            st.setString(2, eq.getDescricao());
            st.setInt(3, eq.getId());
            
            st.execute();
            st.close();
        }


        this.con.close();

    }
    
     public void eliminar(int id) throws SQLException {

        String sql = "delete from equipe where id = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1,id);
            st.execute();
            st.close();
        }

        this.con.close();

    }
}
