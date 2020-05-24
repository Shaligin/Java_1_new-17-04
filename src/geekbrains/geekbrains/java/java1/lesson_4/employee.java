package geekbrains.java.java1.lesson_4;

//   * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.

//Создать класс "Сотрудник" с полями: ФИО, зарплата, возраст;
public class employee {

    String name;
    int age;
    int bonus;

    //   Конструктор класса должен заполнять эти поля при создании объекта;
    employee(String name, int age, int bonus) {
        this.name = name;
        this.age = age;
        this.bonus = bonus;

        System.out.println("employee" + " " + name + " " + "age of" + " " + age + " " + "have a bonus" + " " + bonus + "rub"); //эту строку можно выровнять спомощью табуляции?? чобы не писать все время кавычки.
    }

    //   Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    int printAge() {
        return age;
    }

    int printBonus() {
        return bonus;
    }

    String printName() {
        return name;
    }

     String getprintInfo() {
           return
                   this.name + this.age + this.bonus;
    }

    //  Создать массив из 5 сотрудников.
//   С помощью цикла вывести информацию только о сотрудниках старше 40 лет;



}