package geekbrains.java;

public class Main {


    public static void main(String[] args) {

        employee a1 = new employee("Pieter", 25, 41_000);//создаем новый объекта класса сотрудник
//        a1.age = 25;
//        a1.name = "Pieter";
//        a1.bonus = 41_000;  чтобы это не писать используют конструкторы , которые сразу заполняют поля
        employee a2 = new employee("Tony", 41, 37_000);
        employee a3 = new employee("Kate", 50, 55_000);
        employee a4 = new employee("Wilson", 34, 77_000);
        employee a5 = new employee("Alex", 25, 44_000);
        employee[] staff = {a1, a2, a3, a4, a5};
        //older(staff);

        // Вывести при помощи методов из пункта 3 ФИО и возраст.
        System.out.println(a2.printAge() + " " + a2.printName());
        System.out.println(a1.printAge() + " " + a1.printName());


    }

    public static employee older(employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            staff[i] =
            if ( staff[i] > 40 )

        }
        return ???; ////завис , если бы мы просто спрашивали из мейна ( отзовителсь все кому
        //больше сорока, это понятно. а как в массиве спросить и сравнить, непонятно.Наверняка
        // как обычно все просто и логично((( время поджимает. сдаю так, пораньше.может комменты помогут доехать.
        // спасибо что прочитали)))
    }



