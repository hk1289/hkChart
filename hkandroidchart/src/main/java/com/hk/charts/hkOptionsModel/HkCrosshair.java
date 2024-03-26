package com.hk.charts.hkOptionsModel;

public class HkCrosshair {
    public Number width;
    public String color;
    public String dashStyle;

    public HkCrosshair width(Number prop) {
        width = prop;
        return this;
    }

    public HkCrosshair color(String prop) {
        color = prop;
        return this;
    }

    public HkCrosshair dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }
}
