/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Navio;

import interfaces.Navio;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class PortaAviao implements Navio {

    
    private int qtdPortaAviao;
    private int pontos = 15;
    private String descricao = "Porta-Avião";
    private ArrayList<Integer> portaAviao = new ArrayList<Integer>();
    
    @Override
    public void adicionarNavio(int posicao) {
        portaAviao.add(posicao);
    }

    @Override
    public ArrayList<Integer> retornaNavio() {
        return portaAviao;
    }

    @Override
    public void setQtdNavio(int qtd) {
        qtdPortaAviao = qtd;
    }

    @Override
    public int getQtdNavio() {
        return qtdPortaAviao;
    }

    @Override
    public String descricao() {
        return descricao;
    }

    @Override
    public int pontoNavio() {
        return pontos;
    }

    @Override
    public int removeNavio(int posicao) {
        qtdPortaAviao--;
        return portaAviao.remove(portaAviao.indexOf(posicao));
    }

}
