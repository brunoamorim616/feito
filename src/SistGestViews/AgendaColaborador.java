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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AgendaColaborador extends javax.swing.JPanel {
    private Colaborador c;
    /**
     * Creates new form AgendaColaborador
     */
    public AgendaColaborador(Colaborador colaborador) {
        initComponents();
        c = colaborador;
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
        btnSalvar = new javax.swing.JButton();
        cpTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cpDescricao = new javax.swing.JTextArea();
        lbAgendaColaborador = new javax.swing.JLabel();
        cpDataCria = new javax.swing.JFormattedTextField();
        labelDataCria = new javax.swing.JLabel();
        cpDataCompr = new javax.swing.JFormattedTextField();

        labelEndereco.setText("Data Compromisso:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        cpTitulo.setText("Digite o Título aqui...");

        cpDescricao.setColumns(20);
        cpDescricao.setRows(5);
        cpDescricao.setText("Dê uma descrição aqui...\n");
        jScrollPane2.setViewportView(cpDescricao);

        lbAgendaColaborador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAgendaColaborador.setText("Adcionar à Agenda");

        try {
            cpDataCria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpDataCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDataCriaActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lbAgendaColaborador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbAgendaColaborador)
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
                .addComponent(btnSalvar)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Agenda agenda = new Agenda();
        
        agenda.setDataCriacao(cpDataCria.getText());
        agenda.setDataCompromisso(cpDataCompr.getText());
        agenda.setTitulo(cpTitulo.getText());
        agenda.setDescricao(cpDescricao.getText());
        agenda.setColaborador_id(c.getId());
        agenda.setEquipe_id(c.getEquipe_id());

        //Inserção do compromisso no DB
        AgendaDao agenDao = new AgendaDao();
        try {
            agenDao.inserir(agenda);
            JOptionPane.showMessageDialog(null, "Adcionado à sua Agenda com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao incerir em sua Agenda!");
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cpDataCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataCriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataCriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField cpDataCompr;
    private javax.swing.JFormattedTextField cpDataCria;
    private javax.swing.JTextArea cpDescricao;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDataCria;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel lbAgendaColaborador;
    // End of variables declaration//GEN-END:variables
}
