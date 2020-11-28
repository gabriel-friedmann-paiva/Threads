/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Gabriel
 */
public class BuscaVetor implements Runnable {
    
    private int vet[];
    private String nome;
    private int elemento;
    private Thread thread;
    
    public BuscaVetor(String nome, int vet[], int elemento){
        
        this.nome = nome;
        this.vet = new int[vet.length];
        this.elemento = elemento;
        
        for (int i = 0; i < this.vet.length; i++) {
            this.vet[i] = vet[i]; 
        }
        
        if (thread == null) {
            thread = new Thread(this, nome);
        }
    }
    
    public void start(){
        thread.start();
    }
    
    @Override
    public void run() {
        
        int posicao = -1;
        
        for (int i = 0; i < this.vet.length; i++) {
            
            if(this.vet[i] == this.elemento){
                
                posicao = i;
            }
           
        }
         System.out.println("posicao " + posicao);
    }
    
}
