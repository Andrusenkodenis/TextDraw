package ru.skillbox;

public class Operators {
    public static  void main(String[] args) {
        int temperature = 101;
        boolean isIce = temperature < 0;
        boolean isSteam = temperature > 100;

        boolean isNonLiquld = isIce || isSteam;
        System.out.println(isNonLiquld); /*проверка, жидкости воды или нет*/
    }
}
