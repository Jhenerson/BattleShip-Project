/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;


import Jogador.Jogadores;
import Navio.PortaAviao;
import Navio.Destroyer;
import Navio.Cruzador;
import java.util.ArrayList;
import java.util.Random;
import interfaces.Navio;

/**
 *
 *
 * @author rodolpho
 */
public class Jogo {

    
    private ArrayList<Jogadores> listaJogadores = new ArrayList<>();
    private ArrayList<Navio> listaNavios = new ArrayList<>();
    private ArrayList<String> posicoesPreenchidas = new ArrayList<>();
    private boolean finaly = false;

    public boolean isFinaly() {
        return finaly;
    }
    public void setFinaly(boolean finaly) {
        this.finaly = finaly;
    }
    public ArrayList<String> getPosicoesPreenchidas() {
        return posicoesPreenchidas;
    }
    public void setPosicoesPreenchidas(String tiro) {
        this.posicoesPreenchidas.add(tiro);
        if (posicoesPreenchidas.size() >= getQtdPosicoes()) {
            setFinaly(true);
        }
    }
    private int qtdPosicoes = 0, qtdLinhas, qtdColunas;

    public int getQtdLinhas() {
        return qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public int getQtdColunas() {
        return qtdColunas;
    }

    public void setQtdColunas(int qtdColunas) {
        this.qtdColunas = qtdColunas;
    }
    //Instância unica - controlador
    private static Jogo serverJogo = null;

    // Metodo estatico para obter instancia da classe
    public static Jogo getJogo() {
        if (serverJogo == null) {
            serverJogo = new Jogo();
        }
        return serverJogo;
    }

    public ArrayList<Jogadores> getListJogadores() {
        return listaJogadores;
    }

    public ArrayList<Navio> getListNavios() {
        return listaNavios;
    }

    public int getQtdPosicoes() {
        return qtdPosicoes;
    }

    public void setQtdPosicoes(int qtdPosicoes) {
        this.qtdPosicoes = qtdPosicoes;
    }

    public void iniciarJogo(int linhas, int colunas) throws Exception {
        if (linhas < 10 || colunas < 10 || linhas > 15 || colunas > 30) {
            throw new Exception("erro");
        }
        qtdLinhas = linhas;
        qtdColunas = colunas;
        qtdPosicoes = linhas * colunas;
        listaNavios.add(new Cruzador());
        listaNavios.add(new Destroyer());
        listaNavios.add(new PortaAviao());

        listaNavios.get(0).setQtdNavio((qtdPosicoes * 10) / 100);
        listaNavios.get(1).setQtdNavio((qtdPosicoes * 20) / 100);
        listaNavios.get(2).setQtdNavio((qtdPosicoes * 10) / 100);
        System.out.println("");
        Random random = new Random();

        //Random nos Navios Cruzados
        for (int i = 1; i <= listaNavios.get(0).getQtdNavio(); i++) {
            while (true) {
                int x = random.nextInt(qtdPosicoes);
                if (listaNavios.get(0).retornaNavio().contains(x)) {
                } else {
                    listaNavios.get(0).adicionarNavio(x);
                    break;
                }
            }
        }
        //Random nos Navios Destroiers
        for (int l = 1; l <= listaNavios.get(1).getQtdNavio(); l++) {
            while (true) {
                int x = random.nextInt(qtdPosicoes);
                if (listaNavios.get(0).retornaNavio().contains(x) || listaNavios.get(1).retornaNavio().contains(x)) {
                } else {
                    listaNavios.get(1).adicionarNavio(x);
                    break;
                }
            }
        }
        //Random nos Navios Porta Avioes
        for (int y = 1; y <= listaNavios.get(2).getQtdNavio(); y++) {
            while (true) {
                int x = random.nextInt(qtdPosicoes);
                if (listaNavios.get(0).retornaNavio().contains(x) || listaNavios.get(1).retornaNavio().contains(x) || listaNavios.get(2).retornaNavio().contains(x)) {
                } else {
                    listaNavios.get(2).adicionarNavio(x);
                    break;
                }
            }
        }
    }

    public int adicionarJogador(String nome) {
        if (listaJogadores.size() == 0) {
            listaJogadores.add(new Jogadores());
            listaJogadores.get(listaJogadores.size() - 1).setNome(nome);
            listaJogadores.get(0).setStatusJogo(true);
        } else {
            listaJogadores.add(new Jogadores());
            listaJogadores.get(listaJogadores.size() - 1).setNome(nome);
        }

        return listaJogadores.size() - 1;
    }

    public void getStatusJogo(int id) {
        if (id == listaJogadores.size() - 1) {
            listaJogadores.get(id).setStatusJogo(false);
            listaJogadores.get(0).setStatusJogo(true);
        } else {
            listaJogadores.get(id).setStatusJogo(false);
            listaJogadores.get(id + 1).setStatusJogo(true);
        }
    }
    

}
