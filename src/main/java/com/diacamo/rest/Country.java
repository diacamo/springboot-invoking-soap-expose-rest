package com.diacamo.rest;

public class Country {

    //private final long id;
    private String name;
    private int population;
    private String capital;
    private Curency curency;

    public Country() {   }
    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Curency getCurency() {
        return curency;
    }

    public void setCurency(Curency curency) {
        this.curency = curency;
    }

    public void setName(String name) {
        this.name = name;
    }

}
