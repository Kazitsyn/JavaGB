import java.util.Scanner;
public class Main {

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