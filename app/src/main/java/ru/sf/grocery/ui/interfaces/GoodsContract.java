package ru.sf.grocery.ui.interfaces;

import ru.sf.grocery.model.data.GoodsResponseData;

public interface GoodsContract {

    interface View extends BaseContract.View {
        void showData(GoodsResponseData responseData);
    }

    interface Presenter extends BaseContract.Presenter {
        void requestData();
    }

}
