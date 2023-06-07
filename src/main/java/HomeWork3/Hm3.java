package HomeWork3;

import java.util.*;

public class Hm3 {
    static Random random = new Random();
    static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        deleteEvenNumbers();
        findMin();
        findMax();
        getAverage();
    }
    public static void filList(){
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
        }
        System.out.println(ints);
    }
    public static void deleteEvenNumbers(){
        filList();
        Iterator<Integer> listIterator = ints.iterator();
        while(listIterator.hasNext()) {
            Integer nextInt = listIterator.next();
            if (nextInt % 2 == 0) listIterator.remove();
        }
        System.out.println(ints);
    }

    public static void findMin() {
        filList();
        System.out.println(Collections.min(ints));
    }
    public static void findMax() {
        filList();
        System.out.println(Collections.max(ints));
    }
    public static void getAverage() {
        filList();
        double sum = 0;
        for (int i = 0; i < ints.size(); i++) sum += ints.get(i);
        double average = sum / ints.size();
        System.out.println(average);
    }
}
