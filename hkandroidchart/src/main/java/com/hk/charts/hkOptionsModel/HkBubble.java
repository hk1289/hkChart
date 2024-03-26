package com.hk.charts.hkOptionsModel;

public class HkBubble {
    public Object minSize;
    public Object maxSize;
    public Number zMin;
    public Number zMax;
    public HkDataLabels dataLabels;

    public HkBubble minSize(Object prop) {
        minSize = prop;
        return this;
    }

    public HkBubble maxSize(Object prop) {
        maxSize = prop;
        return this;
    }

    public HkBubble zMin(Number prop) {
        zMin = prop;
        return this;
    }

    public HkBubble zMax(Number prop) {
        zMax = prop;
        return this;
    }

    public HkBubble dataLabels(HkDataLabels prop) {
        dataLabels = prop;
        return this;
    }

}
