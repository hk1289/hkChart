package com.hk.charts.hkOptionsModel;

class HkCredits {
    public Boolean enabled;
    public String href;
    public HkPosition position;
    public HkStyle style;
    public String text;

    public HkCredits enabled(boolean prop) {
        enabled = prop;
        return this;
    }

    public HkCredits href(String prop) {
        href = prop;
        return this;
    }

    public HkCredits position(HkPosition prop) {
        position = prop;
        return this;
    }

    public HkCredits style(HkStyle prop) {
        style = prop;
        return this;
    }

    public HkCredits text(String prop) {
        text = prop;
        return this;
    }
}
