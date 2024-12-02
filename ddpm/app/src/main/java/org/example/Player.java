package org.example;

public class Player {
    public Player() {

    }

    public boolean play() {
        Lotto lotto = new Lotto();
        return lotto.check(lotto.draw());
    }
}
