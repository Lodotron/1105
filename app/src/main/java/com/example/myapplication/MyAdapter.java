package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String[] titlepizza;
    String[] despizza;
    int images[];
    Context context;

    public MyAdapter(Context ct, String[] titlepizza, String[] despizza, int img[]) {
        context = ct;
        this.titlepizza = titlepizza;
        this.despizza = despizza;
        images = img;

    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.Title.setText(titlepizza[i]);
        myViewHolder.Desc.setText(despizza[i]);
        myViewHolder.Im.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return  images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Title, Desc;
        ImageView Im;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Title = itemView.findViewById(R.id.title_pizza);
            Desc = itemView.findViewById(R.id.des_pizza);
            Im = itemView.findViewById(R.id.im);
        }
    }
}



