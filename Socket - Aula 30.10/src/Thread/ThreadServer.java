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
 * Classe que gerencia a comunicação com um cliente conectado ao servidor. 
 * Cada instância é executada em uma thread separada,
 * permitindo atender múltiplos clientes simultaneamente
 * @author laboratorio
 */
public class ThreadServer extends Thread {
    private Socket clienteSocket;
    
    /**
     * Construtor da Classe ThreadServer
     * O construtor recebe um objeto Socket que representa a conexão com o cliente. 
     * Este socket é usado para enviar e receber dados.
     * @param clienteSocket 
     */
    
    public ThreadServer (Socket clienteSocket){ //cria o construtor
        this.clienteSocket = clienteSocket;
    }
    /**
     * Método executado quando a thread é inciada.
     * Gerencia a comunicação com cliente, de entrada (in) e saida (out).
     */
    @Override
    public void run() { 
        try {
            ObjectOutputStream out = new ObjectOutputStream (clienteSocket.getOutputStream());
            //fluxo de saida para enviar objetos ao ciente
            ObjectInputStream in = new ObjectInputStream (clienteSocket.getInputStream());
            //fluxo de entrada para receber objetos do cliente
           
            int id = in.readInt(); //le um inteiro enviado pelo cliente
            System.out.println("Id Recebido: "+id);
            
            //simule a obtencao de uma Pessoa a partir do ID
            PessoaDAO pdao = new PessoaDAO();
            Pessoa p = pdao.getPessoa(id);
            
            out.writeObject(p); //envia o objeto Pessoa encontrado de volta ao cliente 
            
        }catch(IOException e){
            System.out.println("Erro ao lidar com o cliente");
            
        }
    }
    
    
}
