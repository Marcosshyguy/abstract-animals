package org.lessons.java;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("Zzz Zzz");
    }

    public abstract String makeNoise();

    public abstract String eat();
}
