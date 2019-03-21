
package SistGestDao;

import SistGestDao.ConnectionFactory;
import SistGestModelo.Agenda;
import SistGestModelo.Colaborador;
import SistGestViews.AgendaColaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgendaDao extends ConnectionFactory  {
    private Connection con;
   

    public AgendaDao() {
        this.con = this.getConnection();
    }

    public void inserir(Agenda agenda) throws SQLException {

        String sql = "insert into agenda "
                + "(dataCriacao, dataCompromisso, titulo, descricao, colaborador_id, equipe_id) "
                + "values (?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, agenda.getDataCriacao());
            st.setString(2, agenda.getDataCompromisso());
            st.setString(3, agenda.getTitulo());
            st.setString(4, agenda.getDescricao());
            st.setInt(5, agenda.getColaborador_id());
            st.setInt(6, agenda.getEquipe_id());
            

            st.execute();
            st.close();
        }

        this.con.close();

    }
    
    
    public void eliminar(int colaborador_id) throws SQLException {

        String sql = "delete from agenda where colaborador_id = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, colaborador_id);
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void alterar(Agenda comp) throws SQLException {

        String sql2 = "insert into agenda "
                + "(dataCriacao, dataCompromisso, "
                + "titulo, descricao)"
                + "values (?, ?, ?, ?);";

        String sql = "update agenda set dataCriacao = ?, dataCompromisso = ?, titulo = ?, "
                + "descricao = ?, where colaborador_id = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, comp.getDataCriacao());
            st.setString(2, comp.getDataCompromisso());
            st.setString(3, comp.getTitulo());
            st.setString(4, comp.getDescricao());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<Agenda> listaCompromisso() throws SQLException {
        String sql = "select * from agenda";
        List<Agenda> clientes = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            clientes = new ArrayList<Agenda>();

            while (rs.next()) {
                Agenda c = new Agenda();
                c.setDataCriacao(rs.getString("dataCriacao"));
                c.setDataCompromisso(rs.getString("dataCompromisso"));
                c.setTitulo(rs.getString("titulo"));
                c.setDescricao(rs.getString("descricao"));
                c.setColaborador_id(rs.getInt("colaborador_id"));
                c.setEquipe_id(rs.getInt("equipe_id"));

                clientes.add(c);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return clientes;
    }

    public Agenda getCompromisso(int colaborador_id) throws SQLException {
        String sql = "select * from agenda where colaborador_id = ?";
        Agenda compr = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, colaborador_id);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    compr = new Agenda();
                    compr.setDataCriacao(rs.getString("dataCriacao"));
                    compr.setDataCompromisso(rs.getString("dataCompromisso"));
                    compr.setTitulo(rs.getString("titulo"));
                    compr.setDescricao(rs.getString("descricao"));
                    compr.setColaborador_id(rs.getInt("colaborador_id"));
                }
            }
            st.close();
        }

        this.con.close();
        return compr;
    }
    
    /**
     *
     * @param equipe_id
     * @return
     * @throws SQLException
     */
    public Agenda getCompromissoEquipe(int equipe_id) throws SQLException {
        String sql = "select * from agenda where equipe_id = ?";
        Agenda compr = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, equipe_id);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    compr = new Agenda();
                    compr.setDataCriacao(rs.getString("dataCriacao"));
                    compr.setDataCompromisso(rs.getString("dataCompromisso"));
                    compr.setTitulo(rs.getString("titulo"));
                    compr.setDescricao(rs.getString("descricao"));
                    compr.setEquipe_id(rs.getInt("equipe_id"));
                }
            }
            st.close();
        }

        this.con.close();
        return compr;
    }

}
