package com.example.homework34;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
TextView textHolder;
onClickViewHolderListner onClickViewHolderListner;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textHolder= itemView.findViewById(R.id.itm_viewholder);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickViewHolderListner.onClickListenr(getAdapterPosition());
            }
        });


    }


    public void onBind(Person person) {
        textHolder.setText(person.getName());

    }
}
