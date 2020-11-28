/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class CalculaPrimos implements Runnable {

    private String nome;
    private Thread thread = null;

    public CalculaPrimos(String nome) {

        this.nome = nome;

        if (thread == null) {
            thread = new Thread(this, nome);

        }
    }

    @Override
    public void run() {

        boolean primo;
        ArrayList<Integer> primos = new ArrayList<Integer>();

        for (int i = 1; i <= 999; i++) {

            primo = true;

            if (i == 1) {
                primo = false;
            }
            if (primo == true) {
                if (i % 2 == 0 && i != 2) {
                    primo = false;
                }
            }
            if (primo) {
                for (int j = 3; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                
                primos.add(i);
            }

        }
        System.out.println(primos.toString());
        
    }

    public void start() {
        thread.start();
    }
}
