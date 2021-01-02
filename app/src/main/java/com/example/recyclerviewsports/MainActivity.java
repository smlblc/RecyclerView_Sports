package com.example.recyclerviewsports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Sport> sportList = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        populateSportList();

//        MyOnClickSportAction myListenerAction = new MyOnClickSportAction() {
//            @Override
//            public void onClick(int position) {
//                onClickSport(position);
//            }
//        };

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSport(v);
            }
        };

        SportListAdapter adapter = new SportListAdapter(sportList, listener );  //myListenerAction
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

//    public void onClickSport(int position){
//        Intent intent = new Intent(this, SportExplanationActivity.class);
//        intent.putExtra("Extra_Position", position);
//        startActivity(intent);
//    }

    public void onClickSport(View v) {
        Intent intent = new Intent(this, SportExplanationActivity.class);
        intent.putExtra("Extra_position", recyclerView.getChildAdapterPosition(v));
        startActivity(intent);
    }

    public void populateSportList(){
        String[] sportTitle = getResources().getStringArray(R.array.sport_title);
        String[] sportInfo = getResources().getStringArray(R.array.sport_info);
        String[] sportExplanation = getResources().getStringArray(R.array.sport_explanation);
        String[] sportImageName = getResources().getStringArray(R.array.sport_image_name);

        for (int i = 0; i <sportTitle.length ; i++) {
            int imageId = getResources().getIdentifier(sportImageName[i],"drawable",getPackageName());
            sportList.add(new Sport(sportTitle[i],sportInfo[i],sportExplanation[i], imageId));
        }
    }
}