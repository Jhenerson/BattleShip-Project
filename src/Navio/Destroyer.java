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
public class Destroyer implements Navio {

    
    private int qtdDestroyer;    
    private int pontos = 5;
    private String descricao = "Destroyer";
    private ArrayList<Integer> destroyer = new ArrayList<Integer>();

    @Override
    public void adicionarNavio(int posicao) {
        destroyer.add(posicao);
    }

    @Override
    public ArrayList<Integer> retornaNavio() {
        return destroyer;
    }

    @Override
    public void setQtdNavio(int qtd) {
        qtdDestroyer = qtd;
    }

    @Override
    public int getQtdNavio() {
        return qtdDestroyer;
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
        qtdDestroyer--;
        return destroyer.remove(destroyer.indexOf(posicao));
    }

}
