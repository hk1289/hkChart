package com.hk.charts.hkOptionsModel;

public class HkMarker {
    public Boolean enabled;
    public Number radius;
    public String symbol;
    public String fillColor;//点的填充色(用来设置折线连接点的填充色)
    public Number lineWidth;//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
    public Object lineColor;//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色。)
    public HkMarkerStates states;

    public HkMarker enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkMarker radius(Number prop) {
        radius = prop;
        return this;
    }

    public HkMarker symbol(String prop) {
        symbol = prop;
        return this;
    }

    public HkMarker fillColor(String prop) {
        fillColor = prop;
        return this;
    }

    public HkMarker lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkMarker lineColor(Object prop) {
        lineColor = prop;
        return this;
    }

    public HkMarker states(HkMarkerStates prop) {
        states = prop;
        return this;
    }
}
