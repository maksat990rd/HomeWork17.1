package com.company;

public class Horse extends AbstractAnimal{
    private String color;

    @Override
    void methodEat() {
        System.out.println("Kushaet");
    }

    public Horse() {}

    public Horse(String color) {
        this.color = color;
    }

    public Horse(String nickName, int age, char gender, int weight, String color) {
        super(nickName, age, gender, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse color: " + color + " nickName: "+ getNickName() + " age: " + getAge() + " gender: " + getGender() + " weight: " + getWeight();
    }

}
