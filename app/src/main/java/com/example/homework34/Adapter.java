package com.example.homework34;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder>  implements  onClickViewHolderListner{
    ArrayList<Person> list = new ArrayList<>();
    MainActivity activity;


    public void update(ArrayList<Person> list) {
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itm_viewholder, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.onClickViewHolderListner = this;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClickListenr(int postion) {
        Intent intent = new Intent(activity, SekondActivity.class);
        intent.putExtra("key", list.get(postion));
        activity.startActivity(intent);


    }
}
