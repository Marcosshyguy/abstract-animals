package org.lessons.java;

public class Dog extends Animal implements Swim{
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

    @Override
    public String swim() {
        return "I'm swimmig";
    }
}
