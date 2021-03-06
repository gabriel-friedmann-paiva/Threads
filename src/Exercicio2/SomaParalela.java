/*
 * 1. Escreva um programa usando threads que receba dois vetores e execute a soma paralela
 */
package Exercicio2;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel
 */
public class SomaParalela extends Thread {

    private int vet1[];
    private int vet2[];
    private String nome;

    public SomaParalela(String nome, int[] vet1, int[] vet2) {

        this.vet1 = vet1;
        this.vet2 = vet2;
        this.nome = nome;
        
    }

    @Override
    public void run() {
        try {
            int vResult[] = new int[this.vet1.length];

            for (int i = 0; i < vResult.length; i++) {
                vResult[i] = this.vet1[i] + this.vet2[i];
                System.out.println(this.nome + ":  "+ vResult[i] + " ");
                Thread.sleep(500);
            }
            System.out.println(this.nome + ": " + Arrays.toString(vResult));

        } catch (InterruptedException ex) {
            Logger.getLogger(SomaParalela.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(this.nome + "terminou a execução");
        
    }

}
