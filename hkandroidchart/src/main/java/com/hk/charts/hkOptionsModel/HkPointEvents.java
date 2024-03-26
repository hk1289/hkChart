package com.hk.charts.hkOptionsModel;


import com.hk.charts.hkTools.HkJSStringPurer;

public class HkPointEvents {
    public String click; //点击事件
    public String mouseOut; //鼠标划出
    public String mouseOver; //鼠标划过
    public String remove; //删除
    public String select; //选中
    public String unselect; //取消选中
    public String update; //更新
    public String legendItemClick; //图例点击事件

    public HkPointEvents click(String prop) {
        click = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkPointEvents mouseOut(String prop) {
        mouseOut = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkPointEvents mouseOver(String prop) {
        mouseOver = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkPointEvents remove(String prop) {
        remove = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkPointEvents select(String prop) {
        select = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkPointEvents unselect(String prop) {
        unselect = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkPointEvents update(String prop) {
        update = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }

    public HkPointEvents legendItemClick(String prop) {
        legendItemClick = HkJSStringPurer.pureAnonymousJSFunctionString(prop);
        return this;
    }


}
