package com.hk.charts.hkChartCreator;

import com.hk.charts.hkOptionsModel.HkDataLabels;
import com.hk.charts.hkOptionsModel.HkMarker;
import com.hk.charts.hkOptionsModel.HkShadow;
import com.hk.charts.hkOptionsModel.HkTooltip;
import com.hk.charts.hkOptionsModel.HkZonesElement;


public class HkSeriesElement {

    private String type;
    private Boolean allowPointSelect;
    private String name;
    private Object[] data;
    private Number lineWidth;//折线图、曲线图、直方折线图、折线填充图、曲线填充图、直方折线填充图的线条宽度
    private String borderColor; //The border color, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
    private Number borderWidth; //The border width, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
    private Number borderRadius; //The corner radius of the border surrounding each column or bar.
    private Object borderRadiusTopLeft;
    private Object borderRadiusTopRight;
    private Object borderRadiusBottomLeft;
    private Object borderRadiusBottomRight;
    private Object color;
    private Object fillColor;
    private Number fillOpacity;//折线填充图、曲线填充图、直方折线填充图等填充图类型的填充颜色透明度
    private Number threshold;//The threshold, also called zero level or base level. For line type series this is only used in conjunction with negativeColor. default：0.
    private String negativeColor;// The color for the parts of the graph or points that are below the threshold
    private Object negativeFillColor;
    private Object size;
    private Object innerSize;
    private String dashStyle;
    private Integer yAxis;
    private HkDataLabels dataLabels;
    private HkMarker marker;
    private Object step;
    private Object states;
    private Boolean colorByPoint;
    private Integer zIndex;
    private HkZonesElement[] zones;
    private String zoneAxis;
    private HkShadow shadow;
    private String stack;
    private HkTooltip tooltip;
    private Boolean showInLegend;
    private Boolean enableMouseTracking;
    private Boolean reversed;
    private String id;
    private Boolean connectNulls;

    public HkSeriesElement type(String prop) {
        type = prop;
        return this;
    }

    public HkSeriesElement allowPointSelect(Boolean prop) {
        allowPointSelect = prop;
        return this;
    }

    public HkSeriesElement name(String prop) {
        name = prop;
        return this;
    }

    public HkSeriesElement data(Object[] prop) {
        data = prop;
        return this;
    }

    public HkSeriesElement lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkSeriesElement borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkSeriesElement borderWidth(Number prop) {
        borderWidth = prop;
        return this;
    }

    public HkSeriesElement borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public HkSeriesElement borderRadiusTopLeft(Object prop) {
        borderRadiusTopLeft = prop;
        return this;
    }

    public HkSeriesElement borderRadiusTopRight(Object prop) {
        borderRadiusTopRight = prop;
        return this;
    }

    public HkSeriesElement borderRadiusBottomLeft(Object prop) {
        borderRadiusBottomLeft = prop;
        return this;
    }

    public HkSeriesElement borderRadiusBottomRight(Object prop) {
        borderRadiusBottomRight = prop;
        return this;
    }

    public HkSeriesElement color(Object prop) {
        color = prop;
        return this;
    }

    public HkSeriesElement fillColor(Object prop) {
        fillColor = prop;
        return this;
    }

    public HkSeriesElement fillOpacity(Number prop) {
        fillOpacity = prop;
        return this;
    }

    public HkSeriesElement threshold(Number prop) {
        threshold = prop;
        return this;
    }

    public HkSeriesElement negativeColor(String prop) {
        negativeColor = prop;
        return this;
    }

    public HkSeriesElement negativeFillColor(Object prop) {
        negativeFillColor = prop;
        return this;
    }

    public HkSeriesElement size(Object prop) {
        size = prop;
        return this;
    }

    public HkSeriesElement innerSize(Object prop) {
        innerSize = prop;
        return this;
    }

    public HkSeriesElement dashStyle(String prop) {
        dashStyle = prop;
        return this;
    }

    public HkSeriesElement yAxis(Integer prop) {
        yAxis = prop;
        return this;
    }

    public HkSeriesElement dataLabels(HkDataLabels prop) {
        dataLabels = prop;
        return this;
    }

    public HkSeriesElement marker(HkMarker prop) {
        marker = prop;
        return this;
    }

    public HkSeriesElement step(Object prop) {
        step = prop;
        return this;
    }

    public HkSeriesElement states(Object prop) {
        states = prop;
        return this;
    }

    public HkSeriesElement colorByPoint(Boolean prop) {
        colorByPoint = prop;
        return this;
    }

    public HkSeriesElement zIndex(Integer prop) {
        zIndex = prop;
        return this;
    }

    public HkSeriesElement zones(HkZonesElement[] prop) {
        zones = prop;
        return this;
    }

    public HkSeriesElement zoneAxis(String prop) {
        zoneAxis = prop;
        return this;
    }

    public HkSeriesElement shadow(HkShadow prop) {
        shadow = prop;
        return this;
    }

    public HkSeriesElement stack(String prop) {
        stack = prop;
        return this;
    }

    public HkSeriesElement tooltip(HkTooltip prop) {
        tooltip = prop;
        return this;
    }

    public HkSeriesElement showInLegend(Boolean prop) {
        showInLegend = prop;
        return this;
    }

    public HkSeriesElement enableMouseTracking(Boolean prop) {
        enableMouseTracking = prop;
        return this;
    }

    public HkSeriesElement reversed(Boolean prop) {
        reversed = prop;
        return this;
    }

    public HkSeriesElement id(String prop) {
        id = prop;
        return this;
    }

    public HkSeriesElement connectNulls(Boolean prop) {
        connectNulls = prop;
        return this;
    }

}





