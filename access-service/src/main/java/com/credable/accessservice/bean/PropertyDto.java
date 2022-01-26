package com.credable.accessservice.bean;

public class PropertyDto {
    private String name;
    private String path;
    private int minimum;
    private int maximum;

    public PropertyDto(String name, String path, int minimum, int maximum) {
        this.name = name; this.path = path; this.minimum = minimum; this.maximum = maximum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
