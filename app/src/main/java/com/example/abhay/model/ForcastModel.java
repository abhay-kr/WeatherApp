package com.example.abhay.model;

public class ForcastModel {

    private String date;
    private String maxTemp;
    private String minTemp;
    private String maxTempPhrase;
    private String minTempPhrase;

    public ForcastModel(String date, String maxTemp, String minTemp, String maxTempPhrase, String minTempPhrase) {
        this.date = date;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.maxTempPhrase = maxTempPhrase;
        this.minTempPhrase = minTempPhrase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTempPhrase() {
        return maxTempPhrase;
    }

    public void setMaxTempPhrase(String maxTempPhrase) {
        this.maxTempPhrase = maxTempPhrase;
    }

    public String getMinTempPhrase() {
        return minTempPhrase;
    }

    public void setMinTempPhrase(String minTempPhrase) {
        this.minTempPhrase = minTempPhrase;
    }
}
