//1. Реализовать консольное приложение, которое:
//  Принимает от пользователя и “запоминает” строки.
//  Если введено print, выводит строки так, чтобы последняя введенная была первой в
//  списке, а первая - последней.
//  Если введено revert, удаляет предыдущую введенную строку из памяти.

//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
//  который вернет “перевернутый” список.

package home_work4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    private static void task2() {
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list,"first", "second", "third", "fourth", "fifth");
        printList(list);
        reverseList(list);
        printList(list);
    }

    private static void task1() {
        ArrayDeque<String> list = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.nextLine();
            if (str.equals("print")) {
                printList(list);
            } else if (str.equals("revert")) {
                try {
                    list.removeFirst();
                } catch (NoSuchElementException ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (str.equals("exit")) {
                System.exit(0);
            } else {
                list.addFirst(str);
            }
        }
    }

    private static void reverseList(LinkedList<String> list) {
        String temp = null;
        for (int i = 0; i < list.size(); i++) {
            list.addFirst(list.get(i));
            list.remove(i+1);
        }
    }

    private static void printList(ArrayDeque<String> arr) {
        for (String i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    private static void printList(LinkedList<String> arr) {
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
