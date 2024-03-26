package com.hk.charts.hkOptionsModel;

public class HkPlotLinesElement {

    public Object color;
    public String dashStyle;
    public Number width;
    public Number value;
    public Integer zIndex;
    public HkLabel label;

    public HkPlotLinesElement color(Object prop) {
        color = prop;
        return this;
    }

    public HkPlotLinesElement dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }

    public HkPlotLinesElement width(Number prop) {
        width = prop;
        return this;
    }

    public HkPlotLinesElement value(Number prop) {
        value = prop;
        return this;
    }

    public HkPlotLinesElement zIndex(Integer prop) {
        zIndex = prop;
        return this;
    }

    public HkPlotLinesElement label(HkLabel prop) {
        label = prop;
        return this;
    }



}






