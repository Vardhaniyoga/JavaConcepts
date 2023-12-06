package com.collections;

import java.util.HashMap;

public class HashMapClass {

    public static void main(String[] args){

        HashMap<String,String> capitalOfCountry= new HashMap<String,String>();
        capitalOfCountry.put("India","Delhi");
        capitalOfCountry.put("Netherlands","Amsterdam");
        System.out.println(capitalOfCountry);
        System.out.println(capitalOfCountry.get("India"));
for(String i : capitalOfCountry.keySet()){
    System.out.println(i);
}
    }
}
