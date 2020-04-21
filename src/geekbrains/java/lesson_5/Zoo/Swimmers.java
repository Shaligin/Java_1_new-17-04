package geekbrains.java.lesson_5.Zoo;

import geekbrains.java.lesson_5.Animal;


public class Swimmers extends Animal {
    public int swim;

    public Swimmers(int run, double jump, int swim) {
        super(run, jump);
        this.swim = swim;
    }

    @Override
    protected void run(int a) {

    }

    @Override
    protected void jump(double a) {

    }

    public void swim (int limit){
        System.out.println();
    }
}
