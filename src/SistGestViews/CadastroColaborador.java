/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;

import SistGestDao.ColaboradorDao;
import SistGestModelo.Colaborador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CadastroColaborador extends javax.swing.JPanel {

    /**
     * Creates new form CadastroColaborador
     */
    public CadastroColaborador() {
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

        btnCadastrar = new javax.swing.JButton();
        cpCidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lEstado = new javax.swing.JLabel();
        cpCep = new javax.swing.JTextField();
        lUsuario = new javax.swing.JLabel();
        cpBairro = new javax.swing.JTextField();
        cpUsuario = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        lSenha = new javax.swing.JLabel();
        cpRua = new javax.swing.JTextField();
        cpNome = new javax.swing.JTextField();
        lBairro = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        cpSenha = new javax.swing.JPasswordField();
        cpTelefone = new javax.swing.JTextField();
        lRua = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        cpEstado = new javax.swing.JTextField();
        lCEP = new javax.swing.JLabel();
        lTelefone = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        cpTipo = new javax.swing.JTextField();
        lbEquipeId = new javax.swing.JLabel();
        cpEquipeId = new javax.swing.JTextField();

        btnCadastrar.setText("Cadastrar-se");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cpCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpCidadeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Cadastro");

        lEstado.setText("Estado:");

        lUsuario.setText("Usuário:");

        lCidade.setText("Cidade:");

        lSenha.setText("Senha:");

        cpRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpRuaActionPerformed(evt);
            }
        });

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        lBairro.setText("Bairro:");

        lRua.setText("Rua:");

        lNome.setText("Nome:");

        lCEP.setText("CEP:");

        lTelefone.setText("Telefone:");

        lbTipo.setText("Tipo:");

        lbEquipeId.setText("Equipe:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpEstado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lCEP)
                                        .addGap(18, 18, 18)
                                        .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lCidade)
                                            .addComponent(lRua))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cpRua, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                            .addComponent(cpCidade)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbTipo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(lbEquipeId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpEquipeId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(lSenha)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)))
                .addContainerGap())
            .addComponent(separador2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbTipo)
                    .addComponent(cpTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsuario)
                    .addComponent(lSenha)
                    .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEquipeId)
                    .addComponent(cpEquipeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lEstado)
                            .addComponent(cpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lBairro)
                            .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lTelefone)
                            .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCidade)
                            .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lRua)
                            .addComponent(cpRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCEP))))
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Colaborador col = new Colaborador();
        
        int equipeIdConvertido = Integer.parseInt(cpEquipeId.getText()); 
        
        col.setEquipe_id(equipeIdConvertido);
        col.setTipo(cpTipo.getText());
        col.setUsuario(cpUsuario.getText());
        col.setSenha(cpSenha.getText());
        col.setEstado(cpEstado.getText());
        col.setTelefone(cpTelefone.getText());
        col.setBairro(cpBairro.getText());
        col.setCidade(cpCidade.getText());
        col.setCep(cpCep.getText());
        col.setRua(cpRua.getText());
        col.setNome(cpNome.getText());

        //Inserção do colaborador no DB
        ColaboradorDao colDao = new ColaboradorDao();
        try {
            colDao.inserir(col);
            JOptionPane.showMessageDialog(null, "Colaborador inserido com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir colaborador !");
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void cpCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpCidadeActionPerformed

    private void cpRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpRuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField cpBairro;
    private javax.swing.JTextField cpCep;
    private javax.swing.JTextField cpCidade;
    private javax.swing.JTextField cpEquipeId;
    private javax.swing.JTextField cpEstado;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpRua;
    private javax.swing.JPasswordField cpSenha;
    private javax.swing.JTextField cpTelefone;
    private javax.swing.JTextField cpTipo;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lCEP;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lRua;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JLabel lbEquipeId;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables
}
