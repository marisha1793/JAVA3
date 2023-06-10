package Homework4;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HW4Task1 {
    List<Integer> list = new LinkedList<>();
    public static List<Integer> getList(int size){
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <size; i++) {
            list.add(i);
        }
        return list;
    }
    public static void reverseList (){
        List<Integer> newList = getList(10);
        System.out.println(newList);
        Collections.reverse(newList);
        System.out.println(newList);
    }
    public static void main(String[] args) {
        reverseList();
    }
}
