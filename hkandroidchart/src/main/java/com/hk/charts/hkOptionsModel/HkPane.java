package com.hk.charts.hkOptionsModel;

public class HkPane {
    public HkBackgroundElement[] background;
    public Object[] center;
    public Number endAngle;
    public Number size;
    public Number startAngle;

    public HkPane background(HkBackgroundElement[] prop) {
        background = prop;
        return this;
    }

    public HkPane center(Object[] prop) {
        center = prop;
        return this;
    }

    public HkPane endAngle(Number prop) {
        endAngle = prop;
        return this;
    }

    public HkPane size(Number prop) {
        size = prop;
        return this;
    }

    public HkPane startAngle(Number prop) {
        startAngle = prop;
        return this;
    }
}
