package com.company;

public class Cow extends AbstractAnimal{
    @Override
    void methodEat() {
        System.out.println("kushaet");
    }

    public Cow() {
    }

    public Cow(String nickName, int age, char gender, int weight) {
        super(nickName, age, gender, weight);
    }

    @Override
    public String toString() {
        return "Cow nickName: " + getNickName() + " age: " + getAge() + " gender: " + getGender() + " weight: " + getWeight();
    }
}
