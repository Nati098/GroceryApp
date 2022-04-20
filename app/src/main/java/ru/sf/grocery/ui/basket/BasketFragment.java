package ru.sf.grocery.ui.basket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import ru.sf.grocery.databinding.FragmentBasketBinding;
import ru.sf.grocery.ui.interfaces.BaseFragment;
import ru.sf.grocery.ui.interfaces.BasketContract;

public class BasketFragment extends BaseFragment<FragmentBasketBinding> implements BasketContract.View {

    private BasketContract.Presenter presenter;

    private LinearLayout noDataLayout;
    private RecyclerView goodsRecycler;

    @NonNull
    @Override
    public FragmentBasketBinding bindLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragmentBasketBinding.inflate(inflater, container, false);
    }

    @Override
    public void bindView() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(@Nullable String message) {

    }

}