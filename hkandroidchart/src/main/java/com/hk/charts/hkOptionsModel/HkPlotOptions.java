package com.hk.charts.hkOptionsModel;

public class HkPlotOptions {
    public HkColumn column;
    public HkLine line;
    public HkPie pie;
    public HkBar bar;
    public HkSpline spline;
    public HkArea area;
    public HkAreaspline areaspline;
    public HkBubble bubble;
    public HkColumnrange columnrange;
    public HkArearange arearange;
    public HkSeries series;
    public HkBoxplot boxplot;
    public HkScatter scatter;


    public HkPlotOptions column(HkColumn prop) {
        column = prop;
        return this;
    }

    public HkPlotOptions line(HkLine prop) {
        line = prop;
        return this;
    }

    public HkPlotOptions pie(HkPie prop) {
        pie = prop;
        return this;
    }

    public HkPlotOptions bar(HkBar prop) {
        bar = prop;
        return this;
    }

    public HkPlotOptions spline(HkSpline prop) {
        spline = prop;
        return this;
    }

    public HkPlotOptions area(HkArea prop) {
        area = prop;
        return this;
    }

    public HkPlotOptions areaspline(HkAreaspline prop) {
        areaspline = prop;
        return this;
    }

    public HkPlotOptions bubble(HkBubble prop) {
        bubble = prop;
        return this;
    }

    public HkPlotOptions columnrange(HkColumnrange prop) {
        columnrange = prop;
        return this;
    }

    public HkPlotOptions arearange(HkArearange prop) {
        arearange = prop;
        return this;
    }

    public HkPlotOptions series(HkSeries prop) {
        series = prop;
        return this;
    }

    public HkPlotOptions boxplot(HkBoxplot prop) {
        boxplot = prop;
        return this;
    }

    public HkPlotOptions scatter(HkScatter prop) {
        scatter = prop;
        return this;
    }

}
