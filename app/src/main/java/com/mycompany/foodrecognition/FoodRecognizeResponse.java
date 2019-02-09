package com.mycompany.foodrecognition;

import java.util.ArrayList;
import java.util.List;

public class FoodRecognizeResponse {

    private String log_id;

    private int result_num;

    private ArrayList<FoodResult> result;

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public int getResult_num() {
        return result_num;
    }

    public void setResult_num(int result_num) {
        this.result_num = result_num;
    }

    public ArrayList<FoodResult> getResult() {
        return result;
    }

    public void setResult(ArrayList<FoodResult> result) {
        this.result = result;
    }
}
