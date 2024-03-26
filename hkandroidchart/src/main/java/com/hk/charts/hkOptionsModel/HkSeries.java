package com.hk.charts.hkOptionsModel;

public class HkSeries {
    public String borderColor;
    public Number  borderWidth;
    public Number  borderRadius;
    public Object borderRadiusTopLeft;
    public Object borderRadiusTopRight;
    public Object borderRadiusBottomLeft;
    public Object borderRadiusBottomRight;
    public HkMarker marker;
    public String stacking;
    public HkAnimation animation;
    public String[] keys;
    public Boolean colorByPoint;//决定了图表是否给每个数据列或每个点分配一个颜色，默认值是 false， 即默认是给每个数据类分配颜色，
    public Boolean connectNulls;//设置折线是否断点重连
    public HkSeriesEvents events;
    public HkShadow shadow;
    public HkDataLabels dataLabels;
    public HkStates states;
    public HkPoint point;
    public Integer pointInterval;
    public String pointIntervalUnit;
    public Object pointPlacement;
    public Number pointStart;
    public Number pointWidth; //柱状图, 条形图, 柱形范围图, 瀑布图, 箱线图(盒须图)直接设置单个图形元素的宽度
    public Number maxPointWidth; //柱状图, 条形图, 柱形范围图, 瀑布图, 箱线图(盒须图)直接设置单个图形元素的最大宽度
    public Number minPointLength; //柱状图, 条形图, 柱形范围图, 瀑布图, 箱线图(盒须图)直接设置单个图形元素的最小高度




    public HkSeries borderColor(String prop) {
        borderColor = prop;
        return this;
    }
    
    public HkSeries borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkSeries borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public HkSeries borderRadiusTopLeft(Object prop) {
        borderRadiusTopLeft = prop;
        return this;
    }

    public HkSeries borderRadiusTopRight(Object prop) {
        borderRadiusTopRight = prop;
        return this;
    }

    public HkSeries borderRadiusBottomLeft(Object prop) {
        borderRadiusBottomLeft = prop;
        return this;
    }

    public HkSeries borderRadiusBottomRight(Object prop) {
        borderRadiusBottomRight = prop;
        return this;
    }

    public HkSeries marker(HkMarker prop) {
        marker = prop;
        return this;
    }

    public HkSeries stacking(String prop) {
        stacking = prop;
        return this;
    }

    public HkSeries animation(HkAnimation prop) {
        animation = prop;
        return this;
    }

    public HkSeries keys(String[] prop) {
        keys = prop;
        return this;
    }

    public HkSeries colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public HkSeries connectNulls(Boolean prop) {
        connectNulls = prop;
        return this;
    }

    public HkSeries events(HkSeriesEvents prop) {
        events = prop;
        return this;
    }

    public HkSeries shadow(HkShadow prop) {
        shadow = prop;
        return this;
    }

    public HkSeries dataLabels(HkDataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public HkSeries states(HkStates prop) {
        states = prop;
        return this;
    }

    public HkSeries point(HkPoint prop) {
        point = prop;
        return this;
    }

    public HkSeries pointInterval(Integer prop) {
        pointInterval = prop;
        return this;
    }

    public HkSeries pointIntervalUnit(String prop) {
        pointIntervalUnit = prop;
        return this;
    }

    public HkSeries pointPlacement(Object prop) {
        pointPlacement = prop;
        return this;
    }

    public HkSeries pointStart(Number prop) {
        pointStart = prop;
        return this;
    }

    public HkSeries pointWidth(Number prop) {
        pointWidth = prop;
        return this;
    }

    public HkSeries maxPointWidth(Number prop) {
        maxPointWidth = prop;
        return this;
    }

    public HkSeries minPointLength(Number prop) {
        minPointLength = prop;
        return this;
    }

}
