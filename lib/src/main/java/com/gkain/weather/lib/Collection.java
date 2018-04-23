package com.gkain.weather.lib;

import java.util.ArrayList;

public class Collection {
    public static void main (String []args){
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("1");
        listString.add("2");
        listString.add("3");
        listString.add("4");
        listString.add("5");
        listString.add(0,"0");
        if (!listString.isEmpty())
            for (int i=0; i<listString.size();i++){
            String s = listString.get(i)+" ";
            System.out.println(s);
            }
    }
}
