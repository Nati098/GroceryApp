package ru.sf.grocery.domain.interfaces;

import java.util.List;

import ru.sf.grocery.model.data.BasketGoods;

public interface BasketContract {

    interface View extends BaseContract.View {
        void addGoodsToList(List<BasketGoods> goods);
        void clearAll();
        void payForOrder();
    }

    interface Presenter {
        void requestData();
    }

}
