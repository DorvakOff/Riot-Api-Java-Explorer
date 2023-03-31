package com.dorvak.raje.model.shared;

public class Image{
    public String full;
    public String sprite;
    public String group;
    public double x;
    public double y;
    public double w;
    public double h;

    @Override
    public String toString() {
        return "Image{" +
                "full='" + full + '\'' +
                ", sprite='" + sprite + '\'' +
                ", group='" + group + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}