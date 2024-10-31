/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class MinhaThread extends Thread {
    private String mensagem;
    private int intervalo;

    public MinhaThread(String mensagem, int intervalo) {
        this.mensagem = mensagem;
        this.intervalo = intervalo;
    }
    @Override
    public void run () {
        try{
            while(true){
                System.out.println(mensagem);
                Thread.sleep(intervalo);
            }
        
        } catch (InterruptedException ex) {
             System.out.println("Erro no metodo: "+ex.getMessage());
        }
    }
}
