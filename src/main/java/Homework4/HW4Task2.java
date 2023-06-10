package Homework4;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;

public class HW4Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(list);

        System.out.println(dequeue(list)); // удалили первый элемент
        System.out.println(list);

        System.out.println(first(list)); // вывели первый элемент
        System.out.println(list);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = list.get(0);
        return num;
    }

    public static Integer getRandomNumber() {
        Random random = new Random();
        int num = random.nextInt(10);
        return num;
    }
}