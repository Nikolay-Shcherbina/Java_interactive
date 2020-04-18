package ru.geekbrains.java.interactive.homework4;

//1. Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст;
//2. Конструктор класса должен заполнять эти поля при создании объекта;
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

public class Employee {
    String name;
    String position;
    String email;
    long telephone;
    int salary;
    byte age;

    public Employee(String _name, String _posinion, String _email, long _telephone, int _salary, byte _age) {
        name = _name;
        position = _posinion;
        email = _email;
        telephone = _telephone;
        salary = _salary;
        age = _age;
    }

    public String getEmployeeName () {
        return this.name;
    }

// метод, который выводит информацию об объекте в консоль
    public void beastInfo() {
        System.out.println(" ");
    }

}
