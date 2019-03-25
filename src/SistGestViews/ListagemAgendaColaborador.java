/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;


import SistGestDao.AgendaDao;
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
    private Colaborador c;
    /**
     * Creates new form Agenda
     */
    public ListagemAgendaColaborador(Colaborador colaborador) {
        initComponents();
        this.c = colaborador;

        this.add(painelAgendaColaboradorEdicao, "painelAgenda");
        this.add(painelListagemAgendaColaborador, "painelListagemAgenda");
        
        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagemAgenda");
        
        this.limparTabela();
        this.popularTabela();
    }
    
    private void popularTabela() {
        AgendaDao agendao = new AgendaDao();
        List<Agenda> Agenda;

        try {
            Agenda = agendao.listaCompromisso(c.getId());

            DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
            List<Object> lista = new ArrayList<Object>();
            //varre o banco de dados e seta a ordem que ira a parecer na tela 
            for (int i = 0; i < Agenda.size(); i++) {
                Agenda c = Agenda.get(i);
                lista.add(new Object[]{c.getDataCriacao(), c.getDataCompromisso(), c.getTitulo(),
                    c.getDescricao(), c.getColaborador_id()});
               
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
    
    private void preencherCamposEdicao(int idColaborador) throws SQLException {
        AgendaDao agendao = new AgendaDao();

            SistGestModelo.Agenda agenda = agendao.getCompromisso(idColaborador);
            
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
        painelListagemAgendaColaborador = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        labelEnderecoEditar.setText("Data Compromisso:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        cpTituloEditar.setText("Digite o Título aqui...");

        cpDescricaoEditar.setColumns(20);
        cpDescricaoEditar.setRows(5);
        cpDescricaoEditar.setText("Dê uma descrição aqui...\n");
        jScrollPane2.setViewportView(cpDescricaoEditar);

        labelCadastroClienteEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastroClienteEditar.setText("Editar Sua Agenda");

        try {
            cpDataCriaEditar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataCriaEditar.setText("Criada em:");

        try {
            cpDataComprEditar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                .addContainerGap(756, Short.MAX_VALUE)
                .addGroup(painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                        .addComponent(btnEliminarCompromisso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addGap(146, 146, 146))
                    .addGroup(painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                        .addGroup(painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(labelCadastroClienteEditar))
                            .addGroup(painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(cpTituloEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                        .addComponent(labelDataCriaEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCriaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 699, Short.MAX_VALUE)
                        .addComponent(labelEnderecoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataComprEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        painelAgendaColaboradorEdicaoLayout.setVerticalGroup(
            painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgendaColaboradorEdicaoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelCadastroClienteEditar)
                .addGap(18, 18, 18)
                .addComponent(cpTituloEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDataComprEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataCriaEditar)
                    .addComponent(labelEnderecoEditar)
                    .addComponent(cpDataCriaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAgendaColaboradorEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminarCompromisso))
                .addGap(22, 22, 22))
        );

        add(painelAgendaColaboradorEdicao, "card3");

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data de Criação", "Data do Compromisso", "Título", "Descrição", "id do Colaborador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
            .addGroup(painelListagemAgendaColaboradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelListagemAgendaColaboradorLayout.setVerticalGroup(
            painelListagemAgendaColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        add(painelListagemAgendaColaborador, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void tblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendaMouseClicked
       //metodo de clique  na linha que o usuario ckicar vai abrir modo edicao
        int linha = tblAgenda.getSelectedRow();

        if (linha != -1) {
            String codigo = tblAgenda.getValueAt(linha, 0).toString();
            int codigoColaborador = Integer.parseInt(codigo);
            try {
                this.preencherCamposEdicao(codigoColaborador);
            } catch (SQLException ex) {
                Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
            }
                this.cl.show(this, "painelEdicao");
        }
    }//GEN-LAST:event_tblAgendaMouseClicked

    private void tblAgendaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblAgendaComponentShown
       
    }//GEN-LAST:event_tblAgendaComponentShown

    private void btnEliminarCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompromissoActionPerformed
        
    }//GEN-LAST:event_btnEliminarCompromissoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
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
