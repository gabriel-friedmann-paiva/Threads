/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

/**
 *
 * @author Gabriel
 */
public class MaiorElemento implements Runnable{

    private int vet[];
    private String nome;
    private Thread thread;
    
    public MaiorElemento(String nome, int vet[]){
        this.nome = nome;
        this.vet = new int[vet.length];
        
        for (int i = 0; i < this.vet.length; i++) {
            this.vet[i] = vet[i];
        }
        
        if (thread == null) {
            thread = new Thread(this, nome);
        }
    }
    
    @Override
    public void run() {
        
        int maior = this.vet[0];
        int posicao = 0;
        
        for (int i = 0; i < this.vet.length; i++) {
            
            if(vet[i] > maior){
                
                maior = vet[i];
                posicao = i;
            }
            
        }
        System.out.println("maior " + maior);
        System.out.println("posicao " + posicao);
        
    }
    
    public void start(){
        thread.start();
    }
}
