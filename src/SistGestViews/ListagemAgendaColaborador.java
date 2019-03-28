/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;


import SistGestDao.AgendaDao;
import SistGestDao.ColaboradorDao;
import SistGestModelo.Agenda;
import SistGestModelo.Colaborador;
import SistGestModelo.Equipe;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
//metodo para listagem da agenda do colaborador
public class ListagemAgendaColaborador extends javax.swing.JPanel {
    private CardLayout cl;
    private int idAgendaColaborador;
    /**
     * Creates new form Agenda
     */
    public ListagemAgendaColaborador() {
        initComponents();

        
        this.add(painelListagemAgendaColaborador, "painelListagemAgendaColaborador");
        this.add(painelAgendaColaboradorEdicao, "painelAgendaEdicao");
        
        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagemAgendaColaborador");
    }
    
    private void popularTabela() {
        AgendaDao agendao = new AgendaDao();
        List<Agenda> Agenda;

        try {
            Agenda = agendao.listaCompromisso();

            DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
            List<Object> lista = new ArrayList<Object>();
            //varre o banco de dados e seta a ordem que ira a parecer na tela 
            for (int i = 0; i < Agenda.size(); i++) {
                Agenda ag = Agenda.get(i);
                lista.add(new Object[]{ag.getIdAgenda(),ag.getDataCriacao(), ag.getDataCompromisso(), ag.getTitulo(),
                    ag.getDescricao(), ag.getColaborador_id()});
               
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Erro ao obter dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void preencherCamposEdicao(int idAgendaColaborador) throws SQLException {
        AgendaDao agendao = new AgendaDao();

            Agenda agenda = agendao.getCompromisso(idAgendaColaborador);
            
            cpDataCriaEditar.setText(agenda.getDataCriacao());
            cpDataComprEditar.setText(agenda.getDataCompromisso());
            cpDescricaoEditar.setText(agenda.getDescricao());
            cpTituloEditar.setText(agenda.getTitulo());
    }
    
    private void limparTabela() {
        ((DefaultTableModel) tblAgenda.getModel()).setNumRows(0);
        tblAgenda.updateUI();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagemAgendaColaborador = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        painelAgendaColaboradorEdicao = new javax.swing.JPanel();
        labelEnderecoEditar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        cpTituloEditar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cpDescricaoEditar = new javax.swing.JTextArea();
        labelCadastroClienteEditar = new javax.swing.JLabel();
        cpDataCriaEditar = new javax.swing.JFormattedTextField();
        labelDataCriaEditar = new javax.swing.JLabel();
        cpDataComprEditar = new javax.swing.JFormattedTextField();
        btnEliminarCompromisso = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id do Compromisso", "Data de Criação", "Data do Compromisso", "Título", "Descrição", "id do Colaborador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAgendaMouseClicked(evt);
            }
        });
        tblAgenda.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblAgendaComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tblAgenda);

        javax.swing.GroupLayout painelListagemAgendaColaboradorLayout = new javax.swing.GroupLayout(painelListagemAgendaColaborador);
        painelListagemAgendaColaborador.setLayout(painelListagemAgendaColaboradorLayout);
        painelListagemAgendaColaboradorLayout.setHorizontalGroup(
            painelListagemAgendaColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
        );
        painelListagemAgendaColaboradorLayout.setVerticalGroup(
            painelListagemAgendaColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        add(painelListagemAgendaColaborador, "card4");

        labelEnderecoEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelEnderecoEditar.setText("Data Compromisso:");

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        cpTituloEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpTituloEditar.setText("Digite o Título aqui...");

        cpDescricaoEditar.setColumns(20);
        cpDescricaoEditar.setRows(5);
        cpDescricaoEditar.setText("Dê uma descrição aqui...\n");
        jScrollPane2.setViewportView(cpDescricaoEditar);

        labelCadastroClienteEditar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelCadastroClienteEditar.setText("Editar Sua Agenda");

        try {
            cpDataCriaEditar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataCriaEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDataCriaEditar.setText("Criada em:");

        try {
            cpDataComprEditar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnEliminarCompromisso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarCompromisso.setText("Eliminar");
        btnEliminarCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompromissoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAgendaColaboradorEdicaoLayout = new javax.swing.GroupLayout(painelAgendaColaboradorEdicao);
        painelAgendaColaboradorEdicao.setLayout(painelAgendaColaboradorEdicaoLayout);
        painelAgendaColaboradorEdicaoLayout.setHorizontalGroup(
            painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                        .addComponent(labelCadastroClienteEditar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                        .addComponent(labelDataCriaEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCriaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(labelEnderecoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataComprEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cpTituloEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCompromisso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addGap(191, 191, 191)))
                .addContainerGap())
        );
        painelAgendaColaboradorEdicaoLayout.setVerticalGroup(
            painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelCadastroClienteEditar)
                .addGap(49, 49, 49)
                .addGroup(painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDataComprEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataCriaEditar)
                    .addComponent(labelEnderecoEditar)
                    .addComponent(cpDataCriaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpTituloEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCompromisso)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        add(painelAgendaColaboradorEdicao, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void tblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendaMouseClicked
       //metodo de clique  na linha que o usuario ckicar vai abrir modo edicao
        int linha = tblAgenda.getSelectedRow();

        if (linha != -1) {            
            try {
                String codigo = tblAgenda.getValueAt(linha, 0).toString();
                int codigoAgenda = this.idAgendaColaborador = Integer.parseInt(codigo);
                this.preencherCamposEdicao(codigoAgenda);
                
            } catch (SQLException ex) {
                Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
            }   
                this.cl.show(this, "painelAgendaEdicao");
        }
    }//GEN-LAST:event_tblAgendaMouseClicked

    private void tblAgendaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblAgendaComponentShown
       this.limparTabela();
       this.popularTabela();
    }//GEN-LAST:event_tblAgendaComponentShown

    private void btnEliminarCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompromissoActionPerformed
         Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja realmente eliminar este compromisso ?", "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
     
        if (opcaoSelecionada == 0) {
            
            AgendaDao agendao = new AgendaDao();
            
            try {
                agendao.eliminar(idAgendaColaborador);              
                this.limparTabela();
                this.popularTabela();
            } catch (SQLException ex) {
                Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.cl.show(this, "painelListagem");
        }
    }//GEN-LAST:event_btnEliminarCompromissoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Agenda ag = new Agenda();
        
        ag.setIdAgenda(idAgendaColaborador);
        ag.setDataCriacao(cpDataCriaEditar.getText());
        ag.setDataCompromisso(cpDataComprEditar.getText());
        ag.setTitulo(cpTituloEditar.getText());
        ag.setDescricao(cpDescricaoEditar.getText());

        //Inserção do colaborador no DB
        AgendaDao agendao = new AgendaDao();
        try {
            agendao.alterar(ag);
            this.cl.show(this, "painelListagem");
            JOptionPane.showMessageDialog(null, "Colaborador alterado com sucesso !");
        } catch (SQLException ex) {
            this.cl.show(this, "painelListagem");
            JOptionPane.showMessageDialog(null, "Falha ao alterar o colaborador !");
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarCompromisso;
    private javax.swing.JFormattedTextField cpDataComprEditar;
    private javax.swing.JFormattedTextField cpDataCriaEditar;
    private javax.swing.JTextArea cpDescricaoEditar;
    private javax.swing.JTextField cpTituloEditar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCadastroClienteEditar;
    private javax.swing.JLabel labelDataCriaEditar;
    private javax.swing.JLabel labelEnderecoEditar;
    private javax.swing.JPanel painelAgendaColaboradorEdicao;
    private javax.swing.JPanel painelListagemAgendaColaborador;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables
}
