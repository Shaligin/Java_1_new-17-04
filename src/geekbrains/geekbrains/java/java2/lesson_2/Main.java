package geekbrains.java.java2.lesson_2;

import com.sun.javafx.collections.MappingChange;

import javax.swing.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


//        HashMap<Integer, Integer> map1 = new HashMap<>();


        //  ArrayList<myBox> list = new ArrayList<>();
        //  list.addAll(Arrays.asList(b,b1,b2));
//        myBox b = new myBox(1,1);
//        myBox b1 = new myBox(12,1);
//        myBox b2 = new myBox(1,12);
//        ArrayList<myBox> list = new ArrayList<>(Arrays.asList(b, b1, b2));
//        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("you");
        list1.add("we");
        list1.add("all");
        list1.add("new");
        list1.add("she");
        list1.add("he");
        list1.add("them");
        list1.add("they");
        list1.add("new");
        list1.add("all");

        System.out.println(list1);
//        System.out.println(list1.set(4, "change"));
//        System.out.println(list1.get(4));
//        System.out.println(list1.size());
//        System.out.println(list1.contains("tut"));
//        System.out.println(list1.indexOf("new"));
//        System.out.println(list1);

        HashMap<String,Integer> set1 = new HashMap<>();
//        set1.put(1234,"You");
//        set1.put(2341,"We");
//        set1.put(2341,"We");
//        set1.put(2341,"We");

                    //"you"
        for (String x : list1) {
            if(set1.containsKey(x)) {
                set1.put(x, set1.get(x) + 1);
            } else {
                set1.put(x, 1);
            }
        }
        System.out.println(set1);

//        for (int i = 0; i < i; i++) {
//            String x = set1.get(i);
//        }
//        for (Integer key : set1.keySet()) {
//            System.out.print(  set1.get(key));
//        }







//            HashSet<String> set = new HashSet<>(list1);
//            System.out.println(set.toString());



    }
}
//        HashMap<String, Integer> map = new HashMap<>();
//
//        map.put("January", 1);
//        map.put("February", 2);
//        map.put("March", 3);
//        map.put("April", 4);
//        map.put("May", 5);
//
//        map.put("January", 10);
//
//        System.out.println(map);
//
//        for (String key : map.keySet()) {
//            System.out.printf("key=%s, val=%d\n", key, map.get(key));
//        }
//
//        Set<Map.Entry<String, Integer>> set = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iter = set.iterator();
//        while (iter.hasNext()) {
//            Map.Entry<String, Integer> entry = iter.next();
//            System.out.printf("key=%s, val=%d", entry.getKey(), entry.getValue());
//        }
//
//    }
//
//    private static void setExample() {
//        Box b0 = new Box(1, 1);
//        Box b1 = new Box(2, 2);
//        Box b2 = new Box(3, 3);
//        Box b3 = new Box(4, 4);
//        Box b4 = new Box(1, 1);
//
//        TreeSet<String> set = new TreeSet<>();
//        set.add("January");
//        set.add("February");
//        set.add("March");
//        set.add("April");
//
//        set.add("January");
//
//        System.out.println(set);
//
//        TreeSet<Box> set1 = new TreeSet<>();
//        set1.addAll(Arrays.asList(b0, b1, b2, b3));
//        System.out.println(set1);
//    }
//
//    private static void listSample(Box b0, Box b1, Box b2, Box b3, Box b4) {
//        LinkedList<Box> list1 = new LinkedList<>();
//        list1.addAll(Arrays.asList(b0, b1, b2, b3));
////        System.out.println(list1);
//        System.out.println(list1.contains(b4));
//
//        System.out.println(Integer.toHexString(b0.hashCode()));
//        System.out.println(Integer.toHexString(b4.hashCode()));
//    }
//
//    private static void listExample() {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Hello");
//        list.add("World");
//        list.add(0, "Fix");
//        System.out.println(list.get(0));
//        System.out.println(list.contains(new String("Hello")));
//        System.out.println(list.indexOf("World"));
//        list.set(1, "Wow");
//        System.out.println(list);
//    }
//
//    private static void cyclesExample(ArrayList<Box> list1) {
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }
//        System.out.println();
//
//        Iterator<Box> iter = list1.iterator();
//        while (iter.hasNext()) {
//            Box b = iter.next();
//            System.out.print(b + " ");
//        }
//        System.out.println();
//
//        for (Box b : list1) {
//            System.out.print(b + " ");
//        }
//    }
//
//    private static void wrappers() {
//        String s = "HelloWorld";
//        String s0 = new String("Hello");
//        int i = 10;
//        i++;
//        Integer i0 = 10;
//        Integer i1 = new Integer(11);
//        i0++;
//        System.out.println(i0++);
//    }
//}

