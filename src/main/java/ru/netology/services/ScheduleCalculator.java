package ru.netology.services;

public class ScheduleCalculator {
    public int calculate(int income, int expences, int threshold) {
        int count = 0;
        int money = 0;
        for (int workMonth = 0; workMonth < 12; workMonth++) {
            if (money >= threshold) {
                count++;
                money = money - expences;
                money = money / 3;
            } else {
                money = money + income - expences;
            }
        }
        return count;
    }
}
