
package SistGestDao;

import SistGestModelo.Agenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgendaDao extends ConnectionFactory  {
     //define a variavel con como privada 
    private Connection con;
   

    public AgendaDao() {
        this.con = this.getConnection();
    }


    // metodo para inserur dados na tabela  agenda no caso datacompromisso, titulo , descricao , colaborador e equipe id 

    public void inserir(Agenda agenda) throws SQLException {



        // armazena todos os dados em uma string para ser inserida no Banco de dados

        String sql = "insert into agenda "
                + "( idAgenda, dataCriacao, dataCompromisso, titulo, descricao, equipe_id, colaborador_id) "
                + "values (?, ?, ?, ?, ?, ?, ?);";
         // seta oque vai em cada campo e se e uma string ou int 
         // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            
            st.setInt(1, agenda.getIdAgenda());
            st.setString(2, agenda.getDataCriacao());
            st.setString(3, agenda.getDataCompromisso());
            st.setString(4, agenda.getTitulo());
            st.setString(5, agenda.getDescricao());
            st.setInt(6, agenda.getEquipe_id());
            st.setInt(7, agenda.getColaborador_id());
            
            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }
         //finaliza a variavel con
        this.con.close();

    }
    
    // Metodo para elinar dados da tabela agenda
    public void eliminar(int equipe_id) throws SQLException {
        // comando para o banco de dados deletar dados da tabela
        String sql = "delete from agenda where equipe_id = ?";
        
        // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, equipe_id);
            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }
         //finaliza a variavel con
        this.con.close();

    }

    // metodo para editar dados da tabela agenda
    public void alterar(Agenda comp) throws SQLException {
        
        //armazena todos os dados novamente em uma string para ser inserida no Banco de dados

        String sql2 = "insert into agenda "
                + "(idAgenda,dataCriacao, dataCompromisso, "
                + "titulo, descricao)"
                + "values (?,?, ?, ?, ?);";
        //armazena todos os dados novamente em uma string para ser inserida no Banco de dados
        String sql = "update agenda set dataCriacao = ?, dataCompromisso = ?, titulo = ?, "
                + "descricao = ?, where colaborador_id = ?";
        // define oque e o que e que tipo de dados que e , // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            
            st.setInt(1, comp.getIdAgenda());
            st.setString(2, comp.getDataCriacao());
            st.setString(3, comp.getDataCompromisso());
            st.setString(4, comp.getTitulo());
            st.setString(5, comp.getDescricao());
            //executa no banco de dados
            st.execute();
            // fecha a conexao com o bando de dados
            st.close();
        }
        //finaliza a variavel con
        this.con.close();

    }
    // metodo para listar todos os compromissos
    public List<Agenda> listaCompromissoEquipe(int id_equipe) throws SQLException {
        // comando executado no banco de dados
        String sql = "select * from agenda where equipe_id = ?";

        List<Agenda> agenda = null;
        List<Agenda> clientes = null;
        // executa a linha do banco de dados

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, id_equipe);
            ResultSet rs = st.executeQuery();
            agenda = new ArrayList<Agenda>();
            // cria um array list agenda
            clientes = new ArrayList<Agenda>();
            //coleta os dados para o banco de dados 
            while (rs.next()) {
                Agenda c = new Agenda();
                c.setIdAgenda(rs.getInt("idAgenda"));
                c.setDataCriacao(rs.getString("dataCriacao"));
                c.setDataCompromisso(rs.getString("dataCompromisso"));
                c.setTitulo(rs.getString("titulo"));
                c.setDescricao(rs.getString("descricao"));
                c.setColaborador_id(rs.getInt("colaborador_id"));
                c.setEquipe_id(rs.getInt("equipe_id"));


                agenda.add(c);

                // adiciona cliente no array
                clientes.add(c);

            }
            
            
            rs.close();
            // fecha a conexao com o bando de dados
            st.close();

        }
        //finaliza a variavel con
        this.con.close();

        return agenda;
    }
    
    public List<Agenda> listaCompromisso(int id_colaborador) throws SQLException {
       // comando executado no banco de dados
        String sql = "select * from agenda where colaborador_id = ?";
         // cria um array list agenda
        List<Agenda> agenda = null;
         // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            
            st.setInt(1, id_colaborador);
            ResultSet rs = st.executeQuery();
              // cria um array list agenda
            agenda = new ArrayList<Agenda>();           

            while (rs.next()) {
                //coleta os dados para o banco de dados
                Agenda c = new Agenda();
                c.setIdAgenda(rs.getInt("idAgenda"));
                c.setDataCriacao(rs.getString("dataCriacao"));
                c.setDataCompromisso(rs.getString("dataCompromisso"));
                c.setTitulo(rs.getString("titulo"));
                c.setDescricao(rs.getString("descricao"));
                c.setColaborador_id(rs.getInt("colaborador_id"));
                 // adiciona cliente no array
                agenda.add(c);
            }

            rs.close();
            // fecha a conexao com o bando de dados
            st.close();

        }

        this.con.close();
        //retorna o arraylist cliente
        return agenda;

    }
    //metodo para puxar os compromissos de um usuario
    public Agenda getCompromisso(int colaborador_id) throws SQLException {
        //comando para o banco de dados puxar a agenda do usuario
        String sql = "select * from agenda where colaborador_id = ?";
        //
        Agenda compr = null;
        
        // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, colaborador_id);
            //coleta os dados para o banco de dados 
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    compr = new Agenda();
                    compr.setIdAgenda(rs.getInt("idAgenda"));
                    compr.setDataCriacao(rs.getString("dataCriacao"));
                    compr.setDataCompromisso(rs.getString("dataCompromisso"));
                    compr.setTitulo(rs.getString("titulo"));
                    compr.setDescricao(rs.getString("descricao"));
                    compr.setColaborador_id(rs.getInt("colaborador_id"));
                }
            }
            // fecha a conexao com o bando de dados
            st.close();
        }
        //finaliza a variavel con
        this.con.close();
        //retorna 
        return compr;
    }
    
    /**
     *
     * @param equipe_id
     * @return
     * @throws SQLException
     */
    //metodo para puxar o(s) compromosso(s) da equipe
    public Agenda getCompromissoEquipe(int equipe_id) throws SQLException {
        //comando para o banco de dados 
        String sql = "select * from agenda where equipe_id = ?";
        Agenda compr = null;
        // executa a linha do banco de dados
        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, equipe_id);
            //coleta os dados para o banco de dados 
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    compr = new Agenda();
                    compr.setIdAgenda(rs.getInt("idAgenda"));
                    compr.setDataCriacao(rs.getString("dataCriacao"));
                    compr.setDataCompromisso(rs.getString("dataCompromisso"));
                    compr.setTitulo(rs.getString("titulo"));
                    compr.setDescricao(rs.getString("descricao"));
                    compr.setEquipe_id(rs.getInt("equipe_id"));
                }
            }
            // fecha a conexao com o bando de dados
            st.close();
        }
        //finaliza a variavel con
        this.con.close();
        //retorna a agenda compr
        return compr;
    }

}
