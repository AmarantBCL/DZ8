package com.vpetelsky;

/*
1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная
комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
public class Task1 {
    public static void showTime() {
        int amount = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                String hours = String.format("%02d", h);
                String minutes = String.format("%02d", m);
                if (isReversed(hours, minutes)) {
                    System.out.println(hours + ":" + minutes);
                    amount++;
                }
            }
        }

        System.out.println("Total times of symmetry: " + amount);
    }

    public static boolean isReversed(String hours, String minutes) {
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(minutes).reverse().toString();

        return hours.equals(reversed);
    }
}
