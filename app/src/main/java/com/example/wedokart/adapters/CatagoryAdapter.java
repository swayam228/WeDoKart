package com.example.wedokart.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.wedokart.R;
import com.example.wedokart.databinding.ItemCatagoryBinding;
import com.example.wedokart.model.Catagory;

import java.util.ArrayList;

public class CatagoryAdapter extends RecyclerView.Adapter<CatagoryAdapter.CatagoryViewHolder> {

    Context context;
    ArrayList<Catagory> catagories;

    public CatagoryAdapter(Context context, ArrayList<Catagory> catagories){
        this.context = context;
        this.catagories = catagories;
    }

    @NonNull
    @Override
    public CatagoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CatagoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_catagory, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CatagoryViewHolder holder, int position) {
        Catagory catagory = catagories.get(position);
        holder.binding.lable.setText(catagory.getName());
        Glide.with(context)
                .load(catagory.getIcon())
                .into(holder.binding.image);

        holder.binding.image.setBackgroundColor(Color.parseColor(catagory.getColor()));

    }

    @Override
    public int getItemCount() {
        return catagories.size();
    }

    public class CatagoryViewHolder extends RecyclerView.ViewHolder{

        ItemCatagoryBinding binding;
        public CatagoryViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemCatagoryBinding.bind(itemView);
        }
    }
}
