# Homework 1
## Task_1
* *Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.*

        Sample Input:
        8
        11
        Sample Output:
        512
        1331
### *Решение:*
```Java
import java.util.Scanner;

public class Main {
    
  public static int Task_1(int n){
    int[] arr = new int[1000];
    for(int i = 1; i < 1000; i++){
      arr[i] = i*i*i;
    }
    return arr[n];
  }
  
  public static void main(String[] args) {
      
    Scanner iScanner = new Scanner(System.in);
    int n1 = iScanner.nextInt();
    int n2 = iScanner.nextInt();
    System.out.println(Task_1(n1));
    System.out.println(Task_1(n2));
    
  }
}
```
Ввод консоли:
```CMD
8
11
```
Вовод консоли:
```CMD
512
1331
```
----
## *Task_2*
* *Вводится число n, затем n чисел целых, по одному на каждой строке.
  Затем вводится число, на которое нужно умножить все введённые выше числа.
  Выведите на экран результат умножения построчно.*

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
### *Решение:*
```Java
import java.util.Scanner;

public class Main {

  public static int[] Task_2(){
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

  public static void main(String[] args) {
    int[] arr = Task_2();
    for (int item:arr) {
      System.out.println(item);
    }
  }
}
```
Ввод консоли:
```CMD
5
arr[ ] = 1
arr[ ] = 2
arr[ ] = 3
arr[ ] = 4
arr[ ] = 5
m = 6
```
Вовод консоли:
```CMD
6
12
18
24
30
```
----
