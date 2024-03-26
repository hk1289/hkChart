package com.hk.charts.hkOptionsModel;

public class HkMarkerHover {

    public Boolean enabled;
    public String fillColor;
    public String lineColor;
    public Number lineWidth;
    public Number lineWidthPlus;
    public Number radius;
    public Number radiusPlus;

    public HkMarkerHover enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkMarkerHover fillColor(String prop) {
        fillColor = prop;
        return this;
    }

    public HkMarkerHover lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public HkMarkerHover lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkMarkerHover lineWidthPlus(Number prop) {
        lineWidthPlus = prop;
        return this;
    }

    public HkMarkerHover radius(Number prop) {
        radius = prop;
        return this;
    }

    public HkMarkerHover radiusPlus(Number prop) {
        radiusPlus = prop;
        return this;
    }

}
