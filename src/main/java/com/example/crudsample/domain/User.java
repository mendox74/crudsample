package com.example.crudsample.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;

public class User {
	
	/*
  *ID */
    private int id;
    /*
     * 名前*/
	@NotBlank
    private String name;
    /*
     *  年齢　*/
	@NotNull
    @Max(130)
    @Min(0)
    private int age;
    /*
     *  身長　*/
	@NotNull
    @Min(0)
    private int height;
    /*
     *  体重 */
	@NotNull
    @Min(0)
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
