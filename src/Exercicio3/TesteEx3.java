/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author Gabriel
 */
public class TesteEx3 {
    public static void main(String[] args) {
        int mat1[][] = {{1,3,4},
                       {3,5,2},
                       {1,2,3}};
        
        int mat2[][] = {{2,3,4},
                        {1,1,1}, 
                        {2,2,2}};
        
        MultiplicacaoMatriz mat = new MultiplicacaoMatriz("t1",mat1, mat2);
        mat.start();
    }
}
