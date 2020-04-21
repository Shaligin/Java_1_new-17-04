package geekbrains.java.lesson_5.Zoo;

import geekbrains.java.lesson_5.Animal;

public class Cat extends Animal {

    public Cat(int run, double jump) {
        super(run, jump);
    }

    @Override
    protected void run(int a) {
        if (a <= 200) {
            System.out.println(" The cat is ran!");
        }
    }

    @Override
    protected void jump(double a) {
        if (a <= 2) {
            System.out.println(" The cat is jumped!");
        }
    }

//    @Override
//    protected void swim(int a) {
//        System.out.print(" The cat does not swim!");
//    }

}

