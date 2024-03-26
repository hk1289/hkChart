package com.hk.charts.hkOptionsModel;

import java.util.Map;

public class HkResetZoomButton {
    public HkPosition position;
    public String relativeTo;
    public Map theme;

    public HkResetZoomButton position(HkPosition prop) {
        position = prop;
        return this;
    }

    public HkResetZoomButton relativeTo(String prop) {
        relativeTo = prop;
        return this;
    }

    public HkResetZoomButton theme(Map prop) {
        theme = prop;
        return this;
    }


}
