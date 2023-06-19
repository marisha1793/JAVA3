package Seminar6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    private static int[] getArray(){
        Random randomNum = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNum.nextInt(25);
        }
        return array;
    }

    private static float getUniquePercent(int[] arr) {
        Set<Integer> integers = new HashSet<>();
        for (int j : arr) {
            integers.add(j);
        }
        return integers.size() *100f / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(getUniquePercent(getArray()));
    }
}
