package lab5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class main {

    public static void length() {
        String text = "Написать метод для поиска самого длинного слова в тексте";
        String[] strings = text.split(" ");
        int[] length = new int[strings.length];
        int maxvalue = 0;
        int element = 0;
        for (int i=0; i< strings.length; i++) {
            length[i]=strings[i].length();
            if (maxvalue<length[i]) {
                maxvalue = length[i];
            element=i;}
        }
        System.out.println(strings[element]);
        }

    public static void reverse() {
        String s = "Радар";
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = s1.reverse();
        System.out.println(s1.toString().equals(s2.toString()));
    }

    public static void replace() {
        String text = "Написать метод бяка для поиска самого бяка длинного слова в тексте";
        String replace = text.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(replace);
    }

    public static void index() {
        String text = "Написать метод бяка для поиска самого бяка длинного слова в тексте для поиска самого для поиска самого";
        String text2 = "для поиска самого";
        int occurrences = 0;
        int index = text.indexOf(text2);
            while  (index != -1) {
                occurrences++;
                index = text.indexOf(text2, index + 1);
            }
            System.out.println(occurrences);
        }

        public static void task5() {
            String text = "This is a test string";
            String[] strings = text.split(" ");
                for (String s : strings) {
                    StringBuilder s1 = new StringBuilder(s);
                    StringBuilder s2 = s1.reverse();
                    System.out.println(s2.toString());
                }
            }


    public static void main(String[] args) {
        main.length();
        main.reverse();
        main.replace();
        main.index();
        main.task5();

    }
}
