package com.vpetelsky;

import java.util.Scanner;

/*
Код выполнения домашних заданий находится в соответствующих классах
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to show 'Task #1'");
        scanner.nextLine();
        Task1.showTime();
        System.out.println("Press ENTER to show 'Task #2'");
        scanner.nextLine();
        Task2.findLuckyTickets();
    }
}
