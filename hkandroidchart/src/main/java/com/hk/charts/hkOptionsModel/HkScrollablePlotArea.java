package com.hk.charts.hkOptionsModel;

public class HkScrollablePlotArea {
    public Number minHeight;
    public Number minWidth;
    public Float opacity;
    public Number scrollPositionX;
    public Number scrollPositionY;

    public HkScrollablePlotArea minHeight(Number prop) {
        minHeight = prop;
        return this;
    }

    public HkScrollablePlotArea minWidth(Number prop) {
        minWidth = prop;
        return this;
    }

    public HkScrollablePlotArea opacity(Float prop) {
        opacity = prop;
        return this;
    }

    public HkScrollablePlotArea scrollPositionX(Number prop) {
        scrollPositionX = prop;
        return this;
    }

    public HkScrollablePlotArea scrollPositionY(Number prop) {
        scrollPositionY = prop;
        return this;
    }
}
