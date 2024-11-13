package Thread;

import DAO.PessoaDAO;
import beans.Pessoa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ThreadServer extends Thread {
    private Socket clienteSocket;

    public ThreadServer(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {
        try (ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());
             ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream())) {

            // Recebe o nome da pessoa do cliente
            String nome = (String) in.readObject();
            System.out.println("Nome recebido: " + nome);

            // Cria uma nova pessoa para enviar de volta ao cliente
            Pessoa p = new Pessoa();
            p.setNome(nome);

            // Envia a pessoa de volta para o cliente
            out.writeObject(p);
            out.flush();
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
