package org.lessons.java;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Bau bau";
    }

    @Override
    public String eat() {
        return "Dog's food";
    }



    @Override
    public String toString() {
        return   name;
    }
}
