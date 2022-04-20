package ru.sf.grocery.ui.interfaces;

import ru.sf.grocery.ui.view.BaseContract;

public abstract class BasePresenter implements BaseContract.Presenter<BaseContract.View> {
    private BaseContract.View _view = null;

    @Override
    public void onViewCreated() {}

    @Override
    public void attachView(BaseContract.View view) {
        if (_view == null) {
            _view = view;
            view.acceptPresenter(this);
        }
    }

    @Override
    public void detachView() {
        _view = null;
    }
}
