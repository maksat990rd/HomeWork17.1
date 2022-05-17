package com.company;

public class Main {

    public static void main(String[] args) {
        /** ±Класс Cow (weight, age, gender, nickName)
         ±Класс Sheep(weight, age, gender, nickName)
         ±Класс Horse(weight, age, color, gender, nickName)
         ±Класс Farm(address, cows, horses, sheep, OwnerName)
         ±2 Farm тузунуз.
         ±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
         ±2-Farmда 1 sheep, 1 cow, 1 horse болсун. */

        Farm farm1 = new Farm();
        farm1.setOwnerName("Klara");
        farm1.setAddress("Belek!");

        Farm farm2 = new Farm();
        farm2.setOwnerName("Aziza");
        farm2.setAddress("Belogorka!");

        Cow cow1 = new Cow("mumu1",12, 'M', 120);
        Cow cow2 = new Cow("mumu2",13, 'W', 125);
        Cow cow3 = new Cow("mumu3",15, 'M', 142);
        Cow cow4 = new Cow("mumu4",14, 'W', 132);
        Cow cow5 = new Cow("mumu5",16, 'M', 112);
        Sheep sheep1 = new Sheep("Beebeee1", 8, 'M', 40);
        Sheep sheep2 = new Sheep("Beebeee2", 6, 'W', 54);
        Sheep sheep3 = new Sheep("Beebeee3", 5, 'M', 62);
        Horse horse1 = new Horse("igog", 12, 'M', 80, "black");
        Horse horse2 = new Horse("igogogo", 13, 'W', 90, "Wight");

        farm1.setCows(new Cow[]{cow1,cow2,cow3,cow4,cow5});
        farm1.setHorses(new Horse[]{horse1,horse2});
        farm1.setSheeps(new Sheep[]{sheep1,sheep2,sheep3});
        System.out.println(farm1);
        System.out.println();

        farm2.setCows(new Cow[] {cow1});
        farm2.setHorses(new Horse[]{horse1});
        farm2.setSheeps(new Sheep[] {sheep1});
        System.out.println(farm2);

    }
}
