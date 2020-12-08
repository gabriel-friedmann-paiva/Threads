/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

/**
 *
 * @author Gabriel
 */
public class MediaVetor implements Runnable{
    
    private int vet[];
    private Thread thread;
    private String nome;
    
    public MediaVetor(String nome, int vet[]){
        
        this.nome = nome;
        this.vet = vet;
        
        
         if (thread == null) {
            thread = new Thread(this, nome);
        }
        
    }
    
    @Override
    public void run() {
        int soma = 0;
        double media;
        
        for (int i = 0; i < this.vet.length; i++) {
            
            soma = soma + this.vet[i];
        }
        media = (double) soma/this.vet.length;
        System.out.println("media = " + media);
    }
    
    public void start(){
        thread.start();
    }
    
}
