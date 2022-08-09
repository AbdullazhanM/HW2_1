package com.com;

public class Main {

    public static void main(String[] args) {
        Father ObjectA = new Father(EyeColor.GRAY, "Алишер", 60, new Job("Инженер"));
        Son ObjectB = new Son(EyeColor.GREEN, "Абдулла", 27, new Job("Банкир"));
        Son ObjectC = new Son(EyeColor.BLACK, "Аброр", 31, new Job("Экспедитор"));

        ObjectA.getInfo();
        ObjectB.getInfo();
        ObjectC.getInfo();
    }
}
