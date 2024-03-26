package com.hk.charts.hkOptionsModel;

public class HkAnimation {
    public Integer duration;
    public String easing;

    public HkAnimation duration(Integer prop) {
        duration = prop;
        return this;
    }

    public HkAnimation easing(String prop) {
        easing = prop;
        return this;
    }
}
