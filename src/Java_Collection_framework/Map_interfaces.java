package Java_Collection_framework;

import java.util.*;

public class Map_interfaces {
    public static void main(String[] args){
        Map<String,String> mapp = new HashMap<>();

        mapp.put("Ind","India");
        mapp.put("Eng", "England");
        mapp.put("SA", "South Africa");
        System.out.println(mapp);
        System.out.println(mapp.size());

        Map<String, String> tab = new HashMap<>();

        tab.put("Bra", "Brazil");
        tab.put("Aus", "Australia");
        System.out.println("Before putAll method : " + tab);
        tab.putAll(mapp);
        System.out.println("After putAll method : " + tab);

        tab.putIfAbsent("Brus","Belarus");
        System.out.println(tab);
        System.out.println(tab.get("Brus"));
        System.out.println(tab.getOrDefault("Indus","NONE"));
        System.out.println(tab.containsKey("Ind"));
        System.out.println(tab.containsValue("united states"));

        tab.replace("Ind", "Bharat");
        System.out.println(tab);
        tab.remove("Bra");
        tab.remove("Brus","Belarus");
        System.out.println(tab);

        Set<String> keyset = tab.keySet();
        System.out.println(keyset);

        Collection<String> values = tab.values();
        System.out.println(values);

        //Get all the entries from map
        Set<Map.Entry<String,String>> entryset = tab.entrySet();
        System.out.println(entryset);

        //Iterating over map
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
