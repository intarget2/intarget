package com.intarget.fw;

public class TargetObject {
    private String name;
    private String url;
    private String condition;


    public TargetObject setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public TargetObject setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return "TargetObject{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public TargetObject setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public String getCondition() {
        return condition;
    }
}
