import Buldog.Buldog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.*;
import java.util.Random;




//public  class Buldog {
//     Buldog(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public void walking(){
//        System.out.println(name + " гуляет");
//    }
//
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//}

public class Main {
    public static void initHashSet(){
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(a);
    }

    public static void initLinkedHashSet(){
        var b = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(b);
    }
    public static void initTreeSet(){
        var b = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(b);
    }
    public static int[] initArray(){
        int[] arr = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < 1000; i++){
            arr[i] = rnd.nextInt(25);
        }
//        for (int item: arr){
//            System.out.print(item + " ");
//        }
        return arr;
    }

    public static void main(String[] args) {

        Buldog dog = new Buldog("Sharik", 2);
//        System.out.println(dog.getName());
//        System.out.println(dog.getName());
        dog.walking();
        dog.setAward("first");
        dog.setAward("second");
        System.out.println(dog.getAward());
        dog.setExhibition("Дарахвелидзе", "Пьеро");
        dog.setExhibition("Дарахвелидзе2", "Пьеро2");

        System.out.println(dog.getExhibition());
    }
}