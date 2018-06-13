

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    
    public static void main(String args[]) throws Exception {
        
        String sentence;
        String modifiedSentence;
        int port = 6789;
        Socket clientSocket = new Socket("127.0.0.1", port);
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outServer =  new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        sentence = inFromUser.readLine();
        outServer.writeBytes(sentence+"\n");
        modifiedSentence = inFromServer.readLine();
        
        System.out.println("Texto enviado do servidor: "+modifiedSentence);
        clientSocket.close();
    }
}