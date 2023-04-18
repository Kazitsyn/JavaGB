
import java.util.*;

/**
 * Базовый класс телефонной книги
 */
public class PhoneBook {
    /** HashMap для хранения пары ключ-значение, ключ - имя контакта, значение - множество телефонов*/
    private Map<String, Set<String>> book;


    public PhoneBook(){
        book = new HashMap<>();
    }

    /**
     * Добавление нового телефона для указаноего имени, если имени нет то добавляет новый контакт.
     * @param name  Имя
     * @param phone Телефон
     */
    public void add(String name, String phone){
        if (!book.containsKey(name)){
            book.put(name, new HashSet<>());
        }
        book.get(name).add(phone);
    }

    /**
     * Получить номер контакта
     * @param name имя контакта
     * @return возвращает множество телефонов для указаного имени контакта, если контакта нет множество будет пустым.
     */
    public Set<String> getPones(String name){
        return book.getOrDefault(name, new HashSet<>());
    }

    /**
     * Удалить телефон у контакта
     * @param name имя контакта
     * @param phone телефон
     */
    public void remove(String name, String phone){
        if (book.containsKey(name)){
            book.get(name).remove(phone);
            if (book.get(name).isEmpty()){
                book.remove(name);
            }
        }
    }

    /**
     * Удалить все телефоны для указаного имени контакта
     * @param name имя контакта
     */
    public void removeAll(String name){
        book.remove(name);
    }
    public void printAll(){
        for (String name: book.keySet()){
            System.out.println(name + "\t" + getPones(name));
        }
    }


}
