package com.hk.charts.hkOptionsModel;

public class HkColumn {
    public String name;
    public Object[] data;
    public String color;
    public Boolean grouping;//Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. 默认是：true.
    public Float pointPadding;//Padding between each column or bar, in x axis units. 默认是：0.1.
    public Float pointPlacement;//Padding between each column or bar, in x axis units. 默认是：0.1.
    public Float groupPadding;//Padding between each value groups, in x axis units. 默认是：0.2.
    public Number borderWidth;
    public Boolean colorByPoint;//对每个不同的点设置颜色(当图表类型为 HKColumn 时,设置为 HkColumn 对象的属性,当图表类型为 bar 时,应该设置为 bar 对象的属性才有效)
    public HkDataLabels dataLabels;
    public String stacking;
    public Number borderRadius;
    public Integer yAxis;

    public HkColumn name(String prop) {
        name = prop;
        return this;
    }

    public HkColumn data(Object[] prop) {
        data = prop;
        return this;
    }

    public HkColumn color(String prop) {
        color = prop;
        return this;
    }

    public HkColumn grouping(Boolean prop) {
        grouping = prop;
        return this;
    }

    public HkColumn pointPadding(Float prop) {
        pointPadding = prop;
        return this;
    }

    public HkColumn pointPlacement(Float prop) {
        pointPlacement = prop;
        return this;
    }

    public HkColumn groupPadding(Float prop) {
        groupPadding = prop;
        return this;
    }

    public HkColumn borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkColumn colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public HkColumn dataLabels(HkDataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public HkColumn stacking(String prop) {
        stacking = prop;
        return this;
    }

    public HkColumn borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public HkColumn yAxis(Integer prop) {
        yAxis = prop;
        return this;
    }

}
