package com.company;

public class Class {
    private int number;
    private String word;
    private int[] massive;

    public Class(){
    }

    public Class(int number, String word, int[] massive) {
        this.number = number;
        this.word = word;
        this.massive = massive;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMassive() {
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }
}
