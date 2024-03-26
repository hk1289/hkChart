package com.hk.charts.hkOptionsModel;

public class HkOptions {
    public HkChart chart;
    public HkTitle title;
    public HkSubtitle subtitle;
    public HkXAxis xAxis;
    public HkYAxis yAxis;
    public HkXAxis[] xAxisArray;
    public HkYAxis[] yAxisArray;
    public HkTooltip tooltip;
    public HkPlotOptions plotOptions;
    public Object[] series;
    public HkLegend legend;
    public HkPane pane;
    public Object[] colors;
    public HkCredits credits;
    public HkLang defaultOptions;
    public Boolean touchEventEnabled;

    public HkOptions chart(HkChart prop) {
        chart = prop;
        return this;
    }

    public HkOptions title(HkTitle prop) {
        title = prop;
        return this;
    }

    public HkOptions subtitle(HkSubtitle prop) {
        subtitle = prop;
        return this;
    }

    public HkOptions xAxis(HkXAxis prop) {
        xAxis = prop;
        return this;
    }

    public HkOptions yAxis(HkYAxis prop) {
        yAxis = prop;
        return this;
    }

    public HkOptions xAxisArray(HkXAxis[] prop) {
        xAxisArray = prop;
        return this;
    }

    public HkOptions yAxisArray(HkYAxis[] prop) {
        yAxisArray = prop;
        return this;
    }

    public HkOptions tooltip(HkTooltip prop) {
        tooltip = prop;
        return this;
    }

    public HkOptions plotOptions(HkPlotOptions prop) {
        plotOptions = prop;
        return this;
    }

    public HkOptions series(Object[] prop) {
        series = prop;
        return this;
    }

    public HkOptions legend(HkLegend prop) {
        legend = prop;
        return this;
    }

    public HkOptions pane(HkPane prop) {
        pane = prop;
        return this;
    }

    public HkOptions colors(Object[] prop) {
        colors = prop;
        return this;
    }

    public HkOptions credits(HkCredits prop) {
        credits = prop;
        return this;
    }

    public HkOptions defaultOptions(HkLang prop) {
        defaultOptions = prop;
        return this;
    }

    public HkOptions touchEventEnabled(Boolean prop) {
        touchEventEnabled = prop;
        return this;
    }


    public HkOptions() {
        HkCredits hkCredits = new HkCredits();
        hkCredits.enabled = false;
        this.credits = hkCredits;
    }

}
