package com.company;

public class Duck extends Animal implements Quackable, LayEggsAble {
    @Override
    protected void move() {
        System.out.println("Duck swims forward...!");
    }

    @Override
    public void quack() {
        System.out.println("The duck goes quack quack...!");
    }

    @Override
    public void layEggs() {
        System.out.println("The duck lays 02 duck eggs...!");
    }
}
