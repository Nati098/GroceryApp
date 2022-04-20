package ru.sf.grocery.ui.basket;

import java.util.ArrayList;
import java.util.List;

import ru.sf.grocery.model.data.BasketGood;
import ru.sf.grocery.model.datafiller.StaticDataKt;
import ru.sf.grocery.ui.interfaces.BasePresenter;
import ru.sf.grocery.ui.interfaces.BasketContract;

public class BasketPresenter extends BasePresenter implements BasketContract.Presenter {

    BasketContract.View view;

    public BasketPresenter(BasketContract.View view) {
        super();
        this.view = view;
    }

    @Override
    public void requestData() {
        //get data - TODO
        List<BasketGood> data = StaticDataKt.getBasketGoodsList();

        view.addGoodsToList(data);
    }
}