/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;


import SistGestDao.AgendaDao;
import SistGestDao.ColaboradorDao;
import SistGestModelo.Colaborador;
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
public class Agenda extends javax.swing.JPanel {
    private int idColaborador;
    private int idEquipe;
    private CardLayout cl;
    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        
        this.add(painelEdicao, "painelEdicao");
        this.add(painelAgenda, "painelAgenda");
        this.add(painelListagemAgenda, "painelListagemAgenda");
        
        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelAgenda");
    }
    private void preencherCamposEdicao(int idColaborador) throws SQLException {
        AgendaDao agendao = new AgendaDao();
//(usuario, senha, nome, rua, bairro, cep, cidade, estado, telefone, tipo, equipe_id)
        
            SistGestModelo.Agenda agenda = agendao.getCompromisso(idColaborador);
            
            cpDescricaoEditado.setText(agenda.getDescricao());
            cpTituloEditado.setText(agenda.getTitulo());
    }
    
    private void limparTabela() {
        ((DefaultTableModel) tblAgenda.getModel()).setNumRows(0);
        tblAgenda.updateUI();
    }
    
    private void popularTabela() {
        AgendaDao agendao = new AgendaDao();
        List<SistGestModelo.Agenda> Agenda;

        try {
            Agenda = agendao.listaCompromisso();

            DefaultTableModel model = (DefaultTableModel) tblAgenda.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < Agenda.size(); i++) {
                SistGestModelo.Agenda c = Agenda.get(i);
                lista.add(new Object[]{c.getDataCompromisso(), c.getDataCriacao(),
                    c.getDescricao(), c.getTitulo()});
               

            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter os clientes do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEdicao = new javax.swing.JPanel();
        labelEndereco = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        cpTituloEditado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cpDescricaoEditado = new javax.swing.JTextArea();
        labelCadastroCliente = new javax.swing.JLabel();
        cpDataCriaEditado = new javax.swing.JFormattedTextField();
        labelDataCria = new javax.swing.JLabel();
        cpDataComprEditado = new javax.swing.JFormattedTextField();
        btnListarAgenda = new javax.swing.JButton();
        painelAgenda = new javax.swing.JPanel();
        labelEndereco1 = new javax.swing.JLabel();
        btnSalvar1 = new javax.swing.JButton();
        cpTitulo1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cpDescricao1 = new javax.swing.JTextArea();
        labelCadastroCliente1 = new javax.swing.JLabel();
        cpDataCria1 = new javax.swing.JFormattedTextField();
        labelDataCria1 = new javax.swing.JLabel();
        cpDataCompr1 = new javax.swing.JFormattedTextField();
        painelListagemAgenda = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        labelEndereco.setText("Data Compromisso:");

        btnEditar.setText("Adcionar");

        cpTituloEditado.setText("Digite o Título aqui...");

        cpDescricaoEditado.setColumns(20);
        cpDescricaoEditado.setRows(5);
        cpDescricaoEditado.setText("Dê uma descrição aqui...\n");
        jScrollPane1.setViewportView(cpDescricaoEditado);

        labelCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastroCliente.setText("Adcionar à Agenda");

        try {
            cpDataCriaEditado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataCria.setText("Criada em:");

        try {
            cpDataComprEditado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnListarAgenda.setText("Listar Agenda");
        btnListarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addComponent(labelDataCria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCriaEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(labelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataComprEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelCadastroCliente)
                        .addGroup(painelEdicaoLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(cpTituloEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(124, 124, 124)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                        .addComponent(btnListarAgenda)
                        .addGap(34, 34, 34)
                        .addComponent(btnEditar)
                        .addGap(74, 74, 74))))
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelCadastroCliente)
                .addGap(18, 18, 18)
                .addComponent(cpTituloEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDataComprEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataCria)
                    .addComponent(labelEndereco)
                    .addComponent(cpDataCriaEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnListarAgenda))
                .addGap(22, 22, 22))
        );

        add(painelEdicao, "card2");

        labelEndereco1.setText("Data Compromisso:");

        btnSalvar1.setText("Editar");

        cpTitulo1.setText("Digite o Título aqui...");

        cpDescricao1.setColumns(20);
        cpDescricao1.setRows(5);
        cpDescricao1.setText("Dê uma descrição aqui...\n");
        jScrollPane2.setViewportView(cpDescricao1);

        labelCadastroCliente1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastroCliente1.setText("Adcionar à Agenda");

        try {
            cpDataCria1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataCria1.setText("Criada em:");

        try {
            cpDataCompr1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelAgendaLayout = new javax.swing.GroupLayout(painelAgenda);
        painelAgenda.setLayout(painelAgendaLayout);
        painelAgendaLayout.setHorizontalGroup(
            painelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadastroCliente1)
                    .addGroup(painelAgendaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(painelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaLayout.createSequentialGroup()
                                .addComponent(btnSalvar1)
                                .addGap(146, 146, 146))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaLayout.createSequentialGroup()
                                .addComponent(cpTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAgendaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(painelAgendaLayout.createSequentialGroup()
                        .addComponent(labelDataCria1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(labelEndereco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCompr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        painelAgendaLayout.setVerticalGroup(
            painelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgendaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelCadastroCliente1)
                .addGap(18, 18, 18)
                .addComponent(cpTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDataCompr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataCria1)
                    .addComponent(labelEndereco1)
                    .addComponent(cpDataCria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar1)
                .addGap(22, 22, 22))
        );

        add(painelAgenda, "card3");

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idTarefa", "Título", "Descricao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout painelListagemAgendaLayout = new javax.swing.GroupLayout(painelListagemAgenda);
        painelListagemAgenda.setLayout(painelListagemAgendaLayout);
        painelListagemAgendaLayout.setHorizontalGroup(
            painelListagemAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
            .addGroup(painelListagemAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
        );
        painelListagemAgendaLayout.setVerticalGroup(
            painelListagemAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
            .addGroup(painelListagemAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
        );

        add(painelListagemAgenda, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void tblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendaMouseClicked
        int linha = tblAgenda.getSelectedRow();

        if (linha != -1) {
            String codigo = tblAgenda.getValueAt(linha, 0).toString();
            int codigoColaborador = this.idColaborador = Integer.parseInt(codigo);
            
            try {
                this.preencherCamposEdicao(codigoColaborador);
            } catch (SQLException ex) {
                Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.cl.show(this, "painelEdicao");
        }
    }//GEN-LAST:event_tblAgendaMouseClicked

    private void tblAgendaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblAgendaComponentShown
       this.limparTabela();
       this.popularTabela();
    }//GEN-LAST:event_tblAgendaComponentShown

    private void btnListarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAgendaActionPerformed
        cl.show(this, "painelListagemAgenda");
    }//GEN-LAST:event_btnListarAgendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListarAgenda;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JFormattedTextField cpDataCompr1;
    private javax.swing.JFormattedTextField cpDataComprEditado;
    private javax.swing.JFormattedTextField cpDataCria1;
    private javax.swing.JFormattedTextField cpDataCriaEditado;
    private javax.swing.JTextArea cpDescricao1;
    private javax.swing.JTextArea cpDescricaoEditado;
    private javax.swing.JTextField cpTitulo1;
    private javax.swing.JTextField cpTituloEditado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCadastroCliente;
    private javax.swing.JLabel labelCadastroCliente1;
    private javax.swing.JLabel labelDataCria;
    private javax.swing.JLabel labelDataCria1;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEndereco1;
    private javax.swing.JPanel painelAgenda;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagemAgenda;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables
}
