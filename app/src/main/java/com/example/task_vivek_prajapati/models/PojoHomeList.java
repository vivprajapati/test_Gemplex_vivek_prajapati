package com.example.task_vivek_prajapati.models;

import java.util.List;

public class PojoHomeList {
    public String title;
    public List<PojoItems> list;

    public PojoHomeList(String title, List<PojoItems> list) {
        this.title = title;
        this.list = list;
    }
}
