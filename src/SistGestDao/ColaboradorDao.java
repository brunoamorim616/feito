package SistGestDao;

import SistGestDao.ConnectionFactory;
import SistGestModelo.Colaborador;
import java.sql.Connection;
import SistGestViews.CadastroColaborador;
import java.awt.CardLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ColaboradorDao extends ConnectionFactory {
    // define msg como uma nova JOptionPane
    JOptionPane msg = new JOptionPane();
    // declara Con como connection private
    private Connection con;
    //metodo par aconseguir a conexao com o banco de dados
    public ColaboradorDao() {
        this.con = this.getConnection();
    }
    //metodo de inserir um colaborador no sistema
    public void inserir(Colaborador col) throws SQLException {
        //comando para o banco de dados
        String sql = "insert into colaborador (usuario, senha, nome, rua, bairro, cep, cidade, estado, telefone, tipo, equipe_id)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        // executa o comando do banco de dados e define o que vai entrar em qual ordem 
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getUsuario());
            st.setString(2, col.getSenha());
            st.setString(3, col.getNome());
            st.setString(4, col.getRua());
            st.setString(5, col.getBairro());
            st.setLong(6, col.getCep());
            st.setString(7, col.getCidade());
            st.setString(8, col.getEstado());
            st.setLong(9, col.getTelefone());
            st.setString(10, col.getTipo());
            st.setInt(11, col.getEquipe_id());

            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }
    }
    //metodo para verificacao de senha
    public Colaborador getColaborador(String usuario, String senha) throws SQLException {
        //comando no banco de dados
        String sql = "select * from colaborador where usuario = ? and senha = ?";

        Colaborador c = null;
         // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            // seta oque vai em cada campo e na ordem
            st.setString(1, usuario);
            st.setString(2, senha);
            //coleta os dados para o banco de dados 
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    c = new Colaborador();
                    c.setId(rs.getInt("id"));
                    c.setTipo(rs.getString("tipo"));
                    c.setBairro(rs.getString("bairro"));
                    c.setCep(rs.getLong("cep"));
                    c.setCidade(rs.getString("cidade"));
                    c.setEquipe_id(rs.getInt("equipe_id"));
                    c.setEstado(rs.getString("estado"));
                    c.setNome(rs.getString("nome"));
                    c.setRua(rs.getString("rua"));
                    c.setTelefone(rs.getLong("telefone"));
                    c.setSenha(rs.getString("senha"));
                    c.setUsuario(rs.getString("usuario"));
                }
            } 
            // fecha a conexao com o bando de dados
            st.close();
           
            
        }
        //finaliza a variavel con
        this.con.close();
        //retorna um novo colaborador
        return c;

    }
    
    public Colaborador getColaborador(int idColaborador) throws SQLException {
        // comando para o banco de dados
        String sql = "select * from colaborador where id = ?";

        Colaborador c = null;
         // executa a linha do banco de dados           
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idColaborador);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    //coleta os dados para o banco de dados
                    c = new Colaborador();
                    c.setId(rs.getInt("id"));
                    c.setTipo(rs.getString("tipo"));
                    c.setBairro(rs.getString("bairro"));
                    c.setCep(rs.getLong("cep"));
                    c.setCidade(rs.getString("cidade"));
                    c.setEquipe_id(rs.getInt("equipe_id"));
                    c.setEstado(rs.getString("estado"));
                    c.setNome(rs.getString("nome"));
                    c.setRua(rs.getString("rua"));
                    c.setTelefone(rs.getLong("telefone"));
                    c.setSenha(rs.getString("senha"));
                    c.setUsuario(rs.getString("usuario"));
                }
            }
            // fecha a conexao com o bando de dados
            st.close();
        }
        //finaliza a variavel con
        this.con.close();
        return c;

    }
    
    public List<Colaborador> listarColaboradores() throws SQLException {
        // comando para o banco de dados
        String sql = "select * from colaborador";
        List<Colaborador> colaborador = null;
        // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();
            //criacao de novo arraylist colaborador
            colaborador = new ArrayList<Colaborador>();
// "insert into colaborador (usuario, senha, nome, rua, bairro, cep, cidade, estado, telefone, tipo, equipe_id)"
            while (rs.next()) {
                //coleta dados para o banco de dados
                Colaborador c = new Colaborador();
                c.setId(rs.getInt("id"));
                c.setEquipe_id(rs.getInt("equipe_id"));
                c.setTipo(rs.getString("tipo"));
                c.setUsuario(rs.getString("usuario"));
                c.setSenha(rs.getString("senha"));
                c.setNome(rs.getString("nome"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setCep(rs.getLong("cep"));
                c.setTelefone(rs.getLong("telefone"));
                // add um novo colaborador para o array list 
                colaborador.add(c);
            }
            
            rs.close();
            // fecha a conexao com o bando de dados
            st.close();

        }
        //finaliza a variavel con
        this.con.close();
        //retorna uma arrey list colaborador
        return colaborador;
    }
    //metodo para alterar dados de um colaborador 
    public void alterar(Colaborador col) throws SQLException {
        // comando para o banco de dados
        String sql2 = "insert into colaborador (usuario, senha, nome, rua, bairro, "
                + "cep, cidade, estado, telefone, tipo, equipe_id)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        // comando para o banco de dados
        String sql = "update colaborador set usuario = ?, senha = ?, nome = ?, rua = ?, "
                + "bairro = ?, cep = ?, cidade = ?, estado = ?, telefone = ?,"
                + " tipo = ?, equipe_id = ? where id = ?";
        // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            //seta o que vai entrar em qual lugar e que tipo de dado que e 
            st.setString(1, col.getUsuario());
            st.setString(2, col.getSenha());
            st.setString(3, col.getNome());
            st.setString(4, col.getRua());
            st.setString(5, col.getBairro());
            st.setLong(6, col.getCep());
            st.setString(7, col.getCidade());
            st.setString(8, col.getEstado());
            st.setLong(9, col.getTelefone());
            st.setString(10, col.getTipo());
            st.setInt(11, col.getEquipe_id());
            st.setInt(12, col.getId());
            
            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }

        //finaliza a variavel con
        this.con.close();

    }
    //metodo para eliminar colaborador
    public void eliminar(int id) throws SQLException {
        // comando para o banco de dados
        String sql = "delete from colaborador where id = ?";
        // executa a linha do banco de dados
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
