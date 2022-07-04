package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CardData> list= getData();
        recyclerView =(RecyclerView) findViewById(R.id.rv_card_container);
        adapter=new Adapter(list);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
        recyclerView.setAdapter(adapter);


    }

    public List<CardData> getData()
    {
        List<CardData> list = new ArrayList<>();
        list.add(new CardData("Animal\nRegistered","5618","#F6F5FB"));
        list.add(new CardData("\nPremises","24577","#FFF4F4"));
        list.add(new CardData("\nQuarantine","76543","#F5F9F9"));
        list.add(new CardData("Total\nImports","1056","#E2FFE0"));
        list.add(new CardData("Total\nExports","2568","#F2F2FF"));
        list.add(new CardData("\nCampaigns","0000","#EEFFFF"));
        list.add(new CardData("Lab\nTests","5618","#EAFAFF"));
        list.add(new CardData("\nAll","0000","#F2F2F2"));

        return list;
    }
}

