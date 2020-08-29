package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {

    private String name;

    public DuongXinyuEvaluator(String name) {
        this.name = name;
    }

    public boolean isDuong() {
        return "Duong".equals(name);
    }

    public boolean isXinyu() {
        return "Xinyu".equals(name);
    }
}
