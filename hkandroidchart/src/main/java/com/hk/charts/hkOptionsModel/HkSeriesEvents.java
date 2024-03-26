package com.hk.charts.hkOptionsModel;


import com.hk.charts.hkTools.HkJSStringPurer;

public class HkSeriesEvents {
    public String legendItemClick;

    public HkSeriesEvents legendItemClick(String prop) {
        legendItemClick = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

}
