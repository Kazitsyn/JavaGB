package com.company;
import java.util.Scanner;

public class Main {

//    Task_1
//    Улитка ползёт по вертикальному шесту высотой h метров,
//    поднимаясь за день на a метров, а за ночь спускаясь на b метров.
//    На какой день улитка доползёт до вершины шеста?
//    Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
//    Программа должна вывести одно натуральное число.
//    Sample Input 1:
//            10
//            3
//            2
//    Sample Output 1:
//            8
//    Task_2
//    Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
//    если разрешается сделать один разлом по прямой между дольками
//    (то есть разломить шоколадку на два прямоугольника).
//    Входные данные
//    Вводятся 3 числа: n, m и k; k не равно n × m.
//    Гарантируется, что количество долек в шоколадке не превосходит 30000.
//    Выходные данные
//    Программа должна вывести слово YES, если возможно отломить указанное число долек,
//    в противном случае вывести слово NO.
//    Sample Input 1:
//            3 2 4
//    Sample Output 1:
//    YES

//    Task_3
//    В первый день спортсмен пробежал x километров,
//    а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
//    По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
//    Входные данные
//    Программа получает на вход действительные числа x и y
//    Выходные данные
//    Программа должна вывести одно натуральное число.
//    Sample Input:
//            10
//            20
//    Sample Output:
//            9
//    Task_4
//    Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
//    n! = 1∙2∙3∙…∙ n.
//    Sample Input:
//            5
//    Sample Output:
//            120
//    Task_5
//    Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.
//    Входные данные
//    Заданы три целых числа а, b, с, где a > b
//    Выходные данные
//    Выведите единственное число - ответ на задачу.
//    Sample Input:
//            20
//            1
//            2
//    Sample Output:
//            20
//            18
//            16
//            14
//            12
//            10
//            8
//            6
//            4
//            2
//    Task_6
//    Вводится массив (сначала количество элементов, потом сами элементы).
//    Найдите сумму его элементов с чётными индексами и выведите её.
//    А потом выведите числа, которые суммировались.
//    Sample Input:
//            4
//            1
//            2
//            3
//            4
//    Sample Output:
//            4
//            1
//            3
//    Task_7
//    Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
//    Элементы нужно выводить в том порядке, в котором они встречаются в списке.
//            Входные данные
//    Вводится список чисел. Все числа списка находятся на одной строке.
//            Выходные данные
//    Выведите ответ на задачу.
//    Sample Input:
//            6
//            1
//            2
//            2
//            3
//            3
//            3
//    Sample Output:
//            1

    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("h: ");
//        int h = iScanner.nextInt();
//        System.out.printf("a: ");
//        int a = iScanner.nextInt();
//        System.out.printf("b: ");
//        int b = iScanner.nextInt();
//        int day = 1;
//        while (h - a > 0){
//            h = h - a + b;
//            day++;
//        }
//        System.out.printf("day: ");
//        System.out.println(day);
//        -----------------------------------------------------

//          Scanner iScanner = new Scanner(System.in);
//          System.out.printf("n: ");
//          int n = iScanner.nextInt();
//          System.out.printf("m: ");
//          int m = iScanner.nextInt();
//          System.out.printf("k: ");
//          int k = iScanner.nextInt();
//
//          if (k < n*m && k%n==0 || k%m ==0){
//              System.out.println("yes");
//          }else{
//              System.out.println("no");
//          }
//        -----------------------------------------------
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("x: ");
//        double x = iScanner.nextDouble();
//        System.out.printf("y: ");
//        double y = iScanner.nextDouble();
//        int day = 1;
//
//        while (x < y){
//            x = x * 1.1;
//            day++;
//        }
//        System.out.println(day);
//        ---------------------------------------------------

//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("n: ");
//        int n = iScanner.nextInt();
//        System.out.println(fact(n));
//        ---------------------------------------------------
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("a: ");
//        int a = iScanner.nextInt();
//        System.out.print("b: ");
//        int b = iScanner.nextInt();
//        System.out.print("c: ");
//        int c = iScanner.nextInt();
//        for(int i = a; i >= b; i -= 2){
//            System.out.println(i);
//        }
//        ------------------------------------------------
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("cnt: ");
//        int cnt = iScanner.nextInt();
//        int[] arr = new int[cnt];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = iScanner.nextInt();
//            if (i % 2 == 0){
//                sum += arr[i];
//            }
//        }
//        System.out.println(sum);
//        for (int i = 0; i < arr.length; i++){
//            if (i % 2 == 0){
//                System.out.println(arr[i]);
//            }
//        }
//        -----------------------------------------------
        Scanner iScanner = new Scanner(System.in);
        System.out.print("cnt: ");
        int cnt = iScanner.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = iScanner.nextInt();
        }
        for (int k : arr) {
            int cn = 0;
            for (int i : arr) {
                if (k == i) {
                    cn++;
                }
            }
            if (cn == 1) {
                System.out.println(k);
            }
        }



    }
}
