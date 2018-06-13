/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Dados.Dados;
import Servidor.Jogo;
import Servidor.ServidorSocket;
import interfacegraficas.TelaServidor;
import interfacegraficas.TeladoJogo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodolpho
 */
public class ClienteServidor {

    private Socket socket;
    private ObjectOutputStream output;
    public String ip;
    private static ClienteServidor clienteServidor = null;

    public static ClienteServidor get() {
        if (clienteServidor == null) {
            clienteServidor = new ClienteServidor();
        }
        return clienteServidor;
    }

    public ClienteServidor() {
    }

    public void iniciarConexao(String ip) throws IOException {

        this.socket = new Socket(ip, 5000);
        this.output = new ObjectOutputStream(socket.getOutputStream());
        new Thread(new ListenerSocket(socket)).start();
    }

    private class ListenerSocket implements Runnable {

        private ObjectInputStream input;

        public ListenerSocket(Socket socket) {
            try {
                this.input = new ObjectInputStream(socket.getInputStream());

            } catch (IOException ex) {

            }
        }

        @Override
        public void run() {

            Dados jogador = null;
            try {
                while ((jogador = (Dados) input.readObject()) != null) {

                    switch (jogador.getAction()) {
                        case CONECTAR:
                            getConectar(jogador);
                            break;
                        case ATUALIZAR_JOGADORES:
                            getAtualizarJogadores(jogador);
                            break;
                        case INICIAR_JOGO:
                            getIniciarJogo(jogador);
                            break;
                        case SJOGO:
                            getSjogo(jogador);
                            break;
                        case ATUALIZAR_JOGO:
                            getAtualizarJogo(jogador);
                            break;
                        
                        default:
                            break;
                    }
                }
            } catch (IOException | ClassNotFoundException ex) {

            }

        }

    }

    public void getConectar(Dados jogador) {
        ClienteDados.get().setId(jogador.getId());
        ClienteDados.get().setPosicoesTabuleiro(jogador.getQtdPosicoes());
        ClienteDados.get().setQtdLinhas(jogador.getQtdLinhas());
        ClienteDados.get().setQtdColunas(jogador.getQtdColunas());
        ClienteDados.get().setsJogo(jogador.getSJogo());
        ClienteDados.get().setnCruzados(jogador.getnCruzados());
        ClienteDados.get().setnDestroyers(jogador.getnDestroyers());
        ClienteDados.get().setnPortas(jogador.getnPortas());
        System.out.println("recebido");
    }

    public void getAtualizarJogadores(Dados jogador) {
        ClienteDados.get().setListJogadores(jogador.getListJogadores());
        ClienteDados.get().setStatusJogadores(jogador.getStatusJogadores());
        TelaServidor.get().atualizarListJogadores();
    }

    public void getIniciarJogo(Dados jogador) {
        TelaServidor.get().iniciarJogo();
    }

    public void getAtualizarJogo(Dados jogador) {
        ClienteDados.get().setPosicoes(jogador.getPosicoes());
        TeladoJogo.get().atualizarTabuleiro();
    }

    
    
    public void setAtualizarJogo(Dados jogador) {
        try {

            output.writeObject(jogador);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possivel Enviar a Messagem");
        }
    }

    public void getSjogo(Dados jogador) {
        ClienteDados.get().setsJogo(true);
        TeladoJogo.get().atualizarStatusJogador(true);
        TeladoJogo.get().atualizarTabuleiro();
    }

    public void setStartJogo(Dados jogador) {
        try {

            output.writeObject(jogador);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possivel Enviar a Messagem");
        }
    }

    public void setSjogo(Dados jogador) {

    }

    public void setConectar(Dados jogador) {
        try {

            output.writeObject(jogador);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possivel Enviar a Messagem");
        }
    }
}
