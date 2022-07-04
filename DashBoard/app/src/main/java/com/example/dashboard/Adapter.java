package com.example.dashboard;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<CardViewHolder> {
    List<CardData> dataList ;

    public Adapter( List<CardData> list)
    {
        this.dataList=list;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.stats_card, parent, false);
        CardViewHolder cardViewHolder=new CardViewHolder(listItem);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        String check= dataList.get(position).title;
        switch (check) {
            case "Animal\nRegistered":
                holder.title.setTextColor(Color.parseColor("#403572"));
                holder.count.setTextColor(Color.parseColor("#403572"));
                break;
            case "\nPremises":
                holder.title.setTextColor(Color.parseColor("#FF5648"));
                holder.count.setTextColor(Color.parseColor("#FF5648"));
                holder.imageView.setImageResource(R.drawable.ic_premises);
                break;
            case "\nQuarantine":
                holder.title.setTextColor(Color.parseColor("#479696"));
                holder.count.setTextColor(Color.parseColor("#479696"));
                holder.imageView.setImageResource(R.drawable.ic_qurantine);
                break;
            case "Total\nImports":
                holder.title.setTextColor(Color.parseColor("#46AD3F"));
                holder.count.setTextColor(Color.parseColor("#46AD3F"));
                holder.imageView.setImageResource(R.drawable.ic_total_imports);
                break;
            case "Total\nExports":
                holder.title.setTextColor(Color.parseColor("#666EFF"));
                holder.count.setTextColor(Color.parseColor("#666EFF"));
                holder.imageView.setImageResource(R.drawable.ic_total_exports);
                break;
            case "\nCampaigns":
                holder.title.setTextColor(Color.parseColor("#52ABAB"));
                holder.count.setTextColor(Color.parseColor("#52ABAB"));
                holder.imageView.setImageResource(R.drawable.ic_compaigns);
                break;
            case "Lab\nTests":
                holder.title.setTextColor(Color.parseColor("#4E98AF"));
                holder.count.setTextColor(Color.parseColor("#4E98AF"));
                holder.imageView.setImageResource(R.drawable.ic_lab_tests);
                break;
            case "\nAll":
                holder.title.setTextColor(Color.parseColor("#6D8580"));
                holder.count.setTextColor(Color.parseColor("#6D8580"));
                holder.imageView.setImageResource(R.drawable.ic_all);
                break;
        }

        holder.title.setText(dataList.get(position).title);
        //holder.title.setTextColor(Color.parseColor(dataList.get(position).color));

        holder.count.setText(dataList.get(position).count);
       // holder.count.setTextColor(Color.parseColor(dataList.get(position).color));

        holder.container.setBackgroundColor(Color.parseColor(dataList.get(position).color));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
