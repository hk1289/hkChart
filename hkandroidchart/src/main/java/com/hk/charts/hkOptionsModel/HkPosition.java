package com.hk.charts.hkOptionsModel;

public class HkPosition {
    public String align;
    public String verticalAlign;
    public Number x;
    public Number y;

    public HkPosition align(String prop) {
        align = prop;
        return this;
    }

    public HkPosition verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public HkPosition x(Number prop) {
        x = prop;
        return this;
    }

    public HkPosition y(Number prop) {
        y = prop;
        return this;
    }

}
