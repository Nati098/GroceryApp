package ru.sf.grocery.domain.interfaces;

import java.util.List;

import ru.sf.grocery.model.data.Goods;

public interface GoodsContract {

    interface View extends BaseContract.View {
        void showData(List<Goods> data);
    }

    interface Presenter {
        void requestData();
    }

}
