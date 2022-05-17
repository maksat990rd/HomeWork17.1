package com.company;

public class Sheep extends AbstractAnimal{
    @Override
    void methodEat() {
        System.out.println("kushaet");
    }

    public Sheep() {
    }

    public Sheep(String nickName, int age, char gender, int weight) {
        super(nickName, age, gender, weight);
    }

    @Override
    public String toString() {
        return "Sheep NickName: " + getNickName() + " age: " + getAge() + " gender: " + getGender() + " weight: " + getWeight();
    }
}
