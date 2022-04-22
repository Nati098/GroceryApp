package ru.sf.grocery.domain.presenter;

import java.util.List;

import ru.sf.grocery.model.data.BasketGoods;
import ru.sf.grocery.model.datafiller.StaticDataKt;
import ru.sf.grocery.domain.presenter.BasePresenter;
import ru.sf.grocery.domain.interfaces.BasketContract;

public class BasketPresenter extends BasePresenter implements BasketContract.Presenter {

    BasketContract.View view;

    public BasketPresenter(BasketContract.View view) {
        super();
        this.view = view;
    }

    @Override
    public void requestData() {
        //get data - TODO
        List<BasketGoods> data = StaticDataKt.getBasketGoodsList();

        view.addGoodsToList(data);
    }
}