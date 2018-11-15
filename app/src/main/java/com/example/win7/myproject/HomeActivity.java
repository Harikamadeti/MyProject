package com.example.win7.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<Items> itemSlots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        itemSlots=new ArrayList<>();
        itemSlots.add(new Items("Geetanjali Community","Vizag","50 Lakhs","1234567890",R.drawable.img1));
        itemSlots.add(new Items("Anitha Community","Hyderabad","60 Lakhs","1234567891",R.drawable.img2));
        itemSlots.add(new Items("Abhaya Community","Vijayawada","70 Lakhs","1234567892",R.drawable.img3));
        itemSlots.add(new Items("Karthikeya Community","Banglore","80 Lakhs","1234567893",R.drawable.img4));
        itemSlots.add(new Items("Geetanjali 1 Community","Vizag","50 Lakhs","1234567890",R.drawable.img1));
        itemSlots.add(new Items("Anitha 1 Community","Hyderabad","60 Lakhs","1234567891",R.drawable.img2));
        itemSlots.add(new Items("Abhaya 1 Community","Vijayawada","70 Lakhs","1234567892",R.drawable.img3));
        itemSlots.add(new Items("Karthikeya 1 Community","Banglore","80 Lakhs","1234567893",R.drawable.img4));
        itemSlots.add(new Items("Geetanjali 2 Community","Vizag","50 Lakhs","1234567890",R.drawable.img1));
        itemSlots.add(new Items("Anitha 2 Community","Hyderabad","60 Lakhs","1234567891",R.drawable.img2));
        itemSlots.add(new Items("Abhaya 2 Community","Vijayawada","70 Lakhs","1234567892",R.drawable.img3));
        itemSlots.add(new Items("Karthikeya 2 Community","Banglore","80 Lakhs","1234567893",R.drawable.img4));
        itemSlots.add(new Items("Harika Community","Chennai","90 Lakhs","8656452342",R.drawable.img4));
        itemSlots.add(new Items("Rattalu Community","Pune","70 Lakhs","8765434733",R.drawable.img1));
        itemSlots.add(new Items("Avesam Community","Mumbai","80 Lakhs","7534364467",R.drawable.img2));
        itemSlots.add(new Items("Sampath Community","Vizag","20 Lakhs","1253264353",R.drawable.img3));

        RecyclerView recyclerView=findViewById(R.id.recycler);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(this,itemSlots);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
