package ru.sf.grocery.ui.goods;

import ru.sf.grocery.ui.interfaces.BasePresenter;
import ru.sf.grocery.ui.interfaces.GoodsContract;

public class GoodsPresenter extends BasePresenter implements GoodsContract.Presenter {

    private GoodsContract.View view;

    public GoodsPresenter(GoodsContract.View view) {
        super();
        this.view = view;
    }

    @Override
    public void requestData() {
        // get data - TODO
    }

}
