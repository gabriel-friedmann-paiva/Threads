/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio8;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel
 */
public class Corrida implements Runnable {

    
    private String nome;
    private Thread thread;
    
    
    public Corrida(String nome){
        this.nome = nome;
        
        
        if (thread == null) {
            thread = new Thread(this, nome);
        }
    }
    
    public void start(){
        thread.start();
    }
    
    @Override
    public void run() {
        
        int tempo;
        Random aleatorio = new Random();
        int tempoTotal = 0;
                
        for (int volta = 1; volta < 6; volta++) {
            
            tempo = 6000 + aleatorio.nextInt(6000);
            tempoTotal = tempoTotal + tempo;
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Corrida.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            System.out.println(this.nome + " terminou a volta " + volta + " no segundo: " + tempoTotal/1000 );
        }
        System.out.println(this.nome + " terminou a corrida");
        
    }

}
