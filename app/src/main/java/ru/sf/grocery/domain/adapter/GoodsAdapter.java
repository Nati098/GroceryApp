package ru.sf.grocery.domain.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.sf.grocery.R;
import ru.sf.grocery.model.data.Goods;

public class GoodsAdapter extends RecyclerView.Adapter<GoodsAdapter.ViewHolder> {

    private List<Goods> goods = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GoodsAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.good_item_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(goods.get(position));
    }

    @Override
    public int getItemCount() {
        return goods.size();
    }

    public void addItem(Goods item) {
        goods.add(item);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private Context context;
        private ImageView image;
        private TextView name;
        private View countryMarker;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            image = itemView.findViewById(R.id.image_view_good);
            name = itemView.findViewById(R.id.text_view_name);
            countryMarker = itemView.findViewById(R.id.view_country_marker);
        }

        public void bind(Goods item) {
            name.setText(item.getName());
            image.setImageDrawable(context.getDrawable(R.drawable.ic_box));  // set item image - TODO
            countryMarker.setBackgroundColor(item.getCountryCode().getColor());
        }
    }
}
