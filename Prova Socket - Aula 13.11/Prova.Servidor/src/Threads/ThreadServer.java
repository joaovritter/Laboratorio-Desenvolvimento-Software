package Threads;

import DAO.ProdutoDAO;
import beans.Produto;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ThreadServer extends Thread {
    private Socket clienteSocket;

    public ThreadServer(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    public void run() {
        try (ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());
             ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream())) {

            System.out.println("ThreadServer: Recebendo objeto produto...");
            Produto produto = (Produto) in.readObject(); // Recebe o objeto produto do cliente

            ProdutoDAO pDAO = new ProdutoDAO();
            String mensagem;

            try {
                pDAO.inserir(produto); // Insere produto no banco de dados
                mensagem = "Inserido com sucesso";
                System.out.println("ThreadServer: produto inserida com sucesso.");
            } catch (Exception e) {
                mensagem = "Erro ao inserir: " + e.getMessage();
                System.out.println("ThreadServer: " + mensagem);
            }

            out.writeObject(mensagem); // Envia a mensagem de sucesso ou erro de volta ao cliente

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro no servidor: " + e.getMessage());
        }
    }
}
