# Home work 1
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

