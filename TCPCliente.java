/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author victormalves
 */
public class TCPCliente {
    public static void main(String args[]) throws Exception{
        System.out.println("Cliente");
        String texto = "texto para servidor";
        Socket clientSocket = new Socket("127.0.0.1",6789);
        DataOutputStream paraServidor = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader doServidor = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        paraServidor.writeBytes(texto+"\n");
        System.out.println("Texto enviado para servidor");
        String resposta = doServidor.readLine();
        System.out.println("Resposta recebida do servidor");
        System.out.println(resposta);
        clientSocket.close();
    }
    
}
