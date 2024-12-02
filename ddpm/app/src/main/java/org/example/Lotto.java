package org.example;

import java.util.Random;

public class Lotto {
    Random random = new Random();
    public Lotto() {

    }

    public int[] draw(){

        int[] tab = new int[6];
        for(int i = 0;i < tab.length;i++) {
            tab[i] = random.nextInt(0,100);
        }
        return tab;
    }

    public boolean check(int[] tab) {
        int[] winTab = draw();
        for(int i = 0;i < tab.length;i++) {
            if(tab[i] != winTab[i]) {
                return false;
            }
        }
        return true;
    }
}
