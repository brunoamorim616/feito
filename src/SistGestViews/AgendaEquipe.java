/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;

import SistGestDao.AgendaDao;
import SistGestModelo.Agenda;
import SistGestModelo.Equipe;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AgendaEquipe extends javax.swing.JPanel {
    private Equipe eq;
    /**
     * Creates new form AgendaEquipe
     */
    public AgendaEquipe(Equipe equipe) {
        initComponents();
        equipe = eq;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEndereco = new javax.swing.JLabel();
        btnSalvar2 = new javax.swing.JButton();
        cpTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cpDescricao = new javax.swing.JTextArea();
        lbAgendaEquipe = new javax.swing.JLabel();
        cpDataCria = new javax.swing.JFormattedTextField();
        labelDataCria = new javax.swing.JLabel();
        cpDataCompr = new javax.swing.JFormattedTextField();

        labelEndereco.setText("Data Compromisso:");

        btnSalvar2.setText("Salvar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        cpTitulo.setText("Digite o Título aqui...");

        cpDescricao.setColumns(20);
        cpDescricao.setRows(5);
        cpDescricao.setText("Dê uma descrição aqui...\n");
        jScrollPane2.setViewportView(cpDescricao);

        lbAgendaEquipe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAgendaEquipe.setText("Adcionar à Agenda da Equipe");

        try {
            cpDataCria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataCria.setText("Criada em:");

        try {
            cpDataCompr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDataCria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(labelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCompr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar2)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbAgendaEquipe)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbAgendaEquipe)
                .addGap(18, 18, 18)
                .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDataCompr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataCria)
                    .addComponent(labelEndereco)
                    .addComponent(cpDataCria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar2)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
        //vincula uma pagina 
        Agenda agenda = new Agenda();
        //puxa os dados do campo e seta em variaveis
        agenda.setDataCriacao(cpDataCria.getText());
        agenda.setDataCompromisso(cpDataCompr.getText());
        agenda.setTitulo(cpTitulo.getText());
        agenda.setDescricao(cpDescricao.getText());
        agenda.setEquipe_id(eq.getId());

        //Inserção do compromisso no DB
        AgendaDao agenDao = new AgendaDao();
        try {
            agenDao.inserir(agenda);
            JOptionPane.showMessageDialog(null, "Inserido à Agenda da equipe com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir na Agenda da Equipe!");
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JFormattedTextField cpDataCompr;
    private javax.swing.JFormattedTextField cpDataCria;
    private javax.swing.JTextArea cpDescricao;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDataCria;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel lbAgendaEquipe;
    // End of variables declaration//GEN-END:variables
}
