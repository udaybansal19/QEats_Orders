package com.example.dell.q_eats_orders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    ArrayList<Order> orderArrayList;
    Context mContext;

    public RecyclerViewAdapter(ArrayList<Order> orderArrayList, Context mContext) {
        this.orderArrayList = orderArrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_view_item, viewGroup);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.textViewTotalAmount.setText(orderArrayList.get(i).getTotal());
        viewHolder.textViewRestaurantName.setText(orderArrayList.get(i).getRestaurantName());
    }

    @Override
    public int getItemCount() {
        return orderArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewRestaurantName;
        TextView textViewTotalAmount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewRestaurantName = (TextView) itemView.findViewById(R.id.restaurantName);
            textViewTotalAmount = (TextView) itemView.findViewById(R.id.total);
        }
    }
}
