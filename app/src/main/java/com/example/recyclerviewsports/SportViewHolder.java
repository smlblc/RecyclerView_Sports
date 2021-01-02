package com.example.recyclerviewsports;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class SportViewHolder extends RecyclerView.ViewHolder {
    ImageView sportImage;
    TextView sportTitle;
    TextView sportInfo;
    ConstraintLayout constLayout;


    public SportViewHolder(@NonNull View itemView) {
        super(itemView);
        sportImage = itemView.findViewById(R.id.sport_image);
        sportTitle = itemView.findViewById(R.id.sport_title);
        sportInfo = itemView.findViewById(R.id.sport_info);
        constLayout = itemView.findViewById(R.id.cons_layout);

    }
}
