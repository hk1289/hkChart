package com.hk.charts.hkOptionsModel;

public class HkLegend {
    public String layout; //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    public String align; //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    public String verticalAlign; //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    public Boolean enabled;
    public String borderColor;
    public Number borderWidth;
    public Number itemMarginTop; //图例的每一项的顶部外边距，单位px。 默认是：0.
    public HkItemStyle itemStyle;
    public Number symbolHeight;
    public Number symbolPadding;
    public Number symbolRadius;
    public Number symbolWidth;
    public Number x;
    public Number y;
    public Boolean floating;
    public String labelFormat;

    public HkLegend layout(String prop) {
        layout = prop;
        return this;
    }

    public HkLegend align(String prop) {
        align = prop;
        return this;
    }

    public HkLegend verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public HkLegend enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkLegend borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkLegend BorderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkLegend itemMarginTop(Number prop) {
        itemMarginTop = prop;
        return this;
    }

    public HkLegend itemStyle(HkItemStyle prop) {
        itemStyle = prop;
        return this;
    }

    public HkLegend symbolHeight(Number prop) {
        symbolHeight = prop;
        return this;
    }

    public HkLegend symbolPadding(Number prop) {
        symbolPadding = prop;
        return this;
    }

    public HkLegend symbolRadius(Number prop) {
        symbolRadius = prop;
        return this;
    }

    public HkLegend symbolWidth(Number prop) {
        symbolWidth = prop;
        return this;
    }

    public HkLegend x(Number prop) {
        x = prop;
        return this;
    }

    public HkLegend y(Number prop) {
        y = prop;
        return this;
    }

    public HkLegend floating(Boolean prop) {
        floating = prop;
        return this;
    }

    public HkLegend labelFormat(String prop) {
        labelFormat = prop;
        return this;
    }



}
