package Seminar6;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat(Bread.PERS, LocalDate.now(), new Owner(), Color.BLACK, new Pedigree(), Gender.FEMALE);
        System.out.println(cat.getBread());
        Cat cat2 = new Cat(Bread.PERS, LocalDate.now(), new Owner(), Color.BLACK, new Pedigree(), Gender.FEMALE);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);
        System.out.println(cats);

    }
}
