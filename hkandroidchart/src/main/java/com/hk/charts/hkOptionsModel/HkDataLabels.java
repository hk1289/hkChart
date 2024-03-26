package com.hk.charts.hkOptionsModel;

import com.hk.charts.hkTools.HkJSStringPurer;

public class HkDataLabels {
    public Boolean enabled;
    public String align;
    public Boolean inside;
    public HkStyle style;
    public String format;
    public String formatter;
    public Number rotation;
    public Boolean allowOverlap;
    public Boolean useHTML;
    public Number distance;
    public String verticalAlign;
    public Number x;
    public Number y;
    public String color;
    public String backgroundColor;
    public String borderColor;
    public Number borderRadius;
    public Number borderWidth;
    public String shape;
    public Boolean crop;
    public String overflow;
    public Boolean softConnector;
    public Object textPath;
    public Object filter;

    public HkDataLabels enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkDataLabels align(String prop) {
        align = prop;
        return this;
    }

    public HkDataLabels inside(Boolean prop) {
        inside = prop;
        return this;
    }


    public HkDataLabels style(HkStyle prop) {
        style = prop;
        return this;
    }

    public HkDataLabels format(String prop) {
        format = prop;
        return this;
    }

    public HkDataLabels formatter(String prop) {
        formatter = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkDataLabels rotation(Number prop) {
        rotation = prop;
        return this;
    }

    public HkDataLabels allowOverlap(Boolean prop) {
        allowOverlap = prop;
        return this;
    }

    public HkDataLabels useHTML(Boolean prop) {
        useHTML = prop;
        return this;
    }

    public HkDataLabels distance(Number prop) {
        distance = prop;
        return this;
    }

    public HkDataLabels verticalAlign(String prop) {
        verticalAlign = prop;
        return this;
    }

    public HkDataLabels x(Number prop) {
        x = prop;
        return this;
    }

    public HkDataLabels y(Number prop) {
        y = prop;
        return this;
    }

    public HkDataLabels color(String prop) {
        color = prop;
        return this;
    }

    public HkDataLabels backgroundColor(String prop) {
        backgroundColor = prop;
        return this;
    }

    public HkDataLabels borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkDataLabels borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public HkDataLabels borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkDataLabels shape(String prop) {
        shape = prop;
        return this;
    }

    public HkDataLabels crop(Boolean prop) {
        crop = prop;
        return this;
    }

    public HkDataLabels overflow(String prop) {
        overflow = prop;
        return this;
    }

    public HkDataLabels softConnector(Boolean prop) {
        softConnector = prop;
        return this;
    }

    public HkDataLabels textPath(Object prop) {
        textPath = prop;
        return this;
    }

    public HkDataLabels filter(Object prop) {
        filter = prop;
        return this;
    }
}
