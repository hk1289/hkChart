package com.hk.charts.hkChartCreator;

import com.hk.charts.hkTools.HkJSStringPurer;

public class HkChartEvents {
    public String load;
    public String redraw;
    public String render;
    public String selection;


    public HkChartEvents load(String prop) {
        load = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkChartEvents redraw(String prop) {
        redraw = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkChartEvents render(String prop) {
        render = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkChartEvents selection(String prop) {
        selection = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }
}
