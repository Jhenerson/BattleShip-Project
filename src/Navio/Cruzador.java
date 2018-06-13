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
 * 
 */
public class Cruzador implements Navio {

    
  
    private int qtdCruzador;
    private int pontos = 10;
    private String descricao= "Cruzador";
    private ArrayList<Integer> cruzador = new ArrayList<Integer>();

    @Override
    public void adicionarNavio(int posicao) {
        cruzador.add(posicao);
    }

    @Override
    public ArrayList<Integer> retornaNavio() {
        return cruzador;
    }

    @Override
    public void setQtdNavio(int qtd) {
        qtdCruzador = qtd;
    }

    @Override
    public int getQtdNavio() {
        return qtdCruzador;
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
    qtdCruzador--;
    return cruzador.remove(cruzador.indexOf(posicao));
   
    
    }

}
