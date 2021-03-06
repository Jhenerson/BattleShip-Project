/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Action;

/**
 *
 * @author Jhenerson
 */
public class Dados implements Serializable {
    //Informações do Jogo
    private ArrayList<String> listJogadores = new ArrayList<>();
    private ArrayList<String> statusJogadores = new ArrayList<>();
    private ArrayList<String> posicoesPreenchidas = new ArrayList<>();
    private ArrayList<Integer> nCruzados = new ArrayList<>();
    private ArrayList<Integer> nDestroyers = new ArrayList<>();
    private ArrayList<Integer> nPortas = new ArrayList<>();
    //Informações do Jogador
    private int pontos = 0, acertos = 0, erros = 0, id = 0,posicaoTiro = 0,qtdLinhas = 0,qtdColunas = 0,qtdPosicoes = 0;
    private Action action;
    private String nome = "",posicoes = "";
    private boolean sJogo,sStart;

    public String getPosicoes() {
        return posicoes;
    }

    public void setPosicoes(String posicoes) {
        this.posicoes+= posicoes;
    }

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

    public int getQtdPosicoes() {
        return qtdPosicoes;
    }

    public void setQtdPosicoes(int qtdPosicoes) {
        this.qtdPosicoes = qtdPosicoes;
    }

    public ArrayList<String> getStatusJogadores() {
        return statusJogadores;
    }

    public void setStatusJogadores(String status) {
        this.statusJogadores.add(status);
    }

    public ArrayList<String> getListJogadores() {
        return listJogadores;
    }

    public void setListJogadores(String nome) {
        this.listJogadores.add(nome);
    }

    public ArrayList<String> getPosicoesPreenchidas() {
        return posicoesPreenchidas;
    }

    public void setPosicoesPreenchidas(ArrayList<String> posicoesPreenchidas) {
        this.posicoesPreenchidas = posicoesPreenchidas;
    }
    public ArrayList<Integer> getnCruzados() {
        return nCruzados;
    }

    public void setnCruzados(ArrayList<Integer> nCruzados) {
        this.nCruzados = nCruzados;
    }

    public ArrayList<Integer> getnDestroyers() {
        return nDestroyers;
    }

    public void setnDestroyers(ArrayList<Integer> nDestroyers) {
        this.nDestroyers = nDestroyers;
    }

    public ArrayList<Integer> getnPortas() {
        return nPortas;
    }

    public void setnPortas(ArrayList<Integer> nPortas) {
        this.nPortas = nPortas;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosicaoTiro() {
        return posicaoTiro;
    }

    public void setPosicaoTiro(int posicaoTiro) {
        this.posicaoTiro = posicaoTiro;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getSJogo() {
        return sJogo;
    }

    public void setsJogo(boolean sJogo) {
        this.sJogo = sJogo;
    }

    public boolean getsStart() {
        return sStart;
    }

    public void setsStart(boolean sStart) {
        this.sStart = sStart;
    }
    public enum Action{
        CONECTAR,DESCONECTAR,SSTART,SJOGO,ATUALIZAR_JOGADORES,ATUALIZAR_JOGO,INICIAR_JOGO,FINAL
    }
}
