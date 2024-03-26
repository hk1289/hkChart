package com.hk.charts.hkOptionsModel;

public class HkShadow {
    public String color;
    public Number offsetX;
    public Number offsetY;
    public Float opacity;
    public Number width;

    public HkShadow color(String prop) {
        color = prop;
        return this;
    }

    public HkShadow offsetX(Number prop) {
        offsetX = prop;
        return this;
    }

    public HkShadow offsetY(Number prop) {
        offsetY = prop;
        return this;
    }

    public HkShadow opacity(Float prop) {
        opacity = prop;
        return this;
    }

    public HkShadow width(Number prop) {
        width = prop;
        return this;
    }

}
