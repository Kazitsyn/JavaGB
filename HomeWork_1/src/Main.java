import java.util.Scanner;
public class Main {
    /*
    Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
Sample Input:
8
11
Sample Output:
512
1331

Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке.
Затем вводится число, на которое нужно умножить все введённые выше числа.
Выведите на экран результат умножения построчно.
Sample Input:
4
1
2
3
5
2
Sample Output:
2
4
6
10

Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

Task_4. *
+Задано уравнение вида q + w = e,
q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
     */

    public static int task_1(int n){
        int[] arr = new int[1000];
        for(int i = 1; i < 1000; i++){
            arr[i] = i*i*i;
        }
        return arr[n];
    }

    public static int[] task_2(){
        Scanner iScanner = new Scanner(System.in);
        int cnt = iScanner.nextInt();
        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            System.out.print("arr[ ] = ");
            arr[i] = iScanner.nextInt();
        }
        System.out.print("m = ");
        int m = iScanner.nextInt();
        for(int i = 0; i < cnt; i++){
            arr[i] *= m;
        }
        return arr;
    }

    public static void task_3(){
        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        String sim = iScanner.next();
        int b = iScanner.nextInt();
        int result = switch (sim) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.print("= ");
        System.out.print(result);
    }

    public static void task_4_1(){
        for(int q = 0; q <= 99; q++){
            for(int w = 0; w <= 99; w++){
                for (int e = 0; e <= 99; e++){
                    if(q+w==e){
                        System.out.println(q+"+"+w+"="+e);
                    }
                }
            }
        }
    }
    public static int getInt(String st){
        Scanner scan = new Scanner(st);
        scan.useDelimiter("\\D+");
        if (st.indexOf("?") == st.length()-1){
            return 10 * scan.nextInt();
        }else{
             return scan.nextInt();
        }
    }

    public static void main(String[] args) {
        String word = "7? + ?5 = 92";
        Scanner iScanner = new Scanner(System.in);
        word = iScanner.nextLine();
        word = word.replace(" ", "");
        String[] arr = word.split("[+=]");

        int a = getInt(arr[0]);
        int b = getInt(arr[1]);
        int c = getInt(arr[2]);

        if (a > b && a > 10) {
            a = a + b;
            b = c - a;
        }else if(b > a && b > 10){
            b = a + b;
            a = c - b;
        }
        if(a+b == c){
            System.out.println(a + " + " + b + " = "+ c);
        }else{
            System.out.println("False");
        }
    }
}