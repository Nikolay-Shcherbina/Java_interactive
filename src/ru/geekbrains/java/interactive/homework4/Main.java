package ru.geekbrains.java.interactive.homework4;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vasya Pupkin", "Ingener", "pupkin@mail.ru",89295751111L, 150000, (byte) 35);
        System.out.println(employee1.name + employee1.telephone + " " + employee1.age);


    }
}
