package geekbrains.java.java2.lesson_5;

import java.util.Arrays;

public class Lesson_5 implements Runnable {

    static final int size = 1000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    float[] a1 = null;
    float[] a2 = null;


    public static void main(String[] args) {
        Lesson_5 r = new Lesson_5();
        //не понял зачем здесь создавать объект класса
        //task1
        Arrays.fill(r.arr, 1.f);
        r.task1();

        //task2
        Arrays.fill(r.arr, 1.f);
        r.task2();
    }

    private void task1() {
        System.out.print("One Thread time: ");
        long a = System.currentTimeMillis();
        for (int i = 1; i < size; i++) {
             arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    private void task2() {
        System.out.print("Two Threads time: ");
        long a = System.currentTimeMillis();

        a1 = new float[h];
        a2 = new float[h];
        //System.arrayCopy(from, fromIndex, to, toIndex, count);
        // from - массив, который копируем
        // to - массив в которой копируем
        // fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
        // toIndex - индекс в массиве to начиная с которого вставляем элементы
        // count - количество элементов которые берем из массива from и вставляем в массив to
        // Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
        //System.arraycopy(array,0,array1,9,10);
        // копирование 10 элементов из массива array, начиная с позиции 0, в массив array1, начиная с позиции 9
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        //Одна нить может вызвать метод join у объекта второй нити.
        //В результате первая нить (которая вызвала метод) приостанавливает свою работу
        //до окончания работы второй нити (у объекта которой был вызван метод).
        Thread t1 = new Thread(this, "t1");
        t1.start();
        Thread t2 = new Thread(this, "t2");
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);


    }

    @Override
    //здесь ран передает задания в потоки из основного потока. как я понял
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            for (int i = 0; i < h; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        } else {
            for (int i = 0; i < h; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }
}

