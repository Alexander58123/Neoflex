package com.javarush.task.Neoflex;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int dayOtpusk = 0;
        double zp = 0.0;
        double srDnevnoiZp = 0.0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите кол-во дней отпуска");
        dayOtpusk = keyboard.nextInt();
        System.out.println("Введите вашу среднюю зарпату за 12 месяцев");
        zp = keyboard.nextDouble();

        System.out.println("Кол-во дней " + dayOtpusk + "\nЗарплата " + zp);
        System.out.println("--------------");
        srDnevnoiZp = Math.ceil(zp / 29.3);
        System.out.println("Средний дневной заработок " + srDnevnoiZp);
        System.out.println("Сумма отпускных " + srDnevnoiZp * dayOtpusk + " руб.");

    }
}
