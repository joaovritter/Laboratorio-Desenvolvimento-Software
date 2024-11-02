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
 * Cria um servidor TCP que aceia conexões de clientes e utiliza threads para
 * gerenciar cada conexão individualmente
 * 
 * O servidor escuta uma porta específica e, ao receber conexão,
 * cria uma nova thread através da classe ThreadServer para lidar com
 * solicitações do cliente
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int porta = 12345; // Use uma constante para a porta
        //ServerSocket permite que o servidor aceite conexões na porta especificada.
        try (ServerSocket servidorSocket = new ServerSocket (porta)){ 
            System.out.println("Servidor aguardando conexoes na porta "+porta);

            while(true){
                try{
                    // O servidor bloqueia até que um cliente se conecte. 
                    //Uma vez conectado, um novo Socket é criado para se comunicar com o cliente.
                    Socket clienteSocket = servidorSocket.accept();
                    
                    // mostra o endereço do cliente que se conectou
                    System.out.println("Conexao aceita de "+ clienteSocket.getInetAddress());
                    
                    Thread threadCliente = new ThreadServer(clienteSocket);
                    //inicia a thread que executa o metodo run(), permite que o servidor continue aceitando novas conexões
                    //enquanto a thread processa a conexão atual.
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
