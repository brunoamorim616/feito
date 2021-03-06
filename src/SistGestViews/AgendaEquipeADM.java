/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;

import SistGestDao.AgendaDao;
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
public class AgendaEquipeADM extends javax.swing.JPanel {
    /**
     * Creates new form AgendaEquipe
     */
    public AgendaEquipeADM() {
        initComponents();
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
        cpCodigoEquipe = new javax.swing.JTextField();
        lblCodEquipe = new javax.swing.JLabel();
        lblCodCOlaborador = new javax.swing.JLabel();
        cpCodigoColaborador = new javax.swing.JTextField();

        labelEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEndereco.setText("Data Compromisso:");

        btnSalvar2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalvar2.setText("Salvar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        cpTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cpTitulo.setText("Digite o Título aqui...");
        cpTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpTituloActionPerformed(evt);
            }
        });

        cpDescricao.setColumns(20);
        cpDescricao.setRows(5);
        cpDescricao.setText("Dê uma descrição aqui...\n");
        jScrollPane2.setViewportView(cpDescricao);

        lbAgendaEquipe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbAgendaEquipe.setText("Adcionar à Agenda da Equipe");

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

        labelDataCria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDataCria.setText("Criada em:");

        try {
            cpDataCompr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpDataCompr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDataComprActionPerformed(evt);
            }
        });

        cpCodigoEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpCodigoEquipeActionPerformed(evt);
            }
        });

        lblCodEquipe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodEquipe.setText("Codigo equipe:");

        lblCodCOlaborador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodCOlaborador.setText("Codigo colaborador:");

        cpCodigoColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpCodigoColaboradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAgendaEquipe)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDataCria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCria, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpDataCompr, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpCodigoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodCOlaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpCodigoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1874, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbAgendaEquipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDataCompr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereco)
                    .addComponent(cpCodigoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodEquipe)
                    .addComponent(cpDataCria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataCria)
                    .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCodigoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodCOlaborador))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
        //vincula uma pagina 
        int codigoEquipeConvertida = Integer.parseInt(cpCodigoEquipe.getText());
        int codigoColaboradorConvertido = Integer.parseInt(cpCodigoColaborador.getText());
        Agenda agenda = new Agenda();
        //puxa os dados do campo e seta em variaveis
        agenda.setDataCriacao(cpDataCria.getText());
        agenda.setDataCompromisso(cpDataCompr.getText());
        agenda.setTitulo(cpTitulo.getText());
        agenda.setDescricao(cpDescricao.getText());

        agenda.setEquipe_id(codigoEquipeConvertida);
        agenda.setColaborador_id(codigoColaboradorConvertido);

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

    private void cpCodigoEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpCodigoEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpCodigoEquipeActionPerformed

    private void cpDataComprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataComprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataComprActionPerformed

    private void cpDataCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataCriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataCriaActionPerformed

    private void cpTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpTituloActionPerformed

    private void cpCodigoColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpCodigoColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpCodigoColaboradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JTextField cpCodigoColaborador;
    private javax.swing.JTextField cpCodigoEquipe;
    private javax.swing.JFormattedTextField cpDataCompr;
    private javax.swing.JFormattedTextField cpDataCria;
    private javax.swing.JTextArea cpDescricao;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDataCria;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel lbAgendaEquipe;
    private javax.swing.JLabel lblCodCOlaborador;
    private javax.swing.JLabel lblCodEquipe;
    // End of variables declaration//GEN-END:variables
}
