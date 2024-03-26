package com.hk.charts.hkOptionsModel;

public class HkLang {
    public String noData;
    public Integer numericSymbolMagnitude;
    public String[] numericSymbols;
    public String resetZoom;
    public String thousandsSep;

    public HkLang noData(String prop) {
        noData = prop;
        return this;
    }

    public HkLang numericSymbolMagnitude(Integer prop) {
        numericSymbolMagnitude = prop;
        return this;
    }

    public HkLang numericSymbols(String[] prop) {
        numericSymbols = prop;
        return this;
    }

    public HkLang resetZoom(String prop) {
        resetZoom = prop;
        return this;
    }

    public HkLang thousandsSep(String prop) {
        thousandsSep = prop;
        return this;
    }
}
