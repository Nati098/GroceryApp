package ru.sf.grocery.ui.goods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ru.sf.grocery.databinding.FragmentGoodsBinding;
import ru.sf.grocery.model.data.GoodsResponseData;
import ru.sf.grocery.ui.interfaces.BaseContract;
import ru.sf.grocery.ui.interfaces.BaseFragment;
import ru.sf.grocery.ui.interfaces.GoodsContract;

public class GoodsFragment extends BaseFragment<FragmentGoodsBinding> implements GoodsContract.View {

    private GoodsContract.Presenter presenter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindView();
        createPresenter();
    }

    @NonNull
    @Override
    public FragmentGoodsBinding bindLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragmentGoodsBinding.inflate(inflater, container, false);
    }

    @Override
    public void bindView() {

    }

    private void createPresenter() {
        presenter = new GoodsPresenter(this);
        acceptPresenter((BaseContract.Presenter<? super BaseContract.View>) presenter);
    }

    @Override
    public void showData(GoodsResponseData responseData) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(@Nullable String message) {

    }
}
