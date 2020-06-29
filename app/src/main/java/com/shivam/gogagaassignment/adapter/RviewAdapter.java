package com.shivam.gogagaassignment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shivam.gogagaassignment.R;
import com.shivam.gogagaassignment.holder.MyHolder;
import com.shivam.gogagaassignment.modelClass.RviewModel;

import java.util.ArrayList;

public class RviewAdapter extends RecyclerView.Adapter<MyHolder> {

    ArrayList<RviewModel> rviewModels;

    public RviewAdapter(ArrayList<RviewModel> rviewModels) {
        this.rviewModels = rviewModels;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.topText.setText(rviewModels.get(position).getTopText());
        holder.middleText.setText(rviewModels.get(position).getMiddleText());
        holder.bottomText.setText(rviewModels.get(position).getBottomText());

    }

    @Override
    public int getItemCount() {
        return rviewModels.size();
    }
}
