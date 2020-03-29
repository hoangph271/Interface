package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Extends means IS-A
        // Implements means CAN-DO
        // Implements philosophy: It quacks like a duck, and it swims like a duck -> It's a duck...?

        Animal monkey = new Monkey();
        Bird bird = new Bird();
        Duck donal = new Duck();

        // Animals
        System.out.println("Animals");
        List<Animal> animals = new ArrayList<>();
        animals.add(monkey);
        animals.add(donal);
        animals.add(bird);
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).move();
        }

        // Quack-able animals
        System.out.println("Quack-ables");
        List<Quackable> quackables = new ArrayList<>();
        quackables.add(bird);
        quackables.add(donal);

        for (int i = 0; i < quackables.size(); i++) {
            quackables.get(i).quack();
        }

        Bird uglyBird = new Bird();
        uglyBird.layEggs();
    }
}
