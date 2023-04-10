import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static Integer getNumberOfCouples(final List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int x = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                int y = list.get(j);
                if (x == y) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(1, 1, 1, 2, 2);
        System.out.println(getNumberOfCouples(array));


        // Task_1

// Вводится число n, затем n целых чисел.
// Определите, сколько различных чисел было введено.

// Sample Input:
// 7
// 1 1 2 2 2 3 3

// Sample Output:
// 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Введите кол-во элементов: ");
        // int count = sc.nextInt();
        // Set<Integer> set = new HashSet<>();
        // for (int i = 0; i < count; i++) {
        //     set.add(sc.nextInt());
        // }
        // System.out.println("Ответ: "+ set.size());

//         Task_2
// Вводится число n, затем n целых чисел.
//  Для каждого числа выведите слово YES (в отдельной строке),
// если это число ранее встречалось в последовательности или NO,  если не встречалось.
// Sample Input:
// 6
// 1 2 3 2 3 4
// Sample Output:
// NO
// NO
// NO
// YES
// YES
// NO
        //     Scanner sc = new Scanner(System.in);
        // System.out.println("Введите кол-во элементов: ");
        // int count = sc.nextInt();
        // Set<Integer> set = new HashSet<>();
        // ArrayList array = new ArrayList();
        // for (int i = 0; i < count; i++) {
        //     int input = sc.nextInt();
        //     if(set.contains(input)){
        //         array.add("YES");
        //     }else{
        //         set.add(input);
        //         array.add("NO");
        //     }

        // }
        // for (int index = 0; index < array.size(); index++) {
        //     System.out.println(array.get(index));
        // }

        // Дана последовательность чисел.
        // Необходимо вернуть число совпадающих пар в этой последовательности
        // Пример 1:     In: arr = [1, 2]  Out: 0
        // Пример 2:     In: arr = [1, 1, 2]  Out: 1
        // Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4

        // int[] array = {1, 1, 1, 2, 2};
        // Map<Integer, Integer> dict = new HashMap<>();
        // for (int i = 0; i < array.length; i++) {
        //     if (dict.containsKey(array[i])){
        //         int j = dict.get(array[i]);
        //         dict.put(array[i], j+1);
        //     }else{
        //         dict.put(array[i], 1);

        //     }

        // }
        //    int sum = 0;
        //    for (var item : dict.entrySet()) {
        //     int n = item.getValue();
        //     sum += n *(n-1)/2;
        //    }
        //    System.out.println(sum);
//////////////////////////////////////////////////////////////////////////////////////

        //     // Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают,
        //     что существует прямой путь, идущий от
        // // ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути,
        //  ведущего в другой город.
        // // Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
        // // Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара
//        HashMap<String, String> map = new HashMap<>(Map.of(
//                "Москва", "Самара",
//                "Самара", "Курск",
//                "Курск", "Пенза",
//                "Пенза", "Мурманск"
//        ));
//
//        String fCity = "";
//        for (var item : map.entrySet()) {
//            String city = item.getValue();
//            if (!map.containsKey(city)){
//                fCity = city;
//            }
//        }
//        System.out.println(fCity);
//    }
//}
    }
}