### *Семинар 2*
Основные методы строк

        Метод	Описание
        s.concat()	 объединяет строки
        s.length()	 возвращает длину строки
        s.valueOf()	 преобразует объект в строковый вид
        s.join()	 соединяет строки с учетом разделителя
        s.сompare()	 сравнивает две строки
        s.charAt()	 возвращает символ строки по индексу
        s.getChars()	 возвращает группу символов
        s.equals()	 сравнивает строки с учетом регистра
        s.equalsIgnoreCase()	 сравнивает строки без учета регистра
        s.regionMatches()	 сравнивает подстроки в строках
        s.indexOf()	 находит индекс первого вхождения подстроки в строку
        s.isEmpty()	 возвращает true, если строка пуста, иначе - false
        s.lastIndexOf()	 находит индекс последнего вхождения подстроки в строку
        s.startsWith()	 определяет, начинается ли строка с подстроки
        s.endsWith()	 определяет, заканчивается ли строка на определенную подстроку
        s.replace()	 заменяет в строке одну подстроку на другую
        s.trim()	 удаляет начальные и конечные пробелы
        s.substring()	 возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        s.toLowerCase()	 переводит все символы строки в нижний регистр
        s.toUpperCase()	 переводит все символы строки в верхний регистр
        s.toCharArray()	 преобразовывает строку в массив символов


Task_1
Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.

    Sample Input:
    
    4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
    4
    Sample Output:
    
    0
    28
**Решение:**

```Java
package com.company;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
          String numbers = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("введите целое число: ");
          String n = iScanner.next();
          int x1 = numbers.indexOf(n);
          int x2 = numbers.lastIndexOf(n);
          System.out.println(x1);
          System.out.println(x2);
      }
}
```
Ввод консоли:
```CMD
введите целое число: 4
```
Вывод консоли:
```CMD
0
28
```
----

Task_2

Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова, которые написаны в газете.

Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.

    Sample Input:
    
    а
    в
    Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
    Sample Output:
    
    2
    3

**Решение:**

```Java
package com.company;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("любимая буква Маши: ");
          String masha = iScanner.next();
          System.out.printf("любимая буква Олега: ");
          String oleg = iScanner.next();
          String stroka = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
          String [] sample =  stroka.split(" ");
          int count1 = 0;
          int count2 = 0;
          for (int i = 0 ; i < sample.length; i++) {
              if (sample[i].indexOf(masha) != -1){
                  count1++;
              }
              if(sample[i].indexOf(oleg) != -1){
                  count2++;
              }
          }
          System.out.printf("%s, %s\n", count1, count2);
      }
}
```
Ввод консоли:
```CMD
любимая буква Маши: а
любимая буква Олега: в
```
Вывод консоли:
```CMD
7, 5
```
----
Task_3

Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. В следующих трех строках показаны три правильных IP-адреса:

    127.0.0.0
    192.168.0.01
    255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
Входные данные
На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.

Выходные данные
Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

Примечание:
У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:

    String s = ".";

просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки, содержащей точку используйте экранирование.

    
    Sample Input 1:
    
    192.168.1.2
    Sample Output 1:
    
    YES
    Sample Input 2:
    
    192.11.690.0
    Sample Output 2:
    
    NO
    Sample Input 3:
    
    67.67.67
    Sample Output 3:
    
    NO

**Решение:**

```Java
package com.company;

import java.util.Scanner;

public static boolean validate(final String ip) {
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        return ip.matches(PATTERN);
        }

public class Main {
      public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("enter IP-address:");
            String ip = scan.nextLine();

            if (validate(ip)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
      }
}
```
Ввод консоли:
```CMD
133.156.111.0
```
Вывод консоли:
```CMD
YES
```
----
Task_4

Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите, сколько раз в тексте встречается введённый символ в любом регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

    Sample Input:
    
    Good morning my dear friend. My fish.
    m
    Sample Output:
    
    3

**Решение:**

```Java
package com.company;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
          String sample = "Good morning my dear friend. My fish.".toLowerCase();
          int count = 0;
          char n = 'm';
          for (int i  = 0; i < sample.length(); i++) {
              if(sample.charAt(i) == n){
                  count++;
              }
          }
          System.out.println(count);
      }
}
```
Ввод консоли:
```CMD

```
Вывод консоли:
```CMD
3
```
----
Task_5
Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". Если же их равное количество, то выведите слово "Equal".

    Sample Input:
    
    34Hi56
    Sample Output:
    
    Digit

**Решение:**

```Java
package com.company;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
          String str = "asdhkas34898ojd";
          int didgitsCnt = 0;
          int alphaCnt = 0;
          for (int i = 0; i < str.length(); i++) {
              char item = str.charAt(i);
              if (Character.isDigit(item)) {
                  didgitsCnt++;
              }
              if (Character.isLetter(item)) {
                  alphaCnt++;
              }
          }
          if (didgitsCnt > alphaCnt) {
              System.out.println("Digit");
          }
          else System.out.println("Alpha");
      }
}
```

Вывод консоли:
```CMD
Alpha
```
----

Task_6

public class Task_6 {

Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
Требуется перехватить все возможные ошибки и вывести их в логгер.
После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате


}