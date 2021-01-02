package com.example.recyclerviewsports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SportExplanationActivity extends AppCompatActivity {
    private ImageView sportImage_2;
    private TextView sportTitle_2;
    private TextView sportExplanation;
    private ConstraintLayout constLayout_2;
    private int position;
    private final String LOG_TAG = "SportExplanation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_explanation);

        sportImage_2 = findViewById(R.id.sport_image_2);
        sportTitle_2 = findViewById(R.id.sport_title_2);
        sportExplanation = findViewById(R.id.sport_explanation);

        Intent intent = getIntent();
        position = intent.getIntExtra("Extra_position", -1);

        if(position == -1){
            Log.d(LOG_TAG, "Invalid position or NO Position");
        }else{
            String[] sportTitle = getResources().getStringArray(R.array.sport_title);
            String[] sportExplanations = getResources().getStringArray(R.array.sport_explanation);
            String[] sportImageName = getResources().getStringArray(R.array.sport_image_name);

            sportTitle_2.setText(sportTitle[position]);
            sportExplanation.setText(sportExplanations[position]);
            int imageId = getResources().getIdentifier(sportImageName[position],"drawable",getPackageName());
            sportImage_2.setImageResource(imageId);
        }
    }
}