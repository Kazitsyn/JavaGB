

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        task2();
    }

    private static void task1() {
        PhoneBook book = new PhoneBook();
        book.add("Ivan", "+79996662211");
        book.add("Ivan", "+79996662871");
        book.add("Sergey", "+79996662214");
        book.add("Anna", "+79996662217");
        book.add("Maria", "+79996662218");
        book.add("Petr", "+79996662216");
        book.printAll();
    }
    private static void task2() {
        List<String> fio = new ArrayList<>();
        fio.add("firstName2 secondName1");
        fio.add("firstNam1 secondName2");
        fio.add("firstNam2 secondName3");
        fio.add("firstName3 secondName4");
        fio.add("firstNam2 secondName5");
        fio.add("firstName2 secondName6");
        fio.add("firstName2 secondName7");
        fio.add("firstName secondName8");
        fio.add("firstName secondName9");
        fio.add("firstName secondName10");
        fio.add("firstName secondName11");

        int result = 0;
        HashMap<String, Integer> res = new HashMap<>();

        for (String item: fio){
            int cnt = 0;
            Scanner scan = new Scanner(item);
            String name = scan.next();
            name += " ";
            for (String s : fio) {
                if (s.contains(name)) {
                    cnt++;
                }
            }
            if (result < cnt){
                result = cnt;
            }
            res.put(item, cnt);
        }
        System.out.println(result);
        System.out.println(res);
        List<String> finish = new ArrayList<>();
        for (int i = fio.size(); i > 0 ; i--){
            for (String item: fio){
                if (res.containsValue(i) && res.get(item) != null){
                    if (res.get(item) == i){
                        finish.add(item);
                        res.remove(item);
                    }
                }

            }
        }
        System.out.println(finish);
    }


}
