package ru.sf.grocery.domain.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.sf.grocery.R;
import ru.sf.grocery.model.data.BasketGoods;

public class BasketGoodsAdapter extends RecyclerView.Adapter<BasketGoodsAdapter.ViewHolder> {

    private List<BasketGoods> goods = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.basket_good_item_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(goods.get(position));
    }

    @Override
    public int getItemCount() {
        return goods.size();
    }

    public void addItem(BasketGoods item) {
        goods.add(item);
        notifyItemInserted(goods.size()-1);
    }

    public void clearAdapter() {
        goods.clear();
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private Context context;
        private TextView name;
        private TextView pricePerKg;
        private TextView pricePerWeight;
        private TextView totalPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            name = itemView.findViewById(R.id.text_view_name);
            pricePerKg = itemView.findViewById(R.id.text_view_price_per_kg);
            pricePerWeight = itemView.findViewById(R.id.text_view_price_per_our_weight);
            totalPrice = itemView.findViewById(R.id.text_view_total);
        }

        public void bind(BasketGoods item) {
            name.setText(item.getName());
            pricePerKg.setText(String.format(context.getString(R.string.price_per_kg_pattern), item.getPrice()));
            pricePerWeight.setText(String.format(context.getString(R.string.price_per_our_weight_pattern), item.getWeight(), item.getPrice()));
            double total = item.getPrice() * item.getWeight();
            totalPrice.setText(String.format(context.getString(R.string.price_pattern), total));
        }
    }

}
