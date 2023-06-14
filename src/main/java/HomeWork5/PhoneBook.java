package HomeWork5;

// Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать,
// что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать,
// как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.


import java.util.*;

public class PhoneBook {
    Map<String, ArrayList<String>> phonebook = new HashMap<>();
    public void PhoneNameAdd(String name) {
        phonebook.put(name, new ArrayList<>());
    }

    public void printPhoneBook() {
        System.out.println(phonebook);
    }

    public void generateNumbers() {
        Set<String> allKeys = phonebook.keySet();
        List<String> keyList = new ArrayList<>(allKeys);
        for (String s : keyList) {
            ArrayList<String> getArray = phonebook.get(s);
            for (int j = 0; j < counter() + 1; j++) {
                getArray.add(generateRuPhone());
            }
        }
    }

    public void sortedPrint() {
        Comparator<Map.Entry<String, ArrayList<String>>> valueComparator = ((o1, o2) ->
                Integer.compare(o2.getValue().size(), o1.getValue().size()));
        List<Map.Entry<String, ArrayList<String>>> sortedList = new ArrayList<>(phonebook.entrySet());
        sortedList.sort(valueComparator);
        sortedList.forEach(System.out::println);
    }

    private int counter() {
        Random random = new Random();
        return random.nextInt(6);
    }

    private String generateRuPhone() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder("+7");
        String[] cityCodes = {"495", "499", "812", "831", "383", "343", "717", "843", "846"};
        String cityCode = cityCodes[random.nextInt(cityCodes.length)];
        sb.append(cityCode);
        int firstPart = random.nextInt(900) + 100;
        sb.append(firstPart);
        int secondPart = random.nextInt(9000) + 1000;
        sb.append(secondPart);
        return sb.toString();
    }
}