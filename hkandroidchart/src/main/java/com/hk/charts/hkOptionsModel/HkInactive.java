package com.hk.charts.hkOptionsModel;

public class HkInactive {
    public Boolean enabled;
    public Number opacity;

    public HkInactive enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkInactive opacity(Number prop) {
        opacity = prop;
        return this;
    }
}
