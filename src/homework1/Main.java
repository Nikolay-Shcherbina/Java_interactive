package homework1;
/*
* Nikolay Shcherbina
* ДЗ по 1-му уроку
* */

public class Main {

// 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
// где a, b, c, d – входные параметры этого метода;
    public static float calculate(int a, int b, int c, int d) {
        float j = 1.0F;
        return a * (b + (c * j / d));
    }

// 4. Написать метод, принимающий на вход два числа, и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
// в противном случае – false;
    public static boolean sumMinMax ( int a, int b){
            int sum = a + b;
            if (sum >= 10 & sum <= 20) {
                return true;
            } else return false;
        }

// 5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное число передали или отрицательное
// (Замечание: ноль считаем положительным числом.);
    public static void number(int a){
        if(a >= 0){
            System.out.println("Число: " + a + " положительное");
        } else {
            System.out.println("Число: " + a + " отрицательное");
        }
    }

// 6. Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное;
    public static boolean intNumber(int a){
        if(a < 0)
            return true;
        return false;
    }

// 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
// метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void nameHello(String name){
        System.out.println("Привет, " + name + "!");
    }

// 8. *Написать метод, который определяет, является ли год високосным,
// и выводит сообщение в консоль. Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void leapYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println(year + " Високосный");
        }else {
            System.out.println(year + " не високосный");
        }
    }

// 1.Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main (String[]args){

// 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        String name = "Nikolay";
        byte a = 1;
        short b = 2;
        int c = 3;
        long l = 1200L;
        float d = 4.0F;
        double e = 5.55D;
        char g = '*';
        boolean bol = true;
        System.out.println("задание № 2: " + "String " + name + " byte " + a + " short " + b + " int " + c + " long "+ l + " float " + d + " double " + e + " char " + g + " boolean " + bol);

         System.out.println("задание № 3: " + calculate(5, 10, 15, 2));// вызов метода и вывод в консоль задание № 3.
         System.out.println("задание № 4: " + sumMinMax(+7, 12)); // вызов метода и вывод в консоль задание № 4.
         System.out.print("задание № 5: ");
         number(-7);// вызов метода по заданию № 5.
         System.out.println("задание № 6: " + intNumber(-25)); // вызов метода и вывод в консоль задание № 6.
         System.out.print("задание № 7: ");
         nameHello("Vladik");// вызов метода по заданию № 7.
         System.out.print("задание № 8: ");
         leapYear(1988);
    }
}
