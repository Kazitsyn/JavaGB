import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static boolean validate(final String ip) {
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        return ip.matches(PATTERN);
    }
//    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
//        -----------------Task 1----------------------
//        String numbers = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("введите целое число: ");
//        String n = iScanner.next();
//        int x1 = numbers.indexOf(n);
//        int x2 = numbers.lastIndexOf(n);
//        System.out.println(x1);
//        System.out.println(x2);
//------------------------------------------------
//        ------------------Task 2 ------------------------
//            Scanner iScanner = new Scanner(System.in);
//            System.out.printf("любимая буква Маши: ");
//            String masha = iScanner.next();
//            System.out.printf("любимая буква Олега: ");
//            String oleg = iScanner.next();
//            String stroka = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
//            String [] sample =  stroka.split(" ");
//            int count1 = 0;
//            int count2 = 0;
//            for (int i = 0 ; i < sample.length; i++) {
//                if (sample[i].indexOf(masha) != -1){
//                    count1++;
//                }
//                if(sample[i].indexOf(oleg) != -1){
//                    count2++;
//                }
//            }
//            System.out.printf("%s, %s\n", count1, count2);
//        ---------------------------------------------

//                System.out.println("enter IP-address:");
//                String ip = scan.nextLine();
//
//                if (validate(ip)) {
//                    System.out.println("YES");
//                } else {
//                    System.out.println("NO");
//                }


//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("любимая буква Маши: ");
//        String ipAdress = iScanner.next();
//        String[] ip = ipAdress.split("[.]");
//        //for(String i : ip){
//        //   System.out.println(i);
//        //}
//        int count = 0;
//        if (ip.length == 4){
//            for(int i = 0; i < ip.length; i++){
//                Scanner scan = new Scanner(ip[i]);
//                scan.useDelimiter("\\D+");
//                int scanInt = scan.nextInt();
//                if (scanInt >= 0 && scanInt < 256){
//                    count++;
//
//                }}
//            if (count == 4){
//                System.out.println("yes");
//            }
//            else{
//                System.out.println("no");
//            }
//        }
//        else{
//            System.out.println("no");
//        }
//    }
//        String sample = "Good morning my dear friend. My fish.".toLowerCase();
//        int count = 0;
//        char n = 'm';
//        for (int i  = 0; i < sample.length(); i++) {
//            if(sample.charAt(i) == n){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//        ------------------------------------
//        String str = "asdhkas34898ojd";
//        int didgitsCnt = 0;
//        int alphaCnt = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char item = str.charAt(i);
//            if (Character.isDigit(item)) {
//                didgitsCnt++;
//            }
//            if (Character.isLetter(item)) {
//                alphaCnt++;
//            }
//        }
//        if (didgitsCnt > alphaCnt) {
//            System.out.println("Digit");
//        }
//        else System.out.println("Alpha");




    }
}