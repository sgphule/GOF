package com.sudarshan.structural.flyweight;

public class PointIcon {
    private final PointType type;
    private final PointIcon icon;

    public PointIcon(PointType type, PointIcon icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
