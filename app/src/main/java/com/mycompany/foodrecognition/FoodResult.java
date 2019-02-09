package com.mycompany.foodrecognition;

public class FoodResult {

    private String calorie;
    private boolean has_calorie;
    private String name;
    private String probability;
    private Baike baike_info;

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getCalorie() {
        return calorie;
    }

    public String getProbability() {
        return probability;
    }

    public boolean isHas_calorie() {
        return has_calorie;
    }

    public void setHas_calorie(boolean has_calorie) {
        this.has_calorie = has_calorie;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Baike getBaike_info() {
        return baike_info;
    }

    public void setBaike_info(Baike baike_info) {
        this.baike_info = baike_info;
    }
}
