package com.hk.charts.hkOptionsModel;

import com.hk.charts.hkTools.HkJSStringPurer;

public class HkTooltip {
    public Object backgroundColor;
    public String borderColor;
    public Number borderRadius;
    public Number borderWidth;
    public HkStyle style;
    public Boolean enabled;
    public Boolean useHTML;
    public String formatter;
    public String headerFormat;
    public String pointFormat;
    public String footerFormat;
    public Integer valueDecimals;
    public Boolean shared;
    public String valueSuffix;
    public Boolean followTouchMove;//https://api.highcharts.com.cn/highcharts#chart.panning
    public Boolean shadow;
    public Number padding;
    public String pointFormatter;
    public String positioner;
    public HkDateTimeLabelFormats dateTimeLabelFormats;
    public String shape;

    public HkTooltip backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }

    public HkTooltip borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkTooltip borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public HkTooltip borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkTooltip style(HkStyle prop) {
        style = prop;
        return this;
    }

    public HkTooltip enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkTooltip useHTML(Boolean prop) {
        useHTML = prop;
        return this;
    }

    public HkTooltip formatter(String prop) {
        formatter = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkTooltip headerFormat(String prop) {
        headerFormat = prop;
        return this;
    }

    public HkTooltip pointFormat(String prop) {
        pointFormat = prop;
        return this;
    }

    public HkTooltip footerFormat(String prop) {
        footerFormat = prop;
        return this;
    }

    public HkTooltip valueDecimals(Integer prop) {
        valueDecimals = prop;
        return this;
    }

    public HkTooltip shared(Boolean prop) {
        shared = prop;
        return this;
    }

    public HkTooltip valueSuffix(String prop) {
        valueSuffix = prop;
        return this;
    }

    public HkTooltip followTouchMove(Boolean prop) {
        followTouchMove = prop;
        return this;
    }

    public HkTooltip shadow(Boolean prop) {
        shadow = prop;
        return this;
    }

    public HkTooltip padding(Number prop) {
        padding = prop;
        return this;
    }

    public HkTooltip pointFormatter(String prop) {
        pointFormatter = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkTooltip positioner(String prop) {
        positioner = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkTooltip dateTimeLabelFormats(HkDateTimeLabelFormats prop) {
        dateTimeLabelFormats = prop;
        return this;
    }

    public HkTooltip shape(String prop) {
        shape = prop;
        return this;
    }

    public HkTooltip() {
        enabled = true;
        shared = true;
    }


    
  
}
