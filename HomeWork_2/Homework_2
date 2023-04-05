### *Homework*
## Task_0
* *Посчитайте сколько драгоценных камней в куче обычных камней*

      Пример:
      jewels = “aB”, stones = “aaaAbbbB”
      Результат в консоль ”a3B1”
       
### *Решение:*
```Java
import java.util.Scanner;

public class Main {

  public static String findJewelsInStones(String jewels, String stones) {
    String result = "";

    for (int i = 0; i < jewels.length(); i++){
      int cnt = 0;
      for(int j = 0; j < stones.length(); j++){
        if (jewels.charAt(i) == stones.charAt(j)){
          cnt++;
        }
      }
      result = result + jewels.charAt(i) + cnt;
    }
    return result;
  }

  public static void main(String[] args) {

    String st = findJewelsInStones("aB", "aaaAbbbB");
    System.out.println(st);
  }
}
```
Вовод консоли:
```CMD
a3B1
```
----
## *Task_1*
* *Вам дается строка S и целочисленный массив индексов int index[s.length].*
  *Напишите программу, которая перетасует символы в S таким образом,*
  *что символ c i-й позиции переместится на индекс index[i] в результирующей строке.*

      Пример: s = “cba”, index = [3,2,1] result “abc”
### *Решение:*
```Java
import java.util.Scanner;

public class Main {

  public static String shuffle(final String s, final int[] index){
    String res = "";
    for(int i = 0; i < s.length(); i++){
      res += s.charAt(index[i]);
    }
    return res;
  }


  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    String st = "cba";
    int temp = 0;
    int [] arr = new int[st.length()];
    for (int i = 0; i < st.length(); i++){
      temp = iScanner.nextInt();
      if (temp > st.length()){
        arr[i] = st.length();
      } else if (temp < 0) {
        arr[i] = 0;
      }else{
        arr[i] = temp - 1;
      }
    }
    System.out.println(shuffle(st,arr));
    }
  }
}
```
Ввод консоли:
```CMD
3
2
1
```
Вовод консоли:
```CMD
abc
```
----
## *Task_2*
*На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.*

*Выходные данные*
*Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!*


    Sample Input:
    2
    Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
    Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
    3
    арахис - колбаса
    клубника - вишня
    сгущенка - молоко


    Sample Output:
    
    Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
    Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.*


### *Решение:*
```Java
import java.util.Scanner;

public class Main {
  public static String[] task2recept(){
    System.out.print("Количество строчек в книге: ");
    int n = scan.nextInt();
    scan.nextLine();
    String[] recept = new String[n];
    for (int i = 0; i < n; i++){
      recept[i] = scan.nextLine();
    }
    return recept;
  }
  public static List<String[]> task2product(){
    System.out.print("Количество продуктов: ");
    int m = scan.nextInt();
    scan.nextLine();
    List<String[]> product = new ArrayList<>();
    for (int i = 0; i < m; i++){
      String[] words = scan.nextLine().replace(" ", "").split("[-]");
      product.add(words);
    }
    return product;
  }

  public static String newLine(List<String[]> listArr , String line){
    int l = listArr.size();
    for (int i = 0; i < l; i++){
      String temp1 = listArr.get(i)[0];
      String temp2 = listArr.get(i)[1];
      String temp3 = temp1.substring(0, 1).toUpperCase() + temp1.substring(1);
      String temp4 = temp2.substring(0, 1).toUpperCase() + temp2.substring(1);
      line = line.replaceAll(temp1, temp2);
      line = line.replaceAll(temp3, temp4);
    }
    return line;
  }
  public static void task2show(String[] arr){
    for (String item: arr){
      System.out.println(item);
    }

  }
  public static void main(String[] args) {
    String[] recept = task2recept();
    List<String[]> listArr = task2product();
    for (int i = 0; i < recept.length; i++){
      recept[i] = newLine(listArr, recept[i]);
    }
    task2show(recept);
  }
}
```
Ввод консоли:
```CMD
Количество строчек в книге: 2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
Количество продуктов: 3
арахис - колбаса
клубника - вишня
сгущенка - молоко
```
Вовод консоли:
```CMD
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
```
----

----