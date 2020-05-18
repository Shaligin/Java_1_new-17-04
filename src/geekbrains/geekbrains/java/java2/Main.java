package geekbrains.java.java2;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String str = "10 3 1 2 \n 2 3 2 2\n 5 6 7 1\n 300 3 1 0";
        String[][] arrays = new String[4][4];
        //convertArrays(arrays);
        // convert(str);
        format(str);
        System.out.print(Arrays.toString(format(str)));
        //Summa(str);
        convert(str);
    }

    //проверяет матрицу массива которую я в идеале должен был получить
    //на то что она именно 4 на 4 в ином случае выбрасываем исключение
    // тут даже наверно
    public static void matrix(String[][] arr) {
        try {
            String[][] x = arr;
            if (x == arr) {
                System.out.println("вчё супер массивы равны");
            }

        } catch ( "исключение на неравенство" e){

            System.out.println("Задайте массив согласно параметрам");

        }
    }


    //    public static void convertArrays(String[][]arrays, String str){
    //        arrays = format(str);
    //    }

    //метод split разбивает строку посимвольно в массив
    public static String[] format(String str) {
        String[] arrays = str.split(" ");
        for (String t : arrays)
            //System.out.print(t);
            return arrays;
        //System.out.print(Arrays.toString(arrays));

        return arrays;
    }

    //метод из строки преобразует в инт
    public static void convert(String l) {
        try {
            int f = Integer.parseInt(l);

        } catch (NumberFormatException e) {
            System.out.println("вижу это если выпало исключение");
        }
    }

    //    тут должна буть сумма чисел из ячеек массива
//     для начала нужно как то переделать одномерный в двумерный,
//    вроде несложно но нужно наковырять методы и синтаксис
    public static void Summa(int f) {
        int[] x = convert(l);
        int sum = 0;
        for (String t : x) {
            sum = sum + x;
        }
        System.out.print(x[4]);
        System.out.println(sum);
    }

}






