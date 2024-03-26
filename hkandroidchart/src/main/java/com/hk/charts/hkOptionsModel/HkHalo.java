package com.hk.charts.hkOptionsModel;

import java.util.Map;

public class HkHalo {
    public Map<String, Object> attributes;
    public Number opacity;
    public Number size;

    public HkHalo attributes(HkSVGAttributes prop) {
        attributes = prop.toDic();
        return this;
    }

    public HkHalo opacity(Number prop) {
        opacity = prop;
        return this;
    }

    public HkHalo size(Number prop) {
        size = prop;
        return this;
    }
}
