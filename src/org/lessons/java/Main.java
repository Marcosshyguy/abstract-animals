package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog("Gerardo"), new Dolphin("Flipper"), new Eagle("Spike"), new Robin("Little bird")};

        for (int i = 0; i < zoo.length; i++) {
            String name = zoo[i].toString();
            String noise = zoo[i].makeNoise();
            String food = zoo[i].eat().toLowerCase();
            String ability;
            if(zoo[i] instanceof Fly){
                ability =  fly((Fly) zoo[i]);
            } else if (zoo[i] instanceof Swim) {
                ability = swim((Swim) zoo[i]);
            }else{
                ability = "i'm able to swim";
            }
            String animal = "This is " + name + " " + noise + "! It eats " + food + " " + ability ;
            System.out.println(animal);
        }


    }
    public static String fly(Fly flyer){
        return flyer.fly();
    }

    public static String swim(Swim swimmer){
        return swimmer.swim();
    }
}
