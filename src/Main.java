import java.util.Scanner;

public class Main {
    public static int checkYear (int year) {
//        boolean leapYear=((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }return year;
    }

    public static void  printSeparator() {
        System.out.println("++++++++++++");
    }
    public static int selectOs (int clientsOs, int clientDeviceYear){
        if (clientsOs==0 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientsOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientsOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientsOs == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        return clientsOs;
    }

    public static int sumDay(int deliveryDistance) {
        int deliverDay=1;
        if (deliveryDistance>20){
            deliverDay++;
        }
        if (deliveryDistance>60){
            deliverDay++;
        }
        System.out.println("Потребуется дней "+deliverDay);
        return deliveryDistance;
    }
    public static void main(String[] args) {

        Scanner scanYear = new Scanner(System.in);
        System.out.println("Введите год:");
        int sc=checkYear(scanYear.nextInt());
        printSeparator();

        Scanner checkDeviceYear = new Scanner(System.in);
        System.out.println("Введите тип (0-IOS, 1- Android) и год вашего устройства :");
        int deviceYear =selectOs(checkDeviceYear.nextInt(), scanYear.nextInt());
        printSeparator();

        Scanner userDistance = new Scanner(System.in);
        System.out.println("Введите колличество километров: ");
        int enterDistance = sumDay(userDistance.nextInt());
    }
}