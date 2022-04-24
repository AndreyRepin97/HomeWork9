package ru.skypro;

import java.lang.Math;

public class Main {

    public static void arr(int[] array) {

        for (int i = 0; i < array.length; i++) { //вывод первоначального массива
            System.out.print(" " + array[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < array.length/2; i++) { //инверсия порядков элементов
            int t = array[i];
            array[i]=array[array.length - 1 - i];
            array[array.length - 1 - i]=t;
        }

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {  // вывод первоначального массива после инверсии
            System.out.print(" " + array[i]);
        }
    }

    public static void changeStr(String nashaStroka){ //метод для опеределения повторов в строке

        char[] nashaStrokaInChar = nashaStroka.toCharArray();
        for (int i=0;i<nashaStrokaInChar.length;i++){
            if (i!=nashaStrokaInChar.length-1&&(nashaStrokaInChar[i+1]==nashaStrokaInChar[i])){
                System.out.println("Повтор в элементе под номером "+(i+1));
                return;
            }
        }
        System.out.println("Повтора нет ");
    }

    public static double timeDeliver(double deliveryDistance) { //метод для определения количества дней доставки
        double x = deliveryDistance - 20;
        x = x / 40;
        x = Math.ceil(x);
        x += 1;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется 1 день");
        else {
            System.out.println("Потребуется дней: " + x);
        }
        return x;//вернуть значения для задания(зачем?????)
    }

    public static void versijaPrilojenia(int clientDeviceYear, int clientOS){  //метод для опеределения версии приложения

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void isVisocosniy(int year) { //метод для опеределения високосного года

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Високосный год");
        } else if (year % 400 == 0)
            System.out.println("Високосный год");
        else {
            System.out.println("Не високосный год");
        }
    }

    public static void main(String[] args) {

        //определение года для первого задания
        isVisocosniy(2024);

        //определение версии приложения для второго задания
        versijaPrilojenia(2014, 1);

        //определение времени доставки для третьего задания
        timeDeliver(21);

        //изменение строки для четвертого задания
        changeStr("aabccddefgghiijjkk");

        System.out.println("");

        //пятое задание инверсия массива
        int array[] = {1,2,3,4,5,6,7,8};
        arr(array);
    }
}