package com.hk.charts.hkOptionsModel;

public class HkStyle {

    public String background;
    public String backgroundColor;
    public String border;
    public String borderRadius;
    public String color;
    public String cursor;
    public String fontFamily;
    public String fontSize;
    public String fontWeight;
    public Number height;
    public Number lineWidth;
    public Number opacity;
    public String padding;
    public String pointerEvents;
    public String position;
    public String textAlign;
    public String textDecoration;
    public String textOutline;
    public String textOverflow;
    public String top;
    public String transition;
    public String whiteSpace;
    public Number width;

    public HkStyle background(String prop) {
        background = prop;
        return this;
    }

    public HkStyle backgroundColor(String prop) {
        backgroundColor = prop;
        return this;
    }

    public HkStyle border(String prop) {
        border = prop;
        return this;
    }

    public HkStyle borderRadius(Number prop) {
        if (prop != null) {
            borderRadius = prop + "px";
        }
        return this;
    }

    public HkStyle color(String prop) {
        color = prop;
        return this;
    }

    public HkStyle cursor(String prop) {
        cursor = prop;
        return this;
    }

    public HkStyle fontFamily(String prop) {
        fontFamily = prop;
        return this;
    }

    public HkStyle fontSize(Number prop) {
        if (prop != null) {
            fontSize = prop + "px";
        }
        return this;
    }


    public HkStyle fontWeight(String prop) {
        fontWeight = prop;
        return this;
    }



    public HkStyle height(Number prop) {
        height = prop;
        return this;
    }

    public HkStyle lineWidth(Number prop) {
        lineWidth = prop;
        return this;
    }

    public HkStyle opacity(Number prop) {
        opacity = prop;
        return this;
    }

    public HkStyle padding(Number prop) {
        if (prop != null) {
            padding = prop + "px";
        }
        return this;
    }

    public HkStyle pointerEvents(String prop) {
        pointerEvents = prop;
        return this;
    }

    public HkStyle position(String prop) {
        position = prop;
        return this;
    }

    public HkStyle textAlign(String prop) {
        textAlign = prop;
        return this;
    }

    public HkStyle textDecoration(String prop) {
        textDecoration = prop;
        return this;
    }

    public HkStyle textOutline(String prop) {
        textOutline = prop;
        return this;
    }

    public HkStyle textOverflow(String prop) {
        textOverflow = prop;
        return this;
    }

    public HkStyle top(String prop) {
        top = prop;
        return this;
    }

    public HkStyle transition(String prop) {
        transition = prop;
        return this;
    }

    public HkStyle whiteSpace(String prop) {
        whiteSpace = prop;
        return this;
    }

    public HkStyle width(Number prop) {
        width = prop;
        return this;
    }





    public static HkStyle style(
            String color
    ) {
        return HkStyle.style(color,null);
    }

    public static HkStyle style(
            String color,
            Number fontSize
    ) {
        return HkStyle.style(color,fontSize,null);
    }

    public static HkStyle style(
            String color,
            Number fontSize,
            String fontWeight
    ) {
        return HkStyle.style(color,fontSize,fontWeight,null);
    }

    public static HkStyle style(
            String color,
            Number fontSize,
            String fontWeight,
            String textOutline
    ) {
        HkStyle hkStyle = new HkStyle()
                .color(color)
                .fontSize(fontSize)
                .fontWeight(fontWeight)
                .textOutline(textOutline);
        return hkStyle;
    }

}
