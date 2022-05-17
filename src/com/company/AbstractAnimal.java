package com.company;

public abstract class AbstractAnimal {
    private String nickName;
    private int age;
    private char gender;
    private int weight;

    public AbstractAnimal() {}

    public AbstractAnimal(String nickName, int age, char gender, int weight) {
        this.nickName = nickName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract void methodEat();

}
