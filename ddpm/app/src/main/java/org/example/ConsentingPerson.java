package org.example;

import java.util.ArrayList;
import java.util.Random;

public class ConsentingPerson implements Observable{
    int x = 0;
    int y = 0;
    ObservingPerson observingPerson = new ObservingPerson();
    Random random = new Random();

    public ConsentingPerson() {
        ArrayList<ObservingPerson> observingPersons = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {

    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
    public void move() {
        this.x = random.nextInt();
        this.y = random.nextInt();
    }
}
