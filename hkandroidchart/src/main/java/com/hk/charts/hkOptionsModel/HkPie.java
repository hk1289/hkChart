package com.hk.charts.hkOptionsModel;

public class HkPie {
    public String type;
    public String name;
    public Object[] data;
    public HkDataLabels dataLabels;
    public Number size;
    public String innerSize;
    public Boolean allowPointSelect;
    public String cursor;
    public Boolean showInLegend;
    public Number startAngle;
    public Number endAngle;
    public Number depth;
    public Object center;

    public HkPie type(String prop) {
        type = prop;
        return this;
    }

    public HkPie name(String prop) {
        name = prop;
        return this;
    }

    public HkPie data(Object[] prop) {
        data = prop;
        return this;
    }

    public HkPie dataLabels(HkDataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public HkPie size(Number prop) {
        size = prop;
        return this;
    }

    public HkPie innerSize(String prop) {
        innerSize = prop;
        return this;
    }

    public HkPie allowPointSelect(Boolean prop) {
        allowPointSelect = prop;
        return this;
    }

    public HkPie cursor(String prop) {
        cursor = prop;
        return this;
    }

    public HkPie showInLegend(Boolean prop) {
        showInLegend = prop;
        return this;
    }

    public HkPie startAngle(Number prop) {
        startAngle = prop;
        return this;
    }

    public HkPie endAngle(Number prop) {
        endAngle = prop;
        return this;
    }

    public HkPie depth(Number prop) {
        depth = prop;
        return this;
    }

    public HkPie center(Object prop) {
        center = prop;
        return this;
    }

}
