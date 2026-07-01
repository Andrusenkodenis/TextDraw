package ru.skillbox;

import java.time.LocalTime;

public class TemperatureIse {
    public void main() {
        System.out.println(LocalTime.now());
        double randomNumber = Math.random();

        System.out.println(randomNumber);
        System.out.println(randomNumber);
        System.out.println(randomNumber);

        int days = 7;
//      проверка через ==
        boolean isWeek = days == 7;
        System.out.println(days);
        System.out.println(isWeek);

        days = 5;
        isWeek = days == 7; /* Проверяется, действительно isWeek равен days*/
        System.out.println(days);
        System.out.println(isWeek);

        String greeting = "Hello Skillbox!";
        System.out.println("Hello World");
        System.out.println(greeting);
    }
}
