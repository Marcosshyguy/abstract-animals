package org.lessons.java;

public class Eagle extends Animal implements Fly {

    public Eagle(String name) {
        super(name);
    }
    public String makeNoise() {
        return "Eak Eak";
    }

    @Override
    public String eat() {
        return "Worms";
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public String fly() {
        return "I'm flying";
    }
}
