package com.hk.charts.hkChartCreator;


import com.hk.charts.hkChartEnum.HkChartAnimationType;
import com.hk.charts.hkChartEnum.HkChartSymbolStyleType;
import com.hk.charts.hkChartEnum.HkChartType;
import com.hk.charts.hkOptionsModel.HkAnimation;
import com.hk.charts.hkOptionsModel.HkBar;
import com.hk.charts.hkOptionsModel.HkChart;
import com.hk.charts.hkOptionsModel.HkColumn;
import com.hk.charts.hkOptionsModel.HkColumnrange;
import com.hk.charts.hkOptionsModel.HkDataLabels;
import com.hk.charts.hkOptionsModel.HkItemStyle;
import com.hk.charts.hkOptionsModel.HkLabels;
import com.hk.charts.hkOptionsModel.HkLegend;
import com.hk.charts.hkOptionsModel.HkMarker;
import com.hk.charts.hkOptionsModel.HkOptions;
import com.hk.charts.hkOptionsModel.HkPie;
import com.hk.charts.hkOptionsModel.HkPlotOptions;
import com.hk.charts.hkOptionsModel.HkSeries;
import com.hk.charts.hkOptionsModel.HkStyle;
import com.hk.charts.hkOptionsModel.HkSubtitle;
import com.hk.charts.hkOptionsModel.HkTitle;
import com.hk.charts.hkOptionsModel.HkTooltip;
import com.hk.charts.hkOptionsModel.HkXAxis;
import com.hk.charts.hkOptionsModel.HkYAxis;
import com.hk.charts.hkTools.HkColor;

public class HkOptionsConstructor
{
    public static HkOptions configureChartOptions (
            HkChartModel hkChartModel
    ) {
        HkChart hkChart = new HkChart()
                .type(hkChartModel.chartType) //绘图类型
                .inverted(hkChartModel.inverted) //设置是否反转坐标轴，使X轴垂直，Y轴水平。 如果值为 true，则 x 轴默认是 倒置 的。 如果图表中出现条形图系列，则会自动反转
                .backgroundColor(hkChartModel.backgroundColor) //设置图表的背景色(包含透明度的设置)
                .pinchType(hkChartModel.zoomType) //设置手势缩放方向
                .panning(true) //设置手势缩放后是否可平移
                .polar(hkChartModel.polar) //是否极化图表(开启极坐标模式)
                .margin(hkChartModel.margin) //图表边距
                .scrollablePlotArea(hkChartModel.scrollablePlotArea)
                ;

        HkTitle hkTitle = new HkTitle()
                .text(hkChartModel.title) //标题文本内容
                .style(hkChartModel.titleStyle)
                ;

        HkSubtitle hkSubtitle = new HkSubtitle()
                .text(hkChartModel.subtitle) //副标题内容
                .align(hkChartModel.subtitleAlign) //图表副标题文本水平对齐方式。可选的值有 “left”，”center“和“right”。 默认是：center.
                .style(hkChartModel.subtitleStyle)
                ;

        HkTooltip hkTooltip = new HkTooltip()
                .enabled(hkChartModel.tooltipEnabled) //启用浮动提示框
                .shared(true) //多组数据共享一个浮动提示框
                .valueSuffix(hkChartModel.tooltipValueSuffix) //浮动提示框的单位名称后缀
                ;

        HkPlotOptions hkPlotOptions = new HkPlotOptions()
                .series(new HkSeries()
                        .stacking(hkChartModel.stacking) //设置是否百分比堆叠显示图形
                )
                ;

        if (!hkChartModel.animationType.equals(HkChartAnimationType.Linear)) {
            hkPlotOptions.series.animation((new HkAnimation()
                    .easing(hkChartModel.animationType)
                    .duration(hkChartModel.animationDuration)
            ));
        }

        configureHkPlotOptionsMarkerStyle(hkChartModel,hkPlotOptions);
        configureHkPlotOptionsDataLabels(hkPlotOptions,hkChartModel);

        HkLegend hkLegend = new HkLegend()
                .enabled(hkChartModel.legendEnabled) //是否显示 legend
                .itemStyle(new HkItemStyle()
                        .color(hkChartModel.axesTextColor))
                ;

        HkOptions hkOptions = new HkOptions()
                .chart(hkChart)
                .title(hkTitle)
                .subtitle(hkSubtitle)
                .tooltip(hkTooltip)
                .plotOptions(hkPlotOptions)
                .legend(hkLegend)
                .series(hkChartModel.series)
                .colors(hkChartModel.colorsTheme) //设置颜色主题
                .touchEventEnabled(hkChartModel.touchEventEnabled) //是否支持点击事件
                ;

        configureAxisContentAndStyle(hkOptions,hkChartModel);

        return hkOptions;
    }

    private static void configureHkPlotOptionsMarkerStyle (
            HkChartModel hkChartModel,
            HkPlotOptions hkPlotOptions
    ) {
        String hkChartType = hkChartModel.chartType;
        //数据点标记相关配置，只有线性图(折线图、曲线图、折线区域填充图、曲线区域填充图、散点图、折线范围填充图、曲线范围填充图、多边形图)才有数据点标记
        switch (hkChartType) {
            case HkChartType.Area:
            case HkChartType.Areaspline:
            case HkChartType.Line:
            case HkChartType.Spline:
            case HkChartType.Scatter:
            case HkChartType.Arearange:
            case HkChartType.Areasplinerange:
            case HkChartType.Polygon:
                HkMarker hkMarker = new HkMarker()
                        .radius(hkChartModel.markerRadius) //曲线连接点半径，默认是4
                        .symbol(hkChartModel.markerSymbol); //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"

                if (hkChartModel.markerSymbolStyle.equals(HkChartSymbolStyleType.InnerBlank)) {
                    hkMarker.fillColor(HkColor.White) //点的填充色(用来设置折线连接点的填充色)
                            .lineWidth(2f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                            .lineColor(""); //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                } else if (hkChartModel.markerSymbolStyle.equals(HkChartSymbolStyleType.BorderBlank)) {
                    hkMarker.lineWidth(2f)
                            .lineColor(hkChartModel.backgroundColor);
                }
                HkSeries hkSeries = hkPlotOptions.series;
                hkSeries.marker(hkMarker);

                break;
        }
    }


    private static void configureHkPlotOptionsDataLabels (
            HkPlotOptions hkPlotOptions,
            HkChartModel hkChartModel
    ) {
        String hkChartType = hkChartModel.chartType;

        HkDataLabels hkDataLabels = new HkDataLabels()
                .enabled(hkChartModel.dataLabelsEnabled);
        if (hkChartModel.dataLabelsEnabled) {
            hkDataLabels
                    .style(hkChartModel.dataLabelsStyle);
        }

        switch (hkChartType) {
            case HkChartType.Column:
                HkColumn hkColumn = new HkColumn()
                        .borderWidth(0f)
                        .borderRadius(hkChartModel.borderRadius);
                if (hkChartModel.polar) {
                    hkColumn.pointPadding(0f)
                            .groupPadding(0.005f);
                }
                hkPlotOptions.column(hkColumn);
                break;
            case HkChartType.Bar:
                HkBar hkBar = new HkBar()
                        .borderWidth(0f)
                        .borderRadius(hkChartModel.borderRadius)
                        ;
                if (hkChartModel.polar) {
                    hkBar.pointPadding(0f)
                            .groupPadding(0.005f);
                }
                hkPlotOptions.bar(hkBar);
                break;
            case HkChartType.Pie:
                HkPie hkPie = new HkPie()
                        .allowPointSelect(true)
                        .cursor("pointer")
                        .showInLegend(true);
                if (hkChartModel.dataLabelsEnabled) {
                    hkDataLabels.format("<b>{point.name}</b>: {point.percentage:.1f} %");
                }
                hkPlotOptions.pie(hkPie);
                break;
            case HkChartType.Columnrange:
                HkColumnrange hkColumnrange = new HkColumnrange()
                        .borderRadius(0f) //The color of the border surrounding each column or bar
                        .borderWidth(0f) //The corner radius of the border surrounding each column or bar. default：0
                        ;
                hkPlotOptions.columnrange(hkColumnrange);
                break;
        }
        hkPlotOptions.series.dataLabels(hkDataLabels);

    }

    private static void configureAxisContentAndStyle (
            HkOptions HkOptions,
            HkChartModel hkChartModel
    ) {
        String hkChartType = hkChartModel.chartType;
        //x 轴和 Y 轴的相关配置,扇形图、金字塔图和漏斗图则不需要设置 X 轴和 Y 轴的相关内容
        switch (hkChartType) {
            case HkChartType.Column:
            case HkChartType.Bar:
            case HkChartType.Area:
            case HkChartType.Areaspline:
            case HkChartType.Line:
            case HkChartType.Spline:
            case HkChartType.Scatter:
            case HkChartType.Bubble:
            case HkChartType.Columnrange:
            case HkChartType.Arearange:
            case HkChartType.Areasplinerange:
            case HkChartType.Boxplot:
            case HkChartType.Waterfall:
            case HkChartType.Polygon:
            case HkChartType.Gauge:
                if (!hkChartType.equals(HkChartType.Gauge)) {
                    Boolean hkXAxisLabelsEnabled = hkChartModel.xAxisLabelsEnabled;
                    HkLabels hkXAxisLabels = new HkLabels()
                            .enabled(hkXAxisLabelsEnabled);//设置 x 轴是否显示文字
                    if (hkXAxisLabelsEnabled) {
                        hkXAxisLabels.style(new HkStyle()
                                .color(hkChartModel.axesTextColor));
                    }

                    HkXAxis hkXAxis = new HkXAxis()
                            .labels(hkXAxisLabels) //设置 x 轴是否显示文字
                            .reversed(hkChartModel.xAxisReversed)
                            .gridLineWidth(hkChartModel.xAxisGridLineWidth) //x轴网格线宽度
                            .categories(hkChartModel.categories)
                            .visible(hkChartModel.xAxisVisible) //x轴是否可见
                            .tickInterval(hkChartModel.xAxisTickInterval);//x轴坐标点间隔数

                    HkOptions.xAxis(hkXAxis);
                }

                Boolean hkYAxisLabelsEnabled = hkChartModel.yAxisLabelsEnabled;
                HkLabels hkYAxisLabels = new HkLabels()
                        .enabled(hkChartModel.yAxisLabelsEnabled);
                if (hkYAxisLabelsEnabled) {
                    hkYAxisLabels.style(new HkStyle()
                            .color(hkChartModel.axesTextColor));
                }

                HkYAxis hkYAxis = new HkYAxis()
                        .labels(hkYAxisLabels) //设置 y 轴是否显示数字
                        .min(hkChartModel.yAxisMin) //设置 y 轴最小值,最小值等于零就不能显示负值了
                        .max(hkChartModel.yAxisMax) //y轴最大值
                        .allowDecimals(hkChartModel.yAxisAllowDecimals) //是否允许显示小数
                        .reversed(hkChartModel.yAxisReversed)
                        .gridLineWidth(hkChartModel.yAxisGridLineWidth) //y轴网格线宽度
                        .title(new HkTitle()
                                .text(hkChartModel.yAxisTitle)
                                .style(new HkStyle()
                                        .color(hkChartModel.axesTextColor)))
                        .lineWidth(hkChartModel.yAxisLineWidth) //设置 y轴轴线的宽度,为0即是隐藏 y轴轴线
                        .visible(hkChartModel.yAxisVisible);

                HkOptions.yAxis(hkYAxis);
                break;
        }
    }


}
