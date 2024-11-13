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
                    Socket pessoaSocket = servidorSocket.accept();
                    
                    // mostra o endereço do cliente que se conectou
                    System.out.println("Conexao aceita de "+ pessoaSocket.getInetAddress());
                    
                    Thread threadPessoa = new ThreadServer(pessoaSocket);
                    //inicia a thread que executa o metodo run(), permite que o servidor continue aceitando novas conexões
                    //enquanto a thread processa a conexão atual.
                    threadPessoa.start();
                    
                    
                }catch(IOException ex){
                    System.out.println("Erro ao ceitar conexao do cliente");
                }
            }
        }catch (IOException ex){
            System.out.println("Erro ao criar o ServerSocket");
        }
    }
}
