package Seminar2;

public class Task1 {
    private String one = "c1";
    private String two = "c2";
    public static void build (int num) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                builder.append("c1");
            } else {
                builder.append("c2");
            }
        }
        System.out.println(builder);

    }
}
