import java.util.*;


public class Main {
    public static List<Integer> sortByCollections(List<Integer> list){
        list.sort(null);
        return list;
    }

    public static List<Integer> sortByComparator(List<Integer> list){
        list.sort(Collections.reverseOrder());
        return list;
    }

    public static List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0){
                list1.add(list.get(i));
            }
        }
        return list1;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){

        return 0;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        return 0;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){

        return 0;
    }

    public static void printResultOfCheck(List<String> list){
        for (String element : list) {
            try {
                Integer.parseInt(element);
                System.out.println(element + " int");
            } catch (NumberFormatException e) {
                System.out.println(element + " String");
            }
        }
    }


    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        int n = iScanner.nextInt();
//        List<String> listInt = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            listInt.add(String.valueOf(i));
//        }
//        System.out.println(listInt);
//        int m = iScanner.nextInt();
//        String s = iScanner.next();
//        listInt.add(m, s);
//        System.out.println(listInt);
//
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
//        System.out.println(sortByCollections(list));
//        System.out.println(sortByComparator(list));

//        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
//        printResultOfCheck(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
        System.out.println(removeEvenValue(list));


    }
}