package Seminar4;


import java.util.LinkedList;
import java.util.List;

public class Task0 {
    public static List<Integer> createArray(int size){
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        createArray(1000000);
        long after = System.currentTimeMillis();
        System.out.println(after - before);

    }
}
