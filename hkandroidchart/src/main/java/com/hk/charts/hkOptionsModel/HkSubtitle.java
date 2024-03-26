package com.hk.charts.hkOptionsModel;


import com.hk.charts.hkChartEnum.HkChartVerticalAlignType;

public class HkSubtitle {
    public String text;
    public HkStyle style;
    public String align;
    public String verticalAlign;
    public Number x;
    public Number y;
    public Boolean userHTML;

    public HkSubtitle text(String prop) {
        text = prop;
        return this;
    }

    public HkSubtitle style(HkStyle prop) {
        style = prop;
        return this;
    }

    public HkSubtitle align(String prop) {
        align = prop;
        return this;
    }

    public HkSubtitle verticalAlign(HkChartVerticalAlignType prop) {
        verticalAlign = prop.toString();
        return this;
    }

    public HkSubtitle x(Number prop) {
        x = prop;
        return this;
    }

    public HkSubtitle y(Number prop) {
        y = prop;
        return this;
    }

    public HkSubtitle userHTML(Boolean prop) {
        userHTML = prop;
        return this;
    }
}
