package ru.sf.grocery.ui.basket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.sf.grocery.model.data.Good;

public class BasketGoodsAdapter extends RecyclerView.Adapter<BasketGoodsAdapter.ViewHolder> {

    private List<Good> goods = new ArrayList<>();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ViewHolder(LayoutInflater.from(parent.getContext()).inflate());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(goods.get(position));
    }

    @Override
    public int getItemCount() {
        return goods.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Good item) {

        }
    }

}
