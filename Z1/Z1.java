package pl.imiajd.kacprzyk;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.LinkedList;

public class Z1 {

        public static <T> void redukuj(LinkedList<T>li)
        {
            int n = 3;
            int j = 0;
            for(int i=0;i<li.size();i++)
            {
                j++;
                if(j==n)
                {
                    j = 1;
                    li.remove(i);
                }
            }

        }

        public static void main(String[] args) {
        LinkedList<Integer>ints = new LinkedList<>();
        ints.add(1);
        ints.add(1);
        ints.add(3);
        ints.add(1);
        ints.add(1);
        ints.add(3);
        ints.add(1);
        ints.add(1);
        ints.add(3);
        System.out.println(ints);
        redukuj(ints);
        System.out.println(ints);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate d1 = LocalDate.parse("2022 12 01",formatter);
        LocalDate d2 = LocalDate.parse("2021 01 24",formatter);
        LocalDate d3 = LocalDate.parse("2019 05 07",formatter);
        LocalDate d4 = LocalDate.parse("2018 07 14",formatter);
        LocalDate d5 = LocalDate.parse("2017 09 15",formatter);
        LocalDate d6 = LocalDate.parse("2016 10 17",formatter);

        LinkedList<LocalDate> daty = new LinkedList<>();
        daty.add(d1);
        daty.add(d2);
        daty.add(d3);
        daty.add(d4);
        daty.add(d5);
        daty.add(d6);
        System.out.println(daty);
        redukuj(daty);
        System.out.println(daty);


    }
}
