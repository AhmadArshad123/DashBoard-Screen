package com.example.dashboard;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView count;
    LinearLayout container;
    ImageView imageView;
    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        title=(TextView) itemView.findViewById(R.id.tv_title);
        count=(TextView) itemView.findViewById(R.id.tv_count);
        container=(LinearLayout) itemView.findViewById(R.id.card_container);
        imageView=(ImageView) itemView.findViewById(R.id.iv_card);
    }


}
