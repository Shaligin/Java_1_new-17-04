package geekbrains.java.java1.lesson_5;

public abstract class Animal {
    protected int run;
    protected double jump;
    //protected int swim;


    public Animal(int run, double jump) {
        this.run = run;
        this.jump = jump;
//        this.swim = swim;

    }
    protected abstract void run(int a);
    protected abstract void jump(double a);
    //protected abstract void swim(int a); // если все плавают.







    //    public abstract void voice(); //абстрактный метод, метод не имеющий реализации


}


