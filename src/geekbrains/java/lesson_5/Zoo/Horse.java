package geekbrains.java.lesson_5.Zoo;

public class Horse extends Swimmers {

    public Horse(int run, double jump, int swim) {
        super(run, jump, swim);
    }

    @Override
    public void run(int a) {
        if (a <= 1500) {
            System.out.println(" The Horse ran!");
        }
    }

    @Override
    public void jump(double a) {
        if (a <= 3) {
            System.out.println(" The Horse jumped!");
        }
    }

    public void swim(int a) {
        if (a <= 1000) {
            System.out.println(" The horse swam!");
        }

    }
}



