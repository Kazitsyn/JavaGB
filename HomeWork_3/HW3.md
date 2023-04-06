### *Homework*
## Task_1
* *Реализовать алгоритм сортировки слиянием и выборкой.*

### *Решение:*
```Java
import java.util.*;
public class Main {
    public static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = (left + right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, left, L, 0, n1);
        for (int j = 0; j < n2; j++){
            R[j] = arr[mid + j +1];
        }
        int i = 0; int j = 0; int k = left;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minindex = i;
            for (int j = 0; j < arr.length; j++){
                if (arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }
    public static void show(int[] arr){
        for (int item: arr){
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] listSelect = new int[]{1, 9, 2, 6, 4, 3, 5, 7, 8, 0};
        int[] listMarge = new int[]{1, 9, 2, 6, 4, 3, 5, 7, 8, 0};
        mergeSort(listMarge,0,9);
        selectionSort(listSelect);
        show(listSelect);
        show(listMarge);
    }
}
```
Вовод консоли:
```CMD
9 2 6 4 3 5 7 8 1 0 
0 1 2 3 4 5 6 7 8 9 
```
----
## *Task_2*
*Пусть дан произвольный список целых чисел, удалить из него чётные числа*

### *Решение:*
```Java
import java.util.*;
public class Main {

    public static List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                list1.add(integer);
            }
        }
        return list1;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(removeEvenValue(list));
    }
}
```

Вовод консоли:
```CMD
[1, 9, 3, 5, 7]
```
----
## *Task_3*
*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*



### *Решение:*
```Java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
      System.out.println(Collections.max(list));
      System.out.println(Collections.min(list));
      System.out.println(list.stream().mapToInt(Integer::intValue).average());
  }
}
```

Вовод консоли:
```CMD
9
0
OptionalDouble[4.5]
```
----

