package com.company.TreeMap;

public class Main {
    public static void main(String[] args) {
        MyMap<Integer,String> myMap=new MyMap<>();
        myMap.put(1,"aaaaaa");
        myMap.put(2,"kk");
        myMap.put(3,"kk");
        myMap.put(4,"Armen");
        myMap.put(29,"Valod");
        myMap.put(38,"ooooo");
        myMap.put(25,"sdf");
        myMap.put(57,"fwefw");
        myMap.put(11,"aaaaaaafsd");
        myMap.put(12,"kkwefc");
        myMap.put(13,"kkwwfc");
        myMap.put(14,"Armenqwrwe");
        myMap.put(120,"Valodsdv");
        myMap.put(31,"Armenqwrwe");
        myMap.put(27,"Valodsdv");
        myMap.put(16,"Valodsdv");

        myMap.get(25);

        System.out.println(myMap);
    }
}
