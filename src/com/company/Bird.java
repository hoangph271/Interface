package com.company;

public class Bird extends Animal implements Quackable, LayEggsAble {

    @Override
    protected void move() {
        System.out.println("Bird flies forward...!");
    }

    @Override
    public void quack() {
        System.out.println("The bird goes scruggg...!");
    }

    @Override
    public void layEggs() {
        System.out.println("The bird lays 02 UGLY bird eggs...!");
    }
}
