package geekbrains.java.java2.lesson_4;

import java.io.*;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
//            fos.write(24);
            PrintStream printStream = new PrintStream(fos);
                printStream.println("Try catch");



            FileInputStream fis = new FileInputStream("file.txt");

//            int x = fis.read();
//            fis.close();
//            System.out.println(x);
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());
                fis.close();




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
