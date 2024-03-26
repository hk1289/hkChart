package com.hk.charts.hkOptionsModel;

public class HkSelect {
    public Boolean enabled;
    public String borderColor;
    public String color;
    public HkHalo halo;

    public HkSelect enabled(Boolean prop) {
        enabled = prop;
        return this;
    }

    public HkSelect borderColor(String prop) {
        borderColor = prop;
        return this;
    }

    public HkSelect color(String prop) {
        color = prop;
        return this;
    }

    public HkSelect halo(HkHalo prop) {
        halo = prop;
        return this;
    }
}
