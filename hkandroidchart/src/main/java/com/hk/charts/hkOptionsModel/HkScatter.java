package com.hk.charts.hkOptionsModel;

public class HkScatter {
    public Number lineWidth;
    public String lineColor;
    public String dashStyle;
    public Object enableMouseTracking;
    public String linkedTo;
    public HkStates states;
    public HkMarker marker;

    public HkScatter lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkScatter lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public HkScatter dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }

    public HkScatter enableMouseTracking(Object prop) {
        enableMouseTracking = prop;
        return this;
    }

    public HkScatter linkedTo(String prop) {
        linkedTo = prop;
        return this;
    }

    public HkScatter states(HkStates prop) {
        states = prop;
        return this;
    }

    public HkScatter marker(HkMarker prop) {
        marker = prop;
        return this;
    }
}
