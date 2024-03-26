package com.hk.charts.hkOptionsModel;

public class HkItemStyle {
    public String color;
    public String cursor;
    public String pointer;
    public String fontSize;
    public String fontWeight;


    public HkItemStyle color(String prop) {
        color = prop;
        return this;
    }

    public HkItemStyle cursor(String prop) {
        cursor = prop;
        return this;
    }

    public HkItemStyle pointer(String prop) {
        pointer = prop;
        return this;
    }

    public HkItemStyle fontSize(Number prop) {
        fontSize = prop + "px";
        return this;
    }

    public HkItemStyle fontWeight(String prop) {
        fontWeight = prop;
        return this;
    }
}
