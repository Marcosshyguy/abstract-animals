package org.lessons.java;

public class Dolphin extends Animal {
    public Dolphin(String name) {
        super(name);
    }
    @Override
    public String makeNoise() {
            return "Iiiiiiiiiiiiiii iiiiiii";
    }

    @Override
    public String eat() {
        return "Fishes";
    }

    @Override
    public String toString() {
        return name;

    }
}
