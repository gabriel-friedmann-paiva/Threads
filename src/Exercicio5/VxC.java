/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class VxC implements Runnable {
    
    private String nome;
    private int vet[];
    private int constante;
    private Thread thread;
    
    public VxC(String nome, int vet[], int constante){
        this.constante = constante;
        this.nome = nome;
        this.vet = vet;
        
        if (thread == null) {
            thread = new Thread(this, nome);
        }
        
        
    }

    @Override
    public void run() {
        for (int i = 0; i < this.vet.length; i++) {
            this.vet[i] = this.vet[i] * this.constante;
        }
        System.out.println(Arrays.toString(vet));
    }
    
    public void start(){
        thread.start();
    }
}
