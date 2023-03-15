package org.lessons.java;

public class Robin extends Animal {
    public Robin(String name) {
        super(name);
    }
    @Override
    public String makeNoise() {
        return "Cip Cip";
    }

    @Override
    public String eat() {
        return "Worms";
    }

    @Override
    public String toString() {
        return   name;
    }
}

