package HomeWork6;
import java.util.*;
import java.util.HashSet;

public class NoteBookMain {
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook(Brend.ASUS, Color.BLACK, GamingNoteBook.NO);
        NoteBook noteBook2 = new NoteBook(Brend.ASUS, Color.BLACK, GamingNoteBook.YES);
        NoteBook noteBook3 = new NoteBook(Brend.ASUS, Color.WHITE, GamingNoteBook.NO);
        NoteBook noteBook4 = new NoteBook(Brend.SUMSUNG, Color.BLACK, GamingNoteBook.NO);
        NoteBook noteBook5 = new NoteBook(Brend.APPLE, Color.BLACK, GamingNoteBook.YES);
        NoteBook noteBook6 = new NoteBook(Brend.SUMSUNG, Color.WHITE, GamingNoteBook.NO);

        Set<NoteBook> noteBookSet = new HashSet<>();
        noteBookSet.add(noteBook1);
        noteBookSet.add(noteBook2);
        noteBookSet.add(noteBook3);
        noteBookSet.add(noteBook4);
        noteBookSet.add(noteBook5);
        noteBookSet.add(noteBook6);

        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "бренд");
        filter.put(2, "цвет");

        Map<Integer, Brend> brends = new HashMap<>();
        int counter = 1;
        for (Brend br : Brend.values()) {
            brends.put(counter++, br);
        }

        Map<Integer, Color> colors = new HashMap<>();
        counter = 1;
        for (Color cl : Color.values()) {
            colors.put(counter++, cl);
        }

        System.out.println("Введите цифру критерия из списка: ");
        System.out.println(filter);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер критерия: ");
        int userFilter = scanner.nextInt();

        switch (userFilter) {
            case 1 -> {
                System.out.println("Модель какого бренда вас интересует?\nВведите номер бренда:");
                System.out.println(brends);
                int userBrand = scanner.nextInt();
                switch (userBrand) {
                    case 1 -> {
                        for (NoteBook model : noteBookSet) {
                            if (model.getBrend() == Brend.ASUS) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 2 -> {
                        for (NoteBook model : noteBookSet) {
                            if (model.getBrend() == Brend.SUMSUNG) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 3 -> {
                        for (NoteBook model : noteBookSet) {
                            if (model.getBrend() == Brend.APPLE) {
                                System.out.println(model);
                            }
                        }
                    }
                    default -> System.out.println("Введен некорректный номер.");
                }
            }
            case 2 -> {
                System.out.println("Модель какого цвета вас интересует?\nВведите номер:");
                System.out.println(colors);
                int userColor = scanner.nextInt();
                switch (userColor) {
                    case 1 -> {
                        for (NoteBook model : noteBookSet) {
                            if (model.getColor() == Color.BLACK) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 2 -> {
                        for (NoteBook model : noteBookSet) {
                            if (model.getColor() == Color.WHITE) {
                                System.out.println(model);
                            }
                        }
                    }
                    default -> System.out.println("Введен некорректный номер критерия.");
                }
            }
            default -> System.out.println("Введен некорректный номер критерия.");
        }
    }

}
