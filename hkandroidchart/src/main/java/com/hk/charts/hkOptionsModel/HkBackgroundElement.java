package com.hk.charts.hkOptionsModel;

public class HkBackgroundElement {
    public Object backgroundColor;
    public String borderColor;
    public Number borderWidth;
    public String className;
    public Number innerRadius;
    public Number outerRadius;
    public String shape;

    public HkBackgroundElement backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }
    public HkBackgroundElement borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkBackgroundElement borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkBackgroundElement className(String prop) {
        className = prop;
        return this;
    }

    public HkBackgroundElement innerRadius(Number prop) {
        innerRadius = prop;
        return this;
    }

    public HkBackgroundElement outerRadius(Number prop) {
        outerRadius = prop;
        return this;
    }

    public HkBackgroundElement shape(String prop) {
        shape = prop;
        return this;
    }

}
