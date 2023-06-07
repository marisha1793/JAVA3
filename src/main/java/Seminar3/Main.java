package Seminar3;

import java.util.*;

public class Main {
    static Random random = new Random();
    static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
        }
        System.out.println(ints);
        Collections.sort(ints);
        System.out.println(ints);
    }
}
