/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegraficas;

import Cliente.ClienteDados;
import Cliente.ClienteServidor;
import Dados.Dados;
import Dados.Dados.Action;
import Servidor.Jogo;
import Servidor.ServidorSocket;
import interfacegraficas.TeladoJogo;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author jhene
 */
public class TelaServidor extends javax.swing.JFrame {

    private static TelaServidor clienteServidor_Tela = null;
    public static TelaServidor get() {
        if (clienteServidor_Tela == null) {
            clienteServidor_Tela = new TelaServidor();
        }
        return clienteServidor_Tela;
    }

    /**
     * Creates new form TelaServidor
     */
    public TelaServidor() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListJogadores = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        btnIniciarServidor = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLinhas = new javax.swing.JTextField();
        txtColunas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGerarTabuleiro = new javax.swing.JButton();
        btnIniciarJogo = new javax.swing.JButton();
        jLabelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jScrollPane1.setViewportView(jListJogadores);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnIniciarServidor.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarServidor.setText("Iniciar Servidor");
        btnIniciarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarServidorActionPerformed(evt);
            }
        });

        jLabelStatus.setBackground(new java.awt.Color(255, 255, 255));
        jLabelStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus.setText("Offline");
        jLabelStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Status");

        txtColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColunasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Linhas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Colunas");

        btnGerarTabuleiro.setBackground(new java.awt.Color(255, 255, 255));
        btnGerarTabuleiro.setText("Gerar Tabuleiro");
        btnGerarTabuleiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarTabuleiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColunas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLinhas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIniciarServidor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnGerarTabuleiro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGerarTabuleiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIniciarServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnIniciarJogo.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarJogo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnIniciarJogo.setText("Pronto");
        btnIniciarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJogoActionPerformed(evt);
            }
        });

        jLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnIniciarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarServidorActionPerformed
        try {
            //Iniciando Servidor          
            ServidorSocket.get().iniciar();
            ClienteServidor.get().iniciarConexao(String.valueOf(ClienteDados.get().getIp()));
            
            btnIniciarServidor.setText("Iniciado");
            jLabelStatus.setText("Online");
            jLabelStatus.setForeground(Color.GREEN);
            jLabelInfo.setText("Servidor Iniciado");
            btnIniciarServidor.setEnabled(false);

            jLabelInfo.setText("Aguardando Jogadores!");
            btnIniciarJogo.setText("Aguardando");
            btnIniciarJogo.setBackground(Color.YELLOW);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel iniciar ao servidor!", "Erro ao criar o servidor", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnIniciarServidorActionPerformed

    private void txtColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColunasActionPerformed

    private void btnIniciarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarJogoActionPerformed
        Dados jogador = new Dados();
        jogador.setId(ClienteDados.get().getId());
        jogador.setsStart(true);
        jogador.setAction(Action.SSTART);
        ClienteServidor.get().setStartJogo(jogador);
    }//GEN-LAST:event_btnIniciarJogoActionPerformed

    private void btnGerarTabuleiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarTabuleiroActionPerformed
        // TODO add your handling code here:
        try {
            if(ServidorSocket.get() == null)throw new Exception("Favor Iniciar Servidor");
            if(txtColunas.getText().isEmpty())throw new Exception("Favor digitar coluna");
            if(txtLinhas.getText().isEmpty())throw new Exception("Favor digitar linha");
            ClienteDados.get().setQtdLinhas(Integer.parseInt(txtLinhas.getText()));
            ClienteDados.get().setQtdColunas(Integer.parseInt(txtColunas.getText()));
            
            Jogo.getJogo().iniciarJogo(ClienteDados.get().getQtdLinhas(), ClienteDados.get().getQtdColunas());
            Dados jogador = new Dados();
            jogador.setAction(Action.CONECTAR);
            jogador.setNome(ClienteDados.get().getNome());
            ClienteServidor.get().setConectar(jogador);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnGerarTabuleiroActionPerformed

    /**
     * @param args the command line arguments
     */
    public void atualizarListJogadores(){
        String[] jogadores = new String[ClienteDados.get().getListJogadores().size()];
        for(int i=0;i<ClienteDados.get().getListJogadores().size();i++){
            jogadores[i] = ClienteDados.get().getListJogadores().get(i);
            jogadores[i]+=ClienteDados.get().getStatusJogadores().get(i);
        }
        jListJogadores.setListData(jogadores);
    }
    public void iniciarJogo(){
        TeladoJogo.get().setVisible(true);
        setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarTabuleiro;
    private javax.swing.JButton btnIniciarJogo;
    private javax.swing.JButton btnIniciarServidor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JList<String> jListJogadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtColunas;
    private javax.swing.JTextField txtLinhas;
    // End of variables declaration//GEN-END:variables
}
