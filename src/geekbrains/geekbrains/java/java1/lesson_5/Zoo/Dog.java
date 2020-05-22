package geekbrains.java.java1.lesson_5.Zoo;

public class Dog extends
        Swimmers {
    public Dog(int run, double jump, int swim) {
        super(run, jump, swim);
    }

    @Override
    protected void run(int a) {
        if (a <= 500)
            System.out.println(" The dog ran!");
    }

    @Override
    protected void jump(double b) {
        if (b <= 0.5) {
            System.out.println(" The dog jumped!");
        }
    }

    public void swim(int c) {
        if (c <= 500) {
            System.out.println(" The dog swam!");  //смотрел как работает отдельно через наследование от класса пловцы.
        }
    }

}




