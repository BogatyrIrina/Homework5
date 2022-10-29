public class Main {
    //Задание 2
    // К нам пришли коллеги и сообщили, что нам нужно знать не только
    // операционную систему телефона,
    // но и год его создания: от этого зависит,
    // подойдет ли приложение для телефона или оно просто не установится.
    // Если телефон произведен с 2015 по нынешний год,
    // то приложение будет работать корректно.
    // Если телефон произведен ранее 2015 года,
    // о клиенту нужно посоветовать установить облегченную версию приложения.
    // Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту
    // при наличии двух условий — операционной системы телефона (iOS или Android) и года производства.
    // Если год выпуска ранее 2015 года,
    // то к сообщению об установке нужно добавить информацию об облегченной версии.
    // Например, для iOS оно будет звучать так:
    // «Установите облегченную версию приложения для iOS по ссылке».
    // А для Android так:
    // «Установите облегченную версию приложения для Android по ссылке».
    // При этом для пользователей с телефоном с 2015 года выпуска
    // нужно вывести обычное предложение об установке приложения.
    // Для обозначения года создания используйте переменную clientDeviceYear,
    // где необходимо указать 2015 год.

    public static void main(String[] args) {

        System.out.println("Задание 2");

        int clientOS = 0;
        int clientDeviceYear = 2020;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }// Задание 3
        System.out.println("Задание 3");
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
        //Задание 4
        System.out.println("Задание 4");

        int deliveryDistance = 95;

        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        //Задача 5
        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц " + monthNumber);


        }
    }
}












