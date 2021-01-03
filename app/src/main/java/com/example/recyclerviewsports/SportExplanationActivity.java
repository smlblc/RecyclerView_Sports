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
    private Sport sport;
    private final String LOG_TAG = "SportExplanation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_explanation);

        sportImage_2 = findViewById(R.id.sport_image_2);
        sportTitle_2 = findViewById(R.id.sport_title_2);
        sportExplanation = findViewById(R.id.sport_explanation);

        Intent intent = getIntent();
        sport = (Sport) intent.getSerializableExtra("Extra_sport");

            try {
                sportTitle_2.setText(sport.sportTitle);
                sportExplanation.setText(sport.sportExplanation);
                sportImage_2.setImageResource(sport.sportImageId);
            }catch (Exception e) {
                Log.d(LOG_TAG, "Invalid sport or NO sport retreived from Main Activity");
        }
    }
}
