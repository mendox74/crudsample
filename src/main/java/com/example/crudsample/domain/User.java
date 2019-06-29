package com.example.crudsample.domain;

public class User {
	
	/*
  *ID */
    private int id;
    /*
     * 名前*/
    private String name;
    /*
     *  年齢　*/
    private int age;
    /*
     *  身長　*/
    private int height;
    /*
     *  体重 */
    private int weight;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
    }

}
