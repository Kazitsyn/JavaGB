import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static Scanner scan = new Scanner(System.in);

    // Пример: s = “cba”, index = [3,2,1] result “abc”
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

    public static String shuffle(final String s, final int[] index){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            res += s.charAt(index[i]);
        }
        return res;
    }

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