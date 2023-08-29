package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Pair {
    private int key;
            private String value;
    public Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sheet = new Scanner(System.in);
        List<Pair> nota = new ArrayList<>();
        nota.add(new Pair(0, "C"));
        nota.add(new Pair(1, "C#"));
        nota.add(new Pair(2, "D"));
        nota.add(new Pair(3, "D#"));
        nota.add(new Pair(4, "E"));
        nota.add(new Pair(5, "F"));
        nota.add(new Pair(6, "F#"));
        nota.add(new Pair(7, "G"));
        nota.add(new Pair(8, "G#"));
        nota.add(new Pair(9, "A"));
        nota.add(new Pair(10, "A#"));
        nota.add(new Pair(11, "B"));
        List<Pair> inter = new ArrayList<>();
        inter.add(new Pair(0, "ч1"));
        inter.add(new Pair(1, "м2"));
        inter.add(new Pair(2, "б2"));
        inter.add(new Pair(3, "м3"));
        inter.add(new Pair(4, "б3"));
        inter.add(new Pair(5, "ч4"));
        inter.add(new Pair(6, "тритон"));
        inter.add(new Pair(7, "ч5"));
        inter.add(new Pair(8, "м6"));
        inter.add(new Pair(9, "б6"));
        inter.add(new Pair(10, "м7"));
        inter.add(new Pair(11, "б7"));
        inter.add(new Pair(12, "ч8"));

        System.out.println("Введіть потрібну ноту: ");
        String note = sheet.nextLine();

        String note2 = null;
        int note3 = 0;
        int inte3 = 0;
        for (Pair para : nota) {
            if (para.getValue().equals(note)) {
                note2 = para.getValue();
                para.getKey().equals(note);
                note3 = para.getKey();
                break;
            }
        }
        if (note2 != null) {
            System.out.println("Ваша нота: " + note2);
            System.out.println("Введіть потрібний інтервал: ");
            String inte = sheet.nextLine();

            String inte2 = null;
            for (Pair para2 : inter) {
                if (para2.getValue().equals(inte)) {
                    inte2 = para2.getValue();
                    para2.getKey().equals(inte);
                    inte3 = para2.getKey();
                    break;
                }
            }
            if (inte2 != null) {
                System.out.println("Ваш інтервал : " + inte2);
                System.out.println("Обраховуємо вашу відповідь...");
                int res = (note3 + inte3);

                String res1 = null;
                for (Pair para3 : nota) {
                    int kolo = res % nota.size();
                    if (para3.getKey().equals(kolo)) {
                        res1 = para3.getValue();
                    }
                }
                if (res1 != null) {
                    System.out.println("Ваша друга нота буде: " + res1);

                }
            }
        }
    }
}
