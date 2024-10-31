/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formulario;

import DAO.PessoaDAO;
import Thread.ThreadServer;
import beans.Pessoa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int porta = 12345; // Use uma constante para a porta
        
        try (ServerSocket servidorSocket = new ServerSocket (porta)){
            System.out.println("Servidor aguardando conexoes na porta "+porta);

            while(true){
                try{
                    Socket clienteSocket = servidorSocket.accept();
                    System.out.println("Conexao aceita de "+ clienteSocket.getInetAddress());
                    Thread threadCliente = new ThreadServer(clienteSocket);
                    threadCliente.start();
                    
                    /*
                    ObjectOutputStream out = new ObjectOutputStream (clienteSocket.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream (clienteSocket.getInputStream());

                    int id = in.readInt();
                    System.out.println("Id recebido: "+ id);

                    //simule a obtencao de uma pessoa a partir do id
                    PessoaDAO pdao = new PessoaDAO();
                    Pessoa p = pdao.getPessoa(id);

                    out.writeObject(p);
                    */
                    
                    
                }catch(IOException ex){
                    System.out.println("Erro ao ceitar conexao do cliente");
                }
            }
        }catch (IOException ex){
            System.out.println("Erro ao criar o ServerSocket");
        }
    }
}
