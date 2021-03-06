package Jogador;

import interfaces.Jogador;
import java.util.ArrayList;


public class Jogadores implements Jogador {

    private String nome;
    private int qtdErros = 0,qtdAcertos = 0,pontos = 0,id = 0;
    private ArrayList<Integer> tiro = new ArrayList<Integer>();
    private boolean statusJogo = false, statusStart = false;
   
   

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setPontos(int pontos) {
        this.pontos+= pontos;
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    @Override
    public void setQtdErros(int qtdErros) {
        this.qtdErros+= qtdErros;
    }

    @Override
    public int getQtdErros() {
        return qtdErros;
    }

    @Override
    public void setQtdAcertos(int qtdAcertos) {
        this.qtdAcertos+= qtdAcertos;
    }

    @Override
    public int getQtdAcertos() {
        return qtdAcertos;
    }

    @Override
    public boolean getStatusJogo() {
        return statusJogo;
    }

    @Override
    public void setStatusJogo(boolean status) {
        this.statusJogo = status;
    }

    @Override
    public void setTiros(int tiro) {
        this.tiro.add(tiro);
    }

    @Override
    public ArrayList<Integer> getTiros() {
        return tiro;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean getStart() {
        return statusStart;
    }

    @Override
    public void setStart(boolean status) {
        this.statusStart = status;
    }

   
}



