/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;

import SistGestDao.EquipeDao;
import SistGestModelo.Equipe;
import java.awt.CardLayout;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CadastroEquipe extends javax.swing.JPanel {
    private CardLayout cl;
    /**
     * Creates new form CadastroEquipe
     */
    public CadastroEquipe() {
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

        lbCadastrarEquipe = new javax.swing.JLabel();
        lbNomeEquipe = new javax.swing.JLabel();
        cpNomeEquipe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cpDescricaoEquipe = new javax.swing.JTextArea();
        lbDescricaoEquipe = new javax.swing.JLabel();
        btnSalvarEquipe = new javax.swing.JButton();

        lbCadastrarEquipe.setText("Cadastrar Equipe");

        lbNomeEquipe.setText("Nome:");

        cpNomeEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeEquipeActionPerformed(evt);
            }
        });

        cpDescricaoEquipe.setColumns(20);
        cpDescricaoEquipe.setRows(5);
        jScrollPane1.setViewportView(cpDescricaoEquipe);

        lbDescricaoEquipe.setText("Descricao da Equipe:");

        btnSalvarEquipe.setText("Salvar");
        btnSalvarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEquipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCadastrarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDescricaoEquipe)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNomeEquipe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpNomeEquipe)))
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvarEquipe)
                                .addGap(171, 171, 171))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastrarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeEquipe)
                    .addComponent(cpNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(lbDescricaoEquipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnSalvarEquipe)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpNomeEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeEquipeActionPerformed

    private void btnSalvarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEquipeActionPerformed
        Equipe eq = new Equipe();
        
        eq.setNome(cpNomeEquipe.getText());
        eq.setDescricao(cpDescricaoEquipe.getText());

        //Inserção da equipe no DB
        EquipeDao eqdao = new EquipeDao();
        try {
            eqdao.inserir(eq);
            JOptionPane.showMessageDialog(null, "Colaborador inserido com sucesso !");
            this.cl.show(this, "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir colaborador !");
        }
    }//GEN-LAST:event_btnSalvarEquipeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarEquipe;
    private javax.swing.JTextArea cpDescricaoEquipe;
    private javax.swing.JTextField cpNomeEquipe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCadastrarEquipe;
    private javax.swing.JLabel lbDescricaoEquipe;
    private javax.swing.JLabel lbNomeEquipe;
    // End of variables declaration//GEN-END:variables
}