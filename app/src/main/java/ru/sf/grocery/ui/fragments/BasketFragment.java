package ru.sf.grocery.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.sf.grocery.databinding.FragmentBasketBinding;
import ru.sf.grocery.domain.adapter.BasketGoodsAdapter;
import ru.sf.grocery.domain.presenter.BasketPresenter;
import ru.sf.grocery.model.data.BasketGoods;
import ru.sf.grocery.domain.interfaces.BaseContract;
import ru.sf.grocery.ui.interfaces.BaseFragment;
import ru.sf.grocery.domain.interfaces.BasketContract;

public class BasketFragment extends BaseFragment<FragmentBasketBinding> implements BasketContract.View {

    private BasketContract.Presenter presenter;

    private BasketGoodsAdapter goodsAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createPresenter();
        bindView();

        presenter.requestData();
    }

    @NonNull
    @Override
    public FragmentBasketBinding bindLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragmentBasketBinding.inflate(inflater, container, false);
    }

    @Override
    public void bindView() {
        RecyclerView recycler = getBinding().recycler;
        recycler.addItemDecoration(new DividerItemDecoration(recycler.getContext(), DividerItemDecoration.HORIZONTAL));
        goodsAdapter = new BasketGoodsAdapter();
        recycler.setAdapter(goodsAdapter);
        recycler.setLayoutManager(new LinearLayoutManager(this.requireContext()));

        getBinding().buttonClearAll.setOnClickListener(v -> clearAll());
        getBinding().buttonPay.setOnClickListener(v -> payForOrder());
    }

    private void createPresenter() {
        presenter = new BasketPresenter(this);
        acceptPresenter((BaseContract.Presenter<? super BaseContract.View>) presenter);
    }

    private void setupViewByCount() {
        getBinding().layoutNoGoods.setVisibility(goodsAdapter.getItemCount() > 0 ? View.GONE : View.VISIBLE);
        getBinding().layoutWithGoods.setVisibility(goodsAdapter.getItemCount() > 0 ? View.VISIBLE : View.GONE);
        getBinding().buttonPay.setEnabled(goodsAdapter.getItemCount() > 0);
    }

    @Override
    public void addGoodsToList(List<BasketGoods> goods) {
        goods.forEach(g -> goodsAdapter.addItem(g));
        setupViewByCount();
    }

    @Override
    public void clearAll() {
        goodsAdapter.clearAdapter();
        setupViewByCount();
    }

    @Override
    public void payForOrder() {
        Toast.makeText(requireContext(), "Paid", Toast.LENGTH_SHORT);
    }

    @Override
    public void showLoading() {}

    @Override
    public void showError(@Nullable String message) {}

}
