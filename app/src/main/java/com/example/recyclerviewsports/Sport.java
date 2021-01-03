package com.example.recyclerviewsports;

import java.io.Serializable;

public class Sport implements Serializable {

    public String sportTitle;
    public String sportInfo;
    public String sportExplanation;
    public int sportImageId;

    public Sport(String sportTitle, String sportInfo, String sportExplanation, int sportImageId) {
        this.sportTitle = sportTitle;
        this.sportInfo = sportInfo;
        this.sportExplanation = sportExplanation;
        this.sportImageId = sportImageId;
    }
}
