package ru.sf.grocery.model.data;

import java.io.Serializable;
import java.util.List;

public class GoodsResponseData implements Serializable {

    private List<Goods> goods;

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
