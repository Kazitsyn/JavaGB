import java.util.*;

//Task_1
//        Очередь
//        Напишите программу, которая реализует структуру данных очередь, используя список.
//        Условие задачи таково: пользователь листает список музыки и добавляет в плейлист
//        понравившиеся ему композиции. Когда песня доигрывает, включается следующая.
//        Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.
//        Сначала вводится число n - количество запросов к вашей программе.
//        Каждый из запросов будет иметь один следующих видов:
//        push <Название трека> - добавляет трек в плейлист
//        pop - удаляет из плейлиста первы трекй. При этом на экран выводится запись вида "воспроизводится <название трека>"
//        После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.
//        Sample Input:
//        4
//        push Трек1
//        push Трек3
//        pop
//        push ТрекТрек
//        Sample Output:
//
//        воспроизводится Трек1
//        Трек3 ТрекТрек
public class Main {

    public static boolean checkOn(Deque<Integer> deque){
            while (deque.size() > 1){
                if (deque.removeFirst() != deque.removeLast()){
                    return false;
                }
            }
        return true;
    }

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

//        List<String[]> listString = new ArrayList<>();
//        Scanner iScanner = new Scanner(System.in);
//        int n = iScanner.nextInt();
//
//        for (int i = 0; i <= n ; i++){
//            listString.add(iScanner.nextLine().split(" "));
//        }
//        String temp = listString.get(1)[1];
//        System.out.println("Play: " + temp);
//        for (int i = 0; i < n ; i++){
//            if(listString.get(i)[0] == "push"){
//
//            }
//        }
//        System.out.println(listString);

//        List<String> listSt = new ArrayList<>();
//        Scanner iScanner = new Scanner(System.in);
//        int n = iScanner.nextInt();
//
//        for(int i =0; i < n; i++){
//            String temp = iScanner.next();
//            if (temp.equals("push")){
//                String st = iScanner.next();
//                listSt.add(st);
//            } else if (temp.equals("pop")) {
//                System.out.println("Взял " + listSt.get(i-1));
//                listSt.remove(i-1);
//            }
//
//        }
//        for (String item:listSt) {
//            System.out.print(item + " ");
//        }
//        System.out.println(listSt);

        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        System.out.print(sum(d1,d2));

//        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
//        System.out.println(checkOn(deque));
    }
}