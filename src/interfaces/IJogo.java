package interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Jogador.Jogadores;
import interfaces.Navio;
import java.util.ArrayList;

/**
 *
 * @author jhenerson
 */
public interface IJogo {
    public ArrayList<Jogadores> getListJogadores();
    public ArrayList<Navio> getListNavios();
    public int getQtdPosicoes();
    public void setQtdPosicoes(int qtdPosicoes);
    public void iniciarJogo(int tamanho)  throws Exception;
}
