package ru.sf.grocery.model.data;

import java.io.Serializable;
import java.util.List;

public class GoodsResponseData implements Serializable {

    private List<Good> goods;

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
