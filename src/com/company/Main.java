package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(Days.valueOf(sc.next().toUpperCase()));

//        Scanner sc1 = new Scanner(System.in);
//        DaysOfWeek days = DaysOfWeek.valueOf(sc1.next().toUpperCase());
//        switch (days) {
//            case MONDAY -> System.out.println("Java teori.");
//            case TUESDAY -> System.out.println("Advanced English.");
//            case WEDNESDAY -> System.out.println("JAVA teori.");
//            case THURSDAY -> System.out.println("Soft Skills.");
//            case FRIDAY -> System.out.println("Java teori and practise.");
//            case SUNDAY -> System.out.println("Day off");
//            case SATURDAY -> System.out.println("Day with my children");
//        }


    }
}
