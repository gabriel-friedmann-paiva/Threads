/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio8;

/**
 *
 * @author Gabriel
 */
public class TesteEx8 {
    public static void main(String[] args) {
        Corrida t1 = new Corrida("Ferrari");
        Corrida t2 = new Corrida("Lamborghini");
        Corrida t3 = new Corrida("Mercedes");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
