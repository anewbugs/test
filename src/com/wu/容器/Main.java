package com.wu.容器;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        int [] a = new int[1];
        arrayList.add("");
        LinkedList<String> linkedList = new LinkedList<>();
        HashMap<Integer , String> hashMap = new HashMap<>();
        Object o = new Object();
        List list = linkedList;
        System.out.println(Integer.toHexString(list.hashCode()));
        System.out.println( Integer.toHexString(linkedList.hashCode()));
        Integer integer = new Integer(1);
        hashMap.put(null,null);
        System.nanoTime();
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("","");
        Hashtable hashtable = new Hashtable();

        System.out.println(hashMap.get(null));
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            try {
            linkedBlockingQueue.put("ss");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
    }
}
