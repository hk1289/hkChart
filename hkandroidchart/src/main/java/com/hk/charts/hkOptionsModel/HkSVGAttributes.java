package com.hk.charts.hkOptionsModel;

import java.util.HashMap;
import java.util.Map;

public class HkSVGAttributes {
    public Number strokeWidth;
    public String fill;
    public String stroke;

    public HkSVGAttributes strokeWidth(Number prop) {
        strokeWidth = prop;
        return this;
    }

    public HkSVGAttributes fill(String prop) {
        fill = prop;
        return this;
    }

    public HkSVGAttributes stroke(String prop) {
        stroke = prop;
        return this;
    }

    public Map<String, Object> toDic() {
        Map<String, Object> dic = new HashMap<>();
        if (strokeWidth != null) {
            dic.put("stroke-width", strokeWidth);
        }
        if (fill != null) {
            dic.put("fill", fill);
        }
        if (stroke != null) {
            dic.put("stroke", stroke);
        }
        return dic;
    }

}
