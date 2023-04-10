### *Homework*
## Task_1
*Дан Deque состоящий из последовательности цифр.*
  *Необходимо проверить, что последовательность цифр является палиндромом*

### *Решение:*
```Java
import java.util.*;
public class Main {
    public static boolean checkOn(Deque<Integer> deque){
        while (deque.size() > 1){
            if (deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
      System.out.println(checkOn(deque));
    }
}
```
Вовод консоли:
```CMD
false
```
----
## *Task_2*
*Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,*
 *и каждый из их узлов содержит одну цифру.*
*Сложите два числа и верните сумму в виде связанного списка.
### *Решение:*
```Java
import java.util.*;
public class Main {

  public static List<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
    List<Integer> result = new ArrayList<>();
    int temp = 0;
    int n = d1.size();
    for (int i = 0; i < n; i++){
      int n1 = d1.removeFirst();
      int n2 = d2.removeFirst();
      int sum = n1 + n2;
      if (sum >= 10){
        result.add(sum%10 + temp++);
      }else{
        result.add(sum + temp);
        temp = 0;
      }
    }
    result.add(temp);
    return result;
  }
    public static void main(String[] args) {
      Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
      Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
      System.out.print(sum(d1,d2));
    }
}
```

Вовод консоли:
```CMD
[6, 6, 0, 1]
```
----
## *Task_3*
*Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,*
*является ли входная строка логически правильной.*
*Входная строка логически правильная, если:*
1) *Открытые скобки должны быть закрыты скобками того же типа.*
2) *Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую*
*открытую скобку того же типа.*


    ()[] = true
    () = true
    {[()]} = true
    ()() = true
    )()( = false



### *Решение:*
```Java
public class Main {
    public static boolean validate(String sTrue){
        StringBuilder val = new StringBuilder();
        int index = -1;
        for (char item: sTrue.toCharArray()){
            if (item == '(' || item == '{' || item == '['){
                val.append(item);
            } else if (item == ')') {
                index = val.indexOf("(");
                if (index == -1){
                    return false;
                }else {
                    val.deleteCharAt(index);
                }
            } else if (item == '}') {
                index = val.indexOf("{");
                if (index == -1){
                    return false;
                }else {
                    val.deleteCharAt(index);
                }

            } else if (item == ']') {
                index = val.indexOf("[");
                if (index == -1) {
                    return false;
                } else {
                    val.deleteCharAt(index);
                }
            }}
        if (val.length() > 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String sTrue = "(){}[]";
        String sFalse = "(){}[])";
        System.out.println(validate(sTrue));
        System.out.println(validate(sFalse));

    }
}
```

Вовод консоли:
```CMD
true
false
```
----

