/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author victormalves
 */
public class TCPDespachante {
    public static void main(String args[]) throws Exception{
        ServerSocket welcomeSocket = new ServerSocket(6789);
        System.out.println("Servidor");
        while(true){
            Socket socketConexao = welcomeSocket.accept();
            System.out.println("Conexao realizada");
            Atendimento a = new Atendimento(socketConexao);
        }
    }
}


