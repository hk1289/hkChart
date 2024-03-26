package com.hk.charts.hkOptionsModel;

public class HkPlotBandsElement {
    public Number from;
    public Number to;
    public Object color;
    public String borderColor;
    public Number borderWidth;
    public String className;
    public HkLabel label;
    public Integer zIndex;

    public HkPlotBandsElement from(Number prop) {
        from = prop;
        return this;
    }

    public HkPlotBandsElement to(Number prop) {
        to = prop;
        return this;
    }

    public HkPlotBandsElement color(Object prop) {
        color = prop;
        return this;
    }

    public HkPlotBandsElement borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkPlotBandsElement borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkPlotBandsElement className(String prop) {
        className = prop;
        return this;
    }

    public HkPlotBandsElement label(HkLabel prop) {
        label = prop;
        return this;
    }

    public HkPlotBandsElement zIndex(Integer prop) {
        zIndex = prop;
        return this;
    }

}
