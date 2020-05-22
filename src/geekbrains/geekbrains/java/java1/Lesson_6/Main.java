package geekbrains.java.java1.Lesson_6;

import java.io.*;

public class Main {
    public static void main(String[]args) throws FileNotFoundException {

        try {

            FileInputStream one = new FileInputStream("Test1.java");
            int b;
            while((b = one.read()) != -1);

            FileInputStream two = new FileInputStream("Test.java");
            int c;
//           int c = two.read();
//           int[] arr = new int[1];
            while((c = two.read()) != -1);

            FileInputStream four = new FileInputStream("NEW.java");
            int bin;
            while((bin = four.read()) != -1) {
                System.out.print((char) bin);
            }

            FileOutputStream three = new FileOutputStream("NEW.java", true);
            int a = c + b;
            three.write(a);

            PrintStream ps = new PrintStream(three);
            ps.println(a);

            // не успеваю разобраться с приведением типов(выдает какие то казябры) и записью не отдельных чисел а
            //к примеру массив данных.


//            PrintStream ps = new PrintStream(fos);
//            ps.println("qq, I'am here");
//            fos.close();

//            FileInputStream three = new FileInputStream("Test.txt");
//            int ain;
//            while((ain = three.read()) != -1)
//            System.out.print((char)ain);
//            three.close();

//            FileInputStream fis = new FileInputStream("Test.txt");
//            int ain;
//            while((ain = fis.read()) != -1)
//                System.out.print((char)ain);
//            fis.close();

//            FileInputStream fileOne = new FileInputStream("NEW.txt");
//            Scanner scanner = new Scanner(fileOne);
//            System.out.println(scanner.nextLine());
//            int bin;
//            while ((bin = fis.read()) != -1) {
//                System.out.print((char) bin);
//            }

        }catch(FileNotFoundException t) {
            t.printStackTrace();

        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }


    }
}
