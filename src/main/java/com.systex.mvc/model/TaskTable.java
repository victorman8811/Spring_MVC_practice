package com.systex.mvc.model;

public class TaskTable {

    int seq;
    String name;
    String description;

    public void setSeq(int data) {
        seq = data;
    }

    public void setName(String data) {
        name = data;
    }

    public void setDescription(String data) {
        description = data;
    }

    public int getSeq() {
        return seq;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
