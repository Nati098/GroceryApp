package ru.sf.grocery.domain.presenter;

import ru.sf.grocery.model.datafiller.StaticDataKt;
import ru.sf.grocery.domain.presenter.BasePresenter;
import ru.sf.grocery.domain.interfaces.GoodsContract;

public class GoodsPresenter extends BasePresenter implements GoodsContract.Presenter {

    private GoodsContract.View view;

    public GoodsPresenter(GoodsContract.View view) {
        super();
        this.view = view;
    }

    @Override
    public void requestData() {
        // get data - TODO
        view.showData(StaticDataKt.getGoodsList());
    }

}
