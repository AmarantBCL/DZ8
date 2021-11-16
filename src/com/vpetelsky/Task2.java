package com.vpetelsky;

/*
2) Найти количество счастливых билетиков на трамвай от 000001 до 999999 - те у которых сумма первых 3 цифр
равна сумме последних 3
*/
public class Task2 {
    public static void findLuckyTickets() {
        int amount = 0;
        for (int i = 1; i < 1_000_000; i++) {
            String ticket = String.format("%06d", i);
            if (sumTicket(ticket.substring(0, 3)) == sumTicket(ticket.substring(3, 6))) {
                System.out.println("--> " + ticket);
                amount++;
            }
        }

        System.out.println("Total amount of lucky tickets: " + amount);
    }

    public static int sumTicket(String sub) {
        char[] numArray = sub.toCharArray();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Integer.parseInt(String.valueOf(numArray[i]));
        }

        return sum;
    }
}
