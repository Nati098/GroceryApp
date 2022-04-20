package ru.sf.grocery.ui.interfaces;

import java.util.List;

import ru.sf.grocery.model.data.Goods;
import ru.sf.grocery.model.data.GoodsResponseData;

public interface GoodsContract {

    interface View extends BaseContract.View {
        void showData(List<Goods> data);
    }

    interface Presenter {
        void requestData();
    }

}
