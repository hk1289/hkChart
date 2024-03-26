package com.hk.charts.hkOptionsModel;

public class HkDataElement {
    public String name;
    public Number x;
    public Number y;
    public Object color;
    public HkDataLabels dataLabels;
    public HkMarker marker;

    public HkDataElement name(String prop) {
        name = prop;
        return this;
    }

    public HkDataElement x(Number prop) {
        x = prop;
        return this;
    }

    public HkDataElement y(Number prop) {
        y = prop;
        return this;
    }

    public HkDataElement color(Object prop) {
        color = prop;
        return this;
    }

    public HkDataElement dataLabels(HkDataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public HkDataElement marker(HkMarker prop) {
        marker = prop;
        return this;
    }
}
