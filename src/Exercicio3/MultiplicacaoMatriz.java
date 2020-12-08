/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.util.Arrays;

/**
 *
 * @author Gabriel
 */
public class MultiplicacaoMatriz implements Runnable {
    
    private int mat1[][];
    private int mat2[][];
    private Thread thread;
    private String nome;
    
    public MultiplicacaoMatriz(String nome, int mat1[][], int mat2[][]){
        
        this.mat1 = mat1;
        this.mat2 = mat2;
        this.nome = nome;
        
        
        if (thread == null) {
            thread = new Thread(this, nome);

        }
        
    }
    
    @Override
    public void run(){
        
        int matResult[][] = new int[mat1.length][mat1.length];
        
        for (int i = 0; i < matResult.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                matResult[i][j] = this.mat1[i][j] * this.mat2[i][j];
                System.out.print(matResult[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
    public void start(){
        thread.start();
    }
}
