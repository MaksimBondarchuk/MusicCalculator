package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sheet = new Scanner(System.in);
        ArrayList<String> nota = new ArrayList<>();
        nota.add(0, "C");
        nota.add(1, "C#");
        nota.add(2, "D");
        nota.add(3, "D#");
        nota.add(4, "E");
        nota.add(5, "F");
        nota.add(6, "F#");
        nota.add(7, "G");
        nota.add(8, "G#");
        nota.add(9, "A");
        nota.add(10, "A#");
        nota.add(11, "B");
        ArrayList<String> inter = new ArrayList<>();
        inter.add(0, "ч1");
        inter.add(1, "м2");
        inter.add(2, "б2");
        inter.add(3, "м3");
        inter.add(4, "б3");
        inter.add(5, "ч4");
        inter.add(6, "тритон");
        inter.add(7, "ч5");
        inter.add(8, "м6");
        inter.add(9, "б6");
        inter.add(10, "м7");
        inter.add(11, "б7");
        inter.add(12, "ч8");

        System.out.println("Введіть потрібну ноту: ");
            int note = sheet.nextInt();
            if (note >= 0 && note <= nota.size()){
            String nota2 = nota.get(note - 1);
            System.out.println("Ваша нота: " + nota2);

                System.out.println("Введіть ваш інтервал: ");
                int ind = sheet.nextInt();
                if (ind >= 0 && ind <= inter.size()){
                    String ind2 = inter.get(ind);
                    int res = note + ind;// обчислення суми індексів
                    System.out.println("Ваш інтервал: " + ind2);
                    int kolo = res % nota.size();

                    String result = nota.get(kolo - 1);
                    System.out.println("Ваша друга нота буде: " +  result);
                }
                else {
                    System.out.println("Немає такого інтервалу");
                }
        }
            else {
                System.out.println("Немає такої ноти");
            }
    }
}