/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistGestPrincipal;

import SistGestDao.ColaboradorDao;
import SistGestDao.ConnectionFactory;
import SistGestModelo.Colaborador;
import SistGestModelo.Equipe;
import SistGestViews.AgendaColaboradorADM;
import SistGestViews.AgendaEquipeADM;
import SistGestViews.CadastroColaborador;
import SistGestViews.ListagemAgendaColaborador;
import SistGestViews.CadastroEquipe;
import SistGestViews.ListagemColaboradores;
import SistGestViews.ListagemEquipe;
import java.awt.CardLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Aluno
 */
public class SisLojFrame extends javax.swing.JFrame {
    
    Colaborador c;
    Equipe eq;
    
    /**
     * Creates new form SisLojFrame
     */
    public SisLojFrame() {
        initComponents();
        voltar.setEnabled(false);


        //Cria os componentes

        //faz a ligacao de todas as paginas

        CadastroColaborador cad = new CadastroColaborador();

        ConnectionFactory con = new ConnectionFactory();
        
        ColaboradorDao col = new ColaboradorDao();
        
        CadastroEquipe cadeq = new CadastroEquipe();
        
        
        
        ListagemEquipe listeq = new ListagemEquipe();
        ListagemColaboradores list = new ListagemColaboradores();
        
        
       
        
        
        
        


        //adiciona todas as paginas no metodo construtor
        PainelPrincipal.add(cad, "cadColab");

        PainelPrincipal.add(loginPrincipal, "login");
        PainelPrincipal.add(menuColaborador,"menuColaborador");
        PainelPrincipal.add(menuAdministrador,"menuAdministrador");
        PainelPrincipal.add(cad, "cadColab");
        PainelPrincipal.add(cadeq, "cadastrarEquipe");
        
        
        
        PainelPrincipal.add(listeq, "listarEquipe");
        PainelPrincipal.add(list, "listagemColab");
        
        

        //Chamar a inicial aqui no caso a de login 
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(PainelPrincipal, "login");
        
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        menuColaborador = new javax.swing.JPanel();
        btnAgendaColaborador1 = new javax.swing.JButton();
        lbAgenda1 = new javax.swing.JLabel();
        btnAgendaEquipe1 = new javax.swing.JButton();
        btnEliminarTarefa1 = new javax.swing.JButton();
        btnEditarTarefa1 = new javax.swing.JButton();
        btnAdicionarTarefa1 = new javax.swing.JButton();
        lbTarefa1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnListaComproCol = new javax.swing.JButton();
        menuAdministrador = new javax.swing.JPanel();
        lbAgenda = new javax.swing.JLabel();
        lbEquipe = new javax.swing.JLabel();
        BtnCadastrarEquipe = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbColaborador = new javax.swing.JLabel();
        btnListarColaborador = new javax.swing.JButton();
        btnAgendaEquipeADM = new javax.swing.JButton();
        lbSistema = new javax.swing.JLabel();
        btnAgendaColaboradorADM = new javax.swing.JButton();
        btnListarEquipe = new javax.swing.JButton();
        btnCadastrarColaborador = new javax.swing.JButton();
        loginPrincipal = new javax.swing.JPanel();
        labelUsuario2 = new javax.swing.JLabel();
        labelSenha2 = new javax.swing.JLabel();
        cpUsuario2 = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        cpSenha = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        barraDeMenu = new javax.swing.JMenuBar();
        opcaoVoltar = new javax.swing.JMenu();
        voltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema para gestão de loja");
        setSize(new java.awt.Dimension(800, 500));

        PainelPrincipal.setLayout(new java.awt.CardLayout());

        btnAgendaColaborador1.setText("Agenda Colaborador");
        btnAgendaColaborador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaColaborador1ActionPerformed(evt);
            }
        });

        lbAgenda1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbAgenda1.setText("Agenda");

        btnAgendaEquipe1.setText("Agenda Equipe");
        btnAgendaEquipe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaEquipe1ActionPerformed(evt);
            }
        });

        btnEliminarTarefa1.setText("Eliminar");

        btnEditarTarefa1.setText("Editar");

        btnAdicionarTarefa1.setText("Adicionar");
        btnAdicionarTarefa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTarefa1ActionPerformed(evt);
            }
        });

        lbTarefa1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTarefa1.setText("Tarefas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu");

        btnListaComproCol.setText("Listar Compromissos");
        btnListaComproCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaComproColActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuColaboradorLayout = new javax.swing.GroupLayout(menuColaborador);
        menuColaborador.setLayout(menuColaboradorLayout);
        menuColaboradorLayout.setHorizontalGroup(
            menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuColaboradorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdicionarTarefa1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarTarefa1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTarefa1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuColaboradorLayout.createSequentialGroup()
                        .addComponent(lbTarefa1)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgendaColaborador1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgendaEquipe1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuColaboradorLayout.createSequentialGroup()
                        .addComponent(lbAgenda1)
                        .addGap(38, 38, 38))
                    .addComponent(btnListaComproCol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(menuColaboradorLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuColaboradorLayout.setVerticalGroup(
            menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuColaboradorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAgenda1)
                    .addComponent(lbTarefa1))
                .addGap(18, 18, 18)
                .addGroup(menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarTarefa1)
                    .addComponent(btnAgendaColaborador1))
                .addGap(18, 18, 18)
                .addGroup(menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarTarefa1)
                    .addComponent(btnAgendaEquipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuColaboradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTarefa1)
                    .addComponent(btnListaComproCol))
                .addGap(99, 99, 99))
        );

        PainelPrincipal.add(menuColaborador, "card4");

        lbAgenda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbAgenda.setText("Agenda");

        lbEquipe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbEquipe.setText("Equipe");

        BtnCadastrarEquipe.setText("Cadastrar");
        BtnCadastrarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarEquipeActionPerformed(evt);
            }
        });

        lbColaborador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbColaborador.setText("Colaborador");

        btnListarColaborador.setText("Listar");
        btnListarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarColaboradorActionPerformed(evt);
            }
        });

        btnAgendaEquipeADM.setText("Agenda Equipe");
        btnAgendaEquipeADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaEquipeADMActionPerformed(evt);
            }
        });

        lbSistema.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbSistema.setText("Menu");

        btnAgendaColaboradorADM.setText("Agenda Colaborador");
        btnAgendaColaboradorADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaColaboradorADMActionPerformed(evt);
            }
        });

        btnListarEquipe.setText("Listar");
        btnListarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEquipeActionPerformed(evt);
            }
        });

        btnCadastrarColaborador.setText("Cadastrar");
        btnCadastrarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarColaboradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuAdministradorLayout = new javax.swing.GroupLayout(menuAdministrador);
        menuAdministrador.setLayout(menuAdministradorLayout);
        menuAdministradorLayout.setHorizontalGroup(
            menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAdministradorLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAdministradorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAgendaEquipeADM))
                    .addComponent(btnAgendaColaboradorADM)
                    .addGroup(menuAdministradorLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbAgenda)))
                .addGap(43, 43, 43)
                .addGroup(menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbColaborador)
                    .addComponent(btnCadastrarColaborador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarColaborador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuAdministradorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuAdministradorLayout.createSequentialGroup()
                        .addGroup(menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnCadastrarEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuAdministradorLayout.createSequentialGroup()
                        .addGroup(menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSistema)
                            .addComponent(lbEquipe))
                        .addGap(266, 266, 266))))
        );
        menuAdministradorLayout.setVerticalGroup(
            menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAdministradorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAdministradorLayout.createSequentialGroup()
                        .addComponent(lbSistema)
                        .addGap(61, 61, 61)
                        .addGroup(menuAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menuAdministradorLayout.createSequentialGroup()
                                .addComponent(lbColaborador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrarColaborador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListarColaborador))
                            .addGroup(menuAdministradorLayout.createSequentialGroup()
                                .addComponent(lbAgenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgendaEquipeADM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgendaColaboradorADM))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(lbEquipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCadastrarEquipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarEquipe)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        PainelPrincipal.add(menuAdministrador, "card2");

        labelUsuario2.setText("Usuário:");

        labelSenha2.setText("Senha:");

        cpUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpUsuario2ActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelLogin.setText("Login");

        cpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpSenhaActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPrincipalLayout = new javax.swing.GroupLayout(loginPrincipal);
        loginPrincipal.setLayout(loginPrincipalLayout);
        loginPrincipalLayout.setHorizontalGroup(
            loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogin)
                .addGap(72, 72, 72))
            .addGroup(loginPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSenha2)
                    .addComponent(labelUsuario2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        loginPrincipalLayout.setVerticalGroup(
            loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelLogin)
                .addGap(40, 40, 40)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario2)
                    .addComponent(cpUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(86, 86, 86))
        );

        PainelPrincipal.add(loginPrincipal, "card3");

        opcaoVoltar.setText("VOLTAR PARA");
        opcaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoVoltarActionPerformed(evt);
            }
        });

        voltar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        voltar.setText("MENU");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        opcaoVoltar.add(voltar);

        barraDeMenu.add(opcaoVoltar);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // metodo responsavel por verificar se o usuario e um adm ou um usario normal quando o botao voltar for clicado
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        //puxa o tipo do cliente
          String aux = this.c.getTipo();
          //caso o tipo for 0 ele puxa o painel de adm caso contrario ele puxa o painel colaborador
            if(aux.equals("0")){
                    cl.show(PainelPrincipal, "menuAdministrador");
                }else{
                    cl.show(PainelPrincipal, "menuColaborador");
            }
    }//GEN-LAST:event_voltarActionPerformed

    private void cpUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpUsuario2ActionPerformed

    }//GEN-LAST:event_cpUsuario2ActionPerformed

    private void cpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpSenhaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //criacao de um metodo para verificar usuario e senha
        String senhaAux="",loginAux="";
        loginAux = cpUsuario2.getText();
        senhaAux = cpSenha.getText();
        
        //vincula uma pagina 
        ColaboradorDao colDao = new ColaboradorDao();
        
        
        try {
            this.c = colDao.getColaborador(loginAux, senhaAux);
            String aux = this.c.getTipo();
            //verifica se a Senha ou usuario estao corretos 
            if(this.c == null){
                //caso errado uma linda mensagem aparece
                String mensagem = "Senha ou usuario Incorretos";
                
                JOptionPane.showMessageDialog (null, mensagem);
            }else{
                //se estiver correto outra linda mensagem aparece com o o nome do usuario 
                String mensagem2 = "Bem vindo: "+this.c.getNome();
                JOptionPane.showMessageDialog (null, mensagem2);
                
                CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
                //verifica na hora do login que painel ele deve acessar de acordo com o tipo do usuario 
                if (aux.equals("1")) {
                    cl.show(this.PainelPrincipal, "menuColaborador");
                }else{
                    cl.show(this.PainelPrincipal, "menuAdministrador");
                }
                
                
                voltar.setEnabled(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SisLojFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnAgendaColaboradorADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaColaboradorADMActionPerformed
        //quando botao for pressionado ele chama outra tela no caso agendacolaborador
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(PainelPrincipal, "agendaColaborador");
    }//GEN-LAST:event_btnAgendaColaboradorADMActionPerformed

    private void btnCadastrarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarColaboradorActionPerformed
        //quando botao for pressionado ele chama outra tela no caso cadastrascolaborar
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(PainelPrincipal, "cadColab");
    }//GEN-LAST:event_btnCadastrarColaboradorActionPerformed

    private void btnListarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarColaboradorActionPerformed
        //quando botao for pressionado ele chama outra tela no caso ListarColaborador
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(PainelPrincipal, "listagemColab");
    }//GEN-LAST:event_btnListarColaboradorActionPerformed

    private void btnAgendaColaborador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaColaborador1ActionPerformed
        //quando botao for pressionado ele chama outra tela no caso AgendaColaborador
        AgendaColaboradorADM agencolab = new AgendaColaboradorADM();
        PainelPrincipal.add(agencolab, "agendaColaborador");

        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
        cl.show(PainelPrincipal, "agendaColaborador");
    }//GEN-LAST:event_btnAgendaColaborador1ActionPerformed

    private void btnAdicionarTarefa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTarefa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarTarefa1ActionPerformed

    private void btnListaComproColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaComproColActionPerformed
       ListagemAgendaColaborador ag = new ListagemAgendaColaborador();
       PainelPrincipal.add(ag, "listagemAgColab");
       //quando botao for pressionado ele chama outra tela no caso ListaComproColA
       CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
       cl.show(PainelPrincipal, "listagemAgColab");
    }//GEN-LAST:event_btnListaComproColActionPerformed

    private void btnListaComproAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaComproAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListaComproAdmActionPerformed

    private void opcaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcaoVoltarActionPerformed

    private void BtnCadastrarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarEquipeActionPerformed
       //quando botao for pressionado ele chama outra tela no caso CadastrarEquipe
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
       cl.show(PainelPrincipal, "cadastrarEquipe");
    }//GEN-LAST:event_BtnCadastrarEquipeActionPerformed

    private void btnListarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEquipeActionPerformed
       //quando botao for pressionado ele chama outra tela no caso ListarEquipe
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
       cl.show(PainelPrincipal, "listarEquipe");
    }//GEN-LAST:event_btnListarEquipeActionPerformed

    private void btnAgendaEquipe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaEquipe1ActionPerformed

       //quando botao for pressionado ele chama outra tela no caso agendaEquipe
        CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
       cl.show(PainelPrincipal, "agendaEquipe");

    }//GEN-LAST:event_btnAgendaEquipe1ActionPerformed

    private void btnAgendaEquipeADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaEquipeADMActionPerformed
       //quando botao for pressionado ele chama outra tela no caso agendaEquipe
       ListagemAgendaColaborador ag = new ListagemAgendaColaborador();
       PainelPrincipal.add(ag, "listaAgColab");

       
       CardLayout cl = (CardLayout) PainelPrincipal.getLayout();
       cl.show(PainelPrincipal, "agendaEquipe");
    }//GEN-LAST:event_btnAgendaEquipeADMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SisLojFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrarEquipe;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JButton btnAdicionarTarefa1;
    private javax.swing.JButton btnAgendaColaborador1;
    private javax.swing.JButton btnAgendaColaboradorADM;
    private javax.swing.JButton btnAgendaEquipe1;
    private javax.swing.JButton btnAgendaEquipeADM;
    private javax.swing.JButton btnCadastrarColaborador;
    private javax.swing.JButton btnEditarTarefa1;
    private javax.swing.JButton btnEliminarTarefa1;
    private javax.swing.JButton btnListaComproCol;
    private javax.swing.JButton btnListarColaborador;
    private javax.swing.JButton btnListarEquipe;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField cpSenha;
    private javax.swing.JTextField cpUsuario2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha2;
    private javax.swing.JLabel labelUsuario2;
    private javax.swing.JLabel lbAgenda;
    private javax.swing.JLabel lbAgenda1;
    private javax.swing.JLabel lbColaborador;
    private javax.swing.JLabel lbEquipe;
    private javax.swing.JLabel lbSistema;
    private javax.swing.JLabel lbTarefa1;
    private javax.swing.JPanel loginPrincipal;
    private javax.swing.JPanel menuAdministrador;
    private javax.swing.JPanel menuColaborador;
    private javax.swing.JMenu opcaoVoltar;
    private javax.swing.JMenuItem voltar;
    // End of variables declaration//GEN-END:variables
}
