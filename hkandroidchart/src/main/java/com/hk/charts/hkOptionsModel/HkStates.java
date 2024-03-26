package com.hk.charts.hkOptionsModel;

public class HkStates {

    public HkHover hover;
    public HkSelect select;
    public HkInactive inactive;

    public HkStates hover(HkHover prop) {
        hover = prop;
        return this;
    }

    public HkStates select(HkSelect prop) {
        select = prop;
        return this;
    }

    public HkStates inactive(HkInactive prop) {
        inactive = prop;
        return this;
    }

}
