/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegraficas;

import Cliente.ClienteServidor;
import Cliente.ClienteDados;
import Dados.Dados;
import Servidor.Jogo;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aluno
 */
public class TeladoJogo extends javax.swing.JFrame implements ActionListener {

    JButton[] Botoes;

    //Metodo Singleton
    private static TeladoJogo clienteJogo_Tela = null;

    //Metodo Singleton
    public static TeladoJogo get() {
        if (clienteJogo_Tela == null) {
            clienteJogo_Tela = new TeladoJogo();
        }
        return clienteJogo_Tela;
    }

    public TeladoJogo() {

        initComponents();
        iniciarTabuleiro();
        setLocationRelativeTo(null);

    }

    //Criando Botoes no Tabuleiro
    public JButton[] criarBotoes() {
        return new JButton[ClienteDados.get().getPosicoesTabuleiro()];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prin = new javax.swing.JPanel();
        grid = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListJogadores = new javax.swing.JList<>();
        jPanelStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtextFieldAcertos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldErros = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPontuacao = new javax.swing.JTextField();
        jLabelInformacoes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Batalha Naval Senai");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        prin.setBackground(new java.awt.Color(255, 255, 255));
        prin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prin.setPreferredSize(new java.awt.Dimension(629, 614));

        grid.setBackground(new java.awt.Color(255, 255, 255));
        grid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout gridLayout = new javax.swing.GroupLayout(grid);
        grid.setLayout(gridLayout);
        gridLayout.setHorizontalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        gridLayout.setVerticalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jListJogadores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(jListJogadores);

        jPanelStatus.setBackground(new java.awt.Color(255, 255, 0));
        jPanelStatus.setLayout(null);

        jLabelStatus.setBackground(new java.awt.Color(255, 255, 255));
        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatus.setText("Aguarde a sua vez");
        jPanelStatus.add(jLabelStatus);
        jLabelStatus.setBounds(0, 10, 170, 40);

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Acertos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Erros");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Pontuação");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPontuacao))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtextFieldAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldErros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtextFieldAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldErros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelInformacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelInformacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInformacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout prinLayout = new javax.swing.GroupLayout(prin);
        prin.setLayout(prinLayout);
        prinLayout.setHorizontalGroup(
            prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prinLayout.createSequentialGroup()
                .addGroup(prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prinLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 529, Short.MAX_VALUE))
                    .addGroup(prinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        prinLayout.setVerticalGroup(
            prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prinLayout.createSequentialGroup()
                        .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prin, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prin, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public void iniciarTabuleiro() {
            int linha = 0, coluna = 0, tamanho = 0;
        if (ClienteDados.get().getQtdLinhas() <= 14 && ClienteDados.get().getQtdColunas() <= 29) {
            int calc = ((ClienteDados.get().getQtdLinhas() * 40) + 180);
            int calc2 = ((ClienteDados.get().getQtdColunas() * 40) + 190);
            tamanho = 40;
            linha = calc;
            coluna = calc2;
        } else {
            int calc = ((ClienteDados.get().getQtdLinhas() * 30) + 180);
            int calc2 = ((ClienteDados.get().getQtdColunas() * 30) + 190);
            tamanho = 30;
            linha = calc;
            coluna = calc2;
        }

        setSize(coluna, linha);
        prin.setSize(coluna, linha);
        grid.setLayout(new GridLayout(ClienteDados.get().getQtdLinhas(), ClienteDados.get().getQtdColunas(), 2, 2));
        Botoes = criarBotoes();
        for (int posicao = 0; posicao < ClienteDados.get().getPosicoesTabuleiro(); posicao++) {
            Botoes[posicao] = new JButton("");
            Botoes[posicao].setPreferredSize(new Dimension(tamanho, tamanho));
            Botoes[posicao].setIcon(new ImageIcon(TeladoJogo.class.getResource("/imagens/mar2.png")));
            Botoes[posicao].addActionListener(this);
            grid.add(Botoes[posicao]);
        }
        String[] listJogadores = new String[ClienteDados.get().getListJogadores().size()];
        for (int i = 0; i < ClienteDados.get().getListJogadores().size(); i++) {
            listJogadores[i] = ClienteDados.get().getListJogadores().get(i);
        }
        jListJogadores.setListData(listJogadores);
    }

    public void actionPerformed(ActionEvent e) {
        if (ClienteDados.get().getsJogo()) {
            for (int posicao = 0; posicao < ClienteDados.get().getPosicoesTabuleiro(); posicao++) {
                if (e.getSource() == Botoes[posicao]) {
                    if (!ClienteDados.get().getPosicoesAtiradas().contains(posicao)) {
                        if (ClienteDados.get().getnCruzados().contains(posicao)) {
                            Botoes[posicao].setIcon(new ImageIcon(TeladoJogo.class.getResource("/imagens/CruzadorH.png")));
                            ClienteDados.get().setPontos(15);
                            ClienteDados.get().setAcertos(1);
                            ClienteDados.get().setPosicoesAtiradas(posicao);
                            ClienteDados.get().setPosicaoTiro(posicao);
                            setJogador();
                            atualizarStatusJogador(false);
                            jLabelInformacoes.setText("Você acertou um cruzador +15 pontos");

                        } else if (ClienteDados.get().getnDestroyers().contains(posicao)) {
                            Botoes[posicao].setIcon(new ImageIcon(TeladoJogo.class.getResource("/imagens/DestroierH.png")));
                            ClienteDados.get().setPontos(5);
                            ClienteDados.get().setAcertos(1);
                            ClienteDados.get().setPosicoesAtiradas(posicao);
                            ClienteDados.get().setPosicaoTiro(posicao);
                            setJogador();
                            atualizarStatusJogador(false);
                            jLabelInformacoes.setText("Você acertou um destroyer +5 pontos");

                        } else if (ClienteDados.get().getnPortas().contains(posicao)) { //Se posição contem navio Porta Avioes mostra...
                            Botoes[posicao].setIcon(new ImageIcon(TeladoJogo.class.getResource("/imagens/PortaAvioesH.jpg")));
                            ClienteDados.get().setPontos(10);
                            ClienteDados.get().setAcertos(1);
                            ClienteDados.get().setPosicoesAtiradas(posicao);
                            ClienteDados.get().setPosicaoTiro(posicao);
                            setJogador();
                            atualizarStatusJogador(false);
                            jLabelInformacoes.setText("Você acertou um porta-avião +10 pontos");

                        } else {
                            Botoes[posicao].setIcon(new ImageIcon(TeladoJogo.class.getResource("/imagens/agua.png")));
                            ClienteDados.get().setErros(1);
                            ClienteDados.get().setPosicoesAtiradas(posicao);
                            ClienteDados.get().setPosicaoTiro(posicao);
                            setJogador();
                            atualizarStatusJogador(false);
                            jLabelInformacoes.setText("Você errou");
                        }
                    } else {
                        jLabelInformacoes.setText("Posição já atingida");
                    }
                }
                jtextFieldAcertos.setText(String.valueOf(ClienteDados.get().getAcertos()));
                jTextFieldErros.setText(String.valueOf(ClienteDados.get().getErros()));
                jTextFieldPontuacao.setText(String.valueOf(ClienteDados.get().getPontos()));                
                
            }
        } else {
            jLabelInformacoes.setText("Aguarde a sua vez para jogar");
        }
    }

    public void atualizarTabuleiro() {
        if (!ClienteDados.get().getPosicoes().isEmpty()) {
            String posicoes[] = ClienteDados.get().getPosicoes().split(";");
            for (int i = 0; i < posicoes.length; i++) {
                if (!ClienteDados.get().getPosicoesAtiradas().contains(Integer.parseInt(posicoes[i]))) {
                    Botoes[Integer.parseInt(posicoes[i])].setIcon(new ImageIcon(TeladoJogo.class
                            .getResource("/imagens/fogo.png")));
                    ClienteDados.get().setPosicoesAtiradas(Integer.parseInt(posicoes[i]));
                }
            }
        }
    }

    public void atualizarStatusJogador(boolean x) {
        ClienteDados.get().setsJogo(x);
        if (x) {
            jLabelStatus.setText("Sua vez!");
            jPanelStatus.setBackground(Color.GREEN);

        } else {
            jLabelStatus.setText("Aguarde!");
            jPanelStatus.setBackground(Color.ORANGE);
        }
    }

    public void setJogador() {
        ClienteDados.get().setsJogo(false);
        Dados jogador = new Dados();
        jogador.setAction(Dados.Action.SJOGO);
        jogador.setPontos(ClienteDados.get().getPontos());
        jogador.setAcertos(ClienteDados.get().getAcertos());
        jogador.setErros(ClienteDados.get().getErros());
        jogador.setPosicaoTiro(ClienteDados.get().getPosicaoTiro());
        jogador.setId(ClienteDados.get().getId());
        ClienteServidor.get().setAtualizarJogo(jogador);
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelInformacoes;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JList<String> jListJogadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldErros;
    private javax.swing.JTextField jTextFieldPontuacao;
    private javax.swing.JTextField jtextFieldAcertos;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel prin;
    // End of variables declaration//GEN-END:variables
}
