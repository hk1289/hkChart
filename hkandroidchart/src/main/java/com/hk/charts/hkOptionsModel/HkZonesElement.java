package com.hk.charts.hkOptionsModel;

public class HkZonesElement {
    public Number value;
    public Object color;
    public Object fillColor;
    public String dashStyle;

    public HkZonesElement value(Number prop) {
        value = prop;
        return this;
    }

    public HkZonesElement color(Object prop) {
        color = prop;
        return this;
    }

    public HkZonesElement fillColor(Object prop) {
        fillColor = prop;
        return this;
    }

    public HkZonesElement dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }
}
