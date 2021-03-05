package com.julen_junguitu.memorypuzzle;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Score extends RealmObject{

    @PrimaryKey
    private int id;


    private String name;
    private String points;

    public Score(){ }

    public Score(String name, String points){
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoints() {
        return this.points;
    }

    public void setPoints(String points) {
        this.points = points;
    }



    public int compareTo(Score o1, Score o2) {
        if(Integer.valueOf(o1.getPoints())  == Integer.valueOf(o2.getPoints()) ){
            return 0;
        }
        if(Integer.valueOf(o1.getPoints())  < Integer.valueOf(o2.getPoints()) ){
            return -1;
        }
        return  1;
    }
}
