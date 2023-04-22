import Classes.*;
import java.util.*;

public class Main {
    /**
     * 1 - DDR
     * 2  - RAM
     * 3 - VideoRam
     * 4 - diagonal
     * 5 - frequency
     * @return выводит словарь фильтров
     */
    public static HashMap<Integer, Double> inputFilter(){
        HashMap<Integer, Double> temp = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("1 - DDR\n" +
                "2  - RAM\n" +
                "3 - VideoRam\n" +
                "4 - diagonal\n" +
                "5 - frequency CPU \n");
        for (int i = 1; i < 6; i++){
            System.out.printf("%d: ", i );
            temp.put(i, scan.nextDouble());
        }
        return temp;
    }

    public static List<Noutbuk> result(HashMap<Integer, Double> temp, HashSet<Noutbuk> noutbuks){
        List<Noutbuk> res = new ArrayList<>();
        for(var item: noutbuks){
            if(item.getDdr().getVolume() >= temp.get(1) &&
                    item.getRom().getVolume() >= temp.get(2) &&
                    item.getVideoCard().getVolume() >= temp.get(3) &&
                    item.getDiagonal() >= temp.get(4) &&
                    item.getProc().getVolume() >= temp.get(5)){
                res.add(item);
            }
        }
        return res;
    }

    public static void main(String[] args){
        HashSet<Noutbuk> noutbuks = new HashSet<>();
        Noutbuk noutbuk1 = new Noutbuk("ASUS", "white", 3.0, 15.0);
        noutbuk1.setDdr("Corsar", 8.0, "DDR4");
        noutbuk1.setRom("Seagate", 500.0, "SSD");
        noutbuk1.setVideoCard("Nvidea", 4.0, "GTX3070");
        noutbuk1.setProc("intel", 3.3, "i7");
        noutbuks.add(noutbuk1);
        Noutbuk noutbuk2 = new Noutbuk("ASUS", "silver", 3.0, 17.0);
        noutbuk2.setDdr("Samsung", 16.0, "DDR4");
        noutbuk2.setRom("Seagate", 1000.0, "SSD");
        noutbuk2.setVideoCard("Nvidea", 8.0, "GTX3070");
        noutbuk2.setProc("intel", 3.3, "i3");
        noutbuks.add(noutbuk2);
        Noutbuk noutbuk3 = new Noutbuk("Aser", "silver", 3.0, 17.0);
        noutbuk3.setDdr("Micron", 16.0, "DDR4");
        noutbuk3.setRom("Seagate", 2000.0, "HDD");
        noutbuk3.setVideoCard("Nvidea", 4.0, "GTX3070");
        noutbuk3.setProc("intel", 3.3, "i5");
        noutbuks.add(noutbuk3);

        HashMap<Integer, Double> res = inputFilter();
        List<Noutbuk> resultList = result(res, noutbuks);
//        for (var item: noutbuks){
//            System.out.println(item);
//        }
        for (var item: resultList){
            System.out.println(item);
        }
    }



}