package com.hk.charts.hkOptionsModel;

public class HkHover {
    public Boolean enabled;
    public String borderColor;
    public Number brightness;
    public String color;
    public HkHalo halo;
    public Number lineWidth;
    public Number lineWidthPlus;

    public HkHover enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkHover borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkHover brightness(Number prop) {
        brightness = prop;
        return this;
    }

    public HkHover color(String prop) {
        color = prop;
        return this;
    }

    public HkHover halo(HkHalo prop) {
        halo = prop;
        return this;
    }

    public HkHover lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkHover lineWidthPlus(Number prop) {
        lineWidthPlus = prop;
        return this;
    }
}
