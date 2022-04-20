package ru.sf.grocery.ui.goods;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.sf.grocery.databinding.FragmentGoodsBinding;
import ru.sf.grocery.model.data.Goods;
import ru.sf.grocery.model.data.GoodsResponseData;
import ru.sf.grocery.ui.interfaces.BaseContract;
import ru.sf.grocery.ui.interfaces.BaseFragment;
import ru.sf.grocery.ui.interfaces.GoodsContract;

public class GoodsFragment extends BaseFragment<FragmentGoodsBinding> implements GoodsContract.View {

    private GoodsContract.Presenter presenter;
    private GoodsAdapter goodsAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createPresenter();
        bindView();

        presenter.requestData();
    }

    @NonNull
    @Override
    public FragmentGoodsBinding bindLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragmentGoodsBinding.inflate(inflater, container, false);
    }

    @Override
    public void bindView() {
        int orientation = this.getResources().getConfiguration().orientation;
        int numOfCols = orientation == Configuration.ORIENTATION_PORTRAIT? 3 : 6;

        RecyclerView recycler = getBinding().recycler;
        goodsAdapter = new GoodsAdapter();
        recycler.setAdapter(goodsAdapter);
        recycler.setLayoutManager(new GridLayoutManager(recycler.getContext(), numOfCols));
    }

    private void createPresenter() {
        presenter = new GoodsPresenter(this);
        acceptPresenter((BaseContract.Presenter<? super BaseContract.View>) presenter);
    }

    @Override
    public void showData(List<Goods> data) {
        int startPos = goodsAdapter.getItemCount();
        data.forEach(d -> goodsAdapter.addItem(d));
        goodsAdapter.notifyItemRangeChanged(startPos, goodsAdapter.getItemCount()-1);
    }

    @Override
    public void showLoading() { }

    @Override
    public void showError(@Nullable String message) {}
}
