package com.hk.charts.hkOptionsModel;


import com.hk.charts.hkChartCreator.HkChartEvents;

public class HkChart {
    public String type;
    public Object backgroundColor;
    public String plotBackgroundImage;
    public String pinchType;
    public Boolean panning;
    public String panKey;
    public Boolean polar;
    public Object animation; //HkAnimation | Boolean
    public Boolean inverted;
    /*图表外边缘和绘图区域之间的边距。 数组中的数字分别表示顶部，右侧，底部和左侧 ([👆,👉,👇,👈])。
    也可以使用 marginTop，marginRight，marginBottom 和 marginLeft 来设置某一个方向的边距*/
    public Number[] margin;
    public Number marginTop; //👆
    public Number marginRight; //👉
    public Number marginBottom; //👇
    public Number marginLeft; //👈
    public HkScrollablePlotArea scrollablePlotArea;
    public HkResetZoomButton resetZoomButton;
    public String zoomType;
    public HkChartEvents events;
    public Number height;

    public HkChart type(String prop) {
        type = prop;
        return this;
    }

    public HkChart backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }

    public HkChart plotBackgroundImage(String prop) {
        plotBackgroundImage = prop;
        return this;
    }

    public HkChart pinchType(String prop) {
        pinchType = prop;
        return this;
    }

    public HkChart panning(Boolean prop) {
        panning = prop;
        return this;
    }

    public HkChart panKey(String prop) {
        panKey = prop;
        return this;
    }

    public HkChart polar(Boolean prop) {
        polar = prop;
        return this;
    }

    public HkChart animation(Object prop) {
        animation = prop;
        return this;
    }

    public HkChart inverted(Boolean prop) {
        inverted = prop;
        return this;
    }

    public HkChart margin(Number[] prop) {
        margin = prop;
        return this;
    }

    public HkChart marginTop(Number prop) {
        marginTop = prop;
        return this;
    }

    public HkChart marginRight(Number prop) {
        marginRight = prop;
        return this;
    }

    public HkChart marginBottom(Number prop) {
        marginBottom = prop;
        return this;
    }

    public HkChart marginLeft(Number prop) {
        marginLeft = prop;
        return this;
    }

    public HkChart scrollablePlotArea(HkScrollablePlotArea prop) {
        scrollablePlotArea = prop;
        return this;
    }

    public HkChart resetZoomButton(HkResetZoomButton prop) {
        resetZoomButton = prop;
        return this;
    }

    public HkChart zoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }

    public HkChart events(HkChartEvents events) {
        this.events = events;
        return this;
    }

    public HkChart height(Number height) {
        this.height = height;
        return this;
    }

}
