package com.hk.charts.hkOptionsModel;

public class HkTitle {
    public String text;
    public HkStyle style;
    public String align;
    public String verticalAlign;
    public Number x;
    public Number y;
    public Boolean userHTML;

    public HkTitle text(String prop) {
        text = prop;
        return this;
    }

    public HkTitle style(HkStyle prop) {
        style = prop;
        return this;
    }

    public HkTitle align(String prop) {
        align = prop;
        return this;
    }

    public HkTitle verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public HkTitle x(Number prop) {
        x = prop;
        return this;
    }

    public HkTitle y(Number prop) {
        y = prop;
        return this;
    }

    public HkTitle userHTML(Boolean prop) {
        userHTML = prop;
        return this;
    }
}
