package com.able.part1;

import java.util.HashMap;

public class HashMapTest {
    //当hashmap的key为null,value会被覆盖
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"1");
        String str= map.get(null);
        System.out.println(str);
        System.out.println(map);
        map.put(null,"2");
        System.out.println(map);
        String str1=map.get(null);
        System.out.println(str1);
    }
}
