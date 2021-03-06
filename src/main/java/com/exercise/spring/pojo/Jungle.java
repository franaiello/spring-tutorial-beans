package com.exercise.spring.pojo;

import java.util.HashMap;
import java.util.Map;

public class Jungle {
    private Map<String, String> foods = new HashMap<String, String>();
    private Map<String, Animal> animals = new HashMap<String, Animal>();

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    public Map<String, String> getFoods() {
        return foods;
    }

    public Map<String, Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Jungle{" +
                "foods=" + foods +
                ", animals=" + animals +
                '}';
    }
}
