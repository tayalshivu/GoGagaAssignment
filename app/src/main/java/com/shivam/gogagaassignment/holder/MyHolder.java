package com.shivam.gogagaassignment.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shivam.gogagaassignment.R;

public class MyHolder extends RecyclerView.ViewHolder {

   public TextView topText,middleText,bottomText;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.topText=itemView.findViewById(R.id.topHeading);
        this.middleText=itemView.findViewById(R.id.middleHeading);
        this.bottomText=itemView.findViewById(R.id.bottomHeading);

    }
}
