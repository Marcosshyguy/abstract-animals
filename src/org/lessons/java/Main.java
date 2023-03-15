package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog("Gerardo"), new Dolphin("Flipper"), new Eagle("Spike"), new Robin("Little bird")};

        for (int i = 0; i < zoo.length; i++) {
            String animal = "This is " + zoo[i].toString() + " " + zoo[i].makeNoise() + "! It eats " + zoo[i].eat().toLowerCase();
            System.out.println(animal);
        }
    }
}
