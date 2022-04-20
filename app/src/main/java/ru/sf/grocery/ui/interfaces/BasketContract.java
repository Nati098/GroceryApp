package ru.sf.grocery.ui.interfaces;

import java.util.List;

import ru.sf.grocery.model.data.BasketGood;

public interface BasketContract {

    interface View extends BaseContract.View {
        void addGoodsToList(List<BasketGood> goods);
        void clearAll();
        void payForOrder();
    }

    interface Presenter {
        void requestData();
    }

}
