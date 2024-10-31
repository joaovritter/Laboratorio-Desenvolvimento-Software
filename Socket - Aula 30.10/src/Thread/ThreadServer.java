/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread;

import DAO.PessoaDAO;
import beans.Pessoa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author laboratorio
 */
public class ThreadServer extends Thread {
    private Socket clienteSocket;
    
    public ThreadServer (Socket clienteSocket){
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {
        try {
            ObjectOutputStream out = new ObjectOutputStream (clienteSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream (clienteSocket.getInputStream());
            
            int id = in.readInt();
            System.out.println("Id Recebido: "+id);
            
            //simule a obtencao de uma Pessoa a partir do ID
            PessoaDAO pdao = new PessoaDAO();
            Pessoa p = pdao.getPessoa(id);
            
            out.writeObject(p);
            
        }catch(IOException e){
            System.out.println("Erro ao lidar com o cliente");
            
        }
    }
    
    
}
