package org.example;

public class ObservingPerson implements Observer{
    public ObservingPerson() {

    }

    public void message(int x, int y) {
        System.out.println("Message d'Observing Person!");
    }

    @Override
    public void update(Observable observable) {

    }
}
