package com.example.oh.project6;

/**
 * Created by OH on 2017-03-30.
 */

public class Data {
    String table;
    String date;
    String time;
    int spag;
    int piz;
    int index;

    public Data(String table){
        this.table = table;
    }

    public Data(String table, String date, String time, int spag, int piz, int index){
        this.table = table;
        this.date = date;
        this.time = time;
        this.spag = spag;
        this.piz = piz;
        this.index = index;
    }

    public String getTable(){
        return table;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }
    public int getSpag(){
        return spag;
    }
    public int getPiz(){
        return piz;
    }
    public int getIndex(){
        return index;
    }
    public void setSpag(int spag){
        this.spag = spag;
    }
    public void setPiz(int piz){
        this.piz = piz;
    }
    public void setIndex(int index){
        this.index = index;
    }
}
