package com.ftg.learn;

import java.util.ArrayList;
import java.util.List;

public class JJ {


    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("1");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
