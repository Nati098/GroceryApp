package ru.sf.grocery.model;

import ru.sf.grocery.R;

public enum CountryCode {
    RU (R.color.green_light),
    BLR (R.color.yellow);

    private int color;

    CountryCode(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

}
