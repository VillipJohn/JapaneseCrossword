package com.example.pc_4.japanesecrossword.view.recyclerview;

/**
 * Created by villip on 07.06.2016.
 */
public class ItemObject {
    private int number;
    private String color;

    public ItemObject(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }
}
