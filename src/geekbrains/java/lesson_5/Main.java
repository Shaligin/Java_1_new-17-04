package geekbrains.java.lesson_5;

import geekbrains.java.lesson_5.Zoo.*;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(200, 2);
        Dog a = new Dog(500, 0.5, 10);
        Horse h = new Horse(1500, 3, 100);
        int runLimit = 100;
        double jumpLimit = 0.3;
        int swimLimit = 300;

        Animal[] all = {c, a, h};
        for (int i = 0; i < all.length; i++) {
            all[i].run(runLimit);
            all[i].jump(jumpLimit);

             if (all[i] instanceof Dog) {
                ( (Dog) all[i] ).swim(swimLimit);
            }


        }


//        Dog d = new Dog("Tuzya","Black", 6);
//        Bird b = new Bird("Vjik","Yeloow", 2, 20);
//
//        Parrot p = new Parrot("Polly", "Grey", 1, 5);
//        Snake s = new Snake("Ka", "Braun",1 );
//
//        Animal[] all = {a, d, b,};
//        for(int i =0; i < all.length; i++) {
//            all[i].run();
//            all[i].voice();
//
//
//            проверяет явлеется ли объект экземпляром класса Bird
//            if (all[i] instanceof Bird){
//                System.out.println(" Enlarged cage for " + all[i].name);
//            }
//            if (all[i] instanceof Parrot){
//                ((Parrot) all[i]).speak();
//            }
//        }
    }
}
