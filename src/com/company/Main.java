package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// a) Используйте цикл
        //b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
        //c)  Затем программа должна отобразить этот список
        //d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
        //e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        //f)  После объединения отобразить в консоли список С
        //g)   В конце отсортировать элементы списка С по длине слова,
        // сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            System.out.println("Введите имя " + i + " :");

            A.add(scanner.next());
            System.out.println("Вы ввели имя " + i+" :" + A );

        }
        System.out.println(A);
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<String> B = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            System.out.println("Введите имя " + i + " :");

            B.add(scanner2.next());
            System.out.println("Вы ввели имя " + i+" :" + B);
        }

        Collections.reverse(B);
        ArrayList<String> c = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            c.add(A.get(i));
            c.add(B.get(i));
        }

        System.out.println(c);
        c.sort(Comparator.comparingInt(String::length));
        System.out.println(c);
    }

}
