package com.example.win7.myproject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Items> data;

public RecyclerViewAdapter(Context context,List<Items> data)
{
    this.context=context;
    this.data=data;
}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view;
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        view=layoutInflater.inflate(R.layout.cardview_items,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int position) {
    myViewHolder.tv_item.setText(data.get(position).getSitename());
        myViewHolder.img_item.setImageResource(data.get(position).getThumbnail());
        myViewHolder.cardView_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,ItemActivity.class);
                i.putExtra("Site Name",data.get(position).getSitename());
                i.putExtra("Location",data.get(position).getLocation());
                i.putExtra("Price",data.get(position).getPrice());
                i.putExtra("Contact",data.get(position).getContact_num());
                i.putExtra("Thumbnail",data.get(position).getThumbnail());
                context.startActivity(i);
            }
        });
       }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_item;
        ImageView img_item;
        CardView cardView_item;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            tv_item=(TextView)itemView.findViewById(R.id.text_item);
            img_item=(ImageView)itemView.findViewById(R.id.img_item);
            cardView_item=(CardView) itemView.findViewById(R.id.cardview);
        }
    }
}
