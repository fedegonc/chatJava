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
public class Atendimento extends Thread{
    private Socket socketConexao = null;
    public Atendimento(Socket s){
        this.socketConexao = s;
        this.start();
    }
    public void run(){
            try{
                Thread.sleep((long)(Math.random() * 10000));
                BufferedReader doCliente = new BufferedReader(new InputStreamReader(socketConexao.getInputStream()));
                DataOutputStream paraCliente = new DataOutputStream(socketConexao.getOutputStream());
                String dados = doCliente.readLine();
                System.out.println("Recebido do cliente: "+dados);
                paraCliente.writeBytes(dados.toUpperCase()+"\n");
                System.out.println("Modificacao enviada para cliente");
                System.out.println(""+Thread.currentThread().getId());
                System.out.println(""+Thread.currentThread().getName());
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}


