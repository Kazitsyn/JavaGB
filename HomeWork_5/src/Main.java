
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        phoneBook.put("Ivan", new ArrayList<>());
        phoneBook.get("Ivan").add("+79996662211");
        phoneBook.get("Ivan").add("+79996664411");
        phoneBook.put("Sergey", new ArrayList<>());
        phoneBook.get("Sergey").add("+79896663332");
        System.out.println(phoneBook);
    }
}