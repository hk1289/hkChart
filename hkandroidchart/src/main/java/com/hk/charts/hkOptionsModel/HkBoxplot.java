package com.hk.charts.hkOptionsModel;

public class HkBoxplot {
    public String boxDashStyle;
    public Object fillColor;
    public Number lineWidth;
    public String medianColor;
    public String medianDashStyle;
    public Number medianWidth;
    public String stemColor;
    public String stemDashStyle;
    public Number stemWidth;
    public String whiskerColor;
    public String whiskerDashStyle;
    public String whiskerLength;
    public Number whiskerWidth;

    public HkBoxplot boxDashStyle(String prop) {
        boxDashStyle = prop;
        return this;
    }

    public HkBoxplot fillColor(Object prop) {
        fillColor = prop;
        return this;
    }

    public HkBoxplot lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkBoxplot medianColor(String prop) {
        medianColor = prop;
        return this;
    }

    public HkBoxplot medianDashStyle(String prop) {
        medianDashStyle = prop;
        return this;
    }

    public HkBoxplot medianWidth(Number prop) {
        medianWidth = prop;
        return this;
    }

    public HkBoxplot stemColor(String prop) {
        stemColor = prop;
        return this;
    }

    public HkBoxplot stemDashStyle(String prop) {
        stemDashStyle = prop;
        return this;
    }

    public HkBoxplot stemWidth(Number prop) {
        stemWidth = prop;
        return this;
    }

    public HkBoxplot whiskerColor(String prop) {
        whiskerColor = prop;
        return this;
    }

    public HkBoxplot whiskerDashStyle(String prop) {
        whiskerDashStyle = prop;
        return this;
    }

    public HkBoxplot whiskerLength(String prop) {
        whiskerLength = prop;
        return this;
    }

    public HkBoxplot whiskerWidth(Number prop) {
        whiskerWidth = prop;
        return this;
    }
}
