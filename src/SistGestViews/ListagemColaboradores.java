/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestViews;



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
public class ListagemColaboradores extends javax.swing.JPanel {

    private CardLayout cl;
    private int idColaborador;

    public ListagemColaboradores() {
        initComponents();
        

        this.add(painelListagem, "painelListagem");
        this.add(painelEdicao, "painelEdicao");

        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagem");
        
        this.limparTabela();
        this.popularTabela();
    }

    private void popularTabela() {
        ColaboradorDao colaboradordao = new ColaboradorDao();
        List<Colaborador> ListagemColaboradores;

        try {
            ListagemColaboradores = colaboradordao.listarColaboradores();

            DefaultTableModel model = (DefaultTableModel) tblColaborador.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < ListagemColaboradores.size(); i++) {
                Colaborador c = ListagemColaboradores.get(i);
                lista.add(new Object[]{c.getId() ,c.getUsuario(), c.getSenha(), c.getNome(),
                    c.getRua(), c.getBairro(),c.getCep(),
                    c.getCidade(), c.getEstado(), c.getTelefone(), c.getEquipe_id()});
               

            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Erro ao obter dados";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void preencherCamposEdicao(int idColaborador) throws SQLException {
        ColaboradorDao colab = new ColaboradorDao();
//(usuario, senha, nome, rua, bairro, cep, cidade, estado, telefone, tipo, equipe_id)
        
            Colaborador colaborador2 = colab.getColaborador(idColaborador);
            
            cpEquipeId.setText(""+colaborador2.getEquipe_id());
            cpUsuario.setText(colaborador2.getUsuario());
            cpSenha.setText(colaborador2.getSenha());
            cpBairro.setText(colaborador2.getBairro());
            cpCidade.setText(colaborador2.getCidade());
            cpEstado.setText(colaborador2.getEstado());
            cpTipo.setText(colaborador2.getTipo());
            cpCep.setText(""+colaborador2.getCep());
            cpTelefone.setText(""+colaborador2.getTelefone());
            
    }

    private void limparTabela() {
        ((DefaultTableModel) tblColaborador.getModel()).setNumRows(0);
        tblColaborador.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColaborador = new javax.swing.JTable();
        painelEdicao = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        cpCidade = new javax.swing.JTextField();
        lbEdicao = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        cpBairro = new javax.swing.JTextField();
        cpUsuario = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        cpRua = new javax.swing.JTextField();
        cpNome = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        cpSenha = new javax.swing.JPasswordField();
        lbRua = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        cpEstado = new javax.swing.JTextField();
        lbCEP = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        cpTipo = new javax.swing.JTextField();
        lbEquipe = new javax.swing.JLabel();
        cpEquipeId = new javax.swing.JTextField();
        btnEliminarColaborador = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JButton();
        cpTelefone = new javax.swing.JFormattedTextField();
        cpCep = new javax.swing.JFormattedTextField();

        setLayout(new java.awt.CardLayout());

        painelListagem.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painelListagemComponentShown(evt);
            }
        });

        tblColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Usuário", "Senha", "Nome", "Rua", "Bairro", "CEP", "Cidade", "Estado", "Telefone", "id da Equipe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColaboradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColaborador);

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        add(painelListagem, "card3");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        cpCidade.setText("jTextField6");

        lbEdicao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbEdicao.setText("Edição");

        lbEstado.setText("Estado:");

        lbUsuario.setText("Usuário:");

        cpBairro.setText("jTextField7");

        lbCidade.setText("Cidade:");

        lbSenha.setText("Senha:");

        cpRua.setText("jTextField9");

        cpNome.setText("jTextField3");
        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        lbBairro.setText("Bairro:");

        cpSenha.setText("jPasswordField1");

        lbRua.setText("Rua:");

        lbNome.setText("Nome:");

        cpEstado.setText("jTextField5");

        lbCEP.setText("CEP:");

        lbTelefone.setText("Telefone:");

        lbTipo.setText("Tipo:");

        lbEquipe.setText("Equipe:");

        btnEliminarColaborador.setText("Eliminar");
        btnEliminarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarColaboradorActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        try {
            cpTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador1)
            .addComponent(separador2)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpNome))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbCEP)
                                .addGap(18, 18, 18)
                                .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCidade)
                                    .addComponent(lbRua))
                                .addGap(18, 18, 18)
                                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbEdicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTipo))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lbEquipe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpEquipeId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbSenha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addComponent(btnEliminarColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addGap(149, 149, 149)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEdicao)
                    .addComponent(lbTipo)
                    .addComponent(cpTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(lbSenha)
                    .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEquipe)
                    .addComponent(cpEquipeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTelefone)
                            .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCidade)
                            .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRua)
                            .addComponent(cpRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCEP)
                            .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEstado)
                            .addComponent(cpEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBairro)
                            .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminarColaborador)
                    .addComponent(btnCancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(painelEdicao, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void painelListagemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelListagemComponentShown
        this.limparTabela();
        this.popularTabela();
    }//GEN-LAST:event_painelListagemComponentShown

    private void tblColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColaboradorMouseClicked
        int linha = tblColaborador.getSelectedRow();
        
        if (linha != -1) {
            String codigo = tblColaborador.getValueAt(linha, 0).toString();
            int codigoColaborador = this.idColaborador = Integer.parseInt(codigo);
            try {
                this.preencherCamposEdicao(codigoColaborador);
            } catch (SQLException ex) {
                Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.cl.show(this, "painelEdicao");
        }
    }//GEN-LAST:event_tblColaboradorMouseClicked
    //metodo para editar 
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Colaborador col = new Colaborador();

        int equipeIdConvertido = Integer.parseInt(cpEquipeId.getText());

        col.setEquipe_id(equipeIdConvertido);
        col.setTipo(cpTipo.getText());
        col.setUsuario(cpUsuario.getText());
        col.setSenha(cpSenha.getText());
        col.setEstado(cpEstado.getText());
        col.setBairro(cpBairro.getText());
        col.setCidade(cpCidade.getText());
        col.setRua(cpRua.getText());
        col.setNome(cpNome.getText());
        col.setTelefone(cpTelefone.getText());
        col.setId(idColaborador);
        
        String cep = cpCep.getText();
        cep = cep.replaceAll("[^0-9]", "");
        col.setCep(Long.parseLong(cep));

        //Inserção do colaborador no DB
        ColaboradorDao colDao = new ColaboradorDao();
        try {
            colDao.alterar(col);
            this.cl.show(this, "painelListagem");
            JOptionPane.showMessageDialog(null, "Colaborador alterado com sucesso !");
        } catch (SQLException ex) {
            this.cl.show(this, "painelListagem");
            JOptionPane.showMessageDialog(null, "Falha ao alterar o colaborador !");
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed
    // metodo para eliminar colaborador
    private void btnEliminarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarColaboradorActionPerformed
        Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja realmente eliminar este cliente ?", "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
     
        if (opcaoSelecionada == 0) {
            
            ColaboradorDao colabDao = new ColaboradorDao();
            
            try {
                colabDao.eliminar(idColaborador);              
                this.limparTabela();
                this.popularTabela();
            } catch (SQLException ex) {
                Logger.getLogger(ListagemColaboradores.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.cl.show(this, "painelListagem");
            this.limparTabela();
            this.popularTabela();
        }
    }//GEN-LAST:event_btnEliminarColaboradorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //quando botao cancel for precionado volta para o painel listagem
        this.limparTabela();
        this.popularTabela();
        this.cl.show(this, "painelListagem");
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JToggleButton btnEliminarColaborador;
    private javax.swing.JTextField cpBairro;
    private javax.swing.JFormattedTextField cpCep;
    private javax.swing.JTextField cpCidade;
    private javax.swing.JTextField cpEquipeId;
    private javax.swing.JTextField cpEstado;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpRua;
    private javax.swing.JPasswordField cpSenha;
    private javax.swing.JFormattedTextField cpTelefone;
    private javax.swing.JTextField cpTipo;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEquipe;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTable tblColaborador;
    // End of variables declaration//GEN-END:variables
}
