package com.hk.charts.hkChartCreator;


import com.hk.charts.hkChartEnum.HkChartAnimationType;
import com.hk.charts.hkChartEnum.HkChartStackingType;
import com.hk.charts.hkChartEnum.HkChartSymbolStyleType;
import com.hk.charts.hkChartEnum.HkChartType;
import com.hk.charts.hkChartEnum.HkChartZoomType;
import com.hk.charts.hkOptionsModel.HkOptions;
import com.hk.charts.hkOptionsModel.HkScrollablePlotArea;
import com.hk.charts.hkOptionsModel.HkStyle;

public class HkChartModel {

    public String  animationType;         //动画类型
    public Integer animationDuration;     //动画时间
    public String  title;                 //标题内容
    public HkStyle titleStyle;            //标题文本风格样式
    public String  subtitle;              //副标题内容
    public String  subtitleAlign;         //副标题水平对齐方式
    public HkStyle subtitleStyle;         //副标题文本风格样式
    public String  axesTextColor;         //x 轴和 y 轴文字颜色
    public String  chartType;             //图表类型
    public String  stacking;              //堆积样式
    public String  markerSymbol;          //折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
    public String  markerSymbolStyle;     //折线曲线连接点的自定义风格样式
    public String  zoomType;              //缩放类型 HkChartZoomTypeX表示可沿着 x 轴进行手势缩放
    public Boolean inverted;              //x 轴是否翻转(垂直)
    public Boolean xAxisReversed;         //x 轴翻转
    public Boolean yAxisReversed;         //y 轴翻转
    public Boolean tooltipEnabled;        //是否显示浮动提示框(默认显示)
    public String  tooltipValueSuffix;    //浮动提示框单位后缀
    public Boolean gradientColorEnable;   //是否要为渐变色
    public Boolean polar;                 //是否极化图形(变为雷达图)
    public Number[]margin;                //图表外边缘和绘图区域之间的边距
    public Boolean dataLabelsEnabled;     //是否显示数据
    public HkStyle dataLabelsStyle;       //数据文本风格样式
    public Boolean xAxisLabelsEnabled;    //x 轴是否显示数据
    public Integer xAxisTickInterval;     //x 轴刻度点间隔数(设置每隔几个点显示一个 X轴的内容)
    public String[]categories;            //x 轴是否显示数据
    public Number  xAxisGridLineWidth;    //x 轴网格线的宽度
    public Boolean xAxisVisible;          //x 轴是否显示
    public Boolean yAxisVisible;          //y 轴是否显示
    public Boolean yAxisLabelsEnabled;    //y 轴是否显示数据
    public String  yAxisTitle;            //y 轴标题
    public Number  yAxisLineWidth;        //y 轴轴线的宽度
    public Number  yAxisMin;              //y 轴最小值
    public Number  yAxisMax;              //y 轴最大值
    public Boolean yAxisAllowDecimals;    //y 轴是否允许显示小数
    public Number  yAxisGridLineWidth;    //y 轴网格线的宽度
    public Object[]colorsTheme;           //图表主题颜色数组
    public Boolean legendEnabled;         //是否显示图例
    public Object  backgroundColor;       //图表背景色
    public Number  borderRadius;          //柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效)
    public Number  markerRadius;          //折线连接点的半径长度
    public Object[]series;                //图表的数据列内容
    public Boolean touchEventEnabled;     //是否支持用户触摸事件
    public HkScrollablePlotArea scrollablePlotArea;



    public HkChartModel animationType(String prop) {
        animationType = prop;
        return this;
    }

    public HkChartModel animationDuration(Integer prop) {
        animationDuration = prop;
        return this;
    }

    public HkChartModel title(String prop) {
        title = prop;
        return this;
    }

    public HkChartModel titleStyle(HkStyle prop) {
        titleStyle = prop;
        return this;
    }

    public HkChartModel subtitle(String prop) {
        subtitle = prop;
        return this;
    }

    public HkChartModel subtitleAlign(String prop) {
        subtitleAlign = prop;
        return this;
    }

    public HkChartModel subtitleStyle(HkStyle prop) {
        subtitleStyle = prop;
        return this;
    }

    public HkChartModel axesTextColor(String prop) {
        axesTextColor = prop;
        return this;
    }

    public HkChartModel chartType(String prop) {
        chartType = prop;
        return this;
    }

    public HkChartModel stacking(String prop) {
        stacking = prop;
        return this;
    }

    public HkChartModel markerSymbol(String prop) {
        markerSymbol = prop;
        return this;
    }

    public HkChartModel markerSymbolStyle(String prop) {
        markerSymbolStyle = prop;
        return this;
    }

    public HkChartModel zoomType(String prop) {
        zoomType = prop;
        return this;
    }

    public HkChartModel inverted(Boolean prop) {
        inverted = prop;
        return this;
    }

    public HkChartModel xAxisReversed(Boolean prop) {
        xAxisReversed = prop;
        return this;
    }

    public HkChartModel yAxisReversed(Boolean prop) {
        yAxisReversed = prop;
        return this;
    }

    public HkChartModel tooltipEnabled(Boolean prop) {
        tooltipEnabled = prop;
        return this;
    }

    public HkChartModel tooltipValueSuffix(String prop) {
        tooltipValueSuffix = prop;
        return this;
    }

    public HkChartModel gradientColorEnable(Boolean prop) {
        gradientColorEnable = prop;
        return this;
    }

    public HkChartModel polar(Boolean prop) {
        polar = prop;
        return this;
    }

    public HkChartModel margin(Number[] prop) {
        margin = prop;
        return this;
    }

    public HkChartModel dataLabelsEnabled(Boolean prop) {
        dataLabelsEnabled = prop;
        return this;
    }

    public HkChartModel dataLabelsStyle(HkStyle prop) {
        dataLabelsStyle = prop;
        return this;
    }

    public HkChartModel xAxisLabelsEnabled(Boolean prop) {
        xAxisLabelsEnabled = prop;
        return this;
    }

    public HkChartModel xAxisTickInterval(Integer prop) {
        xAxisTickInterval = prop;
        return this;
    }

    public HkChartModel categories(String[] prop) {
        categories = prop;
        return this;
    }

    public HkChartModel xAxisGridLineWidth(Number prop) {
        xAxisGridLineWidth = prop;
        return this;
    }

    public HkChartModel yAxisGridLineWidth(Number prop) {
        yAxisGridLineWidth = prop;
        return this;
    }

    public HkChartModel xAxisVisible(Boolean prop) {
        xAxisVisible = prop;
        return this;
    }

    public HkChartModel yAxisVisible(Boolean prop) {
        yAxisVisible = prop;
        return this;
    }

    public HkChartModel yAxisLabelsEnabled(Boolean prop) {
        yAxisLabelsEnabled = prop;
        return this;
    }

    public HkChartModel yAxisTitle(String prop) {
        yAxisTitle = prop;
        return this;
    }

    public HkChartModel yAxisLineWidth(Number prop) {
        yAxisLineWidth = prop;
        return this;
    }

    public HkChartModel yAxisMin(Number prop) {
        yAxisMin = prop;
        return this;
    }

    public HkChartModel yAxisMax(Number prop) {
        yAxisMax = prop;
        return this;
    }

    public HkChartModel yAxisAllowDecimals(Boolean prop) {
        yAxisAllowDecimals = prop;
        return this;
    }

    public HkChartModel colorsTheme(Object[] prop) {
        colorsTheme = prop;
        return this;
    }

    public HkChartModel legendEnabled(Boolean prop) {
        legendEnabled = prop;
        return this;
    }

    public HkChartModel backgroundColor(Object prop) {
        backgroundColor = prop;
        return this;
    }


    public HkChartModel borderRadius(Number prop) {
        borderRadius = prop;
        return this;
    }

    public HkChartModel markerRadius(Number prop) {
        markerRadius = prop;
        return this;
    }

    public HkChartModel series(Object[] prop) {
        series = prop;
        return this;
    }

    public HkChartModel touchEventEnabled(Boolean prop) {
        touchEventEnabled = prop;
        return this;
    }

    public HkChartModel scrollablePlotArea(HkScrollablePlotArea prop) {
        scrollablePlotArea = prop;
        return this;
    }

    public HkOptions hk_toHkOptions() {
        return HkOptionsConstructor.configureChartOptions(this);
    }

    public HkChartModel() {
        chartType             = HkChartType.Line;
        title                 = "";
        yAxisTitle            = "";
        animationDuration     = 500;//以毫秒为单位
        animationType         = HkChartAnimationType.Linear;
        inverted              = false;
        stacking              = HkChartStackingType.False;
        xAxisReversed         = false;
        yAxisReversed         = false;
        zoomType              = HkChartZoomType.None;
        dataLabelsEnabled     = false;
        markerSymbolStyle     = HkChartSymbolStyleType.Normal;
        colorsTheme           = new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"};//默认的颜色数组(必须要添加默认数组,否则就会出错)
        gradientColorEnable   = false;
        polar                 = false;
        xAxisLabelsEnabled    = true;
        xAxisGridLineWidth    = 0f;
        yAxisLabelsEnabled    = true;
        yAxisGridLineWidth    = 1f;
        legendEnabled         = true;
        backgroundColor       = "#ffffff";
        borderRadius          = 0f;//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
        markerRadius          = 6f;//折线连接点的半径长度,如果值设置为0,这样就相当于不显示了
    }

}









