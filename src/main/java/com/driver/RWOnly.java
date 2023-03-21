package com.driver;

import java.sql.SQLOutput;

public class RWOnly {
    String name;
    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
