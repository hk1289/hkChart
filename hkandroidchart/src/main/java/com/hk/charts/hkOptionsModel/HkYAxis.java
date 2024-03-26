package com.hk.charts.hkOptionsModel;

public class HkYAxis extends HkAxis {
    public Object stackLabels;
    public String tooltipValueFormat; ////Parallel coordinates only. https://api.highcharts.com.cn/highcharts/yAxis.tooltipValueFormat.html
    public Object width;
    public HkYAxis stackLabels(String prop) {
        stackLabels = prop;
        return this;
    }

    public HkYAxis tooltipValueFormat(String prop) {
        tooltipValueFormat = prop;
        return this;
    }

    public HkYAxis width(Object prop) {
        width = prop;
        return this;
    }

    ///////////////////////////////////////////

    public HkYAxis allowDecimals(Boolean prop) {
        allowDecimals = prop;
        return this;
    }

    public HkYAxis alternateGridColor(Object prop) {
        alternateGridColor = prop;
        return this;
    }

    public HkYAxis crosshair(HkCrosshair prop) {
        crosshair = prop;
        return this;
    }

    public HkYAxis title(HkTitle prop) {
        title = prop;
        return this;
    }

    public HkYAxis type(String prop) {
        type = prop;
        return this;
    }

    public HkYAxis dateTimeLabelFormats(HkDateTimeLabelFormats prop) {
        dateTimeLabelFormats = prop;
        return this;
    }

    public HkYAxis plotBands(HkPlotBandsElement[] prop) {
        plotBands = prop;
        return this;
    }

    public HkYAxis plotLines(HkPlotLinesElement[] prop) {
        plotLines = prop;
        return this;
    }

    public HkYAxis categories(String[] prop) {
        categories = prop;
        return this;
    }

    public HkYAxis linkedTo(Integer prop) {
        linkedTo = prop;
        return this;
    }

    public HkYAxis reversed(Boolean prop) {
        reversed = prop;
        return this;
    }

    public HkYAxis opposite(Boolean prop) {
        opposite = prop;
        return this;
    }

    public HkYAxis lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkYAxis lineColor(String prop) {
        lineColor = prop;
        return this;
    }

    public HkYAxis max(Number prop) {
        max = prop;
        return this;
    }

    public HkYAxis min(Number prop) {
        min = prop;
        return this;
    }

    public HkYAxis maxPadding(Number prop) {
        maxPadding = prop;
        return this;
    }

    public HkYAxis minPadding(Number prop) {
        minPadding = prop;
        return this;
    }

    public HkYAxis minRange(Integer prop) {
        minRange = prop;
        return this;
    }

    public HkYAxis minTickInterval(Integer prop) {
        minTickInterval = prop;
        return this;
    }

    public HkYAxis minorTicks(Boolean prop) {
        minorTicks = prop;
        return this;
    }

    public HkYAxis minorGridLineColor(String prop) {
        minorGridLineColor = prop;
        return this;
    }

    public HkYAxis minorGridLineDashStyle(String prop) {
        minorGridLineDashStyle = prop;
        return this;
    }

    public HkYAxis minorGridLineWidth(Number prop) {
        minorGridLineWidth = prop;
        return this;
    }

    public HkYAxis minorTickColor(String prop) {
        minorTickColor = prop;
        return this;
    }

    public HkYAxis minorTickInterval(Object prop) {
        minorTickInterval = prop;
        return this;
    }

    public HkYAxis minorTickLength(Number prop) {
        minorTickLength = prop;
        return this;
    }

    public HkYAxis minorTickPosition(String prop) {
        minorTickPosition = prop;
        return this;
    }

    public HkYAxis minorTickWidth(Number prop) {
        minorTickWidth = prop;
        return this;
    }

    public HkYAxis gridLineWidth(Number prop) {
        gridLineWidth = prop;
        return this;
    }

    public HkYAxis gridLineColor(String prop) {
        gridLineColor = prop;
        return this;
    }

    public HkYAxis gridLineDashStyle(String prop) {
        gridLineDashStyle = prop;
        return this;
    }

    public HkYAxis gridLineInterpolation(String prop) {
        gridLineInterpolation = prop;
        return this;
    }

    public HkYAxis offset(Number prop) {
        offset = prop;
        return this;
    }

    public HkYAxis labels(HkLabels prop) {
        labels = prop;
        return this;
    }

    public HkYAxis visible(Boolean prop) {
        visible = prop;
        return this;
    }

    public HkYAxis startOnTick(Boolean prop) {
        startOnTick = prop;
        return this;
    }

    public HkYAxis endOnTick(Boolean prop) {
        endOnTick = prop;
        return this;
    }

    public HkYAxis tickColor(String prop) {
        tickColor = prop;
        return this;
    }

    public HkYAxis tickAmount(Integer prop) {
        tickAmount = prop;
        return this;
    }

    public HkYAxis tickInterval(Number prop) {
        tickInterval = prop;
        return this;
    }

    public HkYAxis tickmarkPlacement(String prop) {
        tickmarkPlacement = prop;
        return this;
    }

    public HkYAxis tickWidth(Number prop) {
        tickWidth = prop;
        return this;
    }

    public HkYAxis tickLength(Number prop) {
        tickLength = prop;
        return this;
    }

    public HkYAxis tickPosition(String prop) {
        tickPosition = prop;
        return this;
    }

    public HkYAxis tickPositions(Object[] prop) {
        tickPositions = prop;
        return this;
    }

    public HkYAxis left(Object prop) {
        left = prop;
        return this;
    }

}
