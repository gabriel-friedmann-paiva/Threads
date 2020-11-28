/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author Gabriel
 */
public class TesteEx2 {
    public static void main(String[] args) throws InterruptedException {
        
        int v1[] = {1,2};
        int v2[] = {7,8};
        
        SomaParalela result = new SomaParalela("thread1", v1, v2);
        SomaParalela result2 = new SomaParalela("thread2",v1, v2);
        
        result.start();
        
        result.join();
        
        result2.start();
        
    }
}
